package io.nishant.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import io.nishant.api.config.SwaggerConfig;
import io.nishant.api.config.WebConfig;

@SpringBootApplication
@Import({ SwaggerConfig.class, WebConfig.class})
public class Application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    } 
}
