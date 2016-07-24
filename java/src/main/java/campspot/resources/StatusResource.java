package campspot.resources;

import campspot.api.ServerStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
@Produces(MediaType.APPLICATION_JSON)
public class StatusResource {
    private String statusMessage;

    public StatusResource(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @GET
    public ServerStatus getStatus() {
        ServerStatus status = new ServerStatus();
        status.setStatus(statusMessage);

        return status;
    }
}
