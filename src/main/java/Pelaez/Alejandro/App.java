/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static boolean valid = false;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight in pounds? ");
        float weight = ValidateInput();
        System.out.print("What is your height in inches? ");
        float height = ValidateInput();

        float bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi);
        if (bmi > 18.5f && bmi < 25)
        {
            System.out.println("You are in the ideal weight range");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }

    private static float ValidateInput()
    {
        float val = 0;
        while (!valid)
        {
            String in = input.next();
            try
            {
                val = Float.parseFloat(in);
                valid = true;
            } catch (NumberFormatException ex)
            {
                System.out.println("Incorrect input. Try again: ");
            }
        }
        valid = false;
        return val;
    }
}
