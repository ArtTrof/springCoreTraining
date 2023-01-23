package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
//    @PostConstruct - init method
    public void doMyInit(){
        System.out.println("Doing my init");
    }
//    @PreDestroy - to call destroy method
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
