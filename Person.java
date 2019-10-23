package onpu;

public class Person {
    protected String surname;
    protected String name;
    protected int age;

    protected void setSurname(String surname){
        this.surname=surname;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Error!");
    }

    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    protected void printInfo(){
        System.out.println("Human "+getSurname()+ " "+getName()+", age: "+getAge());
    }
}
