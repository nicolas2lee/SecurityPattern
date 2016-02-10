/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: triedMorethanThreetimes
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/triedMorethanThreetimes.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/triedMorethanThreetimes.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## event triedMorethanThreetimes() 
public class triedMorethanThreetimes extends RiJEvent implements AnimatedEvent {
    
    public static final int triedMorethanThreetimes_securityPattern_id = 26832;		//## ignore 
    
    
    // Constructors
    
    public  triedMorethanThreetimes() {
        lId = triedMorethanThreetimes_securityPattern_id;
    }
    
    public boolean isTypeOf(long id) {
        return (triedMorethanThreetimes_securityPattern_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("securityPattern.triedMorethanThreetimes");
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
          String s="triedMorethanThreetimes(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/triedMorethanThreetimes.java
*********************************************************************/

