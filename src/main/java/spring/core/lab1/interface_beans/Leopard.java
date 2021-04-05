package spring.core.lab1.interface_beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Leopard implements Animal {

    @Override
    public String getAnimalName() {
        return "leopard";
    }
}
