/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul2.pkg2;

/**
 *
 * @author user
 */
public class TugasModul22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 10, y = 23, z = 5;
    int max;
    System.out.println("number 1 = "+x);
    System.out.println("number 2 = "+y);
    System.out.println("number 3 = "+z);
 //mencari nilai tertinggi dengan operator kondisi
    max=(y>=x)? y: x;
    max=(z>=max)? z: max;
    System.out.println("Nilai tertingginya adalah angka = "+max);
    }
    
}
