package clases_uml;

public class Estudiante extends Persona{
    //atributos
    private String carrera;
    private String paralelo;
    //Metodos constructores

    public Estudiante() {
    }

    public Estudiante(String carrera, String paralelo, String cedula, String nombres, byte edad, char sexo) {
        /*this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.sexo = sexo;*/
        super(cedula, nombres, edad, sexo);
        this.carrera = carrera;
        this.paralelo = paralelo;
    }
    //metodos getters ands setters

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
    //metodos de comportamiento

    @Override//metodo polimorfico
    public String toString() {
        String estado = super.toString();//metodo de mi padre
        estado += "{" + "carrera=" + carrera + ", paralelo=" + paralelo + '}';
        return estado;
    }
}
