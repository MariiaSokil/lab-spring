package spring.core.beans2;

import org.springframework.stereotype.Component;

@Component
public class NarcissusFlower {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
