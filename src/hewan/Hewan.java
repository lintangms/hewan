/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hewan {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Silahkan pilih hewan yang ada");
        System.out.println("1:Sapi 2Ayam 3:Domba 4:Kucing 5:Harimau");
        System.out.println("Masukkan kode hewan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                sapi.kaki();
                sapi.warna();
                sapi.mata();
                break;
            case 2:
                ayam.kaki();
                ayam.warna();
                ayam.mata();
                ayam.makanan();
                break;
            case 3:
                domba.kaki();
                domba.warna();
                domba.mata();
                domba.makanan();
                break;
            case 4:
                kucing.kaki();
                kucing.warna();
                kucing.mata();
                kucing.makanan();
                break;
            case 5:
                harimau.kaki();
                harimau.warna();
                harimau.mata();
                harimau.makanan();
                break;
            default:
                System.out.println("data yang lain blom ada");
                
        }
}}