package package3_stringManipulation;

public class C15_SifreKontrol {
    public static void main(String[] args) {

        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        // Ilk harf buyuk harf olmali
        // Son harf kucuk harf olmali
        // Sifre bosluk icermemeli
        // Sifre uzunlugu en az 8 karakter olmali


       // if else olunca bir hatadan sonra digerine gevcmez ondan dolayi bagimsiz iflerle olmali
        // bir pronlem yoksa bagimsiliktan dolayi basarili demeyecek en sona olusturulan if  le basarili sonucunu alamis olacaz
        //istenilenleri true yaptik
        // en son a bir if daha yapacagiz
        String sifre="yxcv1234";
        boolean ilkHarf=false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){ // a- z arasi ise treu degilse hata msj
            ilkHarf=true;
        }else {
            System.out.println("Sifrenizin ilk harfi büyük olmasi");
        }

        boolean sonHarf=false;

        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;

        }else {
            System.out.println("Sifreniz son hali kücük harf olmali");
        }

        boolean bosluk= false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("Sifre 8 karakter olmali");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }

    }
}
