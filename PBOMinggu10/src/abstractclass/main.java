/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[]args){
        Kucing01 persia = new Kucing01();
        Ikan01 cupang = new Ikan01();
        
        Orang01 rony = new Orang01("rony");
        Orang01 kurnia = new Orang01("kurnia");
        
        rony.peliharaHewan(persia);
        kurnia.peliharaHewan(cupang);
        
        rony.ajakjalan();
        kurnia.ajakjalan();
    }
}
