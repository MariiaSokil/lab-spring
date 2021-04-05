package spring.core.interface_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainBeanAnimal {
    @Autowired
    private Animal animal;

    @Autowired
    @Qualifier("tiger")
    private Animal tiger;

    @Autowired
    @Qualifier("panther")
    private Animal panther;

    @Autowired
    @Qualifier("lion")
    private Animal lion;

    Animal getAnimalName(){
        return animal;
    }


}
