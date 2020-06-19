package com.example.classes;

public class Driver {
    public static void main(String[] args) {
        Subject subject1 = new Subject("TPH201" , "Engineering Physics");
        Subject subject2 = new Subject("TCS201" , "Programming Language");

        if (subject1.equals(subject2))
            System.out.println("They are Same!");
        else
            System.out.println("They are not Same");

        System.out.println(subject1);

        Student student1 = new Student("Chuck Norris", 1238106494);

        ExamPaper paper = new ExamPaper(student1 ,subject1, 100);

        System.out.println(paper);
        System.out.println("Subject Code " + paper.getSubject().getSubjectCode());



    }
}
