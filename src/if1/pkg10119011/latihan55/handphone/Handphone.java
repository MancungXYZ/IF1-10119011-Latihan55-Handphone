/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan55.handphone;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda   
 *  Kelas   : IF-1 
 *  Nim     : 10119011
 */
public class Handphone {
    protected String manufacture, operationSystem, model;
    protected int harga;
    
    public Handphone (String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operationSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct () {
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("Os : " + operationSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}
