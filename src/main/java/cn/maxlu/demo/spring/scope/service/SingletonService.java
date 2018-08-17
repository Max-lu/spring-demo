package cn.maxlu.demo.spring.scope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonService {

    public String getName() {
        return "max";
    }


}
