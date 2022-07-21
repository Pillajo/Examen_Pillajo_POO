
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author JOSE
 */
public class Aplicacion {
    
           public static void main (String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("JOSE PILLAJO","18");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("0968840967");

        System.out.println("Cliente: " + p2.getNombre());
        System.out.println("De: " + p2.getEdad() + " Años ");
        System.out.println("Número de telefono: " + c2.getTelefono());
    }

    
    
}
