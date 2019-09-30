/*@
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
public class lab2Bai3 {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap so Dien su dung cua thang:");
     int soDientieuthu = sc.nextInt();
     if ( soDientieuthu ==0 && soDientieuthu <= 50 ){
         System.out.println("Gia moi so dien la : 1000");
         int TienDien = soDientieuthu * 1000;
         System.out.println("Tien dien thang nay la"+" " +TienDien);
     }
    else {
        System.out.println("Gia moi so dien la: 1200");
         int TienDien =  soDientieuthu * 1200;
        System.out.println("So tien dien tieu thu thang nay la:"+"" +TienDien);
            
            
         
      }
        }
          }
             
    
}
