package spring.core.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
