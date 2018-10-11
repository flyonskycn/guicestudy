package com.flyonsky;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class StudyListener extends GuiceServletContextListener{
	
	@Override
	protected Injector getInjector() {
		Injector inj = Guice.createInjector(new ServletModule() {

			@Override
			protected void configureServlets() {
				serve("*").with(HelloServlet.class);
			}
		});
		return inj;
	}
}
