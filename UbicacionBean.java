package localidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@ManagedBean
@ViewScoped
public class UbicacionBean implements java.io.Serializable {

    private static final long serialVersionUID = 1L; // Añadido para garantizar la serialización adecuada

    private Map<String, Provincia> provincias;
    private String selectedProvincia;
    private String selectedCanton;
    private String selectedParroquia;

    @PostConstruct
    public void init() {
        cargarJSON();
    }

    public void cargarJSON() {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/provincias.json")) {
            if (inputStream == null) {
                throw new IOException("El archivo provincias.json no se encontró.");
            }
            // Deserializa el archivo JSON en un Map de Provincias
            provincias = mapper.readValue(inputStream, mapper.getTypeFactory()
                    .constructMapType(Map.class, String.class, Provincia.class));
        } catch (IOException e) {
            // Es más conveniente para depuración que prints en la consola
            e.printStackTrace();
        }
    }

    // Getters y Setters
    public Map<String, Provincia> getProvincias() {
        return provincias;
    }

    public String getSelectedProvincia() {
        return selectedProvincia;
    }

    public void setSelectedProvincia(String selectedProvincia) {
        this.selectedProvincia = selectedProvincia;
    }

    public String getSelectedCanton() {
        return selectedCanton;
    }

    public void setSelectedCanton(String selectedCanton) {
        this.selectedCanton = selectedCanton;
    }

    public String getSelectedParroquia() {
        return selectedParroquia;
    }

    public void setSelectedParroquia(String selectedParroquia) {
        this.selectedParroquia = selectedParroquia;
    }
}
