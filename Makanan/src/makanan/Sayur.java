/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makanan;


public class Sayur extends Makanan implements Makananbergizi {
    private String sayur;
    
    public Sayur(String sayur) {
        this.sayur = sayur;
    }
    
    @Override
    public String Nama() {
        return "Sup Sayur " + sayur;
    }
    
    @Override
    public int Kalori() {
        return 200;
    }
    
    @Override
    public String Rasa() {
        return "Gurih dan hangat";
    }
    
    @Override
    public boolean cekGizi() {
        return true;
    }
    
    @Override
    public String saranGizi() {
        return "Anda dapat mencoba sayur lain dengan sayur yang berbeda";
    }
}
