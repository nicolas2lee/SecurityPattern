/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendFeedback
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/sendFeedback.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/sendFeedback.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event sendFeedback() 
public class sendFeedback extends RiJEvent implements AnimatedEvent {
    
    public static final int sendFeedback_Default_id = 18621;		//## ignore 
    
    
    // Constructors
    
    public  sendFeedback() {
        lId = sendFeedback_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (sendFeedback_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.sendFeedback");
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
          String s="sendFeedback(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/sendFeedback.java
*********************************************************************/

