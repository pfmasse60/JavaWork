package com.petemasse.java;

/**
 * Created by peterfmasseiii on 12/29/16.
 */

import java.util.Scanner;

public class Menu extends Object{

    public static final int FULL_MENU = 0;
    public static final int RETURN_MENU = 1;

    public Menu(){

    }

    public void display(String [] menu){
        for (int m = 0; m < menu.length; m++) {
            System.out.println(menu[m]);
        }
    }

    public int select(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
