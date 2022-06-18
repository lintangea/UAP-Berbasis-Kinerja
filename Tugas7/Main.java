/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author DELL
 */
public class Main {
      public static void main(String[] args) {

            PegawaiTetap pegawaitetap1 = new PegawaiTetap("Kim Jong Un", "352006141202200210013", 2500000);
            PegawaiTetap pegawaitetap2 = new PegawaiTetap("Lee Min Ho", "372006131105200558119", 4000000);
            PegawaiTetap pegawaitetap3 = new PegawaiTetap("Jung Ju Won", "382007151007200777901", 7000000);
            System.out.println(pegawaitetap1.toString());
            System.out.println(pegawaitetap2.toString());
            System.out.println(pegawaitetap3.toString());

            PegawaiHarian pegawaiharian1 = new PegawaiHarian("Budi Astuti", "362003310304200450912", 75000, 21);
            PegawaiHarian pegawaiharian2 = new PegawaiHarian("Lintang Eka", "352001021201200160421", 75000, 48);
            PegawaiHarian pegawaiharian3 = new PegawaiHarian("Dominic Bobi","311999040519995012013", 75000, 35);
            System.out.println(pegawaiharian1.toString());
            System.out.println(pegawaiharian2.toString());
            System.out.println(pegawaiharian3.toString());

            Sales sales1 = new Sales("Budhi Santoso", "321997200397199777902", 85, 60000);
            Sales sales2 = new Sales("Berlian Cita", "332012060912201233518", 60, 75000);
            Sales sales3 = new Sales("Deri Kusuma", "351994140594199432101", 50, 50000);
            System.out.println(sales1.toString());
            System.out.println(sales2.toString());
            System.out.println(sales3.toString());
        }
    }
