package com.gummybot.lambdapractice.lambdaimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceIncrementByFive;

public class ClassIncrementByFiveLambda {
    public int incrementimplementation(int a){
        /*Not required to provide the type for str below. Java compiler will automatically convert
          to the required type and return the correct type*/
        InterfaceIncrementByFive ref_to_interface = (num) -> num+5;
        return ref_to_interface.incrementbyfive(a);
    }
}
