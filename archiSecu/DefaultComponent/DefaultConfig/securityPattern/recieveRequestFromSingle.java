/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: recieveRequestFromSingle
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/recieveRequestFromSingle.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/recieveRequestFromSingle.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event recieveRequestFromSingle() 
public class recieveRequestFromSingle extends RiJEvent implements AnimatedEvent {
    
    public static final int recieveRequestFromSingle_securityPattern_id = 26817;		//## ignore 
    
    
    // Constructors
    
    public  recieveRequestFromSingle() {
        lId = recieveRequestFromSingle_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (recieveRequestFromSingle_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.recieveRequestFromSingle");
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
          String s="recieveRequestFromSingle(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/recieveRequestFromSingle.java
*********************************************************************/

