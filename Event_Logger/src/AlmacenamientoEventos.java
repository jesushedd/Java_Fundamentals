import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AlmacenamientoEventos {
    private boolean modoBaseDatos = false;

    private Path rutaArchivo;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;



    public void guardarEvento(Evento evento){

    }

    public  void cargarEventos(List<Evento> listaDeEventos){

    }

    public AlmacenamientoEventos(Path rutaArchivo){

    }

    public AlmacenamientoEventos(String rutaDDBB) {
        //TODO
        //Establecer conexion DDB
        this.modoBaseDatos = true;
    }


}
