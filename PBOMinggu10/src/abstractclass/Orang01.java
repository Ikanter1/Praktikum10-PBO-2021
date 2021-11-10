/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author LENOVO
 */
public class Orang01 {
    private String nama;
    private Hewan01 hewanPeliharaan;
    
    public Orang01(String nama){
        this.nama = nama;
    }
    public void peliharaHewan(Hewan01 hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakjalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Peliharaanku berjalan  dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
}
