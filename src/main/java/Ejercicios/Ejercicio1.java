package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {
       int next, next2, next3, next4, next5;
       int a, b, cur, n;
       
       a = 12;
       b = 5;
       n = 100;
       cur = 92;
       
       next = (a * cur + b) % n;
       System.out.println("El primer numero es: " + next);
       next2 = (a * next + b) % n;
       System.out.println("El segundo numero es: " + next2);
       next3 = (a * next2 + b) % n;
       System.out.println("El tercer numero es: " + next3);
       next4 = (a * next3 + b) % n;
       System.out.println("El cuarto numero es: " + next4);
       next5 = (a * next4 + b) % n;
       System.out.println("El quinto numero es: " + next5);
    }
}
