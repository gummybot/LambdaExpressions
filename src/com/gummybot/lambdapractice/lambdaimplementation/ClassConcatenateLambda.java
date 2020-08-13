package com.gummybot.lambdapractice.lambdaimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceConcatenate;

public class ClassConcatenateLambda {
    public String concatenateimplementation(String s1, String s2){
        InterfaceConcatenate ref_to_interface = (str1, str2) -> String.format("%s %s", str1, str2);
        return ref_to_interface.concatenate(s1, s2);
    }
}
