package com.stackroute.main.java.pe2.problem3;
/*
* Create a class named Member with Name, age, Salary as its variable.
* Write an other class named Member Variable that creates an instance of the Member class, initialises its member variables,
 * and then displays the value of each member variable.
* */
public class MemberVariable {

    public static void main(String[] args) {
        Member member = new Member();
        member.setAge(22);
        member.setName("amit");
        member.setSalary(12);
        System.out.println("Member age is " + member.getAge());
        System.out.println("Member name is " + member.getName());
        System.out.println("Member salary is " + member.getSalary());
    }
}
