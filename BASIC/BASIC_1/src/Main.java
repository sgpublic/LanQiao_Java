import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        if ((year % 4 == 0 & year % 100 != 0) | year % 100 == 0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
