package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.ClaseFactura;
import paquete1.ClaseNombramiento;
import paquete1.Docente;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Docente docente = new Docente();
        ClaseNombramiento calsenom= new ClaseNombramiento();
        ClaseFactura clasefac = new ClaseFactura();
        boolean ban = true;
        do {
            
            System.out.println("Ingreese los valores para Docente");
            entrada.useLocale(Locale.US);
            
            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Clase nombramiento(1)"
                    + "ClaseFactura(2)");
            String opcion = entrada.nextLine();
            
            switch (opcion) {
                case "1":
                    ban = false;
                    System.out.println("Ingrese los valores para Clase Nombramiento ");
                   entrada.useLocale(Locale.US);
                    System.out.println("Ingrese el valor del sueldo ");
                    double valorSueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor Hora ");
                    double valorHora=entrada.nextDouble();
                    System.out.println("Ingrese el numero de horas ");
                    int numeroHoras= entrada.nextInt();
                    
                    
                    calsenom.estabelcerNombre(nombres);
                    calsenom.estabelcerApellido(identificacion);
                    calsenom.establecerValorSueldo(valorSueldo);
                    calsenom.establecerValorHora(valorHora);
                    calsenom.establecerNumeroHoras(numeroHoras);
                    
                    calsenom.establecerSueldo();
                    
                    System.out.printf("%s\n", calsenom);
                    entrada.nextLine();
                    break;
                case "2":
                    ban = false;
                    System.out.println("ingrese los valores para Estudiante presencial ");
                    entrada.useLocale(Locale.US);
                    System.out.println("Ingrese el valor de la Factura: ");
                    double valorfac=entrada.nextDouble();
                    clasefac.estabelcerNombre(nombres);
                    clasefac.estabelcerApellido(identificacion);
                    clasefac.establecerValorFac(valorfac);
                    clasefac.establecerIvaDes();
                    clasefac.establecerCancelar();
                    System.out.printf("%s\n", clasefac);
                    entrada.nextLine();
                    break;
                default:
                    System.out.println("Eleccion incorrecta ");
                    ban = true;
                    break;
            }
            System.out.println("Desea Ingresar otro Doente (Si/No)");
            opcion=entrada.nextLine();
            if (opcion.equals("Si")) {
                ban=true;
            }
            if(opcion.equals("No")) {  
                ban=false;
            }
        } while (ban);

    }
}
