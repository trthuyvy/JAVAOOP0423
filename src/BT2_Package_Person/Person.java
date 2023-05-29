package BT2_Package_Person;

public class Person {

    public String name = "Zy";
    public int age = 28;
    public String gender = "Nữ";
    public String address = "Quận 7";
    public String phone = "+84909097890";

    //khai báo hàm xây dựng có tham số
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    //khai báo hàm xây dựng KHÔNG có tham số
    public Person (){

    }

    //Phạm vi truy cập Public
    public void getInfoperson(){
        System.out.println("Name:" + name);
        System.out.println("Tuổi:" + age);
        System.out.println("Giới tính:" + gender);

    }

    public static void main(String[] args) {

        Person person1 = new Person("Q3","012345678");
        System.out.println(person1.address);
        System.out.println(person1.phone);

        System.out.println("=================");
        Person person2 = new Person("ZyZy", 28,"NU");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);
    }

}


