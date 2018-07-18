package com.cloud.home.management.service.service.fallback;

import com.cloud.home.management.service.entity.User;
import com.cloud.home.management.service.service.Test2;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Component
public class Test2Fallback implements Test2 {
    @Override
    public List<User> sayHiFromClientOne(String name) {
        return new ArrayList<>();
    }
}
