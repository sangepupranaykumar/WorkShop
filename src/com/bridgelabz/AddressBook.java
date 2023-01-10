package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //AddressBook contact= new AddressBook();
    AddressBookMain details = new AddressBookMain();
    ArrayList<AddressBookMain> listOfContacts = new ArrayList<>();
    public void addContacts(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        details.setName(scanner.next());
        System.out.println("Enter the age ");
        details.setAge(scanner.next());
        System.out.println("Enter the phone Number");
        details.setPhoneno(scanner.next());
        System.out.println("Enter the City ");
        details.setCity(scanner.next());
        System.out.println("Enter the State ");
        details.setState(scanner.next());
        AddressBookMain list = new AddressBookMain(details.getName(), details.getAge(),details.getPhoneno(),details.getCity(),details.getState());
        listOfContacts.add(list);
        }
        public void Show(){
            System.out.println(listOfContacts);
        }

    public static void main(String[] args) {
        AddressBook obj = new AddressBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Contacts :");
        int number = scan.nextInt();
        for (int i=1; i<= number;i++){
            System.out.println(obj.listOfContacts);
        }
        obj.addContacts();
        obj.Show();
        obj.toString();
    }
}
