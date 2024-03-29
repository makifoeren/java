package package17_inheritance2;

public class SurekliIsciler extends Isci {

    public static void main(String[] args) {

        SurekliIsciler surIc1 = new SurekliIsciler();
        surIc1.persNo = 5001;
        surIc1.isim = "Cem";
        surIc1.soyisim = "Akay";
        surIc1.statu = "Isci";
        surIc1.saatUcreti = 11;
        surIc1.maas = surIc1.maasHesapla();

        System.out.println(surIc1);
    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}