package onpu;

public class Student extends Person {
    private String group;
    private int number;

    public void setGroup(String group) {
        this.group = group;
    }

    public void setNumber(int number) {
        if (number >= 0)
            this.number = number;
        else System.out.println("Error!");
    }

    public String getGroup() {
        return group;
    }

    public int getNumber() {
        return number;
    }

    @Override
    protected void printInfo() {
        System.out.println("Student of group: " + getGroup() + " " + getSurname() + " " + getName() + ", age: " + getAge() + ". Number of student's ticket: " + getNumber());
    }
}
