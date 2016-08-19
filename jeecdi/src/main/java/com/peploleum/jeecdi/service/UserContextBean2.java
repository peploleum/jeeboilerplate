package com.peploleum.jeecdi.service;

import javax.enterprise.inject.Default;
import java.util.Arrays;

@Default
public class UserContextBean2 implements UserContextService {

    @Override
    public UserContextDto getSomething() {
        try {
            Thread.sleep(2* 1000);
            final UserContextDto toto = new UserContextDto("hello tutu", Arrays.asList(new String[]{"Network", "Maps", "Forms", "Tables"}));
            return toto;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return null;
    }

}
