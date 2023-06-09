package BT1_Class;

import BT1_Class.NhanVien;

public class NhanVien {
    String HoTen = "Vy";
    int Tuoi = 29;
    String ChucVu = "Nhân Viên";

    public NhanVien(String hoTen, int tuoi, String chucVu) {
        HoTen = hoTen;
        Tuoi = tuoi;
        ChucVu = chucVu;
    }

    public  void  getInfo(){
        System.out.println("Họ tên:" + getHoTen());
        System.out.println("Tuổi: "+ getTuoi());
        System.out.println("Chức vụ: " + getChucVu());
    }
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }
}
