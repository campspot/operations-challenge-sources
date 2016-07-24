package campspot.resources;

import campspot.api.ServerStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/status")
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
