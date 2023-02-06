package Class20HomeWork;

public class PartTime extends Employee{
        int experience;

        PartTime(String name, String id, int experience) {
            super(name, id);
            this.experience = experience;
        }
        void printExperience(){
            System.out.println(experience);
        }
    }

