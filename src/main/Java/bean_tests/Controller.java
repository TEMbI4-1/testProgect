package bean_tests;

import org.springframework.stereotype.Component;

@Component
public class Controller implements ControllerMBean {
    public boolean enable;

    public boolean enabled() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }


}
