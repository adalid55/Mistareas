package Ejercicios;

import java.util.Random;

public class Ejercicio2 {
    
   public static void main(String[] args) {
        int a[ ] = {7,8,9};
       
       Random rand = new Random();
       
        for(int i = 0; i < a.length; i++){
            
            int del = rand.nextInt(a.length-i);
            
            System.out.println("a = " + del);
            
            for(int j = del; j < a.length-i-1; j++){
                a[j]= a[j+1];
                System.out.println("aj = " + a[j]);
                System.out.println("aj+1 = " + a[j+1]);
            }
                a[a.length-i-1]=0;
        }
       System.out.println("a[1] = " + a[0]);
       System.out.println("a[2] = " + a[1]);
       System.out.println("a[3] = " + a[2]);
    } 
       
  
    /*
        public static void remove_entry(int[] a){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            
            int del = rand.nextInt(a.length-i);
            
            for(int j = del; j < a.length-i-1; j++){
                a[j]= a[j+1];
            }
                a[a.length-i-1]=0;
        }
        
    } 
   */ 
}
