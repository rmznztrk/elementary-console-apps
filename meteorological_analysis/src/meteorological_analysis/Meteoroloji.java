package meteorological_analysis;

import java.util.Scanner;

public class Meteoroloji {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0, ortalama = 0;
        System.out.println("***2019 Yılı Meteoroloji Degerleri***");
        System.out.println("Hangi ay icin sicaklik degeri gireceksiniz(örn:kasim):");
        String ay = scan.nextLine();
        switch (ay) {
            case "ocak":
                    int[] ocakgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < ocakgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        ocakgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < ocakgunsayisi.length; i++) {

                        toplam = toplam + ocakgunsayisi[i];
                    }
                    int ocakminumumsicaklik=ocakgunsayisi[0];
                    int ocakmaximumsicaklik=ocakgunsayisi[0];
                    for(int i=0;i<ocakgunsayisi.length;i++){
                        if(ocakgunsayisi[i]>ocakmaximumsicaklik){
                            ocakmaximumsicaklik=ocakgunsayisi[i];
                        }
                        
                        if(ocakgunsayisi[i]<ocakmaximumsicaklik){
                            ocakminumumsicaklik=ocakgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+ocakmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+ocakminumumsicaklik+"°C");
                    ortalama=toplam/ocakgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
                    
                    
                    
            case "subat":
                    int[] subatgunsayisi = new int[28];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < subatgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        subatgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < subatgunsayisi.length; i++) {

                        toplam = toplam + subatgunsayisi[i];
                    }
                    int subatminumumsicaklik=subatgunsayisi[0];
                    int subatmaximumsicaklik=subatgunsayisi[0];
                    for(int i=0;i<subatgunsayisi.length;i++){
                        if(subatgunsayisi[i]>subatmaximumsicaklik){
                            subatmaximumsicaklik=subatgunsayisi[i];
                        }
                        
                        if(subatgunsayisi[i]<subatminumumsicaklik){
                            subatminumumsicaklik=subatgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+subatmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+subatminumumsicaklik+"°C");
                    ortalama=toplam/subatgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "mart":
                    int[] martgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < martgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        martgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < martgunsayisi.length; i++) {

                        toplam = toplam + martgunsayisi[i];
                    }
                    int martminumumsicaklik=martgunsayisi[0];
                    int martmaximumsicaklik=martgunsayisi[0];
                    for(int i=0;i<martgunsayisi.length;i++){
                        if(martgunsayisi[i]>martmaximumsicaklik){
                            martmaximumsicaklik=martgunsayisi[i];
                        }
                        
                        if(martgunsayisi[i]<martminumumsicaklik){
                            martminumumsicaklik=martgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+martmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+martminumumsicaklik+"°C");
                    ortalama=toplam/martgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
        
            case "nisan":
                    int[] nisangunsayisi = new int[30];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < nisangunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        nisangunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < nisangunsayisi.length; i++) {

                        toplam = toplam + nisangunsayisi[i];
                    }
                    int nisanminumumsicaklik=nisangunsayisi[0];
                    int nisanmaximumsicaklik=nisangunsayisi[0];
                    for(int i=0;i<nisangunsayisi.length;i++){
                        if(nisangunsayisi[i]>nisanmaximumsicaklik){
                            nisanmaximumsicaklik=nisangunsayisi[i];
                        }
                        
                        if(nisangunsayisi[i]<nisanminumumsicaklik){
                            nisanminumumsicaklik=nisangunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+nisanmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+nisanminumumsicaklik+"°C");
                    ortalama=toplam/nisangunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "mayis":
                    int[] mayisgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < mayisgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        mayisgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < mayisgunsayisi.length; i++) {

                        toplam = toplam + mayisgunsayisi[i];
                    }
                    int mayisminumumsicaklik=mayisgunsayisi[0];
                    int mayismaximumsicaklik=mayisgunsayisi[0];
                    for(int i=0;i<mayisgunsayisi.length;i++){
                        if(mayisgunsayisi[i]>mayismaximumsicaklik){
                            mayismaximumsicaklik=mayisgunsayisi[i];
                        }
                        
                        if(mayisgunsayisi[i]<mayisminumumsicaklik){
                            mayisminumumsicaklik=mayisgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+mayismaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+mayisminumumsicaklik+"°C");
                    ortalama=toplam/mayisgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "haziran":
                    int[] hazirangunsayisi = new int[30];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < hazirangunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        hazirangunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < hazirangunsayisi.length; i++) {

                        toplam = toplam + hazirangunsayisi[i];
                    }
                    int haziranminumumsicaklik=hazirangunsayisi[0];
                    int haziranmaximumsicaklik=hazirangunsayisi[0];
                    for(int i=0;i<hazirangunsayisi.length;i++){
                        if(hazirangunsayisi[i]>haziranmaximumsicaklik){
                            haziranmaximumsicaklik=hazirangunsayisi[i];
                        }
                        
                        if(hazirangunsayisi[i]<haziranminumumsicaklik){
                            haziranminumumsicaklik=hazirangunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+haziranmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+haziranminumumsicaklik+"°C");
                    ortalama=toplam/hazirangunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "temmuz":
                    int[] temmuzgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < temmuzgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        temmuzgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < temmuzgunsayisi.length; i++) {

                        toplam = toplam + temmuzgunsayisi[i];
                    }
                    int temmuzminumumsicaklik=temmuzgunsayisi[0];
                    int temmuzmaximumsicaklik=temmuzgunsayisi[0];
                    for(int i=0;i<temmuzgunsayisi.length;i++){
                        if(temmuzgunsayisi[i]>temmuzmaximumsicaklik){
                            temmuzmaximumsicaklik=temmuzgunsayisi[i];
                        }
                        
                        if(temmuzgunsayisi[i]<temmuzminumumsicaklik){
                            temmuzminumumsicaklik=temmuzgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+temmuzmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+temmuzminumumsicaklik+"°C");
                    ortalama=toplam/temmuzgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "agustos":
                    int[] agustosgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < agustosgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        agustosgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < agustosgunsayisi.length; i++) {

                        toplam = toplam + agustosgunsayisi[i];
                    }
                    int agustosminumumsicaklik=agustosgunsayisi[0];
                    int agustosmaximumsicaklik=agustosgunsayisi[0];
                    for(int i=0;i<agustosgunsayisi.length;i++){
                        if(agustosgunsayisi[i]>agustosmaximumsicaklik){
                            agustosmaximumsicaklik=agustosgunsayisi[i];
                        }
                        
                        if(agustosgunsayisi[i]<agustosminumumsicaklik){
                            agustosminumumsicaklik=agustosgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+agustosmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+agustosminumumsicaklik+"°C");
                    ortalama=toplam/agustosgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "eylul":
                    int[] eylulgunsayisi = new int[30];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < eylulgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        eylulgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < eylulgunsayisi.length; i++) {

                        toplam = toplam + eylulgunsayisi[i];
                    }
                    int eylulminumumsicaklik=eylulgunsayisi[0];
                    int eylulmaximumsicaklik=eylulgunsayisi[0];
                    for(int i=0;i<eylulgunsayisi.length;i++){
                        if(eylulgunsayisi[i]>eylulmaximumsicaklik){
                            eylulmaximumsicaklik=eylulgunsayisi[i];
                        }
                        
                        if(eylulgunsayisi[i]<eylulminumumsicaklik){
                            eylulminumumsicaklik=eylulgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+eylulmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+eylulminumumsicaklik+"°C");
                    ortalama=toplam/eylulgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "ekim":
                    int[] ekimgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < ekimgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        ekimgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < ekimgunsayisi.length; i++) {

                        toplam = toplam + ekimgunsayisi[i];
                    }
                    int ekimminumumsicaklik=ekimgunsayisi[0];
                    int ekimmaximumsicaklik=ekimgunsayisi[0];
                    for(int i=0;i<ekimgunsayisi.length;i++){
                        if(ekimgunsayisi[i]>ekimmaximumsicaklik){
                            ekimmaximumsicaklik=ekimgunsayisi[i];
                        }
                        
                        if(ekimgunsayisi[i]<ekimminumumsicaklik){
                            ekimminumumsicaklik=ekimgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+ekimmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+ekimminumumsicaklik+"°C");
                    ortalama=toplam/ekimgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "kasim":
                    int[] kasimgunsayisi = new int[30];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < kasimgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        kasimgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < kasimgunsayisi.length; i++) {

                        toplam = toplam + kasimgunsayisi[i];
                    }
                    int kasimminumumsicaklik=kasimgunsayisi[0];
                    int kasimmaximumsicaklik=kasimgunsayisi[0];
                    for(int i=0;i<kasimgunsayisi.length;i++){
                        if(kasimgunsayisi[i]>kasimmaximumsicaklik){
                            kasimmaximumsicaklik=kasimgunsayisi[i];
                        }
                        
                        if(kasimgunsayisi[i]<kasimminumumsicaklik){
                            kasimminumumsicaklik=kasimgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+kasimmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+kasimminumumsicaklik+"°C");
                    ortalama=toplam/kasimgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
            case "aralik":
                    int[] aralikgunsayisi = new int[31];
                    System.out.println(ay+" ayinin gunlerine gore sirayla sicaklik degerlerini giriniz: ");
                    for (int i = 0; i < aralikgunsayisi.length; i++) {
                        System.out.print((i+1)+". gun sicaklik degeri= ");
                        aralikgunsayisi[i] = scan.nextInt();
                    }
                    for (int i = 0; i < aralikgunsayisi.length; i++) {

                        toplam = toplam + aralikgunsayisi[i];
                    }
                    int aralikminumumsicaklik=aralikgunsayisi[0];
                    int aralikmaximumsicaklik=aralikgunsayisi[0];
                    for(int i=0;i<aralikgunsayisi.length;i++){
                        if(aralikgunsayisi[i]>aralikmaximumsicaklik){
                            aralikmaximumsicaklik=aralikgunsayisi[i];
                        }
                        
                        if(aralikgunsayisi[i]<aralikminumumsicaklik){
                            aralikminumumsicaklik=aralikgunsayisi[i];
                        }
                    }
                    System.out.println(ay+" ayinin en yuksek sicakligi= "+aralikmaximumsicaklik+"°C");
                    System.out.println(ay+" ayinin en dusuk sicakligi= "+aralikminumumsicaklik+"°C");
                    ortalama=toplam/aralikgunsayisi.length;
                    System.out.println(ay+" ayinin ortalama sicakligi= "+ortalama+"°C");
                    break;
                    
                    default:
                        System.out.println("Lutfen tamami kucuk harfle yazilmis bir ay ismi giriniz! ");
        }
    }

}
