package Class19HomeWork;

public class JavaTeacher extends Teacher{

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {

        JavaTeacher javaTeacher=new JavaTeacher();
        javaTeacher.name="Asel";
        javaTeacher.subject="Java";
        javaTeacher.age=30;

        javaTeacher.code();
        //javaTeacher.teach(); private will give an error cannot be accessed outside the class
        javaTeacher.attendMeeting();
        javaTeacher.grade();
        javaTeacher.planLesson();




    }
}
