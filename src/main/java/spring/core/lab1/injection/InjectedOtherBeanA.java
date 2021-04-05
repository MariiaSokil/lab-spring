package spring.core.lab1.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.core.lab1.other_beans.OtherBeanA;

@Component
public class InjectedOtherBeanA {
    final private OtherBeanA otherBeanA;

    @Autowired
    public InjectedOtherBeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    public void showName(){
        System.out.println(otherBeanA.getNameOfBean("otherBeanA!!!"));
    }

}
