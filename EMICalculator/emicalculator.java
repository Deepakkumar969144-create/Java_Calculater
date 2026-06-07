package EMICalculator;
import java.util.Scanner;
import java.util.*;
public class emicalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("<-- EMI CALCULATOR -->");
        System.out.print("enter loan amount : ");
        double principal = sc.nextDouble();
        if( principal <= 0 ){ // aagar loan 0 ho ya -negative ho 
            System.out.println("invailid loan amount ");
            return;

        }
        System.out.print("enter annual interest rate (%) : ");
        double annualrate = sc.nextDouble();
        if(annualrate <= 0 ){ // aagar interest rate 0 and negtive ho to 
            System.out.println("invalid interest rate ");
            return;

        }
        System.out.print("enter loan in months : ");
        int months = sc.nextInt();
        if(months <= 0 ) { // aagar months 0 and negative huye 
            System.out.println("invalid loan months");
            return;

        }
        double emi = calculateemi(principal, annualrate, months); // emi calculater ko call
        double totalpayment = calculatetotalpayment(emi, months); // calculate t pay
        double totalinterest = calculateTI(totalpayment, principal); // calculate total interest

        System.out.println();
        System.out.println(" >-< ");
        System.out.println("LOAN DETAILS");
        System.out.println(" >-< ");

        // input details print kiya hai format ka use karke 
                // first % ka mtalb hai yeha yek variable ki value hogi 
                // . ka mtlab hai point 
                // 2 ka mtlab hai point ke bad 2 digits hoge 
                // f ka mtlab hai float jese decimal num ( float , double )
                // %% ka mtlab hai display par yek % ka nisan display karna 
                // %d - % ka mtlav yaha ek value aayegi or d ka mtlav hai decimal integer 
        System.out.format("loan amount : %.2f \n ", principal);
        System.out.format("interest rate : %.2f %% \n " , annualrate);
        System.out.format("loan months : %d months \n " , months);
        System.out.println(" >-< ");

        // calculared value print 
        System.out.format("monthly emi : %.2f \n " , emi);
        System.out.format("total payment : %.2f \n " , totalpayment);
        System.out.format(" total interest : %.2f \n " , totalinterest);
        System.out.println(" >-< ");

        sc.close(); // scanner close kiya 
        
    }
    private static double calculateemi( double principal , double annualrate , int months){
        double monthlyrate = annualrate / 12 / 100; // monthly rate me convert karo 
        double powervalue = Math.pow(1+monthlyrate , months); // (1+r)^n calculat karna
        double emi = (principal * monthlyrate * powervalue) / (powervalue - 1 ); // emi formula
        return emi ;

    }
    private static double calculatetotalpayment( double emi , int months){ // calculate total payment 
        return emi * months; // tp = emi * n of months 

    }
    private static double calculateTI( double totalpayment , double principal ) { // toatal interest calculate
        return totalpayment - principal;

    }
    
}
