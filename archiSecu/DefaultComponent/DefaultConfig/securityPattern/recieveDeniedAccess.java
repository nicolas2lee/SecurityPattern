/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: recieveDeniedAccess
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/recieveDeniedAccess.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/recieveDeniedAccess.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event recieveDeniedAccess() 
public class recieveDeniedAccess extends RiJEvent implements AnimatedEvent {
    
    public static final int recieveDeniedAccess_securityPattern_id = 26818;		//## ignore 
    
    
    // Constructors
    
    public  recieveDeniedAccess() {
        lId = recieveDeniedAccess_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (recieveDeniedAccess_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.recieveDeniedAccess");
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
          String s="recieveDeniedAccess(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/recieveDeniedAccess.java
*********************************************************************/

