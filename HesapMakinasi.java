import java.util.*;
public class NewClass1 {
  static int toplama(int a, int hesap,int girdi,int adet,int d,int s1,int sayac){
        Scanner input=new Scanner(System.in);
        int sec=0;
        
        while(sec<5)
        if (sec<5) { 
        System.out.println("\nSAyı Girişi İçin 1'i, Çıkış İçin 5'i Seçiniz:");
        System.out.println("Başka Bir İşleme Geçmek İsterseniz.\nÇıkarma için 2\nÇarpma için 3\nBölme için 4'ü Tuşlayınız.");
        sec=input.nextInt()
                ;
       switch(sec){
            case 1:
               System.out.print("Bir sayı giriniz :");
            a=input.nextInt();       
            girdi=a;
            hesap=girdi+hesap;
                if (sayac==1) {
                    hesap=s1+a;
                    sayac++;
                }
            System.out.println("\n==========\n    "+hesap+"\n==========");
            break;
            
            case 2:
            cikarma(a,hesap,girdi,adet,d,s1,sayac);
            break;
            
            case 3:
                carpma(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
            case 4:
                bolme(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
        }}
        return hesap;
    }
    static int cikarma(int a, int hesap,int girdi,int adet,int d,int s1,int sayac){
        Scanner input=new Scanner(System.in);
        int sec=0;
        while(sec<5)
            if (sec<5) {         
        System.out.println("\nSAyı Girişi İçin 1'i, Çıkış İçin 5'i Seçiniz:");
        System.out.println("Başka Bir İşleme Geçmek İsterseniz.\nToplama için 2\nÇarpma için 3\nBölme için 4'ü Tuşlayınız.");
        sec=input.nextInt();
        switch(sec){
            case 1:
               System.out.print("Bir sayı giriniz :");
            a=input.nextInt();       
            girdi=a;
            hesap=hesap-girdi;
            if (sayac==1) {
                    hesap=s1-a;
                    sayac++;
                }
            System.out.println("\n==========\n    "+hesap+"\n==========");
            break;
            
            case 2:
            toplama(a,hesap,girdi,adet,d,s1,sayac);
            break;
            
            case 3:
                carpma(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
            case 4:
                bolme(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
        }}
        return hesap;
    }
    
    static int carpma(int a, int hesap,int girdi,int adet,int d,int s1,int sayac){
        Scanner input=new Scanner(System.in);
        int sec=0;
        while(sec<5)
            if (sec<5) {
        System.out.println("\nSAyı Girişi İçin 1'i, Çıkış İçin 5'i Seçiniz:");
        System.out.println("Başka Bir İşleme Geçmek İsterseniz.\nÇıkarma için 2\nToplama için 3\nBölme için 4'ü Tuşlayınız.");
        sec=input.nextInt();
        switch(sec){
            case 1:
               System.out.print("Bir sayı giriniz :");
            a=input.nextInt();       
            girdi=a;
            hesap=hesap*girdi;
            if (sayac==1) {
                    hesap=s1*a;
                    sayac++;
                }
            System.out.println("\n==========\n    "+hesap+"\n==========");
            break;
            
            case 2:
            cikarma(a,hesap,girdi,adet,d,s1,sayac);
            break;
            
            case 3:
                toplama(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
            case 4:
                bolme(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
        }}
        return hesap;
    }
    static int bolme(int a, int hesap,int girdi,int adet,int d,int s1,int sayac){
        Scanner input=new Scanner(System.in);
        int sec=0;
        while(sec<5)
            if (sec<5) {
        System.out.println("\nSAyı Girişi İçin 1'i, Çıkış İçin 5'i Seçiniz:");
        System.out.println("Başka Bir İşleme Geçmek İsterseniz.\nÇıkarma için 2\nÇarpma için 3\nToplama için 4'ü Tuşlayınız.");
        sec=input.nextInt();
        switch(sec){
            case 1:
               System.out.print("Bir sayı giriniz :");
            a=input.nextInt();       
            girdi=a;
            hesap=hesap/girdi;
            if (sayac==1) {
                    hesap=s1/a;
                    sayac++;
                }
            System.out.println("\n==========\n    "+hesap+"\n==========");
            break;
            
            case 2:
            cikarma(a,hesap,girdi,adet,d,s1,sayac);
            break;
            
            case 3:
                carpma(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
            case 4:
                toplama(a,hesap,girdi,adet,d,s1,sayac);
                break;
                
        }}
        return hesap;
    }
    public static void main(String[] args){
        int a=0,hesap=0,girdi=0,adet=1,d=0,secim=0,s1,sayac=0;
        Scanner input=new Scanner(System.in);
        
       
            
        while (secim<5){
            sayac=0;
             System.out.print("\nİlk SAyınızı Giriniz:");
        s1=input.nextInt();
            System.out.println("Çıkış İşlemi İçin 5'i Tuşlayın.");
            System.out.println("İşlem Seçiminizi Yapınız.\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            secim=input.nextInt();
           
            
            switch (secim) {
                case 2:
                    sayac++;
                    cikarma(a,hesap,girdi,adet,d,s1,sayac);
                    break;
                case 3:
                    sayac++;
                    carpma(a,hesap,girdi,adet,d,s1,sayac);
                    break;
                case 4:
                    sayac++;
                    bolme(a,hesap,girdi,adet,d,s1,sayac);
                    break;
                case 1:
                    sayac++;
                    toplama(a,hesap,girdi,adet,d,s1,sayac);
                    break;
                case 5:
                    secim=5;
                    break;
                default:
                    System.out.print("Hatalı işlem yaptınız");
                    break;
            }

    }
        System.out.println("Kullandığınız için Teşekkür Ederiz.");
}
}
