package com.test.dubbocli;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dubboser.ServiceDemo;
import com.test.dubboser2.ServiceDemo2;

public class DubboClientMain {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		while (i++ < 5) {
			run();
			Thread.sleep(3000);
		}
	}

	public static void run() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();
		ServiceDemo demoServer = (ServiceDemo) context.getBean("demoServicemy");
		ServiceDemo2 demoServer2 = (ServiceDemo2) context.getBean("demoServicemy2");
		String str1 = demoServer.say("java ---->>>");
		System.err.println("res: " + str1);

		String str2 = demoServer2.say("java ---->>>");
		System.err.println("res: " + str2);


	}
}
