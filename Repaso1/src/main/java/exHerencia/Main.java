package exHerencia;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nombre del coche: ...");
        String nomCoche = teclado.nextLine();
        
        System.out.println("Color del coche: ...");
        String colorCoche = teclado.nextLine();
        
        System.out.println("Velocidad maxima: ...");
        int velMaxCoche = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Matricula del coche: ...");
        String matriculaCoche = teclado.nextLine();
        
        System.out.println("Número de puertas del coche: ...");
        int nPuertasCoche = Integer.parseInt(teclado.nextLine());
        
        Coche coche1 = new Coche(matriculaCoche, nPuertasCoche, nomCoche, colorCoche, velMaxCoche );
        
        
        System.out.println("Nombre de la moto: ...");
        String nomMoto = teclado.nextLine();
        
        System.out.println("Color de la moto: ...");
        String colorMoto = teclado.nextLine();
        
        System.out.println("Velocidad maxima: ...");
        int velMaxMoto = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Matricula de la moto: ...");
        String matriculaMoto = teclado.nextLine();
        
        Moto moto1 = new Moto(matriculaMoto, nomMoto, colorMoto, velMaxMoto );
        
        System.out.println("Nombre del helicopetero: ...");
        String nomHelicop = teclado.nextLine();
        
        System.out.println("Color del helicoptero: ...");
        String colorHelicop = teclado.nextLine();
        
        System.out.println("Velocidad maxima: ...");
        int velMaxHelicop = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Tamaño de las hélices del helicoptero: ...");
        int tamHelices = Integer.parseInt(teclado.nextLine());
        
        Helicoptero helicop1 = new Helicoptero(tamHelices, nomHelicop, colorHelicop, velMaxHelicop);
        
        coche1.abrirPuertas();
        coche1.arrancar();
        
        moto1.arrancar();
        moto1.hacerCaballito();
        
        helicop1.arrancar();
        helicop1.despegar();
        helicop1.aterrizar();
        
        ArrayList <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(coche1);
        vehiculos.add(moto1);
        vehiculos.add(helicop1);
        
        for (int i = 0; i <vehiculos.size() ; i++) {
            vehiculos.get(i).arrancar();
            if(vehiculos.get(i).getClass() == Helicoptero.class){
                ((Helicoptero)vehiculos.get(i)).despegar();
            //Conversión del objeto vehiculo en esa posicion como a un objeto Helicoptero
            //Como tenemos distintos tipos de objetos dentro de vehiculos no todos son Helicopteros
            //Por tanto necesitamos comparar si la clase es Helicoptero antes de tratarlo como tal
            }
        }
        


        
    }
    
    
    
}
