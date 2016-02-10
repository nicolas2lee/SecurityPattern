/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// Default/Default_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## ignore 
public class Default_pkgClass {
    
    public static centerController itsCenterController;		//## classInstance itsCenterController 
    
    public static communiNetwork itsCommuniNetwork;		//## classInstance itsCommuniNetwork 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    
    // Constructors
    
    //## auto_generated 
    public  Default_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsCenterController != null)
            {
                AnimServices.setInstanceName(itsCenterController, "itsCenterController");
            }
        if(itsCommuniNetwork != null)
            {
                AnimServices.setInstanceName(itsCommuniNetwork, "itsCommuniNetwork");
            }
        if(itsFieldUnit != null)
            {
                AnimServices.setInstanceName(itsFieldUnit, "itsFieldUnit");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCenterController = new centerController(p_thread);
        itsCommuniNetwork = new communiNetwork(p_thread);
        itsFieldUnit = new FieldUnit(p_thread);
        {
            
            itsCommuniNetwork.getP_net_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldUnit.getP_field_net().setItsDefaultRequiredInterface(itsCommuniNetwork.getP_net_field().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCenterController.getP_cen_net().setItsDefaultRequiredInterface(itsCommuniNetwork.getP_net_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsCommuniNetwork.getP_net_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_net().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCenterController.startBehavior();
        done &= itsCommuniNetwork.startBehavior();
        done &= itsFieldUnit.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

