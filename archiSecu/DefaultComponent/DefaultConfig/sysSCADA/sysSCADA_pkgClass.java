/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sysSCADA
//!	Generated Date	: Thu, 28, Jan 2016 
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
    
    public static dataServer itsDataServer;		//## classInstance itsDataServer 
    
    public static FieldService itsFieldService;		//## classInstance itsFieldService 
    
    public static FieldUnit itsFieldUnit;		//## classInstance itsFieldUnit 
    
    public static HMI itsHMI;		//## classInstance itsHMI 
    
    public static LocalController itsLocalController;		//## classInstance itsLocalController 
    
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
        if(itsHMI != null)
            {
                AnimServices.setInstanceName(itsHMI, "itsHMI");
            }
        if(itsDataServer != null)
            {
                AnimServices.setInstanceName(itsDataServer, "itsDataServer");
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
        if(itsLocalController != null)
            {
                AnimServices.setInstanceName(itsLocalController, "itsLocalController");
            }
        if(itsFieldService != null)
            {
                AnimServices.setInstanceName(itsFieldService, "itsFieldService");
            }
        if(itsUser != null)
            {
                AnimServices.setInstanceName(itsUser, "itsUser");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCenterController = new centerController(p_thread);
        itsCommNetwork = new commNetwork(p_thread);
        itsDataServer = new dataServer(p_thread);
        itsFieldService = new FieldService(p_thread);
        itsFieldUnit = new FieldUnit(p_thread);
        itsHMI = new HMI(p_thread);
        itsLocalController = new LocalController(p_thread);
        itsUser = new user();
        {
            
            itsFieldUnit.getP_field_ser().setItsDefaultRequiredInterface(itsFieldService.getP_ser_field().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldService.getP_ser_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_ser().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsFieldUnit.getP_field_net().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_field().getItsDefaultProvidedInterface());
            
        }{
            
            itsCommNetwork.getP_net_field().setItsDefaultRequiredInterface(itsFieldUnit.getP_field_net().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCommNetwork.getP_net_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_net().setItsDefaultRequiredInterface(itsCommNetwork.getP_net_cen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsDataServer.getP_data_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_data().getItsDefaultProvidedInterface());
            
        }{
            
            itsCenterController.getP_cen_data().setItsDefaultRequiredInterface(itsDataServer.getP_data_cen().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCenterController.getP_cen_HMI().setItsDefaultRequiredInterface(itsHMI.getP_HMI_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI.getP_HMI_cen().setItsDefaultRequiredInterface(itsCenterController.getP_cen_HMI().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCenterController.startBehavior();
        done &= itsCommNetwork.startBehavior();
        done &= itsDataServer.startBehavior();
        done &= itsFieldService.startBehavior();
        done &= itsFieldUnit.startBehavior();
        done &= itsHMI.startBehavior();
        done &= itsLocalController.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/sysSCADA_pkgClass.java
*********************************************************************/

