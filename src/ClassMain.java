import com.gummybot.lambdapractice.lambdaimplementation.*;
import com.gummybot.lambdapractice.traditionalimplementation.*;

public class ClassMain {
    public static void main(String[] args) {
        ClassHelloWorldTraditional traditionalObj = new ClassHelloWorldTraditional();
        System.out.println(traditionalObj.sayHelloWorld("Gurman"));
        ClassHelloWorldLambda lambdaObj = new ClassHelloWorldLambda();
        System.out.println(lambdaObj.helloworldlambdaimplementation2("Bhalla"));
        ClassIncrementByFiveTraditional incTradObj = new ClassIncrementByFiveTraditional();
        System.out.println(incTradObj.incrementbyfive(21));
        ClassIncrementByFiveLambda incLambdaObj = new ClassIncrementByFiveLambda();
        System.out.println(incLambdaObj.incrementimplementation(36));
        ClassConcatenateTraditional conTradObj = new ClassConcatenateTraditional();
        System.out.println(conTradObj.concatenate("Hello", "World"));
        ClassConcatenateLambda conLambdaObj = new ClassConcatenateLambda();
        System.out.println(conLambdaObj.concatenateimplementation("Hello", "World"));
    }
}
