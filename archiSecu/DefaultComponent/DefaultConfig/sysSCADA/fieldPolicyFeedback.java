/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: fieldPolicyFeedback
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/fieldPolicyFeedback.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/fieldPolicyFeedback.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event fieldPolicyFeedback() 
public class fieldPolicyFeedback extends RiJEvent implements AnimatedEvent {
    
    public static final int fieldPolicyFeedback_sysSCADA_id = 18648;		//## ignore 
    
    
    // Constructors
    
    public  fieldPolicyFeedback() {
        lId = fieldPolicyFeedback_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (fieldPolicyFeedback_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.fieldPolicyFeedback");
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
          String s="fieldPolicyFeedback(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/fieldPolicyFeedback.java
*********************************************************************/

