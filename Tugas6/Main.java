/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;
import java.util.Arrays;


public class Main {
    static Manusia manusia[] ;
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];
 
 public static void main(String[] args) {
 //Class Manusia
    manusia = new Manusia[3];
    System.out.println(" Class Manusia ");
    System.out.println("=================================================");
    manusia[0] = new Manusia("Lintang Ayunda", "215150601111",false, false);
    manusia[1] = new Manusia("Salvia Mariposa","20205051702222",false, true);
    manusia[2] = new Manusia("Indana Hermansyah", "22216061303333",true, true);
    System.out.println(manusia[0].toString());
    System.out.println(manusia[1].toString());
    System.out.println(manusia[2].toString());
 
 //Class Mahasiswa 
    mahasiswa = new MahasiswaFilkom[3];
    System.out.println(" Class Mahasiswa "); 
    System.out.println("=================================================");
    mahasiswa[0] = new MahasiswaFilkom("215150600111005", 3.5, "Angelina Jolie","225150001234",false,true);
    mahasiswa[1] = new MahasiswaFilkom("195150200111007", 4.0, "Brad Pitt","225260004321",true,false);
    mahasiswa[2] = new MahasiswaFilkom("185150400111009", 3.6, "Gal Gadot","225370003421",false,true);
    System.out.println(mahasiswa[0].toString());
    System.out.println(mahasiswa[1].toString());
    System.out.println(mahasiswa[2].toString());
 
 //Class Pekerja 
    pekerja = new Pekerja[3];
    System.out.println(" Class Pekerja "); 
    System.out.println("=================================================");
    pekerja[0] = new Pekerja(8, 30, "202121202003","Ariana Grande","123456789",false,true);
    pekerja[1] = new Pekerja(8, 28, "202525202002","Taylor Swift","987654321",false,true);
    pekerja[2] = new Pekerja(8, 25, "202929202001","Justin Bieber","765123498",true,false);
    System.out.println(pekerja[0].toString());
    System.out.println(pekerja[1].toString());
    System.out.println(pekerja[2].toString());
 
 //Class Manager 
    manager = new Manager[3];
    System.out.println(" Class Manager "); 
    System.out.println("=================================================");
    manager[0] = new Manager(1325, 9, 31, "3401012222","12345","Kiky Saputri",false,true);
    manager[1] = new Manager(1450, 9, 26, "3501013333","43512","Kemal Palevi",true,true);
    manager[2] = new Manager(1575, 9, 29, "3601014444","54321","Cak Lontong",true,false);
    System.out.println(manager[0].toString());
    System.out.println(manager[1].toString());
    System.out.println(manager[2].toString());
 
 //Jumlah
    System.out.println(" Total Keseluruhan yang Terdaftar "); 
    System.out.println("=================================================");
    System.out.println("Jumlah Manusia   : " + manusia.length);
    System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
    System.out.println("Jumlah Pekerja   : " + pekerja.length);
    System.out.println("Jumlah Manager   : " + manager.length);
    } 
}
