/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Gorila01 extends Binatang01 implements Karnivora01, Herbivora01{
    private String suara;
    private String warnaBulu;

    public Gorila01(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;

    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Nama :" + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Makanan : " + karnivora + herbivora);
    }

    public void displayData() {
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("");
    }
}
