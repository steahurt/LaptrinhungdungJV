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
public class Lab2Bai2 {
    public static void main(String[]args){
        double a,b,c, x1, x2;
        Scanner nhap =  new Scanner( System.in);
        System.out.print("Nhap he so bac 2, a = ");
        a = nhap.nextInt();
        System.out.print("nhap he so bac 1, b = ");
        b = nhap.nextInt();
        System.out.print("nhap so c:");
        c = nhap.nextInt();
        if (a==0)   {
            x1= x2 = -(c/b);
            System.out.println("Nghiem cua phuong trinh la x="+" "+x1);
        }
        else if (a!=0){
         double Delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Delta =" + " " +Delta);
        if(Delta ==0){
            x1= x2 = -b/(2*a);
            System.out.println("Nghiem x1, x2" + " " +x1);
        }
        else if(Delta >0){
        x1 = (-b + Math.sqrt(Delta)) /  (2*a);
        x2 = (-b - Math.sqrt(Delta)) / (2*a);
        System.out.println("Nghiem x1=" + " " +x1);
        System.out.println("Nghiem x2=" + " " +x2);
    }
        else{
        System.out.print("Phuong trinh vo nghiem");
        }
        
    }
            
            
        
        
        
        
    }
    
}
 