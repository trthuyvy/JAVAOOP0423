package BT2_Package_Company;

import BT2_Package_Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("vy",21,"Nữ");
        person.getInfoperson();
        System.out.println("===============");
        person.getInfoCompanyClass();
    }
}
