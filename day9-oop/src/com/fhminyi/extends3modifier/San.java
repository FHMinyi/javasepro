package com.fhminyi.extends3modifier;

import com.fhminyi.extends2modifier.Fu;

public class San extends Fu {
    public void Show() {
        protectedMethod();
        publicMethod();
//        method();
    }
}
