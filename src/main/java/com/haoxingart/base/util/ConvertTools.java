package com.haoxingart.base.util;


public class ConvertTools {

	public static  byte[] decimalStringToBCD(String str) {
		if(str.length()%2!=0) str="0"+str;		
	    int len = (str.length()/2);   
	    byte[] result = new byte[len];   
	    char[] achar = str.toCharArray();   
	    for (int i = 0; i < len; i++) {   
	     int pos = i * 2;   
	     result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));   
	    }   
	    return result;   
	}
	private static byte toByte(char c) {   
	    byte b = (byte) "0123456789ABCDEF".indexOf(c);
	    if(b==-1)
	    	b = (byte) "0123456789abcdef".indexOf(c);
	    return b;   
	} 
	public static String byteToHexString(byte [] byteHex){
		String strHex="";
		if(byteHex==null)
			return "";
		for(int i=0;i<byteHex.length;i++){
			strHex=strHex+String.format("%02X", byteHex[i]);
		}
		return strHex;
	}
	public static String IntToChar(int index)
	{
		if(index>36)
			return "0";
		String sBase = "0123456789ABCDEFGHIJKLMNOPQRST";
		return sBase.substring(index, index+1);		
	}
	
}
