package Lab4.packA;

public abstract class Employee {
    protected String name;
    protected int salary;
    protected int experience;
    
    public Employee(String n, int exp, int sal){
        name = n;
        experience = exp;
        salary = sal;
    }

    public Employee(String n){
        name = n;
    }

    public Employee(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    
    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public int getSalary(){
        return salary;
    }

    public void setExperience(int exp){
        experience = exp;
    }

    public int getExperience(){
        return experience;
    }

    public String toString(){
        return "";
    }

    public abstract void sayHi();
}
