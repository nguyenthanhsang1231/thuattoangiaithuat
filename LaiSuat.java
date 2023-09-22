package BaiTap1_4;

public class LaiSuat {
    public static void main(String[] args) {
        double tienGui = 100;
        int nam = 10;
        double laiXuat = 2.8;
        double b = (1+laiXuat);

        double a = tienGui * (Math.pow(b,nam));
        System.out.println("So tien dc nhan sau " + nam + " nam " + "la : " + a);

       //congthuc : tien dc nhan = tiengui *(1+ laxi xuat)^ nam
    }
}
