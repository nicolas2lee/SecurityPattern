/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkedPolicy
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkedPolicy.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/checkedPolicy.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event checkedPolicy() 
public class checkedPolicy extends RiJEvent implements AnimatedEvent {
    
    public static final int checkedPolicy_securityPattern_id = 26820;		//## ignore 
    
    
    // Constructors
    
    public  checkedPolicy() {
        lId = checkedPolicy_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (checkedPolicy_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.checkedPolicy");
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
          String s="checkedPolicy(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkedPolicy.java
*********************************************************************/

