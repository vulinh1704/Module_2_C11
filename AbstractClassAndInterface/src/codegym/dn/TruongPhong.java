package codegym.dn;

import codegym.hn.NhanVien;

public class TruongPhong {

}

abstract class Hinh{}

class Tron extends Hinh{}

abstract class DaGiac extends Hinh{}

class TamGiac extends DaGiac{}

class ChuNhat extends DaGiac{
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int b = a + Integer.MAX_VALUE;
        System.out.println(b);
    }

    public int add(int a,int b) {
        return a + b;
    }
}



