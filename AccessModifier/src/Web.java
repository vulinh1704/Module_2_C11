public class Web {
    static int soLanTruyCap;
    String color;

    static  {
        soLanTruyCap = 0;
    }

    public Web() {
    }

    public void tangLanTruyCap() {
        soLanTruyCap++;
    }

    public static void display() {
        System.out.println("HTTP//:Codegym");
    }
}

class Main {
    public static void main(String[] args) {
//        Web web = new Web();
//        web.tangLanTruyCap();
//        Web web1 = new Web();
//        web1.tangLanTruyCap();
//        web1.tangLanTruyCap();
//        System.out.println(web1.getSoLanTruyCap());
//        System.out.println(web.getSoLanTruyCap());
        System.out.println(Web.soLanTruyCap);
        Web.soLanTruyCap++;
        Web.soLanTruyCap++;
        System.out.println(Web.soLanTruyCap);
        Web.display();
    }
}
