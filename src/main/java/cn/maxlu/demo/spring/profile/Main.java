package cn.maxlu.demo.spring.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "profile1,profile2");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        demoService.echo();

        DemoService2 demoService2 = ctx.getBean(DemoService2.class);
        demoService2.echo();
    }
}
