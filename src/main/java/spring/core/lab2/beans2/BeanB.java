package spring.core.lab2.beans2;

public class BeanB {
    private String name;
    private int value;

    public BeanB(String nameB, int valueB) {
        name = nameB;
        value = valueB;
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
        return "BeanB:"+ name + ","+ value;
    }
    public void init() {
        System.out.println("not lazy B init");
    }

    public void destroy() {
        System.out.println("not lazy B destroy");
    }

    public void init2() {
        System.out.println("not lazy B init2");
    }

}

