import java.time.LocalDateTime;

public class Evento implements Comparable<Evento>{

    @Override
    public int compareTo(Evento o) {
        return fechaHora.compareTo(o.getFechaHora());
    }

    public enum Estado{
        ACTIVO, INACTIVO, PASADO;
    }

    public enum Prioridad{
        ALTA,NORMAL, BAJA;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "fechaHora=" + fechaHora +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }

    private LocalDateTime fechaHora;
    private String descripcion;

    private Estado estado;

    private Prioridad prioridad;

    public Evento(LocalDateTime fechaHora, String descripcion, Estado estado, Prioridad prioridad){
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public Evento(LocalDateTime fechaHora, String descripcion) {
        this(fechaHora, descripcion, Estado.ACTIVO, Prioridad.NORMAL);
    }

    public Estado getEstado(){
        return  this.estado;
    }

    public Prioridad getPrioridad(){
        return this.prioridad;
    }

    public void actualizarEstado(){
        if (fechaHora.isBefore(LocalDateTime.now())){
            this.estado = Estado.INACTIVO;
        }
    }

    public void actualizarEstado(Estado aEstado){
        this.estado = aEstado;
    }


    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        descripcion = descripcion;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
