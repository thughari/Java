package java8.lambda;

import java8.interfaces.AddInterface;
import java8.interfaces.Sayable;

public class ReferenceToInstance {
    void say(){
        System.out.println("hello from Reference from Instance method");
    }
    int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        ReferenceToInstance referenceToInstance = new ReferenceToInstance();
        //say method
        Sayable say = referenceToInstance::say;
        say.say();
        //add method
        AddInterface addInterface = referenceToInstance::add;
        System.out.println(addInterface.add(10,20));
    }
}
