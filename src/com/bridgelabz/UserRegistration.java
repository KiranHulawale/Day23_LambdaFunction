package com.bridgelabz;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    static Scanner scan = new Scanner(System.in);

    interface IValidate {
        boolean validate(String regex,String str) throws CustomException;
    }

    public void firstName() throws CustomException {
        System.out.print(" Please enter the FirstName: ");
        String name = scan.nextLine();
//        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
//        Matcher match = pattern.matcher(name);
        IValidate validateFirstName = (pattern,firstName) -> {
            return Boolean.parseBoolean("The name given is " + Pattern.compile(pattern).matcher(firstName).matches());
        };
        System.out.println(validateFirstName.validate("^[A-Z][a-z]{2,}$", name));
    }



    public void lastName() throws CustomException {
        System.out.print(" Please enter the LastName: ");
        String name = scan.nextLine();
//        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
//        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        IValidate validateFirstName = (pattern,lastName) -> {
            return Boolean.parseBoolean("The name given is " + Pattern.compile(pattern).matcher(lastName).matches());
        };
        System.out.println(validateFirstName.validate("^[A-Z][a-z]{3,}$", name));
    }


    public void validMail() throws CustomException {
        System.out.print(" Please enter the mail id");
        String name = scan.nextLine();
//        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$");
//        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        IValidate validateFirstName = (pattern,validMail) -> {
            return Boolean.parseBoolean("The name given is " + Pattern.compile(pattern).matcher(validMail).matches());
        };
        System.out.println(validateFirstName.validate("^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$", name));
    }

    public void validMobileNo() throws CustomException {
        System.out.print(" Please enter the mobile number");
        String name = scan.nextLine();
//        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
//        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        IValidate validateFirstName = (pattern,validMobileNo) -> {
            return Boolean.parseBoolean("The name given is " + Pattern.compile(pattern).matcher(validMobileNo).matches());
        };
        System.out.println(validateFirstName.validate("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$",name));
    }

    public void password() throws CustomException {
        System.out.print(" Please enter the password");
        String name = scan.nextLine();
//        Pattern pattern = Pattern.compile("^(?=.*[A-Z]).{8,}$");
//        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        IValidate validateFirstName = (pattern,password) -> {
            return Boolean.parseBoolean("The name given is " + Pattern.compile(pattern).matcher(password).matches());
        };
        System.out.println(validateFirstName.validate("^(?=.*[A-Z]).{8,}$",name));
    }

    public static void main(String[] args) {
        UserRegistration userDetails = new UserRegistration();

    }
}