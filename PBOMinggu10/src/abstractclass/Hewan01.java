/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author LENOVO
 */
public abstract class Hewan01 {
    private int umur;
    
    protected Hewan01(){
        this.umur = 0;
    }
    
    public void bertambahUmur(){
        this.umur += 1;
    }
    public abstract void bergerak();
}
