package __pycache__.nqt_and_digital.codesoft;
import java.util.*;

public class TASK1 {
    public static void main(String[] args) {
        Random rd=new Random(); 
        int a=rd.nextInt(1,100); 
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        int t=1;
        
        while(b){
            while(t<=10){
        System.out.println("enter their guess for the generated number :");
        int c=sc.nextInt();
     
        
        if(a==c){
            System.out.println("the guess is correct");
            b=false;
            t=99999;

        }
        else if(a>c){
            System.out.println("the guess is too low");
            b=true;
            t++;
            
            
        }
        else{
            System.out.println("the guess is too high");
            b=true;
            t++;
           
        }

        }
        if(t>10 && b==true ){
        System.out.println(" play again.");
        break;
    }
    System.out.println("round won");

    }
}
}