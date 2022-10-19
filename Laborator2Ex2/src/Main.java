import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Adaugati numarul de invitati= ");
        Scanner inputDevice=new Scanner(System.in);
        int inv;
        inv=inputDevice.nextInt();
        int invitati=pret(inv);

        System.out.print("Pretul per persoana este de 35$ \n");

        System.out.print(" Numarul de invitati este = ");
        System.out.println(inv);
        System.out.print("Pretul total este= ");
        System.out.println(invitati);
        System.out.print("Este un eveniment mare?= ");
        System.out.println(inv>50);

    }
    public static int pret(int  nrInvitati)
    {
        int pretTotal;
        pretTotal=nrInvitati*35;
        return pretTotal;

    }
}