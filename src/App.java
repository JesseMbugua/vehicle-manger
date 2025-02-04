public class App {
    public static void main(String[] args) throws Exception {
    // Creating a specific instance of the Car class 
    car rollsRoyce = new car("Rolls-Royce Phantom",2017);

    //calling the methods
    rollsRoyce.start();
    rollsRoyce.uniqueFeature();
    rollsRoyce.stop();

    //displaying car details using getters
    System.out.println("the cars model is: " + rollsRoyce.getModel());
    System.out.println("the cars release date is: " + rollsRoyce.getYear());
    }
}
