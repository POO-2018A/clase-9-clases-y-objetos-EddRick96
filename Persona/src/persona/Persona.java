package persona;
import java.util.Date;

/**
 *
 * @author Erick
 */
public class Persona {
    //atributos siempre deben ser privados
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    
    public Persona(){
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Persona(String nombre, String apellido, Date fechaNacimiento,String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
    return this.apellido;
    }
    public Date getFechaNacimiento(){
    return this.fechaNacimiento;
    }
    public String getCedula(){
        return this.cedula;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setCedula(String cedula){
        if(validarCedula(cedula)){
            System.out.println("Cédula válida");
            this.cedula = cedula;            
        }else{
            System.out.println("Cédula no válida");
        }
    }
    
    //Metodos privados
    private boolean validarCedula(String cedula){
        int tamanoCedula = 10;
        int numeroProvincias = 24;
        int tercerDigito = 6;
        int acumulador = 0;
        int sumaCoeficientes;
        int ultimoDigito;
        int decenaProxi;
        if (cedula.matches("[0-9]*") && cedula.length()== tamanoCedula){
            int provincia = Integer.parseInt(cedula.charAt(0)+""+cedula.charAt(1));
            int digitoTres = Integer.parseInt(cedula.charAt(2)+"");
            if((provincia > 0 && provincia <= numeroProvincias)&& digitoTres<tercerDigito){
                int digitoTrueRecibido = Integer.parseInt(cedula.charAt(9)+"");
                for(int i = 0;i<9;i++){
                    if(i%2 ==0){
                        sumaCoeficientes = Integer.parseInt(cedula.charAt(i)+"")*2;
                    }else{
                        sumaCoeficientes = Integer.parseInt(cedula.charAt(i)+"")*1;
                    }
                    if(sumaCoeficientes>9){
                        sumaCoeficientes=sumaCoeficientes-9;
                    }
                    acumulador=sumaCoeficientes+acumulador;
                }
                if(acumulador %10 != 0){
                    decenaProxi = acumulador/10;
                    decenaProxi = (decenaProxi+1)*10;
                }else{
                     decenaProxi = acumulador;
                }
                ultimoDigito = decenaProxi - acumulador;
                if(ultimoDigito == digitoTrueRecibido){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.apellido = "Bolaños";//p es una variable
        p.nombre = " Erick";
        p.fechaNacimiento = new Date("1996/04/03");
        p.cedula = "1717976383";
        
        System.out.println("El nombre de p es: "+ p.nombre);
        Persona p1 = new Persona("David");
        System.out.println("El nombre de p1 es: "+ p1.nombre);
        System.out.println("El apellido de p es: "+ p.apellido);
        p.setCedula(p.cedula);
        System.out.println("Su cédula es: " + p.cedula);
        
    }
    
}
