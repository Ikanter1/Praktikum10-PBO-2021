/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa01;
import interfacelatihan.Pascasarjana01;
import interfacelatihan.Rektor01;
import interfacelatihan.Sarjana01;

public class interfacemain {
    public static void main(String[]args){
        Rektor01 pak = new Rektor01();
        
        Mahasiswa01 mhs = new Mahasiswa01("Rony");
        Sarjana01 srj = new Sarjana01("Dul");
        Pascasarjana01 master = new Pascasarjana01("Boni");
        
        //pak.beriSertifikatCumlaude(mhs);
        //pak.beriSertifikatMawapres(srj);
        pak.beriSertifikatMawapres(master);
    }
}
