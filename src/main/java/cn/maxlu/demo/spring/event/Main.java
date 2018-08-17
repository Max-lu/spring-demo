package cn.maxlu.demo.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(BeanConfig.class);
        cxt.start();
        cxt.stop();
        cxt.close();

        TimeUnit.SECONDS.sleep(2);
    }
}
