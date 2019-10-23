package onpu;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Student();
        person1.setName("Andrey");
        person1.setSurname("Yerzhov");
        person1.setAge(19);

        if (person1 instanceof Student) {
            Student student1 = (Student) person1;
            student1.setGroup("AD-181");
            student1.setNumber(1);
        } else if (person1 instanceof Lecturer) {
            Lecturer lector1 = (Lecturer) person1;
            lector1.setCathedra("Information technologies");
            lector1.setSalary(20000);
        }

        Person person2 = new Student();
        person2.setName("Maksim");
        person2.setSurname("Boliandra");
        person2.setAge(19);

        if (person2 instanceof Student) {
            Student student2 = (Student) person2;
            student2.setGroup("AM-181");
            student2.setNumber(2);
        } else if (person2 instanceof Lecturer) {
            Lecturer lector1 = (Lecturer) person2;
            lector1.setCathedra("Information technologies");
            lector1.setSalary(20000);
        }

        Person person3 = new Lecturer();
        person3.setName("Vladimir");
        person3.setSurname("Vichuzhanin");
        person3.setAge(40);

        if (person3 instanceof Student) {
            Student student3 = (Student) person3;
            student3.setGroup("AD-181");
            student3.setNumber(3);
        } else if (person3 instanceof Lecturer) {
            Lecturer lector1 = (Lecturer) person3;
            lector1.setCathedra("Information technologies");
            lector1.setSalary(20000);
        }

        Person[] people = {person1, person2, person3};
        for (int i = 0; i < 3; i++)
            people[i].printInfo();
    }
}

