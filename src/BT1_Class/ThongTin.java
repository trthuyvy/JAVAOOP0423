package BT1_Class;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien Nhanvien1 = new NhanVien("Zy", 21, "nhân viên");
        Nhanvien1.getInfo();

        System.out.println("==============");
        NhanVien Nhanvien2 = new NhanVien("Vy", 31, "nhân viên");
        Nhanvien2.getInfo();
    }

}
