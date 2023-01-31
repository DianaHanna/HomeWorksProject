package Class17HomeWork;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    with different marks. Your program should print an average mark of each student's name.
     */

    String name;
    double elaGrade;
    double mathGrade;
    double scienceGrade;
    double averageGrade;

    Students(String studentName, double studentElaGrade, double studentMathGrade, double studentScienceGrade){
        name=studentName;
        elaGrade=studentElaGrade;
        mathGrade=studentMathGrade;
        scienceGrade=studentScienceGrade;

        averageGrade=(studentElaGrade+studentMathGrade+studentScienceGrade)/3;
    }
    void printInfo(){
        System.out.println("Student Name: "+name+" Average Grade :"+averageGrade);
    }

}
