/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: recieveFromCenterByNet
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/recieveFromCenterByNet.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/recieveFromCenterByNet.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event recieveFromCenterByNet() 
public class recieveFromCenterByNet extends RiJEvent implements AnimatedEvent {
    
    public static final int recieveFromCenterByNet_Default_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  recieveFromCenterByNet() {
        lId = recieveFromCenterByNet_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (recieveFromCenterByNet_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.recieveFromCenterByNet");
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
          String s="recieveFromCenterByNet(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/recieveFromCenterByNet.java
*********************************************************************/

