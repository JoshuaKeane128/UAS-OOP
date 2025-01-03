/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC;

/**
 *
 * @author LENOVO
 */
public class AC {
    int statusACku;
    private int Sekarang_Mati;
    private int Sekarang_Hidup;
     
    public void Mati(){
        
        if(statusACku == Sekarang_Hidup){
        statusACku = Sekarang_Mati;
            System.out.println("matikan AC! --> AC mati");
        }else{
            System.out.println("matikan AC! --> AC udah mati");}
        }
    
    public void Hidup(){
        if(statusACku == Sekarang_Mati){
        statusACku = Sekarang_Hidup;
            System.out.println("hidupkan AC! --> AC hidup");
        }else{
            System.out.println("hidupkan AC! --> AC udah hidup");}
        }
}