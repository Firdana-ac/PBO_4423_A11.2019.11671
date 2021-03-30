//Muhammad Naufal Firdana Trisya
//A11.2019.11671
//A11.433

package sample;

public class Main3 {
    public static void main(String[] args) {
        // Membuat objek dari kelas bertingkat statis
        // Menggunakan nama kelas luar
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("" + usb.usb2);
        System.out.println("" + usb.usb3);
        System.out.println("Total Ports = " + usb.getTotalPorts()); // getTotalPorts = usb2 + usb3 (2+1)
    }
}
