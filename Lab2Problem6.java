import java.util.Scanner;
public class Lab2Problem6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        input.close();
        int gcd=1;
        int lcm;
        //formula : gcd * lcm = firstNum * secondNum 
        for(int i=1; i<=firstNum && i<=secondNum;i++){
            if(firstNum % i == 0 && secondNum % i == 0){
                gcd=i;
            }
        }
        lcm = firstNum * secondNum / gcd;
        System.out.println("GCD = "+gcd+"\n"+"LCM = "+lcm);
    }
}
