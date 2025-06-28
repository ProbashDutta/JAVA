import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = 0; 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                count++; 
                if (count % 2 != 0) { 
                    System.out.print(Character.toUpperCase(ch));
                }
            }
        }

        sc.close();
    }
}

