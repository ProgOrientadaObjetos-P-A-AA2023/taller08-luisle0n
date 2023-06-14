
package paquete1;

public class Docente {
   
    protected  String nom;
    protected String ced;
    
    public void estabelcerNombre(String n){
        nom=n;
    }
     public void estabelcerApellido(String n){
        ced=n;
    }     
    public String obtenerNombre(){
        return nom;
    }
    public String obtenerApellido(){
        return ced;
    }
   
}
