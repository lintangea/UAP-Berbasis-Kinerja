/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author DELL
 */
public class Manager extends Pekerja{
 private int lamaKerja ;
 public Manager(int lamaKerja, int jamKerja, int hariKerja, String nama, String NIK, String NIP, boolean jenisKelamin, boolean menikah) {
    super(jamKerja, hariKerja, nama, NIP, NIK, jenisKelamin, menikah);
    this.lamaKerja = lamaKerja;
 }
 
 public int getLamaKerja() {
    return lamaKerja;
 }
 public void setLamaKerja(int lamaKerja) {
    this.lamaKerja = lamaKerja;
 }
 
 @Override
 public String toString(){
    System.out.println("Nama           : " + this.getNama());
    System.out.println("NIK            : " + this.getNIK());
    System.out.print("Jenis Kelamin  : ");
     if (jenisKelamin == true) {
                System.out.println("Laki-laki");
            }
            else System.out.println("Perempuan");
    System.out.println("Pendapatan     : " + (this.getGaji()+(this.getBonus()+(this.getBonus()* 30/100))+(this.getTunjangan()+ 15))+"$");
    System.out.println("Bonus          : " + (this.getBonus()+(this.getBonus()* 30/100))+"$");
    System.out.println("Gaji           : " + this.getGaji()+"$");
    System.out.println("Status         : " + this.getStatus());
    System.out.println("Lama Kerja     : " + this.getLamaKerja()+" hari");
    return "";
    }
}
