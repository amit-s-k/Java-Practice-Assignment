package main.java.pe2.problem2;

import main.java.problem5.IntegerAdder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOf4 {
    public boolean isPowerOfFour(String number){
        long num;
        try {
            num= Long.parseLong(number);
        }catch (Exception e){
            System.out.println("Input not an integer");
            return false;
        }
        if(num == 0)
            return false;
        while(num != 1)
        {
            if(num % 4 != 0)
                return false;
            num = num / 4;
        }
        return true;
    }
    public static void main(String [] args) throws IOException {
        PowerOf4 powerOf4=new PowerOf4();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String number=bufferedReader.readLine();
        if (powerOf4.isPowerOfFour(number)){
            System.out.println("Number is a power of 4");
        }else {
            System.out.println("Number is not a power of 4");
        }
    }
}
