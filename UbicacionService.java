package localidades;


import com.fasterxml.jackson.databind.ObjectMapper;
import localidades.Provincia;
import localidades.Canton;
import localidades.Parroquia;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UbicacionService {

    private static final String JSON_FILE_PATH = "ubicacion/localidades.json";  // Ruta a tu archivo JSON

    // Método para obtener todas las provincias desde el archivo JSON
    public List<Provincia> obtenerProvincias() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Deserializar el archivo JSON a la lista de provincias
            List<Provincia> provincias = objectMapper.readValue(new File(JSON_FILE_PATH), objectMapper.getTypeFactory().constructCollectionType(List.class, Provincia.class));
            return provincias;
        } catch (IOException e) {
            e.printStackTrace();
            return null;  // En caso de error, retornar null o un arreglo vacío
        }
    }

    // Método para obtener cantones por provincia
    public List<Canton> obtenerCantonesPorProvincia(String codigoProvincia) {
        return obtenerProvincias().stream()
            .filter(provincia -> provincia.getCodigo().equals(codigoProvincia))
            .findFirst()
            .map(Provincia::getCantones)
            .orElse(null);  // Retorna null si no se encuentra la provincia
    }

    // Método para obtener parroquias por cantón
    public List<Parroquia> obtenerParroquiasPorCanton(String codigoCanton) {
        return obtenerCantonesPorProvincia("1").stream()  // Filtrar por la provincia '1' como ejemplo
            .filter(canton -> canton.getCodigo().equals(codigoCanton))
            .findFirst()
            .map(Canton::getParroquias)
            .orElse(null);  // Retorna null si no se encuentra el cantón
    }
}
