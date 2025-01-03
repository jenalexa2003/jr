package localidades;


import localidades.Provincia;
import localidades.Canton;
import localidades.Parroquia;
import localidades.UbicacionService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/ubicacion")
public class UbicacionController {

    private UbicacionService ubicacionService = new UbicacionService();

    @GET
    @Path("/provincias")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerProvincias() {
        List<Provincia> provincias = ubicacionService.obtenerProvincias();
        return Response.ok(provincias).build();
    }

    @GET
    @Path("/cantones/{codigoProvincia}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerCantones(@PathParam("codigoProvincia") String codigoProvincia) {
        List<Canton> cantones = ubicacionService.obtenerCantonesPorProvincia(codigoProvincia);
        return Response.ok(cantones).build();
    }

    @GET
    @Path("/parroquias/{codigoCanton}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerParroquias(@PathParam("codigoCanton") String codigoCanton) {
        List<Parroquia> parroquias = ubicacionService.obtenerParroquiasPorCanton(codigoCanton);
        return Response.ok(parroquias).build();
    }
}
