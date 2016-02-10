/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: securityPattern
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/securityPattern_pkgClass.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// securityPattern/securityPattern_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## ignore 
public class securityPattern_pkgClass {
    
    public static protectedObject itsProtectedObject;		//## classInstance itsProtectedObject 
    
    public static user_securityPattern itsUser_securityPattern;		//## classInstance itsUser_securityPattern 
    
    
    // Constructors
    
    //## auto_generated 
    public  securityPattern_pkgClass(RiJThread p_thread) {
        initRelations();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsUser_securityPattern != null)
            {
                AnimServices.setInstanceName(itsUser_securityPattern, "itsUser_securityPattern");
            }
        if(itsProtectedObject != null)
            {
                AnimServices.setInstanceName(itsProtectedObject, "itsProtectedObject");
            }
    }
    
    //## auto_generated 
    protected void initRelations() {
        itsProtectedObject = new protectedObject();
        itsUser_securityPattern = new user_securityPattern();
        renameGlobalInstances();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/securityPattern_pkgClass.java
*********************************************************************/

