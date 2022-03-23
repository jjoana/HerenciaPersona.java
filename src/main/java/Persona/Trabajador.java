package Persona;

public class Trabajador extends Persona {
    private String empresa;
    private int sueldo;
    private String seguridadSocial;
    
    public Trabajador (int edad, String sexo, String colorpelo, double altura, String empresa, int sueldo, String seguridadSocial){
        super(edad, sexo, colorpelo, altura);
        this.empresa= empresa;
        this.sueldo= sueldo;
        this.seguridadSocial=seguridadSocial;
    }
        
    //Metodo getter para empresa
    public String getempresa(){
        return empresa;
    }
    
    //Metodo setter para edad
    public void setempresa(String empresa){
        this.empresa= empresa;
    }

    //Metodo getter para sueldo
    public int getsueldo(){
        return sueldo;
    }

    //Metodo setter para sueldo
    public void setsueldo (int sueldo){
        this.sueldo=sueldo;
    }
    //Metodo getter para seguridadSocial
    public String getseguridadSocial(){
        return seguridadSocial;
    }

    //Metodo setter para seguridadSocial
    
    public void setSeguridadSocial (String seguridadSocial) {
        this.seguridadSocial=seguridadSocial;
    }
    
}
