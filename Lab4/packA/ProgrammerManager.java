package Lab4.packA;

public class ProgrammerManager extends Programmer implements ManagerRoles {
    
    public ProgrammerManager(String n, int exp, int sal) {
        super(n, exp, sal);
    }

    public void sayHi(){
        super.sayHi();
    }

    public String coding(){
        return "Hello";
    }

    public int evaluate(Programmer p){
        int newSalary = (int)Math.round(1.15 * p.salary);
        return newSalary; 
    }

    public String toString(){
        return String.format("Manager%s", super.toString());
    }
}
