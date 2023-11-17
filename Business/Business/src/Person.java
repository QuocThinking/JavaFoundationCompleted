import business.Company;

import java.time.LocalDate;

public class Person {

    private String lastName;
    private String firstName;

    private LocalDate dob;

    private String middleName = "Christopher";
    public static double PI = 3.14;

    public static  int[] nums = initNums();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static  int[] initNums(){
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        return nums;
    }

    static{
        nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
    }

   public void sayHello(){
       System.out.println("Hello");
   }

   public void saySomeThing(String message){
       System.out.println("Hi! " + message);
   }

   public char getMiddleInitial(){
       return middleName.charAt(5);
   }

   public int add(int num1, int num2){
       return num1 + num2;
   }
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        person.saySomeThing("Quoc");
        person.saySomeThing("Nhan");
        char middleInitial = person.getMiddleInitial();
        System.out.println(middleInitial);
        System.out.println(person.add(6,5));
        System.out.println(person.add(10,8));
        System.out.println(PI);

        System.out.println("Giá trị mảng ban đầu");
        for(int num : nums){
            System.out.println(num + " ");
        }
        nums[3] = 10;
        System.out.println("Mảng sau khi cap nhat");
        for(int num : nums){
            System.out.println(num + " ");
        }
    }

}
