/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makanan;

public class Main {
    public static void main(String[] args) {
        Makanan[] daftarMakanan = new Makanan[4];
        
        daftarMakanan[0] = new Nasigoreng();
        daftarMakanan[1] = new Sotoayam();
        daftarMakanan[2] = new Saladbuah("Apel");
        daftarMakanan[3] = new Sayur("Bayam");
        
        
        for (Makanan m : daftarMakanan) {
            System.out.println("Nama makanan: " + m.Nama());
            System.out.println("Kalori makanan: " + m.Kalori());
            System.out.println("Rasa makanan: " + m.Rasa());
            
            if (m instanceof Makananbergizi) {
                System.out.println("Makanan ini bergizi");
                System.out.println("Saran makanan bergizi lain: " + ((Makananbergizi) m).saranGizi());
            } else {
                System.out.println("Makanan ini tidak bergizi!");
            }
            
            System.out.println();
        }
        try { //source: ChatGPT{
            Makanan m = new Makanan();
        } catch (Exception e) {
            System.out.println("Tidak dapat membuat objek dari kelas Makanan karena kelas ini abstract");
            System.out.println("Exception: " + e.getMessage());
        }     //}source: ChatGPT
    }
}

