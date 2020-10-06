
package map103lab2;

public class Employee extends Person {
    int employeeNumber;
    
    Employee(int employeeNumber, String firstname, String lastname, int age){
        this.employeeNumber = employeeNumber;
        
        super.setFirstName(firstname);
        super.setLastName(lastname);
        super.setAge(age);
    }
    
    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    
}
