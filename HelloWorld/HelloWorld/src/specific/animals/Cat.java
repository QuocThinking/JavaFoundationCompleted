package specific.animals;

import Model.Pet;

public class Cat extends Pet {

    public void bark(){
        System.out.println("Meow...");
        super.protectedMethod();
    }

    @Override
    public String toString() {
        return "Cat - name : Tony";
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
        cat1.bark();
        cat1.protectedMethod();
    }
}
