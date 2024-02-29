import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String nombre;
    private String artista;
    public ArrayList<Cancion> canciones=new ArrayList<Cancion>();

    private Cancion findSong (String titulocancion){

        for (int cont=0;cont< canciones.size();cont++){

            if (canciones.get(cont).equals(titulocancion)){

                return canciones.get(cont);
            }
        }
        return null;
    }

    public boolean addSong (String titulo, double duracion){

        if (findSong(titulo)!=null){

            System.out.println("La cancion ya existe");
            return false;
        }
        canciones.add(new Cancion(titulo,duracion));
        System.out.println("La cancion "+titulo+" se ha añadido correctamente");
        return true;
    }

    public boolean addToPlayList (int numeroPista, LinkedList<Cancion> listaReproduccion){

        if (!listaReproduccion.contains(listaReproduccion.get(numeroPista))){

            System.out.println("");
            return false;
        }
        listaReproduccion.add(canciones.get(numeroPista));
        return true;
    }

    public boolean addToPlayList (String tituloCancion, LinkedList<Cancion> listaReproduccion){

        if (!canciones.contains(findSong(tituloCancion))){

            System.out.println("La cancion que quiere agregar a la lista no existe");
            return false;
        }

        listaReproduccion.add(findSong(tituloCancion));
        return true;
    }

    public Album (String nombrealbum, String artista){

        this.nombre=nombrealbum;
        this.artista=artista;

        ArrayList canciones = new ArrayList<Cancion>();
        this.canciones=canciones;
    }


}
