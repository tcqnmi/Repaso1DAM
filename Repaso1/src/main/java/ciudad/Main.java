package ciudad;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nombre de la ciudad 1: ...");
        String nomCiudad= teclado.nextLine();
        Ciudad ciudad1 = new Ciudad(nomCiudad);
        
        System.out.println("Nombre de la ciudad 2: ...");
        String nomCiudad2= teclado.nextLine();
        Ciudad ciudad2 = new Ciudad(nomCiudad2);
        
        System.out.println("Extensión de la casa 1: ...");
        int extCasa1 = Integer.parseInt(teclado.nextLine());
        
        Casa casa1 = new Casa (extCasa1);
        
        System.out.println("Extensión de la casa 2: ...");
        int extCasa2 = Integer.parseInt(teclado.nextLine());
        
        Casa casa2 = new Casa (extCasa2);
        
        System.out.println("Extensión de la casa 3: ...");
        int extCasa3 = Integer.parseInt(teclado.nextLine());
        
        Casa casa3 = new Casa (extCasa3);
        
        System.out.println("Declaramos las casas dentro de la ciudad");
        ciudad1.añadirVivienda(casa1);
        ciudad1.añadirVivienda(casa2);
        ciudad2.añadirVivienda(casa3);
        
        System.out.println("Nombre de la persona 1: ... ");
        String nom1 = teclado.nextLine();
        
        System.out.println("Edad de la persona 1: ...");
        int edad1 = Integer.parseInt(teclado.nextLine());
        
        Persona p1 = new Persona (nom1,edad1);
        
        System.out.println("Nombre de la persona 2: ... ");
        String nom2 = teclado.nextLine();
        
        System.out.println("Edad de la persona 2: ...");
        int edad2 = Integer.parseInt(teclado.nextLine());
        
        Persona p2 = new Persona (nom2,edad2);
        
        Persona p3 = new Persona ("Maria",30);
        
        Persona p4 = new Persona ("Juan",50);
        
        Persona p5 = new Persona ("Marcos",43);
        
        Persona p6 = new Persona ("Lourdes",10);
        
        System.out.println(" Añadimos a las personas en casas");
        
        if(casa1.meterPersonas(p1)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        if(casa1.meterPersonas(p2)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        if(casa2.meterPersonas(p3)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        if(casa3.meterPersonas(p4)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        if(casa3.meterPersonas(p5)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        if(casa3.meterPersonas(p6)){
            System.out.println("Persona añadida");
        }else{
            System.out.println("No puede entrar en la casa, no hay espacio");
        }
        
        System.out.printf("\nOcupantes de la casa 1:");
        casa1.mostrarOcupantes();
        System.out.printf("\nOcupantes de la casa 2:");
        casa2.mostrarOcupantes();
        System.out.printf("\nOcupantes de la casa 3:");
        casa3.mostrarOcupantes();
        
        System.out.println("");
        System.out.printf("Habitantes totales de la ciudad %S : %d \n", ciudad1.getNombre(), ciudad1.numeroDeHabitantes());
        System.out.printf("Habitantes totales de la ciudad %S : %d \n", ciudad2.getNombre(), ciudad2.numeroDeHabitantes());

        System.out.println("");
        System.out.println("Habitantes de "+ciudad1.getNombre()+": ");
        ciudad1.mostrarPoblacion();
        
        System.out.println("");
        System.out.println("Habitantes de "+ciudad2.getNombre()+": ");
        ciudad2.mostrarPoblacion();
           
        
    }
    
}
