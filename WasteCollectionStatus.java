import java.util.Scanner;
public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the waste collected in kilograms: ");
        double wasteCollected = scanner.nextDouble();
        
        if (wasteCollected > 100) {
            System.out.println("Collection Target Achieved.");
        } else {
            System.out.println("More waste collection required.");
            scanner.close();
        }
    }
}