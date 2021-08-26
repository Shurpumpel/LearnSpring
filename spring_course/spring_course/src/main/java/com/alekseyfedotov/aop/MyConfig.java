package com.alekseyfedotov.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.alekseyfedotov.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
