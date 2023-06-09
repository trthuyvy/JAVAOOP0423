package BT2_Package_Person;

public class Person {

    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getInfoPerson(){
        System.out.println("Tên:" +name);
        System.out.println("Tuổi:" +age);
        System.out.println("Giới tính:" +gender);
        System.out.println("Địa chỉ:" +address);
        System.out.println("Số điện thoại:" +phone);
    }

    public void getInfoCompanyClass(){
        System.out.println("Tên:" +name);
        System.out.println("Tuổi:" +age);
        System.out.println("Giới tính:" +gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    //Phạm vi truy cập Public
    public void getInfoperson(){
        System.out.println("Name:" + name);
        System.out.println("Tuổi:" + age);
        System.out.println("Giới tính:" + gender);
        System.out.println("Địa chỉ:" + gender);
        System.out.println("Số điện thoại:" + gender);
    }


}


