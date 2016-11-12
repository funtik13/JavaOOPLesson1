package ua.kiev.prog.polimorphysm;

import java.util.Random;

public class DeveloperList {
    private RandomDeveloperName rdn;
    private Developer[] list;
    private int count;
    private static JuniorDeveloper[] listJ;
    private static MiddleDeveloper[] listM;
    private static SeniorDeveloper[] listS;
    private static TeamLeadDeveloper[] listTL;
    private Random random;

    public DeveloperList(int count){
        this.count = count;
    }

    public void createDevelopeList() {
        random = new Random();
        rdn = new RandomDeveloperName();
        list = new Developer[count];
        while (count > 0){
            int typeOfDev = random.nextInt(4);
            --count;
            if (typeOfDev == 0) {
                list[count] = new JuniorDeveloper(rdn.createDeveloperName(),
                        (400 + (Math.random() * (1000 - 400))), random.nextInt(3));
            } else if (typeOfDev == 1) {
                list[count] = new MiddleDeveloper(rdn.createDeveloperName(),
                        (1000 + (Math.random() * (2000 - 1000))), random.nextInt(3) + 1);
            } else if (typeOfDev == 2) {
                list[count] = new SeniorDeveloper(rdn.createDeveloperName(),
                        (1000 + (Math.random() * (3000 - 1000))), random.nextInt(5) + 3);
            } else {
                list[count] = new TeamLeadDeveloper(rdn.createDeveloperName(),
                        (3000 + (Math.random() * (1000 - 3000))), random.nextInt(20) + 7);
            }

        }
    }

    public Developer[] getList() {
        return list;
    }


    public static void showDeveloperList(Developer[] list){
        devideTheList(list);
        System.out.println("-----------------------------------------------------------");
        System.out.println("All Junior Developer");
        for(JuniorDeveloper j : listJ){
            System.out.println(j.getName());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("All Middle Developer");
        for(MiddleDeveloper j : listM){
            System.out.println(j.getName());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("All Senior Developer");
        for(SeniorDeveloper j : listS){
            System.out.println(j.getName());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("All Team Lead Developer");
        for(TeamLeadDeveloper j : listTL){
            System.out.println(j.getName());
        }
        System.out.println();
    }

    private static void devideTheList(Developer[] list){
        int[] count = amount(list);
        listJ = new JuniorDeveloper[count[0]];
        listM = new MiddleDeveloper[count[1]];
        listS = new SeniorDeveloper[count[2]];
        listTL = new TeamLeadDeveloper[count[3]];
        int j = 0;
        int m = 0;
        int s = 0;
        int tl = 0;
        for (Developer d : list){
            if(d instanceof JuniorDeveloper){
                    listJ[j] = (JuniorDeveloper) d;
                j++;
            }else if(d instanceof MiddleDeveloper) {
                    listM[m] = (MiddleDeveloper) d;
                m++;
            }else if(d instanceof SeniorDeveloper){
                    listS[s] = (SeniorDeveloper) d;
                s++;
            }else{
                    listTL[tl] = (TeamLeadDeveloper) d;
                tl++;
            }

        }
    }

    private static int[] amount(Developer[] list){
        int[] a = {0, 0, 0, 0};
        for (Developer d : list){
            if(d instanceof JuniorDeveloper){
                a[0]++;
            }else if(d instanceof MiddleDeveloper) {
                a[1]++;
            }else if(d instanceof SeniorDeveloper){
                a[2]++;
            }else{
                a[3]++;
            }
        }
        return a;

    }

}
