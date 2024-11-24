package tut.dushyant.cafe;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/shop")
public class ShopWebResource {

    @GET
    public String hello() {
        return "Hello, World!";
    }

}
