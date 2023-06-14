
package paquete1;

public class ClaseFactura extends Docente{
    protected double valorFac;
    protected double valorIvaDes;
    private double cancelar;
    public void establecerValorFac(double n){
        valorFac=n;
        
    }
    public void establecerIvaDes(){
        valorIvaDes=0.12;
        
    }
    public void establecerCancelar(){
        cancelar=valorFac-(valorFac*valorIvaDes);
    }
 
    public double obtenerValorFac(){
        return valorFac;
    }
    public double obtenerValorIvaDes(){
        return valorIvaDes;
    }
    public double obtenerCancelar(){
        return cancelar;
    }
     @Override
    public String toString(){
        String reporte = String.format("Nombre: %s\nCedula: %s\nValor Factura: %.2f\nValor Iva Descuento: %.2f\nCancelar %.2f"
                ,obtenerNombre(),obtenerApellido(),obtenerValorFac(),obtenerValorIvaDes(),obtenerCancelar());
        return reporte;
    }
}
