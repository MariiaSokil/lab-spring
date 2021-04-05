package spring.core.lab2.beans2;

//import org.springframework.boot.context.properties.ConfigurationProperties;


public class BeanD {
    private String name;
    private int value;

    public BeanD(String nameD, int valueD) {
        name = nameD;
        value = valueD;
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
        return "BeanD:"+ name + ","+ value;
    }

    public void init() {
        System.out.println("not lazy D init");
    }

    public void destroy() {
        System.out.println("not lazy D destroy");
    }
}
