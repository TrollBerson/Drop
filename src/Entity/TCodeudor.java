package Entity;
// Generated 11/02/2017 12:56:19 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TCodeudor generated by hbm2java
 */
public class TCodeudor  implements java.io.Serializable {


     private Integer tcodId;
     private TCasa TCasa;
     private TEmpresa TEmpresa;
     private TPersona TPersona;
     private Set TClientes = new HashSet(0);

    public TCodeudor() {
    }

	
    public TCodeudor(TCasa TCasa, TEmpresa TEmpresa, TPersona TPersona) {
        this.TCasa = TCasa;
        this.TEmpresa = TEmpresa;
        this.TPersona = TPersona;
    }
    public TCodeudor(TCasa TCasa, TEmpresa TEmpresa, TPersona TPersona, Set TClientes) {
       this.TCasa = TCasa;
       this.TEmpresa = TEmpresa;
       this.TPersona = TPersona;
       this.TClientes = TClientes;
    }
   
    public Integer getTcodId() {
        return this.tcodId;
    }
    
    public void setTcodId(Integer tcodId) {
        this.tcodId = tcodId;
    }
    public TCasa getTCasa() {
        return this.TCasa;
    }
    
    public void setTCasa(TCasa TCasa) {
        this.TCasa = TCasa;
    }
    public TEmpresa getTEmpresa() {
        return this.TEmpresa;
    }
    
    public void setTEmpresa(TEmpresa TEmpresa) {
        this.TEmpresa = TEmpresa;
    }
    public TPersona getTPersona() {
        return this.TPersona;
    }
    
    public void setTPersona(TPersona TPersona) {
        this.TPersona = TPersona;
    }
    public Set getTClientes() {
        return this.TClientes;
    }
    
    public void setTClientes(Set TClientes) {
        this.TClientes = TClientes;
    }




}


