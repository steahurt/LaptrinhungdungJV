/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Bai2;
 
public class teshinhchunhat {
 
    public static void main(String[] args) {
         hinhchunhat hinhChuNhat = new HinhChuNhat();
         
        // nhập chiều dài và chiều rộng hình chữ nhật
        hinhChuNhat.nhap();
         
        // hiển thị chiều dài và chiều rộng
        hinhChuNhat.hienThi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // tính chu vi và diện tích
        double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
        double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // hiển thị chu vi và diện tích
        hinhChuNhat.hienThiChuViVaDienTich(chuVi, dienTich);
    }

    private static class hinhchunhat {

        public hinhchunhat() {
        }
    }
 
}