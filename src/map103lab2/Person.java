package map103lab2;

public class Person {

    String firstName;
    String lastName;
    int age;

    Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
}