/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: selectData
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/selectData.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/selectData.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event selectData() 
public class selectData extends RiJEvent implements AnimatedEvent {
    
    public static final int selectData_sysSCADA_id = 18631;		//## ignore 
    
    
    // Constructors
    
    public  selectData() {
        lId = selectData_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (selectData_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.selectData");
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
          String s="selectData(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/selectData.java
*********************************************************************/

