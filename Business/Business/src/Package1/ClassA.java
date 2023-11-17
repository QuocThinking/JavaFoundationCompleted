package Package1;

import Package2.ClassB;

public class ClassA extends ClassB {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
        ClassA classA = new ClassA();
        classA.protectedMethod();
    }

}
