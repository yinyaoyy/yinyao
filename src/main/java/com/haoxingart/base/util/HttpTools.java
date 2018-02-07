package com.haoxingart.base.util;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpTools {

	public static String postData(String urlStr,byte [] data){
		StringBuilder buffer=new StringBuilder();
		BufferedReader reader=null;
		OutputStream out=null;
		try {
			URL url = new URL(urlStr);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setRequestMethod("POST");
			http.setConnectTimeout(5000);
			http.setReadTimeout(30000);
			//byte [] bdata = data.getBytes(encodding);
			//http.setRequestProperty("Content-Length", String.valueOf(bdata.length));
			http.setInstanceFollowRedirects(true);
			//http.setRequestProperty("Content-Type","application/json");
			http.setDefaultUseCaches(false);
			http.setDoOutput(true);
			http.setDoInput(true);
			out = http.getOutputStream();
			out.write(data);
			out.flush();
			out.close();
			// 读取返回数据 
			reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
			String line = null;
			while ((line=reader.readLine())!=null) {
				buffer.append(line+"\n");
			}
			if(buffer.length()>0){
				buffer.deleteCharAt(buffer.length()-1);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null)out.close();
				if(reader!=null)reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return buffer.toString();
	}
}
