package model;

import java.util.Scanner;

public class Student {

    private String name;
    private String surname;
    private int age;
    private char gender;
    private double mark;
    private boolean isPhd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public void printAll() {
        System.out.println("Student name: " + name);
        System.out.println("Student surname: " + surname);
        System.out.println("Student age: " + age);
        if(gender=='F'||gender=='f'){
            System.out.println("Student gender: Female");
        } else {
            System.out.println("Student gender: Male");
        }
        System.out.println("Student mark: " + mark);
        System.out.println("Student PhD: " + (isPhd?"has a PhD Degree":"Does not have a PhD Degree"));
    }


}
