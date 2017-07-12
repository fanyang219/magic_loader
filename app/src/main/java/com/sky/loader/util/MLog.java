package com.sky.loader.util;

// TODO ���ȼ������־
public class MLog {
	public static void log(String tag, String log) {
		tag+="-"+Thread.currentThread().getStackTrace()[2].getMethodName();
		tag+="-L"+Thread.currentThread().getStackTrace()[2].getLineNumber();
		System.out.println("(" + tag + "): " + log);
	}
	
	public static void log(String tag, String log, String name) {
		tag+="-"+Thread.currentThread().getStackTrace()[2].getMethodName();
		tag+="-L"+Thread.currentThread().getStackTrace()[2].getLineNumber();
		System.out.println("[" + name + "]: " + log + " (" + tag + ")"); 
	}
}
