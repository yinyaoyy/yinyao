package com.haoxingart.base.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dengqc on 2017/3/29.
 */
public class SessionUtil {
    @SuppressWarnings("unchecked")
	public static  <T> T getSessionAttribute(HttpServletRequest request,String key,Class<T> clazz){
        if(StringUtil.isEmptyStrs(key)||request==null||clazz == null){
            return  null;
        }
        Object object = request.getSession().getAttribute(key);
        if(object==null){
            return null;
        }
        try {
            T t = (T) object;
            return t;
        }catch (ClassCastException e){
            return null;
        }
    }

    public static boolean setSessionAttribute(HttpServletRequest request,String key,Object object){
        if(StringUtil.isEmptyStrs(key)||request==null){
            return false;
        }
        request.getSession().setAttribute(key,object);
        request.getSession().setMaxInactiveInterval(-1);
        return true;
    }

    public static boolean removeSessionAttribute(HttpServletRequest request,String key){
        if(StringUtil.isEmptyStrs(key)||request==null){
            return false;
        }
        request.getSession().removeAttribute(key);
        return true;
    }
}
