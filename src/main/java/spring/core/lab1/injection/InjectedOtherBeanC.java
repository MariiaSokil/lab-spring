package spring.core.lab1.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.core.lab1.other_beans.OtherBeanC;

@Component
public class InjectedOtherBeanC {
    @Autowired
    private OtherBeanC otherBeanC;

    public void showName(){
        System.out.println(otherBeanC.getNameOfBean("otherBeanC!!!"));
    }
}
