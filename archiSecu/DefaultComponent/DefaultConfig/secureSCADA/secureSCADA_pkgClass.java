/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: secureSCADA
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/secureSCADA_pkgClass.java
*********************************************************************/

package secureSCADA;

//## classInstance itsFieldUnit 
import sysSCADA.FieldUnit;
//## classInstance itsCommNetwork 
import sysSCADA.commNetwork;
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
    
    public static centerController itsCenterController;		//## classInstance itsCenterController 
    
    public static commNetwork itsCommNetwork;		//## classInstance itsCommNetwork 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    public static User itsUser;		//## classInstance itsUser 
    
    
    // Constructors
    
    //## auto_generated 
    public  secureSCADA_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
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
        if(itsCenterController != null)
            {
                AnimServices.setInstanceName(itsCenterController, "itsCenterController");
            }
        if(itsCommNetwork != null)
            {
                AnimServices.setInstanceName(itsCommNetwork, "itsCommNetwork");
            }
        if(itsFieldUnit != null)
            {
                AnimServices.setInstanceName(itsFieldUnit, "itsFieldUnit");
            }
    }
    
    //## auto_generated 
    protected void OMCreateInstances(RiJThread p_thread) {
        itsCenterController = new centerController(p_thread);
        itsCommNetwork = new commNetwork(p_thread);
        itsFieldUnit = new FieldUnit(p_thread);
        itsUser = new User();
    }
    
    //## auto_generated 
    protected void OMConnectRelations(RiJThread p_thread) {
        {
            
            itsUser.getP_user().setItsDefaultRequiredInterface(itsSingleAccessPoint_1_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_1_0.getP_single_user().setItsDefaultRequiredInterface(itsUser.getP_user().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsUser.getP_user().setItsDefaultRequiredInterface(itsCenterController.getP_cen_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_user().setItsDefaultRequiredInterface(itsUser.getP_user().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCenterController.getP_cen_net().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsCommNetwork.getP_net_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_net().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCommNetwork.getP_net_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldUnit.getP_field_net().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_field().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        OMCreateInstances(p_thread);
        OMConnectRelations(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCenterController.startBehavior();
        done &= itsCommNetwork.startBehavior();
        done &= itsFieldUnit.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/secureSCADA_pkgClass.java
*********************************************************************/

