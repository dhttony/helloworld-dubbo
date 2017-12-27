package com.test.dubboser;

public class ServiceImp implements ServiceDemo {
	public String say(String str) {
		System.err.println("server: " + str);
		return "hello from service 1: " + str;
	}
}
