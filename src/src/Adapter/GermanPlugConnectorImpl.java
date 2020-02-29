package Adapter;

public class GermanPlugConnectorImpl implements GermanPlugConnector{

    @Override
    public void takeElectricityFromSocket() {
        System.out.println("Taking electricity from the socket for the German appliance");
    }
}
