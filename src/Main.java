import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, esponente;
        do
        {
            System.out.println("Inserisci la base della potenza (tra 0 e 10)");
            base = scan.nextInt();
        }while(base<0 || base>10);

        do
        {
            System.out.println("Inserisci l'esponente della potenza (tra 0 e 10)");
            esponente = scan.nextInt();
        }while(esponente<0 || esponente>10);
        
        System.out.println(Potenza(base,esponente));
        scan.close();
    }
    
    static double Potenza(int base, int esponente)
        {
            return Math.pow(base, esponente);
        }
}