package spring.core.lab1.interface_beans;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Primary
public class Tiger implements Animal {
    @Override
    public String getAnimalName() {
        return "tiger";
    }
}

