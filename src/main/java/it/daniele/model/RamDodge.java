package it.daniele.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "ramdodge")
@Primary //genererebbe errore percvhe gia presente in RamEsprimo
public class RamDodge implements IsRam{


    @Override
    public void modelloRam() {
        System.out.println ("8Gb 240pin DIMM DDR3 - 1333MHz , Unbuffered, 1,5V");
    }




}
