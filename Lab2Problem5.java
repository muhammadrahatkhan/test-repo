import java.util.Scanner;

public class Lab2Problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        //true=prime, false=not prime
        boolean checker=false;
        if(value<=1){
            checker = false;
        }else if(value==2){
            checker = true;
        }else{
            for(int i=2;i<value;i++){
                if(value%i==0){
                    checker = false;
                    break;
                }else{
                    checker=true;
                }
        }
        }
        
        if(checker==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }    
}
