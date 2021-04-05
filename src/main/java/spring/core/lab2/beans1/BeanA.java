package spring.core.lab2.beans1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {
   private String name;
   private int value;

    public BeanA() {

    }

    public BeanA(String nameA, int valueA) {
        name = nameA;
        value = valueA;
        System.out.println("not lazy A");
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
        return "BeanA:"+ name + ","+ value;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy in beanA");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in afterPropertiesSet in beanA");
    }
}
