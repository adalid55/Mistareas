package Ejercicios;

public class Ejercicio13 {
public static boolean equals(Object[] a, Object[] b){// check if a and b point to the same object
// then they are equal
if(a==b)return true;// check if any of the two arrays are null
// then return false
if(a==null|| b==null)return false;// length of array a
int length = a.length;// if length of both the arrays are not equal
// then return false
if(b.length != length)return false;// Iteratively compare the elements of array
// and array b
for(int i=0; i<length; i++){
        Object m = a[i];
        Object n = b[i];// if at any position the element at array a
// is different than the element at array b,
// then return false
if(!(m==null? n==null: m.equals(n)))return false;}// if all the elements are same, then return true
return true;}


// method to perform deep equality test of two arrays
public static boolean deepEquals(Object[] a, Object[] b){// check if a and b point to the same object
// then they are equal
if(a == b)return true;// check if any of the two arrays are null
// then return false
if(a ==null|| b==null)return false;// length of array a
int length = a.length;// if length of both the arrays are not equal
// then return false
if(b.length != length)return false;// perform deep equality test, i.e. if a and b are
// 3 dimensional arrays, then recursively perform equality 
// testing till you reach the 3rd dimension
// Iteratively compare the elements of array a and b
for(int i =0; i < length; i++){// Store the elements at each position
        Object m = a[i];
        Object n = b[i];// check if they point to the same object
if(m == n)continue;if(m ==null)return false;// Find if the two elements are equal
boolean eq;// check if they both are an object of class Object
// if yes, then recursively perform deep equality test
// on the two objects
if(m instanceof Object[]&& n instanceof Object[])
            eq = deepEquals ((Object[]) m,(Object[]) n);// check if they both are an object of class byte
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof byte[] && n instanceof byte[])
            eq = equals((byte[]) m,(byte[]) n);// check if they both are an object of class short
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof short[]&& n instanceof short[])
            eq = equals((short[]) m,(short[]) n);// check if they both are an object of class int
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof int[]&& n instanceof int[])
            eq = equals((int[]) m,(int[]) n);// check if they both are an object of class long
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof long[]&& n instanceof long[])
            eq = equals((long[]) m,(long[]) n);// check if they both are an object of class char
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof char[]&& n instanceof char[])
            eq = equals((char[]) m,(char[]) n);// check if they both are an object of class float
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof float[]&& n instanceof float[])
            eq = equals((float[]) m,(float[]) n);// check if they both are an object of class double
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof double[]&& n instanceof double[])
            eq = equals((double[]) m,(double[]) n);// check if they both are an object of class boolean
// if yes, then recursively perform deep equality test
// on the two objects
else if(m instanceof boolean[]&& n instanceof boolean[])
            eq = equals((boolean[]) m,(boolean[]) n);
else
            eq = m.equals(n);// if they are not equal
// return false
if(!eq)return false;}// if all the above conditions are satisifed, return true
return true;}


    
    
/*
La diferencia entre una prueba de igualdad superficial y una prueba de igualdad profunda
es que el método de igualdad profunda puede comparar matrices anidadas de profundidad arbitraria
(es decir, matrices 2D, matrices 3D, etc.), mientras que el método de igualdad superficial no puede.
La prueba de igualdad superficial no verifica si el elemento es de tipo Array y solo compara si las 
referencias apuntan al mismo objeto o no.
*/
    
}
