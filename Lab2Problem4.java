import java.util.Scanner;
public class Lab2Problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int number = value;
        int reverse = 0;
        int lastdigit;
        while(number>0){
            lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }
        input.close();
        if(value == reverse){
            System.out.println("Input = "+value+"\n"+"Reverse = "+reverse+"\n"+"Palindrome");
        }else{
            System.out.println("Input = "+value+"\n"+"Reverse = "+reverse+"\n"+"Not Palindrome");

        }
    }
}
