package ua.lviv.iot.model;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/dish")
public class DishService {
    private static Map<Integer, Dish> dishMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Dish getDish(@PathParam("id")Integer id){
        return dishMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Dish createDish( Dish dish) {
        dishMap.put(dish.getId(), dish);
        return dishMap.get(dish.getId());
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response deleteDish( @PathParam("id") Integer id) {
        dishMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateDish( Dish dish) {
        dishMap.replace(dish.getId(), dish);
        return Response.status(200).entity(dishMap.get(dish.getId())).build();
    }
}
