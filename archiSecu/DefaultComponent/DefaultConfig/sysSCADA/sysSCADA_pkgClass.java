/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sysSCADA
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sysSCADA_pkgClass.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// sysSCADA/sysSCADA_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## ignore 
public class sysSCADA_pkgClass {
    
    public static user itsUser;		//## classInstance itsUser 
    
    
    // Constructors
    
    //## auto_generated 
    public  sysSCADA_pkgClass(RiJThread p_thread) {
        initRelations();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsUser != null)
            {
                AnimServices.setInstanceName(itsUser, "itsUser");
            }
    }
    
    //## auto_generated 
    protected void initRelations() {
        itsUser = new user();
        renameGlobalInstances();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sysSCADA_pkgClass.java
*********************************************************************/

