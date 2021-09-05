/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Steven Iannucci
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[ ] args) {
        // print "What is your name? "
        // add user input for variable name
        // print name in output
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = (input.nextLine());
        System.out.println("Hello," + name + ", nice to meet you!");
    }
}
