/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: fieldRightsFeedback
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/fieldRightsFeedback.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/fieldRightsFeedback.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event fieldRightsFeedback() 
public class fieldRightsFeedback extends RiJEvent implements AnimatedEvent {
    
    public static final int fieldRightsFeedback_sysSCADA_id = 18649;		//## ignore 
    
    
    // Constructors
    
    public  fieldRightsFeedback() {
        lId = fieldRightsFeedback_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (fieldRightsFeedback_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.fieldRightsFeedback");
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
          String s="fieldRightsFeedback(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/fieldRightsFeedback.java
*********************************************************************/

