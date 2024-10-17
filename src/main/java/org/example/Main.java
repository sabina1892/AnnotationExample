package org.example;
import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++){
            String s = sc.nextLine().trim().toLowerCase();
            if(s.length()<=10)  hs.add(s);
            System.out.println(hs.size());
        }


    }
}