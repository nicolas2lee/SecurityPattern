/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkAgain
//!	Generated Date	: Thu, 14, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkAgain.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/checkAgain.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event checkAgain() 
public class checkAgain extends RiJEvent implements AnimatedEvent {
    
    public static final int checkAgain_securityPattern_id = 26831;		//## ignore 
    
    
    // Constructors
    
    public  checkAgain() {
        lId = checkAgain_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (checkAgain_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.checkAgain");
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
          String s="checkAgain(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkAgain.java
*********************************************************************/

