package com.test.dubboser2;

public class ServiceImp implements ServiceDemo2 {
	public String say(String str) {
		System.err.println("server: " + str);
		return "hello from service 2: " + str;
	}
}
