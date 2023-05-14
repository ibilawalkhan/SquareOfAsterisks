import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of rows: ");
        int rows = input.nextInt();

        System.out.println("Enter the size of columns");
        int columns = input.nextInt();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}