package __pycache__.nqt_and_digital.codesoft;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            sum=sum+a;

        }
        String grade;
        double avg=sum/n;
        if(avg>50 && avg<=60){
            grade="c";
        }
        else if(avg>60 && avg<=70){
            grade="B";
        }
        else if(avg>70 &&avg<=80){
            grade="A";
        }
        else if(avg>80 && avg<=90){
            grade="E";
        }
        else if(avg>90){
            grade="O";
        }
        else{
            grade="F";
        }
        System.out.println("the total mark: "+sum+" average percentage: "+avg+" grade: "+ grade);

    }
}
