package spring.core.lab1.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.core.lab1.other_beans.OtherBeanB;

@Component
public class InjectedOtherBeanB {
    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    public void showName(){
        System.out.println(otherBeanB.getNameOfBean("otherBeanB!!!"));
    }
}
