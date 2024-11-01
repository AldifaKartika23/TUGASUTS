/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BMI;

/**
 *
 * @author Difa
 */
public class Bmi {
    double hasil;
  
void kalkulatorBmi (double tinggi , double berat, String category) {
    hasil = berat / (tinggi * tinggi);
    
    System.out.println("Jadi hasil BMI Difa adalah"+ hasil );
    System.out.println("Kategori BMI : " + category);
    System.out.println("berat badan difa" + berat);
    System.out.println("tinggi difa" + tinggi);
}    

public String getBMICategory (double hasil) {
    if (hasil < 18.5) {
        return "Under weight" ;
    } else if (hasil >= 18.5 && hasil < 24.9) {
        return "Normal Weight" ;
    } else if (hasil >= 25 && hasil < 29.99) {
        return "Over Weight" ;
    } else if (hasil >= 30 && hasil >35) {
        return "Obesity" ;
    } else {
        return "Over Obesity" ;
    }
  }
}

    