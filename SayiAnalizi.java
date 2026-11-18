import java.util.Scanner;

public class SayiAnalizi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int toplamsayi = 0;
        
        int toplam = 0;
        
        int pozitif = 0;
        
        int negatif = 0;
        
        int teksayi = 0;
        
        int ciftsayi = 0;
        
        int enBuyuk = 0;
        
        int enKucuk = 0;

        System.out.println("Sayilari girmeye baslayiin");

        while (true) {
            System.out.print("Sayi giriniz: ");
            int sayi = sc.nextInt();

            if (sayi == 0) {
                break;
            }

            toplamsayi++;
            toplam += sayi;

            if (toplamsayi == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }

            if (sayi > 0) {
                pozitif++;
            } else {
                negatif++;
            }

            if (sayi % 2 == 0) {
                ciftsayi++;
            } else {
                teksayi++;
            }

            System.out.println(sayi + " Sayisi Ozel Analizi ");

            int sayii = sayi;
            int basamak = 0;
            do {
                sayii /= 10;
                basamak++;
            } while (sayii != 0);
            System.out.println("Basamak sayisi : " + basamak);

            boolean asaltest = true;
            if (sayi <= 1) {
                asaltest = false;
            } else {
                int i = 2;
                while (i < sayi) {
                    if (sayi % i == 0) {
                        asaltest = false;
                        break;
                    }
                    i++;
                }
            }

            if (asaltest) {
                System.out.println("Asal bir sayidir");
            } else {
                System.out.println("Asal bir sayi degildir");
            }

            if (sayi > 0) {
                int bolenToplam = 0;
                int j = 1;
                while (j < sayi) {
                    if (sayi % j == 0) {
                        bolenToplam += j;
                    }
                    j++;
                }

                if (bolenToplam == sayi) {
                    System.out.println("Mukemmel sayidir");
                } else {
                    System.out.println("Mukemmel sayi degildir");
                }
            } else {
                System.out.println("Negatif sayilar mukemmel olamaz");
            }
        }

        if (toplamsayi == 0) {
            System.out.println("Uyari: Hic sayi girilmeden 0 girildi, analiz yapilamadi!");
        } else {
            double ortalama = (double) toplam / toplamsayi;

            System.out.println("Analiz Yapiliyor");
            System.out.println("Pozitif Sayi Adedi   : " +pozitif+ "Negatif sayı adedi" +negatif+ "Tek sayi adedi" +teksayi+ "Cift sayi adedi" +ciftsayi+ "En buyuk sayi" +enBuyuk+ "En Kucuk sayi ise" +enKucuk+ "Butun sayilarin toplami" +toplam+ "Son olarak iseee aritmetik ortalamamız: " +ortalama);
        }
    }
}