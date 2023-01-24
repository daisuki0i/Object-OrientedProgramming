package packA;

public class Accountant extends Programmer {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    public Accountant(String name, int superExp, int experience, int sal, String talent){
        super(name, superExp, sal);
        this.experience = experience;
        specialty = talent;
    }

    public void setSpecialty(String newSpecialty){
        specialty = newSpecialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setAccountExperience(int newExperience){
        experience = newExperience;
    }

    public int getAccountExperience(){
        return experience;
    }

    public String tellProfit(){
        int random = (int) (Math.random() * 1000);
        return String.format("%s 's profit is %d. My salary is %d" ,companyName, random, super.getSalary());
    }

    public String toString(){
        return String.format("%s %d %d can%s", super.getName(), super.getExperience(), experience, specialty);
    }

    public  static String tellMyRole(){
        return String.format("I am an accountant at %s" , companyName);
    }

    public void sayHi(){
        System.out.println(tellProfit());
    }

}
