public class Main {
    public static void main(String[] args) {
        Grandmother grandmother = new Grandmother("Anna", 70);
        Mother mother = new Mother("Kate", 35, 12000, "Reading");
        Daughter daughter = new Daughter("Gul'naz", 23, 4, "Gargering");
        Kitchen kitchen = new Kitchen("New" , 700);

        System.out.println("Grandmother:");
        System.out.println(grandmother.getInfo());
        System.out.println();

        System.out.println("Mother:");
        System.out.println(mother.getInfo());
        System.out.println();

        System.out.println("Daughter:");
        System.out.println(daughter.getInfo());
        System.out.println();

        System.out.println("Kitchen:");
        System.out.println("Repair: " + Kitchen.getRepair());
        System.out.println("Price: " + Kitchen.getPrice());
    }
}