package com.haoxingart.base.util;

import org.apache.log4j.helpers.FormattingInfo;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.spi.LoggingEvent;

/**
 * <br>
 * 版权：Copyright (c) 2017-2020<br>
 * 公司：北京昊星文化科技有限公司<br>
 * 作者：dqc000<br>
 * 版本：1.0<br>
 * 创建日期：2017年7月10日<br>
 */
public class Log4jExPatternParser  extends PatternParser { 
  
    public Log4jExPatternParser(String pattern) { 
        super(pattern); 
    } 
     /** 
      * 重写finalizeConverter，对特定的占位符进行处理，T表示线程ID占位符 
      */
     @Override
     protected void finalizeConverter(char c) { 
      if (c == 'T') { 
       this.addConverter(new ExPatternConverter(this.formattingInfo)); 
      } else { 
       super.finalizeConverter(c); 
      } 
     } 
  
     private static class ExPatternConverter extends PatternConverter { 
  
      public ExPatternConverter(FormattingInfo fi) { 
       super(fi); 
      } 
  
      /** 
       * 当需要显示线程ID的时候，返回当前调用线程的ID 
       */
      @Override
      protected String convert(LoggingEvent event) { 
       return String.valueOf(Thread.currentThread().getId()); 
      } 
  
     } 
  
  
}
