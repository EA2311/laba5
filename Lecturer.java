package onpu;

public class Lecturer extends Person {
    private String cathedra;
    private int salary;

    public void setCathedra(String cathedra) {
        this.cathedra = cathedra;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
        else System.out.println("Error!");
    }

    public String getCathedra() {
        return cathedra;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    protected void printInfo() {
        System.out.println("Lecturer of cathedra: " + getCathedra() + " " + getSurname() + " " + getName()
                + ", age: " + getAge() + " The salary: " + getSalary());
    }
}
