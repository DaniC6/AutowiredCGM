package it.daniele.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "computernuovo") // o ("computernuovo")
//@Scope("false") // false-> disabilita singleton
@Scope("prototype")

public class ComputerNuovo {

    private String marca;
    private String processore;
   // @Autowired
    private IsRam ram;

    //@Autowired
    public ComputerNuovo(IsRam ram) {
        this.ram = ram;
    }

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
   @Qualifier(value = "ramdodge")
    public void setRam(IsRam ram) {
        this.ram = ram;
    }


    public void configuraziuone(){
        System.out.println ("Marca: " + marca);
        System.out.println ("Processore: " + processore);
        System.out.println ("Ram: ");
        ram.modelloRam();
    }
}
