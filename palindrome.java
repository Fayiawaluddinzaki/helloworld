import java.util.*;

public class ReverseString {
  public static void main(String args[]) {
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan kata: ");
    huruf = scanner.nextLine();

    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;

    for (int i = 0; i < jumlah; i++) 
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
      if (hasil.equals("hasil+jumlahHuruf"))
          System.out.println("True" + hasil);
      
      else (!"hasil".
      
      equals("hasil+jumlahHuruf"))
          System.out.println("False" + hasil);
      

  }
}