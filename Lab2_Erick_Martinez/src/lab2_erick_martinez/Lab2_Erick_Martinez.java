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
                    ArrayList muerto = new ArrayList();
                    int turno = 1;
                    do {
                        switch (turno) {
                            case 1:
                                int num = 0;
                                if (Rusia.size() == 0) {
                                    for (int i = 0; i < Rusia.size(); i++) {
                                        Rusos rusia = ((Rusos) Rusia.get(i));
                                        int fuego = rusia.getFuego();
                                        if (i < Alemania.size()) {
                                            Alemanes alemania = ((Alemanes) Alemania.get(i));
                                            int resistencia = alemania.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(alemania.getAlias() + ", Ejercito Aleman");
                                                Alemania.remove(i);
                                            } else {
                                                alemania.setResistencia(salud);
                                            }
                                            num = i;
                                        } else {
                                            Alemanes alemania = ((Alemanes) Alemania.get(num));
                                            int resistencia = alemania.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(alemania.getAlias() + ", Ejercito Aleman");
                                                Alemania.remove(num);
                                            } else {
                                                alemania.setResistencia(salud);
                                            }
                                        }
                                    }
                                    int num2 = 0;
                                    for (int i = 0; i < Rusia.size(); i++) {
                                        Rusos rusia = ((Rusos) Rusia.get(i));
                                        int fuego = rusia.getFuego();
                                        if (i < Programacion.size()) {
                                            Alumnos programacion = ((Alumnos) Programacion.get(i));
                                            int resistencia = programacion.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(programacion.getApodo() + ", Ejercito Alumnos");
                                                Programacion.remove(i);
                                            } else {
                                                programacion.setResistencia(salud);
                                            }
                                            num2 = i;
                                        } else {
                                            Alumnos programacion = ((Alumnos) Programacion.get(num2));
                                            int resistencia = programacion.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(programacion.getApodo() + ", Ejercito Alumnos");
                                                Programacion.remove(num2);
                                            } else {
                                                programacion.setResistencia(salud);
                                            }
                                        }
                                    }
                                }
                                turno++;
                                break;
                            case 2:
                                int num3 = 0;
                                if (Alemania.size() == 0) {
                                    for (int i = 0; i < Alemania.size(); i++) {
                                        Alemanes alemania = ((Alemanes) Alemania.get(i));
                                        int fuego = alemania.getFuego();
                                        if (i < Rusia.size()) {
                                            Rusos rusia = ((Rusos) Rusia.get(i));
                                            int resistencia = rusia.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(rusia.getNombre() + ", Ejercito Ruso");
                                                Rusia.remove(i);
                                            } else {
                                                rusia.setResistencia(salud);
                                            }
                                            num3 = i;
                                        } else {
                                            Rusos rusia = ((Rusos) Rusia.get(num3));
                                            int resistencia = rusia.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(rusia.getNombre() + ", Ejercito Ruso");
                                                Alemania.remove(num3);
                                            } else {
                                                rusia.setResistencia(salud);
                                            }
                                        }
                                    }
                                    int num4 = 0;
                                    for (int i = 0; i < Alemania.size(); i++) {
                                        Alemanes alemania = ((Alemanes) Alemania.get(i));
                                        int fuego = alemania.getFuego();
                                        if (i < Programacion.size()) {
                                            Alumnos programacion = ((Alumnos) Programacion.get(i));
                                            int resistencia = programacion.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(programacion.getApodo() + ", Ejercito Alumnos");
                                                Programacion.remove(i);
                                            } else {
                                                programacion.setResistencia(salud);
                                            }
                                            num4 = i;
                                        } else {
                                            Alumnos programacion = ((Alumnos) Programacion.get(num4));
                                            int resistencia = programacion.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(programacion.getApodo() + ", Ejercito Alumnos");
                                                Programacion.remove(num4);
                                            } else {
                                                programacion.setResistencia(salud);
                                            }
                                        }
                                    }
                                }
                                turno++;
                                break;
                            case 3:
                                int num5 = 0;
                                if (Programacion.size() == 0) {
                                    for (int i = 0; i < Programacion.size(); i++) {
                                        Alumnos programacion = ((Alumnos) Programacion.get(i));
                                        int fuego = programacion.getFuego();
                                        if (i < Rusia.size()) {
                                            Rusos rusia = ((Rusos) Rusia.get(i));
                                            int resistencia = rusia.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(rusia.getNombre() + ", Ejercito Ruso");
                                                Rusia.remove(i);
                                            } else {
                                                rusia.setResistencia(salud);
                                            }
                                            num5 = i;
                                        } else {
                                            Rusos rusia = ((Rusos) Rusia.get(num5));
                                            int resistencia = rusia.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(rusia.getNombre() + ", Ejercito Ruso");
                                                Rusia.remove(num5);
                                            } else {
                                                rusia.setResistencia(salud);
                                            }
                                        }
                                    }
                                    int num6 = 0;
                                    for (int i = 0; i < Programacion.size(); i++) {
                                        Alumnos programacion = ((Alumnos) Programacion.get(i));
                                        int fuego = programacion.getFuego();
                                        if (i < Alemania.size()) {
                                            Alemanes alemania = ((Alemanes) Alemania.get(i));
                                            int resistencia = alemania.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(alemania.getAlias() + ", Ejercito Alemania");
                                                Alemania.remove(num6);
                                            } else {
                                                alemania.setResistencia(salud);
                                            }
                                            num6 = i;
                                        } else {
                                            Alemanes alemania = ((Alemanes) Alemania.get(num6));
                                            int resistencia = alemania.getResistencia();
                                            int salud = resistencia - fuego;
                                            if (salud <= 0) {
                                                muerto.add(alemania.getAlias() + ", Ejercito Alemania");
                                                Alemania.remove(num6);
                                            } else {
                                                alemania.setResistencia(salud);
                                            }
                                        }
                                    }
                                }
                                turno = 1;
                                break;
                        }
                        if ((Rusia.isEmpty() && Alemania.isEmpty()) || turno == 1) {
                            System.out.println("Ganador Alumnos!");
                            ganador = 1;
                        } else {
                            if ((Rusia.isEmpty() && Programacion.isEmpty()) || turno == 2) {
                                System.out.println("Ganador Alemania!");
                                ganador = 1;
                            } else {
                                if ((Programacion.isEmpty() && Alemania.isEmpty()) || turno == 3) {
                                    System.out.println("Ganador Rusia!");
                                    ganador = 1;
                                }
                            }
                        }
                    } while (ganador == 0);
                    System.out.println();
                    System.out.println("Muertos en Batalla:");
                    if (muerto.isEmpty()) {
                        System.out.println(0);
                    }
                    for (int i = 0; i < muerto.size(); i++) {
                        System.out.println(muerto.get(i));
                    }
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
                    switch (num2) {
                        case 1:
                            System.out.println("Soldados de Rusia:");
                            for (int i = 0; i < Rusia.size(); i++) {
                                System.out.println(i + ". " + Rusia.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("Soldados de Alemania:");
                            for (int i = 0; i < Alemania.size(); i++) {
                                System.out.println(i + ". " + Alemania.get(i));
                            }
                            break;
                        case 3:
                            System.out.println("Soldados de Programacion:");
                            for (int i = 0; i < Programacion.size(); i++) {
                                System.out.println(i + ". " + Programacion.get(i));
                            }
                            break;
                    }
                    System.out.print("Ingrese el numero del soldado: ");
                    int num3 = sc.nextInt();
                    switch (num) {
                        case 1:
                            switch (num2) {
                                case 1:
                                    Rusia.remove(num3);
                                    break;
                                case 2:
                                    Alemania.remove(num3);
                                    break;
                                case 3:
                                    Programacion.remove(num3);
                                    break;
                            }
                            break;
                        case 2:
                            switch (num2) {
                                case 1:
                                    Rusia_Metodo2(num3);
                                    break;
                                case 2:
                                    Alemania_Metodo2(num3);
                                    break;
                                case 3:
                                    Programacion_Metodo2(num3);
                                    break;
                            }
                            break;
                    }
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
            if (edad >= 16) {
                Programacion.add(new Alumnos(apodo, cuenta, edad, 8 * edad, grado, Arma, fuego));
            } else {
                System.out.println("El soldado no esta calificado por ser menor de 16 años!");
            }
            System.out.println("Desea ingresar otro soldado alumno? [s/n]");
            resp3 = sc.next().charAt(0);
        } while (resp3 == 's' || resp3 == 'S');
    }

    public static void Rusia_Metodo2(int soldado) {
        System.out.println();
        System.out.println("-> Modificacion de Soldado Ruso");
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
            Rusia.set(soldado, new Rusos(nombre, id, edad, rango, 8 * edad, Arma, fuego));
        } else {
            System.out.println("El soldado no esta calificado por ser menor de edad!");
        }
    }

    public static void Alemania_Metodo2(int soldado) {
        System.out.println();
        System.out.println("-> Modificacion de Soldado Aleman");
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
        Alemania.set(soldado, new Alemanes(alias, edad, casta, 8 * edad, Arma, fuego));
    }

    public static void Programacion_Metodo2(int soldado) {
        System.out.println();
        System.out.println("-> Modificacion de Alumno");
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
            Programacion.set(soldado, new Alumnos(apodo, cuenta, edad, 8 * edad, grado, Arma, fuego));
        } else {
            System.out.println("El soldado no esta calificado por ser menor de 16 años!");
        }
    }
}
