public class Main {
    public static void main(String[] args) {


        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        KrediUI krediUI1 = new KrediUI();
        krediUI1.KrediHesapla(new TarımKrediManager());
        KrediUI krediUI2 = new KrediUI();
        krediUI2.KrediHesapla(new AskerKrediManager());

    }
}