package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        NumStack numStack = new NumStack();

        float number = input.nextFloat();
        numStack.addNumStack(number);
       
        numStack.getNumStack();

    }
}