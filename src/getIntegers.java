import java.util.Scanner;

public class getIntegers {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int num, i, total = 0;
        System.out.println("Enter a number 10 times, and I will tell you the sum.");

        for (i=0; i<10; i++){
            System.out.println("Enter a number");
            num = input.nextInt();
            total += num;
        }
        System.out.println("The total of all 10 numbers is " + total + ".\n" +
                "Thank you for playing with me. See you later!");


    }
}
