package com.gummybot.lambdapractice.lambdaimplementation;

import com.gummybot.lambdapractice.interfaceexamples.InterfaceHelloWorld;

public class ClassHelloWorldLambda {
    public String helloworldlambdaimplementation(String name){
        InterfaceHelloWorld referencetointerface = (String str) -> {
            /*Since there in only one abstract function in the interface Single Abstract Method(SAM)
            lambda function automatically assumes definition is for the same*/
            return String.format("%s: Hello World -> implemented using Lambda Expression", str);
        };
        return referencetointerface.sayHelloWorld(name);
    }

    public String helloworldlambdaimplementation2(String name){
        /*Since there in only one abstract function in the interface Single Abstract Method(SAM)
          lambda function automatically assumes definition is for the same*/

        //Alternate implementation without curly braces

        /*Not required to provide the type for str below. Java compiler will automatically convert
          to the required type and return the correct type*/
        InterfaceHelloWorld referencetointerface = (str) -> String.format("%s: Hello World -> implemented using Lambda Expression", str);
        return referencetointerface.sayHelloWorld(name);
    }
}
