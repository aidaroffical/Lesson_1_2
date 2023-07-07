public class Kitchen {
    private static String repair;
    private static int price;

    public static String getRepair() {
        return repair;
    }

    public static int getPrice() {
        return price;
    }

    public Kitchen(String repair, int price){
        this.repair = repair;
        this.price = price;
    }
}