import java.util.Scanner;
public class WasteCalculator {

    public static double calculateTotalWaste(double point1Waste, double point2Waste){
        return point1Waste + point2Waste;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter waste collected at point 1 (in kg): ");
        double point1Waste = scanner.nextDouble();
        System.out.print("Enter waste collected at point 2 (in kg): ");
        double point2Waste = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected: " + totalWaste + " kg");

        scanner.close();
    }
}