package Entity;
// Generated 11/02/2017 12:56:19 AM by Hibernate Tools 4.3.1



/**
 * TReferencia generated by hbm2java
 */
public class TReferencia  implements java.io.Serializable {


     private Integer trefId;
     private TPersona TPersona;
     private String trefTipo;
     private String trefNombre;
     private String trefApellido;
     private String trefTelefono;

    public TReferencia() {
    }

	
    public TReferencia(TPersona TPersona) {
        this.TPersona = TPersona;
    }
    public TReferencia(TPersona TPersona, String trefTipo, String trefNombre, String trefApellido, String trefTelefono) {
       this.TPersona = TPersona;
       this.trefTipo = trefTipo;
       this.trefNombre = trefNombre;
       this.trefApellido = trefApellido;
       this.trefTelefono = trefTelefono;
    }
   
    public Integer getTrefId() {
        return this.trefId;
    }
    
    public void setTrefId(Integer trefId) {
        this.trefId = trefId;
    }
    public TPersona getTPersona() {
        return this.TPersona;
    }
    
    public void setTPersona(TPersona TPersona) {
        this.TPersona = TPersona;
    }
    public String getTrefTipo() {
        return this.trefTipo;
    }
    
    public void setTrefTipo(String trefTipo) {
        this.trefTipo = trefTipo;
    }
    public String getTrefNombre() {
        return this.trefNombre;
    }
    
    public void setTrefNombre(String trefNombre) {
        this.trefNombre = trefNombre;
    }
    public String getTrefApellido() {
        return this.trefApellido;
    }
    
    public void setTrefApellido(String trefApellido) {
        this.trefApellido = trefApellido;
    }
    public String getTrefTelefono() {
        return this.trefTelefono;
    }
    
    public void setTrefTelefono(String trefTelefono) {
        this.trefTelefono = trefTelefono;
    }




}


