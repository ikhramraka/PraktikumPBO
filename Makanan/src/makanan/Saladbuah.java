/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makanan;


public class Saladbuah extends Makanan implements Makananbergizi {
   private String buah;
    
    public Saladbuah(String buah) {
        this.buah = buah;
    }
    
    @Override
    public String Nama() {
        return "Salad Buah " + buah;
    }
    
    @Override
    public int Kalori() {
        return 100;
    }
    
    @Override
    public String Rasa() {
        return "Manis dan segar";
    }
    
    @Override
    public boolean cekGizi() {
        return true;
    }
    
    @Override
    public String saranGizi() {
        return "Anda dapat mencoba salad buah lain dengan buah yang berbeda";
    }
}
