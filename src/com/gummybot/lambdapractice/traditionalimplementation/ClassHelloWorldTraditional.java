package com.gummybot.lambdapractice.traditionalimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceHelloWorld;

public class ClassHelloWorldTraditional implements InterfaceHelloWorld {

    @Override
    public String sayHelloWorld(String name) {
        return String.format("%s: Hello World -> implemented Traditionally", name);
    }
}
