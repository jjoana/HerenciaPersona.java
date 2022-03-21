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
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("La edad de Julio es: " );
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("El sexo de Julio es: ");
        sexo= entrada.nextLine();
        System.out.print("El colorpelo de Julio es: ");
        colorpelo= entrada.nextLine();
        System.out.print("La altura de Julio es: ");
        altura= entrada.nextDouble();
        Persona julio = new Persona(edad, sexo, colorpelo, altura);

        System.out.print("La edad de Jesus es: " );
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("El sexo de Jesus es: ");
        sexo= entrada.nextLine();
        System.out.print("El colorpelo de Jesus es: ");
        colorpelo= entrada.nextLine();
        System.out.print("La altura de Jesus es: ");
        altura= entrada.nextDouble();
        Persona jesus = new Persona(edad, sexo, colorpelo, altura);

        System.out.println("La edad de jesus es: " + jesus.getedad() + "El sexo de Jesus es: " 
        + jesus.getsexo() + "El color de pelo de Jesus es: " + jesus.getcolorpelo() + "La altura de Jesus es de: " + jesus.getaltura());
        entrada.close();

    }
}
