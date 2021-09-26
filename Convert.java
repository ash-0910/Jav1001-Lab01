/*  Ashish Surti 
    Student id - A00244471
    Program - MAPD - JAV1001, Lab - 01
*/


import java.util.Scanner;

public class Convert{

    public static void main(String[] args){

        double num1;
        String value;
        String check;


        do{

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a numeric value to convert and unit of measure: eg:- 10 km / 5.4 cm.");
            System.out.println("Please type any of the following unit of measure.");
            System.out.println("************ km, mi, cm, lb, kg, in *****************");
            
            //taking value from the user 
            num1 = scan.nextDouble();
            value = scan.next();

                //convert km to mi
                if(value.equals("km") || value.equals("KM") || value.equals("Km") || value.equals("kM")){

                    double miles = num1 / 1.609344;

                    System.out.println(num1 + " " + value + " is " + miles + " mi");


                }
                // convert mi to km
                else if(value.equals("mi") || value.equals("Mi") || value.equals("MI") || value.equals("mI")){

                    double kilometers = num1 * 1.60934;

                    System.out.println(num1 + " " + value + " is " + kilometers +" km");
                }
                // convert cm to in 
                else if (value.equals("cm") || value.equals("Cm") || value.equals("cM") || value.equals("CM")){

                    double inches = num1 * 0.394;

                    System.out.println(num1 + " " + value + " is " + inches + " in");
                }
                // convert in to cm
                else if(value.equals("in") || value.equals("In") || value.equals("iN") || value.equals("IN")){
                
                    double centimeters = num1 * 2.54;

                    System.out.println(num1 + " " + value + " is "+ centimeters + " cm"); 
                }
                //convert kg to lb
                else if(value.equals("kg") || value.equals("Kg") || value.equals("kG") || value.equals("KG")){

                    double pounds = num1 * 2.20462262;

                    System.out.println(num1 + " " + value + " is " + pounds + " lb");
                }
                //convert lb to kg
                else if(value.equals("lb") || value.equals("Lb") || value.equals("lB") || value.equals("LB")){

                    double kilograms = num1 * 0.4536;

                    System.out.println( num1 + " " + value + " is " + kilograms + " kg");
                }

            //check if the user wants to check any other unit of measure
            Scanner sc = new Scanner(System.in);

            System.out.println("Do you want to check for any other unit of measure? Y/N ");

            check = sc.next();


        }
        while(check.equals("y") || check.equals("Y"));
    

        //thanking the user for using the program
        System.out.println("****************Thank you for using the conversions program****************");


    }

}