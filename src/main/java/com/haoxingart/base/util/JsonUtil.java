package com.haoxingart.base.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionLikeType;

/**
 * Created by dengqc on 2017/3/12.
 */
public class JsonUtil {

    private static Logger logger = Logger.getLogger(JsonUtil.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 解析器支持解析单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 解析器支持解析结束符
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        // 设置当前json格式日期格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        
        objectMapper.setTimeZone(TimeZone.getDefault());
    }

    /**
     * 转换成字符串
     *
     * @param object
     * @return
     */
    public static String toString(Object object) {
        return toString(object, false);
    }

    /**
     * 转换成字符串
     *
     * @param object
     * @param isPretty
     * @return
     */
    public static String toString(Object object, boolean isPretty) {
        if (object == null) {
            return null;
        }
        try {
            String content = null;
            if (isPretty) {
                content = objectMapper.writer(new DefaultPrettyPrinter()).writeValueAsString(object);
            } else {
                content = objectMapper.writeValueAsString(object);
            }
            return content;
        } catch (JsonProcessingException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成map
     *
     * @param content
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> toMap(String content) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            Map<String, Object> map = objectMapper.readValue(content, Map.class);
            return map;
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成字符串map
     *
     * @param content
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> toStringMap(String content) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            Map<String, String> map = objectMapper.readValue(content, Map.class);
            return map;
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成List<Map>
     *
     * @param content
     * @return
     */
    public static List<Map<String, Object>> toListMap(String content) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            CollectionLikeType array = objectMapper.getTypeFactory()
                    .constructCollectionType(ArrayList.class, Map.class);

            return objectMapper.readValue(content, array);
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成List<Map>
     *
     * @param content
     * @return
     */
    public static List<Map<String, String>> toListStringMap(String content) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }

        try {
            CollectionLikeType array = objectMapper.getTypeFactory()
                    .constructCollectionType(ArrayList.class, Map.class);

            return objectMapper.readValue(content, array);
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成指定对象
     *
     * @param content
     * @param typeReference
     * @return
     */
    public static <T> T toObject(String content, TypeReference<T> typeReference) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            T t = objectMapper.readValue(content, typeReference);
            return t;
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * 转换成指定对象
     *
     * @param content
     * @param clazz
     * @return
     */
    public static <T> T toObject(String content, Class<T> clazz) {
        try {
            T t = objectMapper.readValue(content, clazz);
            return t;
        } catch (JsonParseException e) {
            logger.error("ERROR", e);
        } catch (JsonMappingException e) {
            logger.error("ERROR", e);
        } catch (IOException e) {
            logger.error("ERROR", e);
        }
        return null;
    }

    /**
     * json转换对象
     * @param obj 对象数据
     * @param clazz 需要转换对象
     * @return
     */
    public static <T> T toObjectByObj(Object obj, Class<T> clazz) {
        if (obj == null) {
            return null;
        }
        String jsonString = toString(obj);
        return toObject(jsonString, clazz);
    }

    /**
     * json转换集合对象
     * @param jsonString json数据
     * @param clazz 需要转换集合子对象
     * @return
     */
    public static <T> List<T> toObjectList(String jsonString, Class<T> clazz) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        CollectionLikeType array = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
        try {
            return objectMapper.readValue(jsonString, array);
        } catch (IOException e) {
            logger.warn("parse json string error:" + jsonString, e);
            return null;
        }
    }

    /**
     * json转换集合对象
     *
     * @param obj   对象数据
     * @param clazz 需要转换集合子对象
     * @return
     */
    public static <T> List<T> toObjectListByObj(Object obj, Class<T> clazz) {

        if (obj == null) {
            return null;
        }
        String jsonString = toString(obj);
        return toObjectList(jsonString, clazz);
    }

}
