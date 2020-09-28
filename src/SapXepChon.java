import java.util.Scanner;

public class SapXepChon {

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " Value ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        selectionSort(list);
        System.out.println("Your input list");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }
}

