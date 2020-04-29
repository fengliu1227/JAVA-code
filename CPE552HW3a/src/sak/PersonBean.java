/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sak;

/**
 *
 * @author Feng Liu
 */
public class PersonBean { // must be public
    private String firstName, lastName;
    private int age;
    private int ssn;
    
    public PersonBean() { // default constructor
    }
    
    public void setFirstName(String v) {
        firstName = v;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String v) {
        lastName = v;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setAge(int v) {
        age = v;
    }
    
    public int getAge() {
        return age;
    }
    
    public Person[] getChildren() {
        return null;
    }
    
    public void setChildren(Person [] children) {
    }
    
    public void setChild(int i, Person p) {
        //children[i] = p;
    }
    public Person getChild(int i) {
        return null;
    }
}