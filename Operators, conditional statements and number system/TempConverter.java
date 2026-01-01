//Temparature convert 
//Farenheit to celcius

import java.util.Scanner;

public class TempConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temparature in Fahrenheit : ");
        float  f=sc.nextFloat();
        float c = ((f-32)*5)/9;
        System.out.println("The given temparature in Celcius is : "+c+"degree");
    }
}