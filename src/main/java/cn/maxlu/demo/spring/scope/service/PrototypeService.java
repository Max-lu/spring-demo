package cn.maxlu.demo.spring.scope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {

    public String getName() {
        return "max";
    }


}
