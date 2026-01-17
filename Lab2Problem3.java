import java.util.Scanner;
public class Lab2Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int number = value;
        int lastdigit;
        int reverse = 0;
        do{
            lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number/10;
        }while(number>0);
        input.close();//closing scanner obj
        System.out.println("Before = "+value+"\n"+"After = "+reverse);
    }
}
