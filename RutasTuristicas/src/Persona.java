

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pcmaster2
 */

public abstract class Persona {
     private String Nombre;
     private String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
     
     public void ReservacionDe(IPersona reservacion){
        reservacion.guardarReservacion(Nombre);
    }
     abstract void printInfo();
}
