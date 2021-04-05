package spring.core.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanF {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
