package cn.maxlu.demo.spring.aop.springinterface;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class CustomAfterAdvice implements AfterReturningAdvice {


    @Override
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("after return");
    }
}
