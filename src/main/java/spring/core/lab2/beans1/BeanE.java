package spring.core.lab2.beans1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BeanE {
    private String name;
    private int value;

    public BeanE() {

    }
    public BeanE(String nameE, int valueE) {
        name = nameE;
        value = valueE;
        System.out.println("not lazy E");
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
        return "BeanE:"+ name + ","+ value;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("in postConstruct in beanE");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("in preDestroy in beanE");
    }

}
