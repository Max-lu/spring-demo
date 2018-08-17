package cn.maxlu.demo.spring.aop.springinterface;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

public class CustomBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println("before");
    }
}
