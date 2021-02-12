package educanet.managers;

import educanet.entities.CarEntity;
import jdk.internal.loader.Resource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@ApplicationScoped
public class CarManager {

    private ArrayList<CarEntity> carEntities = new ArrayList<>();
    private int id = 0;
    static String name;
    static String type;
    static String RegistrationNumber;

public ArrayList<CarEntity> getAll(){
    return carEntities;
}
public void get() {
    if (id != null && carEntities.get(id) != null){
        Response.ok(carEntities.get(id)).build();
    }else {
        Response.ok("Auto neni v databazi").build();
    }
    }
public void create(CarEntity post){
    if(name != null && type != null && RegistrationNumber != null){
        post.setId(id);
        id++;
        carEntities.add(post);
    }
}
public void delete() {
    if (id != null){
        carEntities.remove(id);
    }
}
}
