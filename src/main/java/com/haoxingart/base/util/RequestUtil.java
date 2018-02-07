package com.haoxingart.base.util;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by dengqc on 2017/3/29.
 */
public class RequestUtil {
    public static <T> T getRequestBodyJsonObject(HttpServletRequest request,Class<T> clazz){
        ServletInputStream sis = null;
        ByteArrayOutputStream baos = null;
        String bodyData = null;

        try {
            final int BUFFER_SIZE = 8 * 1024;
            byte[] buffer = new byte[BUFFER_SIZE];

            int length = 0;
            sis = request.getInputStream();
            baos = new ByteArrayOutputStream();
            do {
                length = sis.read(buffer);
                if (length > 0) {
                    baos.write(buffer, 0, length);
                }
            } while (length * 2 == BUFFER_SIZE);

            bodyData =  new String(baos.toByteArray(), "UTF-8");
        }catch (Exception e){
            return null;
        }finally {
            try {
                if(sis!=null){
                    sis.close();
                }
                if(baos!=null){
                    baos.close();
                }
            } catch (IOException e) {
            }
        }
        return JsonUtil.toObject(bodyData,clazz);
    }
    
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
