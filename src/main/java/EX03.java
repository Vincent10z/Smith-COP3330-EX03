/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = enter.nextLine();
        System.out.println("Who said it?");
        String author = enter.nextLine();

        System.out.println("" +author+  " says,"+ '"'+""+quote +'"');



    }

}
