package tsi.ensg.jee.hibernate.ex1;

public class Employee {
    // Attribute
    private long id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(){
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.salary = 0;
    }
    public Employee(Long id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public long getId(){return this.id;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getSalary(){return this.salary;}

    // Setters
    public void setId(long id){this.id = id;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setSalary(int salary){this.salary= salary;}

    // Method
    public String toString(){
        return this.id + ": " + this.firstName + " " + this.lastName + ", " + this.salary + "€.";
    }

    public boolean equals(Employee employee){
        if (employee.getSalary() == this.salary){
            return true;
        } else {
            return false;
        }
    }

    public String HashCode(){
        return "abc";
    }

} 