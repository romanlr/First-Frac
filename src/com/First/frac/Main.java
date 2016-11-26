package com.First.frac;
import java.util.Scanner;
/**
 * Created by roman on 13.11.16.
 */
public class Main {
    public static void main (String arg[]){
        Frac frac =new Frac(1,6);
        Frac frac2 = new Frac(1,3);
        System.out.println(frac+" "+frac2 );
        Frac res = frac.sum(frac2);
        System.out.println(res+"");
        Frac result =frac.sum(6);
        System.out.println(result);
        System.out.println(frac.isShorten());
        System.out.println(frac.makeshort());
        System.out.println(frac.isEqual(frac2));
        System.out.println(frac.compareTo(frac2));
    }
}

