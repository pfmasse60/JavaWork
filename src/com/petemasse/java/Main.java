package com.petemasse.java;

public class Main {

    public static final int FULL_MENU = 0;
    public static final int RETURN_MENU = 1;

    public static void main(String[] args) {
        Menu m = new Menu();
        String[] mainMenu = new String[9];

        mainMenu[0] = "Main Menu";
        mainMenu[1] = "____ ____";
        mainMenu[2] = "";
        mainMenu[3] = "1. Palindrome Detection";
        mainMenu[4] = "2. Prime Number Generator";
        mainMenu[5] = "3. SQL Database Connect";
        mainMenu[6] = "4. Soup Connect";
        mainMenu[7] = "5. File Encryption";
        mainMenu[8] = "6. Exit";

        m.display(mainMenu);

        if (m.select() == 6) {

            String[] returnMenu = new String[3];
            returnMenu[0] = "1. Return to Main Menu";
            returnMenu[1] = "2. Run again";
            returnMenu[2] = "3. Exit";

            m.display(returnMenu);
            m.select();
        }

    }
}
