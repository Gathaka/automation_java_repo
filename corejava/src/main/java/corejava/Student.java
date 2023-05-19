package corejava;

public class Student {
    int rno, age;

    public void displaystmt1() {
       System.out.println(" Welcome to learn core Java");
    }

    public void displaystmt2() {
        System.out.println("Automation is Very Easy");
    }

    public static void main(String args[]) {
        Student abc = new Student();
        abc.rno = 12345;
        abc.age = 20;
        System.out.println("Student Roll Number : " + abc.rno);
        System.out.println("student Age :" + abc.age);
        abc.displaystmt1();
        abc.displaystmt2();
    }
}