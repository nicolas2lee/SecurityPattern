/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendToLocal
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sendToLocal.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/sendToLocal.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event sendToLocal() 
public class sendToLocal extends RiJEvent implements AnimatedEvent {
    
    public static final int sendToLocal_sysSCADA_id = 18617;		//## ignore 
    
    
    // Constructors
    
    public  sendToLocal() {
        lId = sendToLocal_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (sendToLocal_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.sendToLocal");
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
    }
    public String toString() {
          String s="sendToLocal(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sendToLocal.java
*********************************************************************/

