package main.java.pe2.problem3;

public class MemberVariable {

    public void log(Member member){
        System.out.println("Member Name is "+member.name);
        System.out.println("Member Age is "+member.age);
        System.out.println("Member Salary "+member.salary);
    }

    private Member setMemberVariable(String name, int age, int salary){
        Member member=new Member();
        member.name= name;
        member.age=age;
        member.salary=salary;
        return member;
    }

    public static void main(String [] args){
        MemberVariable memberVariable =new MemberVariable();
        memberVariable.log(memberVariable.setMemberVariable("amit",22,10));
    }
}
