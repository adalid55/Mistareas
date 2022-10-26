package Ejercicios;

public class Ejercicio14 {
    /*
    int[]original={2,3,5,7,11,13,17,19};
    int[]backup;
    backup = original;
    backup=data.clone();
    */
    
    public static int[ ][ ] deepClone(int[ ][ ] original){
    // create top-level array of arrays 
    int[ ][ ] backup = new int[original.length][ ]; 
    for (int k=0; k < original.length; k++) 
    //copy row k 
    backup[k] = original[k].clone( ); 
    return backup; }
        
    
}
