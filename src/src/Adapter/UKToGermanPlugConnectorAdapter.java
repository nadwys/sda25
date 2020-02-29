package Adapter;
public class UKToGermanPlugConnectorAdapter implements UKPlugConnector {

    private UKPlugConnector plug;

    public UKToGermanPlugConnectorAdapter(UKPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void takeElectricityFromSocket() {
        plug.takeElectricityFromSocket();
    }

}