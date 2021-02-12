package educanet.recources;

import educanet.entities.CarEntity;
import educanet.managers.CarManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarRecources {

    @Inject
    private CarManager manager;
    @GET
    public Response getAll() {
        return Response.ok(manager.getAll()).build();
    }
    @GET
    @Path("{id}")
    public Response get(@PathParam("id") int id){
        return Response.ok(manager.get(id)).build();
    }
    @POST
    public Response create(CarEntity post){
        manager.create(post);
        return Response.ok(post).build();
    }
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id){
        return Response.ok(manager.delete(id)).build();
    }
}
