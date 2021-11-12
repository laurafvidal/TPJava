/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjava;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class TPJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        
        String nombreUsuario = scanner.next();
        
        System.out.println("Introduce tu apellido");
        
        String apellidoUsuario = scanner.next();
        
        System.out.println("¿Cuantos años tienes?");
        
        String edadUsuario = scanner.next();
        
        System.out.println("¿Cual es tu hobby favorito?");
        
        String hobbyUsuario = scanner.next();
        
        System.out.println("¿Cual es tu editor  de código preferido?");
        
        String editorUsuario = scanner.next();
        
        System.out.println("¿Qué sistema operativo utilizas?");
        
        String sistemaUsuario = scanner.next();
        
        System.out.println("--------------------------------------------");
        
        System.out.println("GRACIAS POR LA INFORMACION. ESTOS SON TODOS SUS DATOS:");
        
        System.out.println("Su nombre es: " +nombreUsuario);
        
        System.out.println("Su apellido es: " +apellidoUsuario);
        
        System.out.println("Su edad es: " +edadUsuario +" años");
        
        System.out.println("Su hobby es: " +hobbyUsuario);
        
        System.out.println("Su editor de código preferido es: " +editorUsuario);
     
        System.out.println("Usas el sistema operativo: " +sistemaUsuario);
        }
    
}
