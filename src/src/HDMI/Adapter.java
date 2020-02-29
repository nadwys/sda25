package HDMI;

public class Adapter {
        public static void main(String[] args) {
            Hdmi hdmi = new HdmiImpl();
            Usb usb = new Usb();

            HdmiToUsb hdmiToUsb = new HdmiToUsbImpl(hdmi);

            usb.connect(hdmiToUsb);
        }
    }
