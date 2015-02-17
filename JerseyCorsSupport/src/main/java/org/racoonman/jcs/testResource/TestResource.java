package org.racoonman.jcs.testResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author daniel
 */
@Path(value = "/test")
public class TestResource {
    
    @POST
    public Response test(){
        return Response.ok("TEST", MediaType.TEXT_PLAIN). build();
    }
}
