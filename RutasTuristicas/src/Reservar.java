


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pcmaster2
 */
public class Reservar extends Persona{

    @Override
    void printInfo() {
        System.out.println("Esto es una Reservacion, de la persona: "+ getNombre()+ " y de apellido " + getApellido()); 
    }
    
}
