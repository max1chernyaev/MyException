package Exceptions;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class myEx {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name in capital letters:");
        String Name = scan.nextLine();

        System.out.println("Enter second name in capital letters:");
        String secondName = scan.nextLine(); ;


        Map<String, String> id = new HashMap<>();
        id.put(Name, secondName);


        try {
            if (!Name.equals(Name.toUpperCase(Locale.ROOT)) || !secondName.equals(secondName.toUpperCase(Locale.ROOT))) {
                throw new Exception("NameOrSecondNameNotUpperCase");
            }else {
                System.out.println("ID: " + id);
                System.out.println("Success!");
            }
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Repeat the operation, please.");


    } finally {
            System.out.println("Thanks for using our service.");
        }



    }

}
