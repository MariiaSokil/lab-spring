package spring.core.lab1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
   private String name;

    @Override
    public String toString() {
        return name;
    }
}
