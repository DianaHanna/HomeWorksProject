package Class20HomeWork;

class Employee {

    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void printName() {
        System.out.println(name);
    }

    void printId() {
        System.out.println(id);
    }
}

