package clase4_ejercicio1;
import java.util.Date;
/**
 *
 * @author Erick
 */
public class Archivo {

    private String nombreArchivo;
    private Date fechArchivo;
    private String tipo;
    
    public Archivo(){}
    
    public Archivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    public Archivo(String nombreArchivo, String tipo){
        this.nombreArchivo = nombreArchivo;
        this.tipo = tipo;
    }
    public Archivo(String nombreArchivo, String tipo, Date fechArchivo){
        this.nombreArchivo = nombreArchivo;
        this.tipo = tipo;
        this.fechArchivo = fechArchivo;
    }
    
    //Getters
    public String getNombreArchivo(){
        return this.nombreArchivo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public Date getFechArchivo(){
        return this.fechArchivo;
    }
    
    //Setters
    public void setNombreArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setFechArchivo(Date fechArchivo){
        this.fechArchivo = fechArchivo;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo a1 = new Archivo();
        Archivo a2 = new Archivo();
        Archivo a3 = new Archivo();
        
        a1.nombreArchivo = "Mis Documentos";
        a2.nombreArchivo = "Tarea.txt";
        a3.nombreArchivo = "Rock.mp4";
        
        a1.fechArchivo = new Date("2014/03/02");
        a2.fechArchivo = new Date("2018/04/15");
        a3.fechArchivo = new Date("2015/12/20");
        
        System.out.println("La fecha del archivo '"+a1.nombreArchivo+"' es: "+a1.fechArchivo);
        System.out.println("La fecha del archivo '"+a2.nombreArchivo+"' es: "+a2.fechArchivo);
        System.out.println("La fecha del archivo '"+a3.nombreArchivo+"' es: "+a3.fechArchivo);
    }
    
}
