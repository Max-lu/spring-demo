package cn.maxlu.demo.spring.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "cn.maxlu.demo.spring.beanfactory")
public class BeanConfig {

    @Bean
    public DemoService demoService() {
        return new DemoService();
    }
}
