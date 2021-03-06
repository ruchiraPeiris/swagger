package com.amithfernando.swagger.resteasy.api.config.swagger;

import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SwaggerBootstrap extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setTitle("Test API with rest easy");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/swagger-resteasy/api");
        beanConfig.setResourcePackage("com.amithfernando.swagger.resteasy.api.resources");
        beanConfig.setScan(true);
    }
}
