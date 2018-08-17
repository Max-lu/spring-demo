package cn.maxlu.demo.spring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.echo();
    }
}
