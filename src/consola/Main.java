package consola;
import clases_uml.Estudiante;
import clases_uml.Persona;
public class Main {    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona objPers1 = new Persona("0133145547", "Armando Paredes del Castillo", (byte)25, 'M');
        String estado = objPers1.toString();
        System.out.println(estado);
        Estudiante objEst1 = new Estudiante("Software", "DSE08", "0122134439", "Juana de Arcos", (byte)20, 'F');
        estado = objEst1.toString();
        System.out.println(estado);
        //principio SOLID: Liskov
        Persona objPers2 = new Estudiante("Contabilidad", "CSE08", "0112332456", "Brad Pitt", (byte)30, 'M');
        estado = objPers2.toString();//estable el enlace dinamico segun el tipo dinamico del objeto
        System.out.println(estado);
    }
    
}
