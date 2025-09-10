public class Teacher {
    //property class
    String name;
    String subject;
    double salary;
    int age;

    //constructor
    public Teacher() {
        name = "mail";
        subject = "Unknown";
        salary = 30000.0;
        age = 25;
    }
    //getter
    public String getName() {
        return name;
    }   
    public String getSubject() {
        return subject;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    //method
    

    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.salary = 30000.0 + (yearsOfExperience * 2000);
        this.age = 25 + yearsOfExperience;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
