/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: recieveFromCenterByNet
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/recieveFromCenterByNet.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/recieveFromCenterByNet.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event recieveFromCenterByNet() 
public class recieveFromCenterByNet extends RiJEvent implements AnimatedEvent {
    
    public static final int recieveFromCenterByNet_sysSCADA_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  recieveFromCenterByNet() {
        lId = recieveFromCenterByNet_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (recieveFromCenterByNet_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.recieveFromCenterByNet");
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
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/recieveFromCenterByNet.java
*********************************************************************/

