/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: toCheckPoint
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/toCheckPoint.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/toCheckPoint.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event toCheckPoint(String) 
public class toCheckPoint extends RiJEvent implements AnimatedEvent {
    
    public static final int toCheckPoint_sysSCADA_id = 18636;		//## ignore 
    
    public String policy;
    
    // Constructors
    
    public  toCheckPoint() {
        lId = toCheckPoint_sysSCADA_id;
    }
    public  toCheckPoint(String p_policy) {
        lId = toCheckPoint_sysSCADA_id;
        policy = p_policy;
    }
    
    public boolean isTypeOf(long id) {
        return (toCheckPoint_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.toCheckPoint");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("policy", policy);
    }
    public String toString() {
          String s="toCheckPoint(";      
          s += "policy=" + AnimInstance.animToString(policy) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/toCheckPoint.java
*********************************************************************/

