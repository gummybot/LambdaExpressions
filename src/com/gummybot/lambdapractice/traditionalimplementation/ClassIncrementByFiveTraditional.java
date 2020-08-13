package com.gummybot.lambdapractice.traditionalimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceIncrementByFive;

public class ClassIncrementByFiveTraditional implements InterfaceIncrementByFive {
    @Override
    public int incrementbyfive(int a) {
        return a+5;
    }
}
