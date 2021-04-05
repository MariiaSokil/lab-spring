package spring.core.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.core.other_beans.OtherBeanC;

@Component
public class InjectedOtherBeanC {
    @Autowired
    private OtherBeanC otherBeanC;

    public void showName(){
        System.out.println(otherBeanC.getNameOfBean("otherBeanC!!!"));
    }
}
