package com.company;

import java.util.ArrayList;

public class NumStack {
    ArrayList<Float> Stack = new ArrayList();

    public NumStack(){
    }

    public void addNumStack(float newNumber){
        Stack.add(newNumber);
    }

    public void getNumStack(){
        for (int i = 0; i < Stack.size(); i++) {
            System.out.println(Stack.get(i));
        }
    }

}
