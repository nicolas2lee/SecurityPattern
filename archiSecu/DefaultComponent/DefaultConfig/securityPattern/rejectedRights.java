/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: rejectedRights
//!	Generated Date	: Thu, 14, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/rejectedRights.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/rejectedRights.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event rejectedRights() 
public class rejectedRights extends RiJEvent implements AnimatedEvent {
    
    public static final int rejectedRights_securityPattern_id = 26827;		//## ignore 
    
    
    // Constructors
    
    public  rejectedRights() {
        lId = rejectedRights_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (rejectedRights_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.rejectedRights");
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
          String s="rejectedRights(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/rejectedRights.java
*********************************************************************/

