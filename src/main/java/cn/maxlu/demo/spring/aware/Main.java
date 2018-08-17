package cn.maxlu.demo.spring.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        String beanName = demoService.getBeanName();
        System.out.println("beanName=" + beanName);

        ApplicationContext ctx2 = demoService.getApplicationContext();
        System.out.println(ctx == ctx2);
    }
}
