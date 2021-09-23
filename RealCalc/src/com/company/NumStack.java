package com.company;

import java.util.ArrayList;

public class NumStack {
    ArrayList<Float> Stack = new ArrayList();

    public NumStack(){
    }

    public void addNumStack(float newNumber){
        Stack.add(newNumber);
    }

    public void replace(float newNumber){
        Stack.remove(Stack.size()-1);
        Stack.remove(Stack.size()-1);
        Stack.add(newNumber);
    }

    public float getXValue(){return Stack.get(Stack.size()-1);}
    public float getYValue(){return Stack.get(Stack.size()-2);}

    public void getNumStack(){
        for (int i = 0; i < Stack.size(); i++) {
            int counter = 0;
            float engineerValue = Stack.get(i);
            while (engineerValue>1000){
                engineerValue/=1000;
                counter+=3;
            }
            System.out.printf("%.02f", engineerValue);
            System.out.println(" x10^" + counter);
        }
    }

}
