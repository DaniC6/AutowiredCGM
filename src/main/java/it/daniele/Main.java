package it.daniele;

import it.daniele.config.ConfigApp;
import it.daniele.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Gestioni di iniezione tramite annotazione @Autowired
 */
public class Main {

    public static void main(String[] args) {
        System.out.println ("-- The Best Pc--"); // @Autowired nel setter

        ApplicationContext apx = new AnnotationConfigApplicationContext ( ConfigApp.class );

        //Dichiaro un oggetto computer e lo inizializzo con le sue proprietà

        Computer bestComputer =(Computer) apx.getBean ( "computer" );
        bestComputer.setMarca ( "Asus");
        bestComputer.setProcessore ( "I5" );
        bestComputer.configuraziuone ();

        System.out.println ("---------------------------------");

        System.out.println ("--The Best Smartphone--"); // @Autowired nel setter

        //Dichiaro un bean di tipo cellulare e lo inizializzo con le proprietà    @Qualify

        Smartphone nokia =(Smartphone) apx.getBean ( "nokia" );
        nokia.setMarca ( "Nokia" );
        nokia.setProcessore ( "Arm 7 32b" );
        nokia.configurazioneSmartphone ();

        // Dichiaro un bean di tipo computer e inizializzo le sue proprietà

        System.out.println ("--------------------------------");

        Computer computer = apx.getBean ( "computer",Computer.class);
        computer.setMarca ( "Asus");
        computer.setProcessore ( "I5" );
        computer.configuraziuone ();
    }



    }




