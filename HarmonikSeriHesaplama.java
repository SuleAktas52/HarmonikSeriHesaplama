import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {

        int sayi;
        double sayininKesri;
        double sonuc=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Sayiyi Giriniz: ");
        sayi=input.nextInt();

        for (int i=1; i<=sayi; i++){
            sayininKesri=1.0/i;
            sonuc+=sayininKesri;
        }
        System.out.println(sonuc);
    }
}
