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
   public class CarRider {
    private String name;
    private int age; 
    private String phone; 
 
    public CarRider(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getphone() {
        return phone;
    } 
}
