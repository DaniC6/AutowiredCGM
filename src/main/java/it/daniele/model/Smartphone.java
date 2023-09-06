package it.daniele.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "nokia")
public class Smartphone {

    private String marca;
    private String processore;
    private IsRam ram;

    private  Display display;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public IsRam getRam() {
        return ram;
    }

    @Autowired
    @Qualifier(value = "ramesprimo")
    public void setRam(IsRam ram) {
        this.ram = ram;
    }


    public Display getDisplay() {
        return display;
    }
    @Autowired
    @Qualifier(value = "displaynovepollici")
    public void setDisplay(Display display) {
        this.display = display;
    }

    public void configurazioneSmartphone(){
        System.out.println ("Marca: " + marca);
        System.out.println ("Display: " + display);
        System.out.println ("Processore: " + processore);
        System.out.println ("Ram: ");
        ram.modelloRam();
    }
}
