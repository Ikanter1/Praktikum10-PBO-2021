/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Main01 {
    public static void main(String[] args) {
        Singa01 s = new Singa01("CingaCing", 4, "Roaaar", "Coklat");
        Keledai01 k = new Keledai01("Kedelai", 4, "Hehehehe", "Abu-abu");
        Gorila01 g = new Gorila01("Gulali", 4, "Haaum Hauum", "Hitam Manis");

        k.displayBinatang();
        k.displayMakanan();
        k.displayData();

        g.displayBinatang();
        g.displayMakanan();
        g.displayData();

        s.displayBinatang();
        s.displayMakanan();
        s.displayData();
    }
}
