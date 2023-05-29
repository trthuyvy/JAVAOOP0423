package BT2_Package_Person;

public class Information {
    public static void main(String[] args) {

        //Gọi các thông tin từ class person
        Person person = new Person();
        System.out.println(person.address);
        System.out.println(person.phone);
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
    }

}
