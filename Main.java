import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   
        double mesafe,yas,yolculukTipi;
        double kmBasina=0.10,normalTutar,yasIndirimi = 0,yasIndirimOrani=0,indirimliTutar,gidisDonusIndirimi=0,toplamTutar;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi giriniz:");
        mesafe=input.nextInt();
        
        System.out.print("Yaşınızı giriniz:");
        yas=input.nextInt();
        
        System.out.println("1.Tek Yön\n2.Gidiş-Dönüş");
        System.out.print("Yolculuk Tipini Girin:");
        yolculukTipi=input.nextInt();



        if ((mesafe>0) && (yas>0) && (yolculukTipi==1|| yolculukTipi==2)){

            if (yas<12){
                yasIndirimOrani=0.50;


            } else if (yas>=12 && yas<=24) {
                yasIndirimOrani=0.10;

                
            } else if (yas>65) {
                yasIndirimOrani=0.30;

            }
            else {
                yasIndirimOrani=0;
            }
            normalTutar=mesafe*kmBasina;
            yasIndirimi=normalTutar*yasIndirimOrani;
            indirimliTutar=normalTutar-yasIndirimi;
            if (yolculukTipi==2){
                gidisDonusIndirimi=indirimliTutar*0.20;
                toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
            }else {
                toplamTutar=indirimliTutar;
            }

            System.out.println("Toplam Tutar:"+toplamTutar+"TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}