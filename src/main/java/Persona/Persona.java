package Persona;

import java.util.Scanner;

public class Persona {

    private int edad;
    private String sexo;
    private String colorpelo;
    private double altura; 

    public Persona (int edad, String sexo, String colorpelo, double altura){
        this.edad = edad;
        this.sexo = sexo;
        this.colorpelo = colorpelo;
        this.altura = altura; 
    }
    //Metodo getter para edad

    public int getedad(){
        return edad;
    }
    
    //Metodo setter para edad

    public void setedad(int edad){
        this.edad= edad;
    }

    //Metodo getter para sexo
    public  String getsexo(){
        return sexo;
    }
    
    //Metodo setter para sexo
    public void setsexo(String sexo){
        this.sexo=sexo;
    }

    //Metodo getter para edad
    public String getcolorpelo(){
        return colorpelo;
    }

    //Metodo setter para colorpelo
    public void setcolorpelo(String colorpelo){
        this.colorpelo= colorpelo;
    }

    //Metodo getter para altura
    public double getaltura(){
        return altura;
    }

    //Metodo setter para altura
    public void setaltura(double altura){
        this.altura= altura;
    }


}