public class AddOnService {

    /**
     * Name of the service.
     */
    private String serviceName;

    /**
     * Cost of the service.
     */
    private double cost;

    /**
     * Constructor
     */
    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    /**
     * @return service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * @return service cost
     */
    public double getCost() {
        return cost;
    }
}