package ua.kiev.prog.polimorphysm;

public class Main {
    public static void main(String[] args) {
        DeveloperList dl = new DeveloperList(10);
        DeveloperList dl2 = new DeveloperList(10);
        DeveloperList dl3 = new DeveloperList(10);

        dl.createDevelopeList();
        dl2.createDevelopeList();
        dl3.createDevelopeList();

        Developer[] list = dl.getList();
        Developer[] list2 = dl2.getList();
        Developer[] list3 = dl3.getList();

        StringBuilder sb;
        for (Developer d : list) {
            if (d instanceof SeniorDeveloper && d.getSalary() > 1500) {
                sb = new StringBuilder()
                        .append(d.getClass().getSimpleName())
                        .append(" ")
                        .append(d.getName()).append(" with salary: ")
                        .append(d.getSalary());

                System.out.println(sb.toString());
            }
        }

        DeveloperList.showDeveloperList(list);
        DeveloperList.showDeveloperList(list2);
        DeveloperList.showDeveloperList(list3);
    }
}
