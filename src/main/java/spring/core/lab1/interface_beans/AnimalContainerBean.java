package spring.core.lab1.interface_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AnimalContainerBean {
    @Autowired
    private List<Animal> animals;

    public void printAnimal() {
        for (Animal an : animals) {
            System.out.println(an.getAnimalName());
        }
    }
}
