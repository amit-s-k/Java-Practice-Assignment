package main.java.pe2.problem7;

public class Factorial {

    public int getFactorial(int num){
        int result=1;
        if (num==0 ||num==1){
            return result;
        }
            for (int c = 1; c <= num; c++)
                result = result*c;
            return result;
    }
    public long getFactorial(long num){
        long result=1;
        if (num==0 ||num==1){
            return result;
        }
        for (long c = 1; c <= num; c++)
            result = result*c;
        return result;
    }

    public static void main(String [] args){
        Factorial factorial=new Factorial();
        int i=0;
        int num=factorial.getFactorial(i);

        while (num <= factorial.getFactorial(i+1)){
            System.out.println("Factorial of "+i+" is "+num);
            i++;
            num=factorial.getFactorial(i);
        }
        System.out.println("\n");
        long j=0;
        long longnum=factorial.getFactorial(j);
        while (longnum <= factorial.getFactorial(j+1)){
            System.out.println("Factorial of "+j+" is "+longnum);
            j++;
            longnum=factorial.getFactorial(j);
        }
    }
}
