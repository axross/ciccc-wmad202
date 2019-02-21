public class Driver {
    public static void main(String[] args) {
        Model derrick = new Model("Derrick", "Park", 70, 176, true);

        derrick.printDetails();

        System.out.println("");

        derrick.displayModelDetails();

        System.out.println("");

        derrick.displayModelDetails(true);
    }
}