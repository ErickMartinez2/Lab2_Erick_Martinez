/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_erick_martinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab2_Erick_Martinez {

    static Scanner sc = new Scanner(System.in);
    static ArrayList Rusia = new ArrayList();
    static ArrayList Alemania = new ArrayList();
    static ArrayList Programacion = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Batalla de Stalingrado ***");

        int opcion;
        do {
            System.out.println("-> Menu");
            System.out.println("1. Agregar Rusos");
            System.out.println("2. Agregar Alemanes");
            System.out.println("3. Agregar Alumnos");
            System.out.println("4. Simular Batalla");
            System.out.println("5. Modificar Soldado");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Rusia_Metodo();
                    break;
                case 2:
                    Alemania_Metodo();
                    break;
                case 3:
                    Programacion_Metodo();
                    break;
                case 4:
                    int ganador = 0;
                    do {
                        int turno = 1;
                        switch (turno) {
                            case 1:

                                break;
                        }
                    } while (ganador == 0);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("-> Modificacion");
                    System.out.println("1. Dar de alta a un soldado");
                    System.out.println("2. Editar datos de un soldado");
                    System.out.print("Ingrese su opcion: ");
                    int num = sc.nextInt();
                    System.out.println();
                    System.out.println("Soldado:");
                    System.out.println("1. Ruso");
                    System.out.println("2. Aleman");
                    System.out.println("3. Alumno");
                    System.out.print("Ingrese su opcion: ");
                    int num2 = sc.nextInt();
                    switch(num){
                        
                    }
                    break;
            }
        } while (opcion != 6);
    }

    public static void Rusia_Metodo() {
        System.out.println();
        System.out.println("-> Reclutamiento de Rusos");
        char resp;
        do {
            System.out.print("Ingrese el nombre del soldado: ");
            String nombre = sc.next();
            System.out.print("Ingrese el ID del soldado: ");
            int id = sc.nextInt();
            System.out.print("Ingrese la edad del soldado: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el rango del soldado: ");
            String rango = sc.next();
            int arma;
            do {
                System.out.println("Escoga una arma para el soldado:");
                System.out.println("1. AK-47");
                System.out.println("2. Revolver Navant");
                System.out.println("3. RPG-7");
                System.out.print("Ingrese su opcion: ");
                arma = sc.nextInt();
                if (arma < 1 || arma > 3) {
                    System.out.println("Opcion incorrecta!");
                } else {
                    if (arma == 3 && edad < 25) {
                        System.out.println("Demasiado joven para una RPG-7!");
                        arma = 4;
                    }
                }
            } while (arma < 1 || arma > 3);
            String Arma = "";
            int fuego = 0;
            switch (arma) {
                case 1:
                    fuego = 27;
                    Arma = "AK-47";
                    break;
                case 2:
                    fuego = 13;
                    Arma = "Revolver_Navant";
                    break;
                case 3:
                    fuego = 57;
                    Arma = "RPG-7";
                    break;
            }
            if (edad > 17) {
                Rusia.add(new Rusos(nombre, id, edad, rango, 8 * edad, Arma, fuego));
            } else {
                System.out.println("El soldado no esta calificado por ser menor de edad!");
            }
            System.out.println("Desea ingresar otro soldado ruso? [s/n]");
            resp = sc.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }

    public static void Alemania_Metodo() {
        System.out.println();
        System.out.println("-> Reclutamiento de Alemanes");
        char resp2;
        do {
            System.out.print("Ingrese el alias del soldado: ");
            String alias = sc.next();
            System.out.print("Ingrese la edad del soldado: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese la casta del soldado: ");
            String casta = sc.next();
            int arma;
            do {
                System.out.println("Escoga una arma para el soldado:");
                System.out.println("1. Subfusil MP 40");
                System.out.println("2. Ametralladora MG42");
                System.out.println("3. Pistola Walther P38");
                System.out.print("Ingrese su opcion: ");
                arma = sc.nextInt();
                if (arma < 1 || arma > 3) {
                    System.out.println("Opcion incorrecta!");
                }
            } while (arma < 1 || arma > 3);
            String Arma = "";
            int fuego = 0;
            switch (arma) {
                case 1:
                    fuego = 25;
                    Arma = "Subfusil_MP40";
                    break;
                case 2:
                    fuego = 32;
                    Arma = "Ametralladora_MG42";
                    break;
                case 3:
                    fuego = 11;
                    Arma = "Pistola_Walther_P38";
                    break;
            }
            Alemania.add(new Alemanes(alias, edad, casta, 8 * edad, Arma, fuego));
            System.out.println("Desea ingresar otro soldado alemán? [s/n]");
            resp2 = sc.next().charAt(0);
        } while (resp2 == 's' || resp2 == 'S');
    }

    public static void Programacion_Metodo() {
        System.out.println();
        System.out.println("-> Reclutamiento de Alumnos");
        char resp3;
        do {
            System.out.print("Ingrese el apodo del soldado: ");
            String apodo = sc.next();
            System.out.print("Ingrese el numero de cuenta del soldado: ");
            int cuenta = sc.nextInt();
            System.out.print("Ingrese la edad del soldado: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el grado academico del soldado: ");
            String grado = sc.next();
            int arma;
            do {
                System.out.println("Escoga una arma para el soldado:");
                System.out.println("1. Disco Duro");
                System.out.println("2. Control de Wii");
                System.out.println("3. Laptop");
                System.out.print("Ingrese su opcion: ");
                arma = sc.nextInt();
                if (arma < 1 || arma > 3) {
                    System.out.println("Opcion incorrecta!");
                }
            } while (arma < 1 || arma > 3);
            String Arma = "";
            int fuego = 0;
            switch (arma) {
                case 1:
                    fuego = 23;
                    Arma = "Disco_Duro";
                    break;
                case 2:
                    fuego = 47;
                    Arma = "Control_Wii";
                    break;
                case 3:
                    fuego = 76;
                    Arma = "Laptop";
                    break;
            }
            if (edad < 16) {
                Programacion.add(new Alumnos(apodo, cuenta, edad, 8 * edad, grado, Arma, fuego));
            } else {
                System.out.println("El soldado no esta calificado por ser menor de 16 años!");
            }
            System.out.println("Desea ingresar otro soldado alumno? [s/n]");
            resp3 = sc.next().charAt(0);
        } while (resp3 == 's' || resp3 == 'S');
    }
}
