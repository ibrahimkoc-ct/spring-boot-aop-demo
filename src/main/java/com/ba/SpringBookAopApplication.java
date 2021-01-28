package com.ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.ba")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBookAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookAopApplication.class, args);
	}

}
