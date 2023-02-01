package Lab4.packA;

import java.util.ArrayList;

public class Programmer extends Employee {
private ArrayList<String> skills = new ArrayList<>();

public Programmer(String n, int exp, int sal){
    name = n;
    experience = exp;
    salary = sal;
    skills.add("solidity");
    skills.add("typescript");
}

@Override
public void sayHi(){
    System.out.printf("Coding in %s%n", skills);
}


public String toString(){
    return String.format("Programmer [name=%s, salary=%d, experience=%d]", name, salary, experience);
}

public String coding(){
    return "I LOVE COMSCI";
}
}
