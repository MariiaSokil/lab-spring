package spring.core.interface_beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Lion implements Animal {

    @Override
    public String getAnimalName() {
        return "lion";
    }
}
