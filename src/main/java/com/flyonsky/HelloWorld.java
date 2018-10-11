package com.flyonsky;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloWorldImp.class)
public interface HelloWorld {
	String sayHello();
}
