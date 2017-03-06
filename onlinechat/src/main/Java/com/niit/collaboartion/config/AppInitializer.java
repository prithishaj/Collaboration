package com.niit.collaboartion.config;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
private static final Logger logger= LoggerFactory.getLogger(AppInitializer.class);

@Override
protected Class[]getRootConfigClasses(){
	logger.debug("Starting of the method getRootConfigClasses");
	return new Class[]{AppInitializer.class,WebSocketConfig.class};
}

@Override
protected Class[]getServletConfigClasses(){
	logger.debug("Starting of the method getServletConfigClasses");
	return new Class[]{AppInitializer.class,WebSocketConfig.class};
}

@Override
protected String[]getServletMappings(){
	logger.debug("Starting of the method getServletMappings");
	return new String[]{"/"};
}

}
