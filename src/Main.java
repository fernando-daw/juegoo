import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        jugador mando1 = new jugador(150,45,15,"ElXokas",30,24);
        Enemigo mando2 = new Enemigo(150,25,25,"Twitter",28);


        Entidad arrayjugadores[] = new Entidad[2];
        arrayjugadores[0]= mando1;
        arrayjugadores[1]=mando2;

        boolean salir = false;
        Scanner menu = new Scanner(System.in);

        while (!salir){
            int atacar;
            int damage;

            for (int i =0; i<arrayjugadores.length;i++){

            }

            System.out.println("La vida de " + mando1.getNombre() + "es de " + mando1.getVida());
            System.out.println("La vida de " + mando2.getNombre() + "es de " + mando2.getVida());







        }








    }
}