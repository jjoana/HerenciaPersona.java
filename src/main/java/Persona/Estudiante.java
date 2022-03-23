package Persona;

public class Estudiante extends Persona {
    private String universidad;
    private String carrera;
    private int anoestudio;

    public Estudiante(String universidad, String carrera, int anoestudio, int edad, String sexo, String colorpelo, double altura ){
        super(edad, sexo, colorpelo, altura);
        this.universidad= universidad;
        this.carrera= carrera;
        this.anoestudio=anoestudio;
    }
    
    //Metodo getter para Universidad

    public String getUniversidad(){
        return universidad;
    }

    //Metodo setter para Universidad

    public void setUniversidad(String universidad){
        this.universidad= universidad;

    }    
    //Metodo getter para carrera
    public String getcarrera(){
        return carrera;
    }

    //Metodo setter para carrera
    public void setcarrera(String carrera){
        this.carrera=carrera;
    }

    //Metodo getter para anoestudio
    public int getanoestudio(){
        return anoestudio;
    }

    //Metodo setter para anoestudio
    public void setanoestudio(int anoestudio){
        this.anoestudio=anoestudio;
    }
}

