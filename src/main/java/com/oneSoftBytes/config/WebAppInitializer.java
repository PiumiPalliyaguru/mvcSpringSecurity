package com.oneSoftBytes.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] config = {MyAppConfig.class};
        return config;
    }

    protected String[] getServletMappings() {
        String[] mapping = {"/"};
        return mapping;
    }
}
