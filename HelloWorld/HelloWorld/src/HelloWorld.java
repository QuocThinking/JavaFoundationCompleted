import specific.animals.Dog;
import Model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person tom = new Person("Tom","Clark", LocalDate.of(1992,2,13));
        Person janet = new Person("janet","mackson",LocalDate.of(1992,3,21));

        System.out.println("The person's firstName is : " + janet.getFirstName());
        janet.setLastName("smith");
        System.out.println("The person's firstName is : " + janet.getLastName());
        janet.dob = LocalDate.of(1969,7,22);


//        tom.setSpouse(janet);

//        Dog luki = new Dog("luki",LocalDate.of(2012,3,10));
//
//        tom.setPet(luki);
//        luki.bark();
//        System.out.println(tom);
    }
}