package cn.maxlu.demo.spring.aop.aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="cn.maxlu.demo.spring.aop.aspectj")
@EnableAspectJAutoProxy
public class BeanConfig {

}
