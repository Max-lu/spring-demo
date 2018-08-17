package cn.maxlu.demo.spring.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        //beanFactory();
//        xmlApplicationContext();
        annotationApplicationContext();
    }

    //会实例化bean
    private static void annotationApplicationContext() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
    }

    //会实例化bean(需要bean设置为非lazyload)
    private static void xmlApplicationContext() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
    }

    //不会实例化bean
    private static void beanFactory() {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
    }
}
