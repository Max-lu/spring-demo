package cn.maxlu.demo.spring.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("active.flag", "true");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoService demoService = ctx.getBean(DemoService.class);
    }
}
