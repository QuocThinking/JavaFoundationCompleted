package Package2;

import java.lang.invoke.LambdaConversionException;

public class otherClass {
    public void method1(){
        ClassB classB = new ClassB();
        classB.protectedMethod();

    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.defaultMethod();
    }
}
