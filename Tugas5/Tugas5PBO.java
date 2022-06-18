/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5pbo;

/**
 *
 * @author DELL
 */
public class Tugas5PBO {
   public static void main(String[] args) {
    CarRider YooSiJin = new CarRider("Yoo Si Jin",30,"080000000000");
    CarRider KangMinJun = new CarRider("Kang Min Jun",39,"0811111111111");
    CarRider LeeKwangSoo = new CarRider("Lee Kwang Soo",27,"0812222222222");
    CarRider YooKangSuk = new CarRider("Yoo Kang Suk",21,"0813333333333");
    
     CarData data = new CarData();
     data.addCar("MPV", "N 0000 LE","Toyota");
     data.addCar("CROSSOVER","N 1111 LE","Honda");
     data.addCar("HATCHBACK","N 2222 LE","Daihatsu");
     data.addCar("SEDAN","N 3333 LE","BMW");
     
 
     data.listOfCar();
 
     RentArchive arsip = new RentArchive();
     arsip.Rent(YooSiJin, data.carList.get(0), 7);
     arsip.Rent(KangMinJun, data.carList.get(2), 10);
     arsip.Rent(LeeKwangSoo, data.carList.get(2), 12);
     arsip.Rent(YooKangSuk, data.carList.get(3), 15);
     
       
     System.out.println("");
     arsip.info();
    } 
}

