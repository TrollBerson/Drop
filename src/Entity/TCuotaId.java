package Entity;
// Generated 11/02/2017 12:56:19 AM by Hibernate Tools 4.3.1



/**
 * TCuotaId generated by hbm2java
 */
public class TCuotaId  implements java.io.Serializable {


     private int tcuoId;
     private int tcuoNum;

    public TCuotaId() {
    }

    public TCuotaId(int tcuoId, int tcuoNum) {
       this.tcuoId = tcuoId;
       this.tcuoNum = tcuoNum;
    }
   
    public int getTcuoId() {
        return this.tcuoId;
    }
    
    public void setTcuoId(int tcuoId) {
        this.tcuoId = tcuoId;
    }
    public int getTcuoNum() {
        return this.tcuoNum;
    }
    
    public void setTcuoNum(int tcuoNum) {
        this.tcuoNum = tcuoNum;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TCuotaId) ) return false;
		 TCuotaId castOther = ( TCuotaId ) other; 
         
		 return (this.getTcuoId()==castOther.getTcuoId())
 && (this.getTcuoNum()==castOther.getTcuoNum());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTcuoId();
         result = 37 * result + this.getTcuoNum();
         return result;
   }   


}


