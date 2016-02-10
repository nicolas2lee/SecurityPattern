/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: secureSCADA
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/secureSCADA_pkgClass.java
*********************************************************************/

package secureSCADA;

//## classInstance itsUser 
import sysSCADA.centerController;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## classInstance itsSingleAccessPoint_1_0 
import securityPattern.SingleAccessPoint;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// secureSCADA/secureSCADA_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package secureSCADA 


//## ignore 
public class secureSCADA_pkgClass {
    
    public static User itsUser;		//## classInstance itsUser 
    
    
    // Constructors
    
    //## auto_generated 
    public  secureSCADA_pkgClass(RiJThread p_thread) {
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
    protected void OMCreateInstances() {
        itsUser = new User();
    }
    
    //## auto_generated 
    protected void OMConnectRelations() {
        {
            
            itsUser.getP_user().setItsDefaultRequiredInterface(itsSingleAccessPoint_1_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_1_0.getP_single_user().setItsDefaultRequiredInterface(itsUser.getP_user().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    protected void initRelations() {
        OMCreateInstances();
        OMConnectRelations();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/secureSCADA_pkgClass.java
*********************************************************************/

