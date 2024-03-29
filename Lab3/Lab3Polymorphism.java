package Lab3;
import java.util.ArrayList;
import Lab3.packA.*;

public class Lab3Polymorphism {
    
    public static void main(String[] args) {
        q1();
    }

    static void q1(){
        ArrayList<EmpTmp> aList = new ArrayList<>();
        aList.add(new Accountant("goodAtmyJob", 7, 6, 390, "sing"));
        aList.add(new Accountant("canRap", 4, 9, 480, "rap"));
        aList.add(new Salesperson("mr.salesperson", 5, 150, 5000));
        aList.add(new Salesperson("mr.kayan", 3, 260, 9000));
        aList.add(new Programmer("keng", 2, 300));
        aList.add(new EmpTmp("invisible", 9, 120));

        System.out.println("Upcasting");
        for (EmpTmp e : aList)

            e.sayHi();
        System.out.println("Downcasting");
        for (EmpTmp e : aList){
            String str;
            str = "";
            
            if (e instanceof Programmer){
                // Programmer p = (Programmer)e;
                // str = p.coding();
                str = ((Programmer)e).coding();
            }

            if (e instanceof Salesperson){
                str = ((Salesperson)e).makeQuotation();
            }

            if (e instanceof Accountant){
                str = ((Accountant)e).tellProfit();
            }

            System.out.println(str);
        }

    }
}
