import java.util.Scanner;
public class Lab2Problem2 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int sentinel = 0;
        int i=0;
        int sum = 0;
        while(true){
            int value = input.nextInt();
            sum = sum + value;
            i++;
            if(value == sentinel){
                i--;
                break;
            }
        }
        int result = sum/i;
        System.out.println(result);
    }
}
