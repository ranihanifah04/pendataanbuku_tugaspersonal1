/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendataanbuku;

import java.util.Scanner;
/**
 *
 * @author This PC
 */
public class pendataanbuku {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Perpustakaan David!");
        System.out.println("============[   ^ ^    ]=============");
        System.out.println("List Buku Yang Available: ");
        System.out.println("1. Pelajaran.");
        System.out.println("2. Novel.");
        System.out.println("3. Skripsi.");
        System.out.println("============    ***     =============");
        System.out.println("Masukkan buku yang dipinjam (angka): ");
        int buku = scanner.nextInt();
        System.out.println("Masukkan lama pinjam (hari): ");
        int lamapinjam = scanner.nextInt();
        double denda = hitungDenda(buku, lamapinjam);
        if (denda > 0) {
            System.out.println("Denda anda sebesar: Rp." + denda);
            System.out.println("Harap lebih disiplin.");
            System.out.println("Terima Kasih!");
        }else{
            System.out.println("Terima Kasih!");
        }
    }
    
    public static double hitungDenda(int buku, int lamapinjam){
        double denda = 0;
        
        switch (buku) {
            case 1: //Buku Pelajaran didenda per hari 2000
            if (lamapinjam > 10) {
                int lamaDenda = lamapinjam - 10;
                denda = lamaDenda * 2000;
            }
            break;
            case 2: //Buku Novel didenda perhari 5000
            if (lamapinjam > 10) {
                int lamaDenda = lamapinjam - 10;
                denda = lamaDenda * 5000;
            }
            case 3: // Buku Skripsi didenda perhari 10.000
                if (lamapinjam > 10) {
                    int lamaDenda = lamapinjam - 10;
                    denda = lamaDenda * 10000; 
                }
                break;
            default:
                System.out.println("Maaf, tidak ada buku yang dimaksud.");
        }
        return denda;
        }
    }

