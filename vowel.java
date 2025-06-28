import java.util.Scanner;
public class vowel{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        input=input.toLowerCase();
        System.out.print("Vowels in the string: ");
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch='o'||ch=='u'){
                System.out.print(ch+"");
        }
        
    }
    sc.close();
}
}