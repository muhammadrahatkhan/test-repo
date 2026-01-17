import java.util.Scanner;
public class Lab2Problem1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1;i<=10;i++){
            int val = num;
            val = num*i;
            System.out.println(num+ " x " +i+" = "+val);
        }
    }
}
