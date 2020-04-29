/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sak;

import java.io.*;

/**
 *
 * @author Feng Liu
 */
public class Person implements Serializable {
    //private transient long id;
    private String firstName, lastName;
    private int age;

    public Person(String fname, String lname, int age) {
        firstName = fname;
        lastName = lname;
        this.age = age;
    }

    public boolean equals(Object other) {
        Person p = (Person) other;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName)
                && age == p.age;
    }

    public Person clone() {
        return new Person(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Dov", "Kruger", 52);
        Person p2 = new Person("Peihong", "Yu", 24);
        if (p.equals(p2));
    }
}
