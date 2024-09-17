package clases_uml;

public class Persona {
    //Atributos
    protected String cedula;
    protected String nombres;
    protected byte edad;
    protected char sexo;
    //Metodos constructores
    public Persona() {
    }

    public Persona(String cedula, String nombres, byte edad, char sexo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.sexo = sexo;
    }
    //metodos getters and setters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //metodos de comportamiento

    @Override //estado del objeto
    public String toString() {
        return "Class: " + this.getClass().getName().substring(11)+ "{" + "cedula=" + cedula + ", nombres=" + nombres + ", edad=" + edad + ", sexo=" + sexo + '}';
    }    
    
}
