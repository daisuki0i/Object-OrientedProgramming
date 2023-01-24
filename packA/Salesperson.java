package packA;
public class Salesperson extends Programmer {
    private int target;

                                                                                                                                                                                                                     

    public Salesperson(String n, int exp, int sal, int assignedTarget){
        super(n, exp, sal);
        target = assignedTarget;
    }

    public Salesperson(String n, int exp){
        super(n);
        setExperience(exp);
    }

    public void settTarget(int target){
        this.target = target;
    }

    public int gettTarget(){
        return target;
    }

    public void setSalary(){
        salary *= 1.1;
    }

    public void setSalary(int incresedAmount){
        salary += incresedAmount;
    }

    public String  makeQuotation(){
        return "";
    }

    public String toString(){
        return String.format("Salesperson [target=%d, Programmer [name=%s, salary=%d, experience=%d]]", target, super.getName(), salary ,super.getExperience());
    }
}
