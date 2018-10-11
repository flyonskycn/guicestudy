package com.flyonsky;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
	public static void main(String[] args) {
		Injector inj = Guice.createInjector();
		HelloWorld service = inj.getInstance(HelloWorld.class);
		System.out.println(service.sayHello());
	}
}
