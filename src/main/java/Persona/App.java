package Persona;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int edad;
        String sexo;
        String colorpelo;
        double altura;
        String universidad;
        String carrera;
        int anoestudio;
        String empresa;
        int sueldo;
        String seguridadSocial;
        
        Scanner entrada = new Scanner(System.in);
        //System.out.print("La edad de Julio es: " );
        //edad = entrada.nextInt();
        //entrada.nextLine();
        //System.out.print("El sexo de Julio es: ");
        //sexo= entrada.nextLine();
        //System.out.print("El colorpelo de Julio es: ");
        //colorpelo= entrada.nextLine();
        //System.out.print("La altura de Julio es: ");
        //altura= entrada.nextDouble();
        //Persona julio = new Persona(edad, sexo, colorpelo, altura);

        //Instanciamos y creamos objeto persona

        //System.out.print("La edad de Jesus es: " );
        //edad = entrada.nextInt();
        //entrada.nextLine();
        //System.out.print("El sexo de Jesus es: ");
        //sexo= entrada.nextLine();
        //System.out.print("El colorpelo de Jesus es: ");
        //colorpelo= entrada.nextLine();
        //System.out.print("La altura de Jesus es: ");
        //altura= entrada.nextDouble();
        //Persona jesus = new Persona(edad, sexo, colorpelo, altura);

        //Instanciamos y creamos objeto estudiante

        //System.out.print("La edad de Jesus es: " );
        //edad= entrada.nextInt();
        //entrada.nextLine();
        //System.out.print("El sexo de Jesús es: " );
        //sexo= entrada.nextLine();
        //System.out.print("El colorpelo de Jesus: " );
        //colorpelo= entrada.nextLine();
        //System.out.print("La altura de Jesus es: " );
        //altura= entrada.nextDouble();
        //entrada.nextLine();
        //System.out.print("Jesus estudia en la Universidad: " );
        //universidad= entrada.nextLine();
        //System.out.print("Jesus estudia la carrera de: " );
        //carrera= entrada.nextLine();
        //System.out.print("Jesus esta en el año de estudio: " );
        //anoestudio= entrada.nextInt();
        //entrada .nextLine();
        //Estudiante Jesus = new Estudiante (universidad,carrera, anoestudio, edad, sexo, colorpelo, altura);

        //Intanciamos y cremaos objeto Trabajador 
        System.out.print("La edad es de: " );
        edad= entrada.nextInt();
        entrada.nextLine();
        System.out.print("El sexo de Jesus es: " );
        sexo=entrada.nextLine();
        System.out.print("El color de pelo de Jesus es: ");
        colorpelo= entrada.nextLine();
        System.out.print("La altura de Jesus es: " );
        altura= entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Jesus trabaja en la empresa: " );
        empresa= entrada.nextLine();
        System.out.println("Cuanto gana Jesus: " );
        sueldo= entrada.nextInt();
        entrada.nextLine();
        System.out.print("Cual es el numero de la seguridad social de Jesus: " );
        seguridadSocial= entrada.nextLine();
        Trabajador Jesus = new Trabajador (edad, sexo, colorpelo, altura, empresa, sueldo, seguridadSocial);
        System.out.println("La edad de Jesus es de: " + Jesus.getedad() + "El sexpo de Jesus es: " + Jesus.getsexo() + "El color de pelo de Jesus es: " + Jesus.getcolorpelo() 
        + "Jesus mide: " + Jesus.getaltura() +"La empresa en la que trabaja se llama: " + Jesus.getempresa() + "El sueldo de Jesus es: " + Jesus.getsueldo());

        

        //System.out.println("Jesus estudia en la Universidad: " + Jesus.getUniversidad() + "La carrera que estudia en la Universidad es: " + Jesus.getcarrera() + 
        //"Esta en el año de estudio: " + Jesus.getanoestudio() + "Su edad es de: " + Jesus.getedad() + "El es un@: " + Jesus.getsexo() + 
        //"Tiene el color de pelo: " + Jesus.getcolorpelo() + "Jesus mide: " + Jesus.getaltura());


      //  System.out.println("La edad de jesus es: " + jesus.getedad() + "El sexo de Jesus es: " 
        //+ jesus.getsexo() + "El color de pelo de Jesus es: " + jesus.getcolorpelo() + "La altura de Jesus es de: " + jesus.getaltura());
        entrada.close();

    }
}
