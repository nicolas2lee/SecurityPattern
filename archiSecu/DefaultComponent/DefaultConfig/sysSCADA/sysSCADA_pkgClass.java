/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sysSCADA
//!	Generated Date	: Wed, 17, Feb 2016 
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
    
    public static centerController itsCenterController;		//## classInstance itsCenterController 
    
    public static commNetwork itsCommNetwork;		//## classInstance itsCommNetwork 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    public static user itsUser;		//## classInstance itsUser 
    
    
    // Constructors
    
    //## auto_generated 
    public  sysSCADA_pkgClass(RiJThread p_thread) {
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
    protected void initRelations(RiJThread p_thread) {
        itsCenterController = new centerController(p_thread);
        itsCommNetwork = new commNetwork(p_thread);
        itsFieldUnit = new FieldUnit(p_thread);
        itsUser = new user();
        {
            
            itsUser.getP_user_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_user().setItsDefaultRequiredInterface(itsUser.getP_user_cen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCenterController.getP_cen_net().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsCommNetwork.getP_net_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_net().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCommNetwork.getP_net_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_innet().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldUnit.getP_field_innet().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_field().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsFieldUnit.getP_field_outnet().setItsDefaultRequiredInterface(itsCommNetwork.getP_outnet_field().getItsDefaultProvidedInterface());
            
        }{
            
            itsCommNetwork.getP_outnet_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_outnet().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCommNetwork.getP_net_backcen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_backnet().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_backnet().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_backcen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCenterController.getP_cen_backusr().setItsDefaultRequiredInterface(itsUser.getP_usr_backcen().getItsDefaultProvidedInterface());
            
        }{
            
            itsUser.getP_usr_backcen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_backusr().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
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
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sysSCADA_pkgClass.java
*********************************************************************/

