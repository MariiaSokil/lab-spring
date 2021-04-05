package spring.core.lab2.beans1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF {
    private String name;
    private int value;

    public BeanF() {
        System.out.println("lazy F");
    }

    public BeanF(String nameF, int valueF) {
        name = nameF;
        value = valueF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanF:"+ name + ","+ value;
    }
}
