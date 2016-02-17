/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: requestToLogin
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/requestToLogin.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/requestToLogin.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event requestToLogin(String) 
public class requestToLogin extends RiJEvent implements AnimatedEvent {
    
    public static final int requestToLogin_sysSCADA_id = 18643;		//## ignore 
    
    public String userId;
    
    // Constructors
    
    public  requestToLogin() {
        lId = requestToLogin_sysSCADA_id;
    }
    public  requestToLogin(String p_userId) {
        lId = requestToLogin_sysSCADA_id;
        userId = p_userId;
    }
    
    public boolean isTypeOf(long id) {
        return (requestToLogin_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.requestToLogin");
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
          msg.add("userId", userId);
    }
    public String toString() {
          String s="requestToLogin(";      
          s += "userId=" + AnimInstance.animToString(userId) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/requestToLogin.java
*********************************************************************/

