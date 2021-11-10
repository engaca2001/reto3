package com.company;

import java.util.Scanner;

public class Main {

    static String[] nombresComunes = {"Juan Pablo", "Juan José", "Juan Diego", "Miguel Ángel", "Juan Sebastián", "María José", "José María"};
    static String[] partes;
    static String nombre = "";
    static String apellido1 = "";
    static String apellido2 = "" ;


    public static void  separaNombreCompleto (String nombreCompleto)
    {

          String nombreCompuesto;

          partes = nombreCompleto.split(" ");


              if (partes.length == 1) {
                  nombre = partes[0];
              } else if (partes.length >= 2) {
                  nombreCompuesto = partes[0] + " " + partes[1];
                  boolean encontrado = false;

                  for (int i = 0; i < nombresComunes.length; i++) {
                      if (nombresComunes[i].equals(nombreCompuesto)) {
                          encontrado = true;
                          break;
                      }
                  }

                  if (encontrado) {
                      if (partes.length == 2) nombre = nombreCompuesto;
                      else if (partes.length == 3) {
                          nombre = nombreCompuesto;
                          apellido1 = partes[2];
                      } else {
                          nombre = nombreCompuesto;
                          apellido1 = partes[2];
                          apellido2 = partes[3];
                      }
                  } else {
                      if (partes.length == 2) {
                          nombre = partes[0];
                          apellido1 = partes[1];
                      } else {
                          nombre = partes[0];
                          apellido1 = partes[1];
                          apellido2 = partes[2];
                      }
                  }
              }








    }
    public static void main(String[] args) {




        System.out.println("Introduce nombre completo de una persona: ");
        Scanner teclado = new Scanner(System.in);
        String nombreCompleto = teclado.nextLine();

        separaNombreCompleto(nombreCompleto);

        if (nombre != "") System.out.println("Nombre: " + nombre);
        if (apellido1 != "")  System.out.println("Apellido1: " + apellido1);
        if (apellido2 !="") System.out.println("Apellido2: " + apellido2);


    }

}
