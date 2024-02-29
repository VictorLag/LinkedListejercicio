import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainCanciones {
    public static Scanner sc = new Scanner(System.in);



public static void cancionparalalista (){

}


    public static void imprimirMenu(){

        System.out.println("0 = Salir de la lista de reproducción");
        System.out.println("1 = Reproducir siguiente canción en la lista");
        System.out.println("2 = Reproducir la canción previa de la lista");
        System.out.println("3 = Repetir la canción actua");
        System.out.println("4 = Imprimir la lista de canciones en la playlist");
        System.out.println("5 = Volver a imprimir menu");
       // System.out.println("6 = Borrar");
    }



    public static void main(String[] args) {
        ArrayList<Album> albumlista=new ArrayList<Album>();
        albumlista.add(new Album("System of a DAW","Serj Tankian"));
        albumlista.add(new Album("CodeAllica","El diavolico Michael G."));

        LinkedList<Cancion> listaReproduccion=new LinkedList<>();
       // listaReproduccion.add();




        boolean continuar = true;
        int opcion;
        imprimirMenu();

        while (continuar){
            System.out.println("Elige una opcion.");
            opcion=sc.nextInt();

            switch (opcion){

                case 0:
                    System.out.println("Adios");
                    continuar=false;
                    break;

                case 1:


                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:


                    break;

                case 5:


                    break;

                case 6:


                    break;
            }


        }


    }

}
