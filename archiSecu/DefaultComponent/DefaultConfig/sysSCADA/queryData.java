/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: queryData
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/queryData.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/queryData.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## event queryData() 
public class queryData extends RiJEvent implements AnimatedEvent {
    
    public static final int queryData_sysSCADA_id = 18634;		//## ignore 
    
    
    // Constructors
    
    public  queryData() {
        lId = queryData_sysSCADA_id;
    }
    
    public boolean isTypeOf(long id) {
        return (queryData_sysSCADA_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("sysSCADA.queryData");
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
          String s="queryData(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/queryData.java
*********************************************************************/

