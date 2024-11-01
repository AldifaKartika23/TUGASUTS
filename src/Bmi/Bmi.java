/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bmi;

/**
 *
 * @author Difa
 */
public class Bmi {
    double hasil;
    
    void kalkulatorBMI (double tinggi, double berat){
        hasil = berat / (tinggi * tinggi);
        
        System.out.println("Hasil dari BMI difa" + hasil);
        String category = getBMICategory (hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("Berat badan Difa" + berat);
        System.out.println("tinggi difa" + tinggi);    
    }
    
    public String getBMICategory (double hasil){
        if (hasil < 18.5){
            return "Under Weight";
        } else if (hasil >= 18.5 && hasil < 24.9){ 
            return "Normal Weight";   
        } else if (hasil >= 25 && hasil < 29.9){
            return "Over Weight";
        } else if (hasil >= 30 && hasil >35){
            return "Obesity";
        } else {
            return "Over Obesity";
        }
    }  
}
