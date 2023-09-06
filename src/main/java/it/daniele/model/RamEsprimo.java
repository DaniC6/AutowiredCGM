package it.daniele.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "ramesprimo")
//@Primary // con l annotazione primary nel caso spring matchi 2 bean non dara l errore ma prendera quello annotato co @Primary va messo sulla classe
public class RamEsprimo implements IsRam{
    @Override
    public void modelloRam() {
        System.out.println ("16Gb 125pin DIMM DDR3 - 1333MHz , Unbuffered, 1,7V");
    }
}
