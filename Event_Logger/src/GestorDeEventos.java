import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GestorDeEventos {

    private Path path = Path.of("");

    private AlmacenamientoEventos almacenamientoEventos;
    //leer evento en archivo
    //guardar eventos en archivo
    private final  List<Evento> eventos = new ArrayList<>();

    public void leerEventos(){
        System.out.println(path);
    }

    public static void main(String[] args) {
        new GestorDeEventos().leerEventos();
    }



}
