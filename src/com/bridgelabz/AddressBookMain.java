package com.bridgelabz;

public class AddressBookMain {
    String name,age,phoneno,city,state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBookMain{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public AddressBookMain(String name, String age, String phoneno,String city, String state){
        this.name= name;
        this.age=age;
        this.phoneno=phoneno;
        this.city=city;
        this.state=state;
    }
    public AddressBookMain(){

    }
}
