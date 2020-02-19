import java.util.Scanner;

public class JavaProjesi {
    public static void main (String[] args){

        System.out.println("Kar Miktarını Giriniz");
        Scanner kar = new Scanner(System.in);
        int karMiktari = kar.nextInt();

        System.out.println("Zarar Miktarını Giriniz");
        Scanner zarar = new Scanner(System.in);
        int zararMiktari = zarar.nextInt();

        if (karMiktari > zararMiktari){
            System.out.println("Kar yaptınız:" + (karMiktari-zararMiktari));
        }else{
            System.out.println("Zarar Yaptınız" + (zararMiktari - karMiktari));
        }
    }



}
