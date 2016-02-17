/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EnterSingleAccessField
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/EnterSingleAccessField.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/EnterSingleAccessField.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event EnterSingleAccessField() 
public class EnterSingleAccessField extends RiJEvent implements AnimatedEvent {
    
    public static final int EnterSingleAccessField_sysSCADA_id = 18644;		//## ignore 
    
    
    // Constructors
    
    public  EnterSingleAccessField() {
        lId = EnterSingleAccessField_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EnterSingleAccessField_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.EnterSingleAccessField");
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
          String s="EnterSingleAccessField(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/EnterSingleAccessField.java
*********************************************************************/

