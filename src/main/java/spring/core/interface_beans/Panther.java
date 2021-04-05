package spring.core.interface_beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class Panther implements Animal {

    @Override
    public String getAnimalName() {
        return "panther";
    }
}

