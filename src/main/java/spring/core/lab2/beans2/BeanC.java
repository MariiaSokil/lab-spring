package spring.core.lab2.beans2;

public class BeanC {
    private String name;
    private int value;

    public BeanC(String nameC, int valueC) {
        name = nameC;
        value = valueC;
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
        return "BeanC:"+ name + ","+ value;
    }

    public void init() {
        System.out.println("not lazy C init");
    }

    public void destroy() {
        System.out.println("not lazy C destroy");
    }
}
