/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: doSomething
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/doSomething.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/doSomething.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event doSomething() 
public class doSomething extends RiJEvent implements AnimatedEvent {
    
    public static final int doSomething_Default_id = 18622;		//## ignore 
    
    
    // Constructors
    
    public  doSomething() {
        lId = doSomething_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (doSomething_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.doSomething");
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
          String s="doSomething(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/doSomething.java
*********************************************************************/

