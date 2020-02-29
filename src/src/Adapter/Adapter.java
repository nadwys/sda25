package Adapter;

public class Adapter {

        public static void main(String[] args) {
            GermanPlugConnector plug = new GermanPlugConnectorImpl();
            UKElectricalSocket socket = new UKElectricalSocket();

            UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);

            socket.plugIn(ukAdapter);
        }
    }