import business.Company;

import java.time.LocalDate;
// import business.FactoryWorker;

class NewsAgency {
    Company company;
    String name;

    public void accessMethod(){
        Person person = new Person();
        person.setFirstName("Quoc");
        System.out.println(person.getFirstName());
        person.setDob(LocalDate.now());
        System.out.println(person.getDob());
    }

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.accessMethod();
    }


}
