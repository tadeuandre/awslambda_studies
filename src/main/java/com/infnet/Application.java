package com.infnet;

import com.infnet.controller.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.support.*;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.method.annotation.*;

@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts
// @ComponentScan(basePackages = "com.infnet.controller")
@Import({ ContentController.class })
public class Application extends SpringBootServletInitializer {

    /*
     * Create required HandlerMapping, to avoid several default HandlerMapping instances being created
     */
    @Bean
    public HandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    /*
     * Create required HandlerAdapter, to avoid several default HandlerAdapter instances being created
     */
    @Bean
    public HandlerAdapter handlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}