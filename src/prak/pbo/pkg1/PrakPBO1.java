/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak.pbo.pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PrakPBO1 {

    /**
     * @param args the command line arguments
     */
    public static void PrakPBO1(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop;
        double Suhu_Awal;
        System.out.println("|-----------------------|");
        System.out.println("| Program Konversi Suhu |");
        System.out.println("|-----------------------|");
        System.out.println("Masukkan Data");
        System.out.println("----------");
        System.out.print("Suhu Celci\t: ");
        Suhu_Awal = input.nextDouble();
        do{
            KonversiSuhu dariCelci = new KonversiSuhu(Suhu_Awal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("|---------------|");
            System.out.println("|1. Lihat Data  |");
            System.out.println("|2. Edit Data   |");
            System.out.println("|3. Exit        |");
            System.out.println("|---------------|");
            System.out.print("  |    Pilih\t:   |");
            System.out.println("|---------------|");
            loop=input.nextInt();
            if(loop == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + Suhu_Awal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + dariCelci.keFahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + dariCelci.keReamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + dariCelci.keKelvin() + "K");
                System.out.println("Kondisi Air " + dariCelci.kondisiair());
            }
            else if(loop == 2){
                System.out.println("\nMasukkan Data");
                System.out.println("----------");
                System.out.print("Suhu Di Celcius\t: ");
                Suhu_Awal = input.nextDouble();
            }
            else if(loop != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(loop!=3);
    }
    
}