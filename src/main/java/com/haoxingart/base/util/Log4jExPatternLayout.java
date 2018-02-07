package com.haoxingart.base.util;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;

/**
 * <br>
 * 版权：Copyright (c) 2017-2020<br>
 * 公司：北京昊星文化科技有限公司<br>
 * 作者：dqc000<br>
 * 版本：1.0<br>
 * 创建日期：2017年7月10日<br>
 */
public class Log4jExPatternLayout extends PatternLayout { 
    public Log4jExPatternLayout(String pattern){ 
        super(pattern); 
    } 
      
    public Log4jExPatternLayout(){ 
        super(); 
    } 
     /** 
      * 重写createPatternParser方法，返回PatternParser的子类 
      */
     @Override
     protected PatternParser createPatternParser(String pattern) { 
      return new Log4jExPatternParser(pattern); 
     } 
  
}
