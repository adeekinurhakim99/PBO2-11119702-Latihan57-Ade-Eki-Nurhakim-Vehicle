/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Bicycle b = new Bicycle();
    b.setMyBrans("Trek Bike");
    b.setMyModel("7.4 Fx");
    b.setMyGearCount(23);
    System.out.println("Bicycle");
    System.out.println("Brand : "+b.getMyBrans());
    System.out.println("Model : "+b.getMyModel());
    System.out.println("Jumlah Gear : "+b.getMyGearCount());
    
    Skaterboard s = new Skaterboard();
    s.setMyBrans("Ally Skate");
    s.setMyModel("Rocket");
    s.setMyBoardLength(54.5);
    System.out.println("SkaterBoard");
    System.out.println("Brand : "+s.getMyBrans());
    System.out.println("Model : "+s.getMyModel());
    System.out.println("Panjangnya Board : "+s.getMyBoardLength());
    
    }
}
