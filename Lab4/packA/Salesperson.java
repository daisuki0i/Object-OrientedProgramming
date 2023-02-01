package Lab4.packA;
public  class Salesperson extends Employee {
    private int target;

                                                                                                                                                                                                                     

    public Salesperson(String n, int exp, int sal, int assignedTarget){
        super(n, exp, sal);
        target = assignedTarget;
    }

    public Salesperson(String n, int exp){
        super(n);
        setExperience(exp);
    }

    public void setTarget(int target){
        this.target = target;
    }

    public int getTarget(){
        return target;
    }

    public void setSalary(){
        salary *= 1.1;
    }

    @Override
    public void setSalary(int incresedAmount){
        salary += incresedAmount;
    }
    
    public String  makeQuotation(){
        return String.format("Dear value customer, %d is my best offer.", (int)(Math.random()* target));
    }

    public String toString(){
        return String.format("Salesperson [target=%d, Programmer [name=%s, salary=%d, experience=%d]]", target, super.getName(), salary ,super.getExperience());
    }

    @Override
    public void sayHi() {
        System.out.print("Hello"); 
    }
}
