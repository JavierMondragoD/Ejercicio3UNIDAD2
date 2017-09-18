/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Ejercicio3UNIDAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio3UNIDAD2 objfibo = new Ejercicio3UNIDAD2 ();
        System.out.println("La sucesion fibonacci de 12 mediante la recursividad es " + objfibo.fibonacciRecursiva (12) );
        
        System.out.println("La sucesion fibonacci de 12 mediante la ciclo es " + objfibo.fibonacciCiclo   (12) );
    }
    public int fibonacciRecursiva(int n ){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return fibonacciRecursiva (n-1) + fibonacciRecursiva (n-2);          
        }
    }
    public int fibonacciCiclo(int n){
          int fibo = 0 , primero = 1 , segundo 0 ;
     while( n > 0){
       fibo = primero + segundo;
       primero = segundo;
       segundo = fibo;
       n--;       
    }
    return fibo;      
    } 
 }


