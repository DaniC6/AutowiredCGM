package it.daniele.config;

import it.daniele.model.Display;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("it.daniele")
public class ConfigApp {

    // Creo bean da classi non annotate con @Component
    @Bean(name = "displaysettepollici")
    public Display getDisplaySette(){
       Display displaySettePollici = new Display ();
       displaySettePollici.setDimensioneDisplay ( "Sette Pollici" );
       return displaySettePollici;
    }

    @Bean(name = "displaynovepollici")
    public Display getDisplayNove(){
        Display displayNovePollici = new Display ();
        displayNovePollici.setDimensioneDisplay ( "Nove Pollici" );
        return displayNovePollici;
    }

}
