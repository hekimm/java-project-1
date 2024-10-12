/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner  scanner =new Scanner(System.in);

double boy,kilo,bki;
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = scanner.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo = scanner.nextDouble();
        bki = (kilo/(boy*boy));
        System.out.println("Beden kitle indeksiniz : " +bki);
        

    }
    
}
