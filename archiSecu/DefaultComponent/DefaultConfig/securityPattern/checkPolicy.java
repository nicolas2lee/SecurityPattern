/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkPolicy
//!	Generated Date	: Thu, 14, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkPolicy.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/checkPolicy.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event checkPolicy() 
public class checkPolicy extends RiJEvent implements AnimatedEvent {
    
    public static final int checkPolicy_securityPattern_id = 26823;		//## ignore 
    
    
    // Constructors
    
    public  checkPolicy() {
        lId = checkPolicy_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (checkPolicy_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.checkPolicy");
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
          String s="checkPolicy(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkPolicy.java
*********************************************************************/

