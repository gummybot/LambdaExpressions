package com.gummybot.lambdapractice.traditionalimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceConcatenate;

public class ClassConcatenateTraditional implements InterfaceConcatenate {
    @Override
    public String concatenate(String str1, String str2) {
        return String.format("%s %s", str1, str2);
    }
}
