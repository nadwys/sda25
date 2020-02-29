package Adapter;

public class UKPlugConnectorImpl implements UKPlugConnector{
    @Override
    public void takeElectricityFromSocket() {
        System.out.println("Taking electricity from the socket for the UK appliance");
    }
}
