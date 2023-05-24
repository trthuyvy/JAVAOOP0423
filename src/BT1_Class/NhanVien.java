package BT1_Class;

import BT1_Class.NhanVien;

public class NhanVien {
    String HoTen = "Vy";
    int Tuoi = 29;
    String ChucVu = "Nhân Viên";

    public static void main(String[] args) {
        NhanVien Nhanvien1 = new NhanVien();
        System.out.println(Nhanvien1.HoTen);
        System.out.println(Nhanvien1.Tuoi);
        System.out.println(Nhanvien1.ChucVu);
    }
}
