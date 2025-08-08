package com.kathir;

import com.kathir.request.TestRequestContainer;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public void print(TestRequestContainer testRequestContainer)
    {
        System.out.println(testRequestContainer);
    }
}
