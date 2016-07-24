package campspot.healthcheck;

import campspot.config.NodeConfig;
import com.codahale.metrics.health.HealthCheck;

import javax.ws.rs.client.Client;

public class NodeHealthCheck extends HealthCheck {
    private NodeConfig nodeConfig;
    private Client client;

    public NodeHealthCheck(NodeConfig nodeConfig, Client client) {
        this.nodeConfig = nodeConfig;
        this.client = client;
    }

    @Override
    protected Result check() throws Exception {
        client.target(String.format("http://%s:%d/api/v1/status", nodeConfig.getHost(), nodeConfig.getPort()))
            .request()
            .get();

        return Result.healthy();
    }
}
