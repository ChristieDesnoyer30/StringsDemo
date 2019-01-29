package com.company;

public class Main {

    public static void main(String[] args) {
	// *Exercise 12.4*
        //
        //++Create a String object using the new operator and initialize it with the value of your full name (first name + last name)
        //++Create a second String object and initialize it with the value of your full name in lowercase
        //++Use the .equals() and .equalsIgnoreCase() methods to test whether or not your two Strings are equal
        //++Use the .length() method to print out the length of your full name
        //++Use the .concat() method to concatenate your two Strings together and print out the new concatenated String
        //++Use the charAt(int index) method to return the index of the fourth letter of your name
        //
        //++Create (2) String objects, and initialize one with the value of your first name and one with with the value of a classmate’s first name
        //++Use the compareTo(String comparedString) to determine which of your names comes first, alphabetically
        //++Use the replace(char find, char replacement) method to replace all instances of one letter in your name with the letter ‘z’
        //++Use the substring(int index) method to return the last 2 letters of your name



        String fullName = "Christie Desnoyer";

        String lowerCaseFullName = fullName.toLowerCase();

        boolean isEqual1 = fullName.equals(lowerCaseFullName);

        boolean isEqual2 = fullName.equalsIgnoreCase(lowerCaseFullName);

        int lengthOfName = fullName.length();


        System.out.println(fullName);
        System.out.println(lowerCaseFullName);
        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(lengthOfName);
        System.out.println(fullName.concat(lowerCaseFullName));
        System.out.println(fullName.charAt(3));


        String myName = "Christie";
        String yourName = "Nada";

        int value = myName.compareToIgnoreCase(yourName);
        String comparedString = " ";

        if (value < 0){
            System.out.println( myName + " comes before " + yourName + " alphabetically. ");

        } else if (value > 0 ){

            System.out.println( yourName + " comes before  " + myName + " alphabetically.");
        } else{

            System.out.println("They are equal");
        }

        System.out.println(comparedString);

        System.out.println(myName.replace('i', 'z'));
        System.out.println(myName.substring(6));




    }
}
