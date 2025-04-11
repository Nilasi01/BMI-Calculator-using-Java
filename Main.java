import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the weight in Kg:");
        double weight=sc.nextDouble();
        System.out.println("Enter the height in Cm:");
        double height=sc.nextDouble();

        double heightm=height/100;
        double bmi=weight/(heightm*heightm);
        System.out.println("The BMI is:"+ bmi);

           if (bmi<18.5){
            System.out.println("You are underweight");
           }else if (bmi<25){
             System.out.println("You are normal weight");

           }else if (bmi<30){
               System.out.print("You are overweight");

           }else {
               System.out.print("You are obese");
           }


    }
}