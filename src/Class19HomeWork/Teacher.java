package Class19HomeWork;

public class Teacher {

    String name;
    int age;
    String subject;

    // Behaviors
    public void teach() {
        System.out.println(this.name + " is teaching " + this.subject);
    }

    public void grade() {
        System.out.println(this.name + " is grading papers");
    }

    public void attendMeeting() {
        System.out.println(this.name + " is attending a meeting");
    }

    public void planLesson() {
        System.out.println(this.name + " is planning a lesson");
    }
}

class MathTeacher extends Teacher {
    // Features
    String[] mathSubjects;

    // Behaviors
    public void teachMath() {
        System.out.println(this.name + " is teaching math");
    }

    public void solveMathProblem() {
        System.out.println(this.name + " is solving a math problem");
    }
}

class ChemistryTeacher extends Teacher {
    // Features
    String[] chemicals;

    // Behaviors
    public void teachChemistry() {
        System.out.println(this.name + " is teaching chemistry");
    }

    public void conductExperiment() {
        System.out.println(this.name + " is conducting a chemistry experiment");
    }
}

class PianoTeacher extends Teacher {
    // Features
    String[] pianoStyles;

    // Behaviors
    public void teachPiano() {
        System.out.println(this.name + " is teaching piano");
    }

    public void playPiano() {
        System.out.println(this.name + " is playing the piano");
    }

    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Mr. Smith";
        mathTeacher.age = 45;
        mathTeacher.subject = "Math";
        mathTeacher.mathSubjects = new String[]{"Algebra", "Calculus"};
        mathTeacher.teach();
        mathTeacher.teachMath();
        mathTeacher.solveMathProblem();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Ms. Johnson";
        chemistryTeacher.age = 35;
        chemistryTeacher.subject = "Chemistry";
        chemistryTeacher.chemicals = new String[]{"Hydrogen", "Oxygen"};
        chemistryTeacher.teach();
        chemistryTeacher.teachChemistry();
        chemistryTeacher.conductExperiment();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Mrs. Brown";
        pianoTeacher.age = 30;
        pianoTeacher.subject = "Piano";
        pianoTeacher.pianoStyles = new String[]{"Classical", "Jazz"};
        pianoTeacher.teach();
        pianoTeacher.teachPiano();
        pianoTeacher.playPiano();
    }
}

