package Class19HomeWork;

public class ClassD {

    static void printF(){
        System.out.println("PrintF method from Class D");
    }
}

class ClassE extends ClassD{

  static void reusePrintF(){
      printF();
  }
    public static void main(String[] args) {

        ClassE classE=new ClassE();
        classE.reusePrintF();

}
  }