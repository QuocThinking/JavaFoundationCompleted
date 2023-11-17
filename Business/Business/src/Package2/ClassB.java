package Package2;

public class ClassB {
    public void publicMethod(){
        System.out.println("This is a public method of class B");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("This is a private method of class B");
    }

    protected void protectedMethod(){
        System.out.println("This is a protected method of class B");
    }

    void defaultMethod(){
        System.out.println("This is a default method of class B");
    }
}
