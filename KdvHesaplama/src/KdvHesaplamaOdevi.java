import java.util.Scanner;

public class KdvHesaplamaOdevi {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :  ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :  " + kdvOran);
        System.out.println("KDV Tutarı:  " + kdvTutar);
        System.out.println("KDV'li Tutar:  " + kdvliTutar);

        boolean totalToplam1 = tutar > 0 && tutar <= 1000;
        kdvOran = 0.18; // %18 KDV

        boolean totalToplam2 = (tutar > 1000);
        kdvOran = 0.08; // %8 KDV



        String str = totalToplam1 ? "KDV Oranı = 0.18" : "Yeni KDV Oranı = 0.08" ;

        System.out.print(str);





    }
}
