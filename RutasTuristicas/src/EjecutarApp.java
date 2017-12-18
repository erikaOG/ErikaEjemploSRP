

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pcmaster2
 */
public class EjecutarApp {
     public static void main(String[] args) {
        Persona m = new Reservar();
        m.setNombre("Sofia");
        m.setApellido("Vasquez");
        m.ReservacionDe(new GuardarReservacion());
        m.printInfo();
        
        
        
        
    }
    
}
