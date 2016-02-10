/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: approvedRights
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/approvedRights.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/approvedRights.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event approvedRights() 
public class approvedRights extends RiJEvent implements AnimatedEvent {
    
    public static final int approvedRights_securityPattern_id = 26826;		//## ignore 
    
    
    // Constructors
    
    public  approvedRights() {
        lId = approvedRights_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (approvedRights_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.approvedRights");
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
          String s="approvedRights(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/approvedRights.java
*********************************************************************/

