import specific.animals.Dog;
import Model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person tom = new Person("Tom","Clark", LocalDate.of(1992,2,13));
        Person janet = new Person("Janet","Jackson",LocalDate.of(1992,3,21));
        tom.setSpouse(janet);

        Dog luki = new Dog("luki",LocalDate.of(2012,3,10));

        tom.setPet(luki);
        luki.bark();
        System.out.println(tom);
    }
}