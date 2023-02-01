package Lab3.packA;

public class Programmer extends EmpTmp {

public Programmer(String n, int exp, int sal){
    name = n;
    experience = exp;
    salary = sal;
}

@Override
public void sayHi(){
    System.out.println("hi from" + name);
}


public String toString(){
    return String.format("Programmer [name=%s, salary=%d, experience=%d]", name, salary, experience);
}

public String coding(){
    return "";
}
}
