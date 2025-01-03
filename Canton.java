package localidades;
import java.util.List;

public class Canton {
    private String codigo;
    private String nombre;
    private List<Parroquia> parroquias;

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Parroquia> getParroquias() {
        return parroquias;
    }

    public void setParroquias(List<Parroquia> parroquias) {
        this.parroquias = parroquias;
    }
}
