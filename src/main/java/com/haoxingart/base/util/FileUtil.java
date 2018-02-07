package com.haoxingart.base.util;


import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Created by dengqc on 2017/3/13.
 */
public class FileUtil {
    private static Logger logger = Logger.getLogger(FileUtil.class);
    public static final String NEW_LINE = System.getProperty("line.separator");

    /**
     * 读取文件变成字符串
     * @param fileName
     * @param charset 字符集
     * @return
     */
    public static String readFile(String fileName, String charset) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName), charset);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(NEW_LINE);
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 读取文件变成字符串
     *
     * @param fileName
     * @return
     */
    public static String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(NEW_LINE);
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 写字符串到文件
     *
     * @param content
     * @return
     */
    public static void writeFile(String content, String pathname) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathname));
            bufferedWriter.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件或目录是否存在
     */
    public static boolean isFile(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            return false;
        }
        try {
            File file = new File(fileName);
            return file.exists();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 得到Classpath下的资源
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static String getClasspathResource(String path) throws FileNotFoundException {
        URL url = Thread.currentThread().getContextClassLoader().getResource(path);
        try {
            if (url == null) {
                throw new FileNotFoundException(path);
            }
            String file = URLDecoder.decode(url.getFile(), "utf-8");
            return file;
        } catch (UnsupportedEncodingException e) {
            logger.error("出错了", e);
        }
        return null;
    }

    /**
     * 删除文件或文件夹
     * @param filepath
     * @throws IOException
     */
    public static void delete(String filepath) throws IOException {
        File f = new File(filepath);// 定义文件路径
        if (f.exists() && f.isDirectory()) {
            File[] delFile = f.listFiles();
            // 判断是文件还是目录
            if (delFile == null || delFile.length == 0) {
                // 若目录下没有文件则直接删除
                f.delete();
            } else {// 若有则把文件放进数组，并判断是否有下级目录
                int i = delFile.length;
                for (int j = 0; j < i; j++) {
                    if (delFile[j].isDirectory()) {
                        delete(delFile[j].getAbsolutePath());// 递归调用del方法并取得子目录路径
                    }
                    delFile[j].delete();// 删除文件
                }
            }
        }
    }
}
