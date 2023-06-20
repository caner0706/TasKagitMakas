package com.mycompany.oyun1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("******************");
        System.out.println("0 = TAŞ\n"
                         + "1 = KAĞIT\n"
                         + "2 = MAKAS");
        System.out.println("******************");
        
        
        // Bilgisayar Bir Değer Seçerek Taş Kağıt veya Makas Olmasına Karar verir.
        int sayı =(int)(Math.random()*3);
        
        
        System.out.println("Lütfen Bir Sayı Giriniz : ");
        int sayı1 = scanner.nextInt();
        
        if(sayı1==sayı){
            System.out.println("Berabere...");
        }
        else if(sayı==1 && sayı1==0){
            System.out.println("Sen Taşsın.Bilgisayar Kağıt.Bilgisayar Kazandı :( ");
        }
        else if(sayı==2 && sayı1==0){
            System.out.println("Sen Taşsın.Bilgisayar Makas.Sen Kazandın :) ");
        }
        else if(sayı==0 && sayı1==1){
            System.out.println("Sen Kağıtsın.Bilgisayar Taş.Sen Kazandın :) ");
        }
        else if(sayı==2 && sayı1==1){
            System.out.println("Sen Kağıtsın.Bilgisayar Makas.Bilgisayar Kazandı :( ");
        }
        else if(sayı==0 && sayı1==2){
            System.out.println("Sen Makansın.Bilgisayar Taş.Bilgisayar Kazandı :( ");
        }
        else if(sayı==1 && sayı1==2){
            System.out.println("Sen Makassın.Bilgisayar Kağıt.Sen Kazandın :) ");
        }
        
        
                
    }
    
}
