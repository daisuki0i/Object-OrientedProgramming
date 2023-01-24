import java.util.*;

class Lab1Coder {
    private String name;
    int experience;
    private ArrayList<String> languages; 
    
    Lab1Coder(){
        languages = new ArrayList<>();
    }

    Lab1Coder(String n){
        name = n;
        experience = 0;
        languages = new ArrayList<>();
    }
 
    Lab1Coder(String n, int exp){
        name = n;
        experience = exp;
        languages = new ArrayList<>();

    }

    void setName (String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setExperience(int exp){
        experience = exp;
    }

    int getExperience(){
        return experience;
    }

    void setLanguage(String... lang){
        for(String str : lang){
            this.languages.add(str);
        }
    }

    ArrayList<String> getLanguages(){
        return languages;
    }

    ArrayList<String> findCommonLanguages(Lab1Coder other){
        ArrayList<String> collect = new ArrayList<>();
        for (String i : this.languages){
            for (String j : other.getLanguages()){

                if (i.equals(j)){
                    collect.add(i);
                }
            }
        }
        if (collect.size() == 0){
            collect.add("None");
        }
        return collect;
    }

    public String toString(){
        return String.format("%s(%d) know %s", name, experience, languages.toString().replace("[", "")
                                                                        .replace("]", "")
                                                                        .replace(",", ""));
    }

}