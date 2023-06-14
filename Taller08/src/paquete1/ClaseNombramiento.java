/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author luisa
 */
public class ClaseNombramiento extends Docente{
    private double valorSueldo;
    private double valorHora;
    private int numeroHoras;
    private double sueldo;
    
    public void establecerValorSueldo(double n){
        valorSueldo=n;
        
    }
    public void establecerValorHora(double n){
        valorHora=n;
        
    }
    public void establecerNumeroHoras(int n){
        numeroHoras=n;
    }
    public void establecerSueldo(){
        sueldo=valorSueldo+(valorHora*numeroHoras);       
    }
    
    public double obtenerValorSueldo(){
        return valorSueldo;
    }
    public double obtenerValorHora(){
        return valorHora;
    }
    public int obtenerNumeroHoras(){
        return numeroHoras;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
     @Override
    public String toString(){
        String reporte = String.format("Nombre: %s\nCedula: %s\nValor Sueldo: %.2f\nValor Hora: %.2f\nNumero de Horas: %d\n"
                + "Sueldo: %.2f",obtenerNombre(),obtenerApellido(),obtenerSueldo(),obtenerValorHora(),obtenerNumeroHoras(),
        obtenerSueldo());
        return reporte;
    }
}
