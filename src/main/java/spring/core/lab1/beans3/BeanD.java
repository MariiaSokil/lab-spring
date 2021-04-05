package spring.core.lab1.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
