import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Adaugati nr de minute ");
        Scanner inputDevice=new Scanner(System.in);
        int minute,ore;
        minute=inputDevice.nextInt();
        int pret=cost(minute);
        ore=minute/60;
        System.out.print("Numarul de ore ");
        System.out.println(ore);
        System.out.print("Numarul de minute= ");
        System.out.println(minute);
        System.out.print("Pretul total este= ");
        System.out.println(pret);



    }
    public static int cost(int nrMinute) {
        int inchiriere , inchiriereextra = 0, inchiereMeh;


        inchiriere = nrMinute * 40;
        if (inchiriere > 240) {
            for (int i = 60; i < nrMinute; i++) {
                inchiriereextra++;

            }
        }
        System.out.print("Pretul fara orele extra e ");
        System.out.println(inchiriere);

        System.out.print("Pretul minute suplimentare este ");
        System.out.println(inchiriereextra);


        inchiereMeh = inchiriere + inchiriereextra ;

        return inchiereMeh;
    }
}