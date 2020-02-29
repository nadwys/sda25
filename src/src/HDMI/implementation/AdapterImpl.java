package HDMI.implementation;

import HDMI.Adapter;

public class AdapterImpl extends AdapterToPdf {
    private Converter converter;

    public AdapterImpl(Converter converter){
        this.converter = converter;
    }

    @Override
    public void converter(){
        this.converter.converter();
    }
}
