/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author LENOVO
 */
public class Sarjana01 extends Mahasiswa01 implements ICumlaude{
    public Sarjana01(String nama){
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan Skripsi");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku Lebih dari 3,51");
    }
    
    void beriSertifikatCumlaude(Sarjana01 srj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
