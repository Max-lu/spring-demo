package cn.maxlu.demo.spring.factorybean;

import org.springframework.stereotype.Component;

public class DemoService {

    private String name;

    public DemoService(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello " + name);
    }
}
