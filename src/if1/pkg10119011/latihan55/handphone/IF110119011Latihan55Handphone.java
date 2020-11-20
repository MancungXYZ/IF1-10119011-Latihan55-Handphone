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
public class IF110119011Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android samsung = new Android ("Samsung", "Android", "Grand", 30000000);
        samsung.setKeyStore("234ibfd3840fo");
        samsung.displayProduct();
        System.out.println("Android Key Store : " + samsung.getKeyStore());
        
        System.out.println();
        
        BlackBerry bb = new BlackBerry ("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB());
        
        System.out.println();
        
        WindowsPhone nokia = new WindowsPhone ("Nokia", "Wind8", "Lumia", 10000000);
        nokia.setWpKeyStore("UUUIQIJOWKSD");
        nokia.displayProduct();
        System.out.println("Wp Key Store : " + nokia.getWpKeyStore());
    }
    
}
