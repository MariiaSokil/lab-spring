package spring.core.beans2;

import org.springframework.stereotype.Component;

@Component
public class RoseFlower {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
