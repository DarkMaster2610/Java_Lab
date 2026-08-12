import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}