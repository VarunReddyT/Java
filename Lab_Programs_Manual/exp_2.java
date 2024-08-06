// A resistor is a circuit device designed to provide a specific resistance between its two ends. Resistance is expressed in ohms (Ω) or kilo-ohms (kΩ). Resistors are usually marked with coloured bands that encode their resistance, as shown in figure 1 below. The first two bands represent digits and the third is a power-of-ten multiplier.
// Write a Resistor class containing the parameterized constructor, which takes in three strings representing the three band colours. Write the methods to calculate and set the resistance for the resistor.

import java.util.*;

class Resistor{
    HashMap<String,Integer> colour;
    String band1,band2,band3;
    double value;

    public Resistor(){
        band1=band2=band3="";
        value = 0.0;
    }
    public Resistor(String b1, String b2, String b3){
        band1 = b1;
        band2 = b2;
        band3 = b3;
        colour = new HashMap<>();
        colour.put("black",0);
        colour.put("brown",1);
        colour.put("red",2);
        colour.put("orange",3);
        colour.put("yellow",4);
        colour.put("green",5);
        colour.put("blue",6);
        colour.put("violet",7);
        colour.put("grey",8);
        colour.put("whtie",9);
    }
    public String getResistance(){
        int firstdig = colour.get(band1);
        int seconddig = colour.get(band2);
        int thirddig = (int)(Math.pow(10, colour.get(band3)));
        String value1 = Integer.toString(firstdig)+Integer.toString(seconddig);
        value = Integer.parseInt(value1)*thirddig;
        value /= 1000;
        value1 = value + " Kilo_Ohms";
        return value1;
    }
}

public class exp_2 {
    public static void main(String[] args) {
        Resistor resistor = new Resistor("red","black","orange");
        System.out.println(resistor.getResistance());
    }    
}
