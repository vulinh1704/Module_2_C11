import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public int age;

    public static void main(String[] args) {
//        int a  = 10;
//        int b = 0;
//        int c = 5;
//        System.out.println(a / b);
//        System.out.println("Hello");

//        FileInputStream fileInputStream = new FileInputStream(new File("hello.txt"));
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap so a: ");
//        int a = input.nextInt();
//        System.out.println(a);
//
//        Demo demo = null;
//        System.out.println(demo.age);
//        String a = "g";
//        int b = Integer.parseInt(a);
//        System.out.println(b);
//        int[] arr = {1, 2, 4};
//        System.out.println(arr[3]);
//        try {
//            readFile();
//        } catch (FileNotFoundException f) {
//            System.out.println(f);
//        }

//        throwError();
//        System.out.println("Halo");

//        try {
//            int a = 0;
//            int b = 10;
//            System.out.println(b / a);
//            int[] arr = {1,3,5};
//            System.out.println(arr[5]);
//            System.out.println("Hello World");
//        } catch (ArithmeticException arithmeticException) {
//            System.out.println("Loi roi ban oi! Bao admin di");
//        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
//            System.out.println("Loi 2");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Hello C11");


        try {
            int a = 0;
            int b = 10;
            System.out.println(b / a);
        } finally {
            System.out.println("Finally!!");
        }

        System.out.println("Hello C11");
    }

    public static void readFile() throws ArithmeticException, ClassCastException, FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File("abc"));
    }

    public static void throwError() {
        throw new RuntimeException();
    }
}
