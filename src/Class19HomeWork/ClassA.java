package Class19HomeWork;

public class ClassA {

    String subject;
    String teacher;

    void understandingLevel(){
        System.out.println("Understanding level from Class A");
    }
}

class ClassB extends ClassA{

    int score;

    void goodScore(){
        System.out.println("Good score method from Class B");
    }
}

class ClassC extends ClassB{

    int courseDuration;

    void howLong(){
        System.out.println("How long method from Class C");
    }
}
