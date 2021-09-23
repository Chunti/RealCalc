package com.company;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        NumStack numStack = new NumStack();
        SimpleMath simpleMath = new SimpleMath();
        boolean stop = false;
        float newNumber;
        while(stop == false)
        if(input.hasNextFloat()){
            float number = input.nextFloat();
            numStack.addNumStack(number);
        }
        else
            {
                char symbol = input.next().charAt(0);
                switch (symbol) {
                case '+':
                    newNumber = simpleMath.addXY(numStack.getXValue(),numStack.getYValue());
                    numStack.replace(newNumber);
                    break;

                case 's':
                    stop = true;
                    break;
                }
            }
        Runtime.getRuntime().exec("cls");


        // simpleMath.addXY();


       
        numStack.getNumStack();


    }

}