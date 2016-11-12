package ua.kiev.prog.polimorphysm;

import java.util.Random;

public class RandomDeveloperName {
    private Random random = new Random(System.currentTimeMillis());
    private String[] name = {"Jacob", "Mason", "Ethan", "Noah", "William", "Liam", "Jayden",
            "Michael", "Alexander", "Aiden", "Pedro","Sherlok", "Sveta", "Dasha",
            "Alyona", "Tanya", "Marina", "Olga", "Voldka", "Andrey", "Vasya", "Ivan",
            "Nastya"};
    private String[] surName = {"Adderiy","Addington", "Adrian", "Albertson", "Aldridge", "Bargeman",
            "Barnes", "Barrington", "Bawerman", "Carroll", "Carter", "Chandter", "Chapman", "Dean",
            "Derrick", "Dickinson", "Enderson", "Erickson", "Evans", "Fleming", "Ford", "Forman", "Galbraith",
            "Gardner", "Garrison", "Hamphrey", "Hancock", "Hardman", "Jacobson", "James", "Vance", "Vaughan"};

    StringBuilder sb;

    public String createDeveloperName(){
        sb = new StringBuilder();
        sb.append(name[random.nextInt(name.length)]);
        sb.append(" ");
        sb.append(surName[random.nextInt(surName.length)]);
        return sb.toString();
    }

}
