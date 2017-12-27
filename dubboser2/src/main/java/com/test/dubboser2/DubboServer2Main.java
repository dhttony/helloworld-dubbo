package com.test.dubboser2;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboServer2Main {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationProvider.xml" });
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
