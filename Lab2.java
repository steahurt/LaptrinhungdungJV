/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;

/**
 *
 * @author MSI GP72VR 7RF
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a:"+" ");
        float a = sc.nextFloat();
        System.out.print("Nhap b:"+"" + " ");
        float b = sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.print("Phuong trinh vo so nghiem");
            }
            else{
                System.out.print("Phuong trinh vo nghiem");
            }
        }else{
            float x = -b/a;
            System.out.print("Nghiem cua phuong trinh la: x="+" "+x);
        }
    }
}
  
