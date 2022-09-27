package methods2;
public class Methods2 {
    
    public static void main(String[] args) {
       String yeniMesaj = sehirVer();
       int sonuc = topla(90,12);
       int toplam = topla2(1,2,3,4,5,6,7,8,9,10);
       System.out.println(yeniMesaj);
       System.out.println(sonuc);
       System.out.println(toplam);
    }
    
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    
    public static void sil(){
        System.out.println("Silindi.");
    }
    
    public static void guncelle(){
        System.out.println("Güncellendi.");
    }
    
    public static String sehirVer(){
        return "İstanbul";
    }
    
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam = toplam+sayi;
        }
        return toplam;
    }
    
}
