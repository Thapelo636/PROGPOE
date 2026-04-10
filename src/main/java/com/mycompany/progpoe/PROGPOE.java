/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;

import java.util.Scanner;

/**
 *
 * @author khuma
 */
public class PROGPOE {

    static String username;
    static String password;
    static String firstName;
    static String lastName;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Registration");

        // names
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        // username
        System.out.print("Enter username: ");
        username = sc.nextLine();

        if (checkUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        // password
        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (checkPassword(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        // phone
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (checkPhone(phone)) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }

        // login
        System.out.println("\nLogin");

        System.out.print("Username: ");
        String u = sc.nextLine();

        System.out.print("Password: ");
        String p = sc.nextLine();

        if (loginUser(u, p)) {
            System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }

        sc.close();
    }

    // username check (simple way)
    public static boolean checkUsername(String user) {
        if (user.contains("_") && user.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    // password check (not fancy)
    public static boolean checkPassword(String pass) {

        boolean cap = false;
        boolean num = false;
        boolean special = false;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if (Character.isUpperCase(c)) {
                cap = true;
            }

            if (Character.isDigit(c)) {
                num = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                special = true;
            }
        }

        if (pass.length() >= 8 && cap && num && special) {
            return true;
        } else {
            return false;
        }
    }

    // phone (still regex because assignment wants it)
    public static boolean checkPhone(String phone) {
        return phone.matches("^\\+27\\d{9}$");
    }

    // login
    public static boolean loginUser(String u, String p) {
        if (u.equals(username) && p.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}