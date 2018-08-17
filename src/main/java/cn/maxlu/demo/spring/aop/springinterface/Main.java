package cn.maxlu.demo.spring.aop.springinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:aop-beans2.xml");
        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.echo();
    }
}
