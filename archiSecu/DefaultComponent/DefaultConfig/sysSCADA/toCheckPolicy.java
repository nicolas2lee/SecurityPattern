/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: toCheckPolicy
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/toCheckPolicy.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/toCheckPolicy.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event toCheckPolicy(String) 
public class toCheckPolicy extends RiJEvent implements AnimatedEvent {
    
    public static final int toCheckPolicy_sysSCADA_id = 18637;		//## ignore 
    
    public String cPolicy;
    
    // Constructors
    
    public  toCheckPolicy() {
        lId = toCheckPolicy_sysSCADA_id;
    }
    public  toCheckPolicy(String p_cPolicy) {
        lId = toCheckPolicy_sysSCADA_id;
        cPolicy = p_cPolicy;
    }
    
    public boolean isTypeOf(long id) {
        return (toCheckPolicy_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.toCheckPolicy");
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
          msg.add("cPolicy", cPolicy);
    }
    public String toString() {
          String s="toCheckPolicy(";      
          s += "cPolicy=" + AnimInstance.animToString(cPolicy) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/toCheckPolicy.java
*********************************************************************/

