/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldUnit
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/FieldUnit.java
*********************************************************************/

package sysSCADA;

//## classInstance itsRights 
import securityPattern.Rights;
//## classInstance itsCheckPoint 
import securityPattern.checkPoint;
//## classInstance itsSecurityPolicy 
import securityPattern.SecurityPolicy;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## classInstance itsSingleAccessPoint 
import securityPattern.SingleAccessPoint;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/FieldUnit.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class FieldUnit 
public class FieldUnit implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldUnit = new AnimClass("sysSCADA.FieldUnit",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected FieldUnit.p_field_ser_C p_field_ser;		//## ignore 
    
    protected FieldUnit.p_field_con_C p_field_con;		//## ignore 
    
    protected FieldUnit.p_field_innet_C p_field_innet;		//## ignore 
    
    protected FieldUnit.p_field_outnet_C p_field_outnet;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected checkPoint itsCheckPoint_0;		//## classInstance itsCheckPoint_0 
    
    protected commNetwork itsCommNetwork;		//## link itsCommNetwork 
    
    protected FieldService itsFieldService;		//## link itsFieldService 
    
    protected FieldService itsFieldService_0;		//## classInstance itsFieldService_0 
    
    protected FieldService itsFieldService_1;		//## classInstance itsFieldService_1 
    
    protected LocalController itsLocalController;		//## link itsLocalController 
    
    protected LocalController itsLocalController_0;		//## classInstance itsLocalController_0 
    
    protected LocalController itsLocalController_1;		//## classInstance itsLocalController_1 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected Rights itsRights_0;		//## classInstance itsRights_0 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SecurityPolicy itsSecurityPolicy_0;		//## classInstance itsSecurityPolicy_0 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    protected SingleAccessPoint itsSingleAccessPoint_0;		//## classInstance itsSingleAccessPoint_0 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int recievedFromCenter=1;
    public static final int Idle=2;
    public static final int EnterEspaceField=3;
    public static final int distributedFieldService=4;
    public static final int checkedRightsField=5;
    public static final int checkedPolicyField=6;
    public static final int checkedPointField=7;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isPort(Object port) {
        return reactive.isPort(port);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  FieldUnit(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassFieldUnit.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public FieldUnit.p_field_ser_C getP_field_ser() {
        return p_field_ser;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_ser_C get_p_field_ser() {
        return p_field_ser;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_ser_C newP_field_ser() {
        p_field_ser = new FieldUnit.p_field_ser_C();
        return p_field_ser;
    }
    
    //## auto_generated 
    public void deleteP_field_ser() {
        p_field_ser=null;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_con_C getP_field_con() {
        return p_field_con;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_con_C get_p_field_con() {
        return p_field_con;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_con_C newP_field_con() {
        p_field_con = new FieldUnit.p_field_con_C();
        return p_field_con;
    }
    
    //## auto_generated 
    public void deleteP_field_con() {
        p_field_con=null;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_innet_C getP_field_innet() {
        return p_field_innet;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_innet_C get_p_field_innet() {
        return p_field_innet;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_innet_C newP_field_innet() {
        p_field_innet = new FieldUnit.p_field_innet_C();
        return p_field_innet;
    }
    
    //## auto_generated 
    public void deleteP_field_innet() {
        p_field_innet=null;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_outnet_C getP_field_outnet() {
        return p_field_outnet;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_outnet_C get_p_field_outnet() {
        return p_field_outnet;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_outnet_C newP_field_outnet() {
        p_field_outnet = new FieldUnit.p_field_outnet_C();
        return p_field_outnet;
    }
    
    //## auto_generated 
    public void deleteP_field_outnet() {
        p_field_outnet=null;
    }
    
    //## operation requestFieldService() 
    public void requestFieldService() {
        try {
            animInstance().notifyMethodEntered("requestFieldService",
               new ArgData[] {
               });
        
        //#[ operation requestFieldService() 
        getP_field_ser().gen (new offerService());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendBackServiceInfoToNet() 
    public void sendBackServiceInfoToNet() {
        try {
            animInstance().notifyMethodEntered("sendBackServiceInfoToNet",
               new ArgData[] {
               });
        
        //#[ operation sendBackServiceInfoToNet() 
        getP_field_net().gen(new backServiceInfo());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendOfferServiceToFieldService() 
    public void sendOfferServiceToFieldService() {
        try {
            animInstance().notifyMethodEntered("sendOfferServiceToFieldService",
               new ArgData[] {
               });
        
        //#[ operation sendOfferServiceToFieldService() 
        getP_field_ser().gen (new offerService());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendRequestLocController() 
    public void sendRequestLocController() {
        try {
            animInstance().notifyMethodEntered("sendRequestLocController",
               new ArgData[] {
               });
        
        //#[ operation sendRequestLocController() 
        getP_check_protected().gen(new requestService());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint() {
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public checkPoint newItsCheckPoint(RiJThread p_thread) {
        itsCheckPoint = new checkPoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckPoint", itsCheckPoint);
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public void deleteItsCheckPoint() {
        animInstance().notifyRelationRemoved("itsCheckPoint", itsCheckPoint);
        itsCheckPoint=null;
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint_0() {
        return itsCheckPoint_0;
    }
    
    //## auto_generated 
    public checkPoint newItsCheckPoint_0(RiJThread p_thread) {
        itsCheckPoint_0 = new checkPoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckPoint_0", itsCheckPoint_0);
        return itsCheckPoint_0;
    }
    
    //## auto_generated 
    public void deleteItsCheckPoint_0() {
        animInstance().notifyRelationRemoved("itsCheckPoint_0", itsCheckPoint_0);
        itsCheckPoint_0=null;
    }
    
    //## auto_generated 
    public commNetwork getItsCommNetwork() {
        return itsCommNetwork;
    }
    
    //## auto_generated 
    public void __setItsCommNetwork(commNetwork p_commNetwork) {
        itsCommNetwork = p_commNetwork;
        if(p_commNetwork != null)
            {
                animInstance().notifyRelationAdded("itsCommNetwork", p_commNetwork);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCommNetwork");
            }
    }
    
    //## auto_generated 
    public void _setItsCommNetwork(commNetwork p_commNetwork) {
        if(itsCommNetwork != null)
            {
                itsCommNetwork.__setItsFieldUnit(null);
            }
        __setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void setItsCommNetwork(commNetwork p_commNetwork) {
        if(p_commNetwork != null)
            {
                p_commNetwork._setItsFieldUnit(this);
            }
        _setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void _clearItsCommNetwork() {
        animInstance().notifyRelationCleared("itsCommNetwork");
        itsCommNetwork = null;
    }
    
    //## auto_generated 
    public FieldService getItsFieldService() {
        return itsFieldService;
    }
    
    //## auto_generated 
    public void __setItsFieldService(FieldService p_FieldService) {
        itsFieldService = p_FieldService;
        if(p_FieldService != null)
            {
                animInstance().notifyRelationAdded("itsFieldService", p_FieldService);
            }
        else
            {
                animInstance().notifyRelationCleared("itsFieldService");
            }
    }
    
    //## auto_generated 
    public void _setItsFieldService(FieldService p_FieldService) {
        if(itsFieldService != null)
            {
                itsFieldService.__setItsFieldUnit(null);
            }
        __setItsFieldService(p_FieldService);
    }
    
    //## auto_generated 
    public FieldService newItsFieldService(RiJThread p_thread) {
        itsFieldService = new FieldService(p_thread);
        itsFieldService._setItsFieldUnit(this);
        animInstance().notifyRelationAdded("itsFieldService", itsFieldService);
        return itsFieldService;
    }
    
    //## auto_generated 
    public void deleteItsFieldService() {
        itsFieldService.__setItsFieldUnit(null);
        animInstance().notifyRelationRemoved("itsFieldService", itsFieldService);
        itsFieldService=null;
    }
    
    //## auto_generated 
    public FieldService getItsFieldService_0() {
        return itsFieldService_0;
    }
    
    //## auto_generated 
    public FieldService newItsFieldService_0(RiJThread p_thread) {
        itsFieldService_0 = new FieldService(p_thread);
        animInstance().notifyRelationAdded("itsFieldService_0", itsFieldService_0);
        return itsFieldService_0;
    }
    
    //## auto_generated 
    public void deleteItsFieldService_0() {
        animInstance().notifyRelationRemoved("itsFieldService_0", itsFieldService_0);
        itsFieldService_0=null;
    }
    
    //## auto_generated 
    public FieldService getItsFieldService_1() {
        return itsFieldService_1;
    }
    
    //## auto_generated 
    public FieldService newItsFieldService_1(RiJThread p_thread) {
        itsFieldService_1 = new FieldService(p_thread);
        animInstance().notifyRelationAdded("itsFieldService_1", itsFieldService_1);
        return itsFieldService_1;
    }
    
    //## auto_generated 
    public void deleteItsFieldService_1() {
        animInstance().notifyRelationRemoved("itsFieldService_1", itsFieldService_1);
        itsFieldService_1=null;
    }
    
    //## auto_generated 
    public LocalController getItsLocalController() {
        return itsLocalController;
    }
    
    //## auto_generated 
    public void __setItsLocalController(LocalController p_LocalController) {
        itsLocalController = p_LocalController;
        if(p_LocalController != null)
            {
                animInstance().notifyRelationAdded("itsLocalController", p_LocalController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsLocalController");
            }
    }
    
    //## auto_generated 
    public void _setItsLocalController(LocalController p_LocalController) {
        if(itsLocalController != null)
            {
                itsLocalController.__setItsFieldUnit(null);
            }
        __setItsLocalController(p_LocalController);
    }
    
    //## auto_generated 
    public LocalController newItsLocalController(RiJThread p_thread) {
        itsLocalController = new LocalController(p_thread);
        itsLocalController._setItsFieldUnit(this);
        animInstance().notifyRelationAdded("itsLocalController", itsLocalController);
        return itsLocalController;
    }
    
    //## auto_generated 
    public void deleteItsLocalController() {
        itsLocalController.__setItsFieldUnit(null);
        animInstance().notifyRelationRemoved("itsLocalController", itsLocalController);
        itsLocalController=null;
    }
    
    //## auto_generated 
    public LocalController getItsLocalController_0() {
        return itsLocalController_0;
    }
    
    //## auto_generated 
    public LocalController newItsLocalController_0(RiJThread p_thread) {
        itsLocalController_0 = new LocalController(p_thread);
        animInstance().notifyRelationAdded("itsLocalController_0", itsLocalController_0);
        return itsLocalController_0;
    }
    
    //## auto_generated 
    public void deleteItsLocalController_0() {
        animInstance().notifyRelationRemoved("itsLocalController_0", itsLocalController_0);
        itsLocalController_0=null;
    }
    
    //## auto_generated 
    public LocalController getItsLocalController_1() {
        return itsLocalController_1;
    }
    
    //## auto_generated 
    public LocalController newItsLocalController_1(RiJThread p_thread) {
        itsLocalController_1 = new LocalController(p_thread);
        animInstance().notifyRelationAdded("itsLocalController_1", itsLocalController_1);
        return itsLocalController_1;
    }
    
    //## auto_generated 
    public void deleteItsLocalController_1() {
        animInstance().notifyRelationRemoved("itsLocalController_1", itsLocalController_1);
        itsLocalController_1=null;
    }
    
    //## auto_generated 
    public Rights getItsRights() {
        return itsRights;
    }
    
    //## auto_generated 
    public Rights newItsRights(RiJThread p_thread) {
        itsRights = new Rights(p_thread);
        animInstance().notifyRelationAdded("itsRights", itsRights);
        return itsRights;
    }
    
    //## auto_generated 
    public void deleteItsRights() {
        animInstance().notifyRelationRemoved("itsRights", itsRights);
        itsRights=null;
    }
    
    //## auto_generated 
    public Rights getItsRights_0() {
        return itsRights_0;
    }
    
    //## auto_generated 
    public Rights newItsRights_0(RiJThread p_thread) {
        itsRights_0 = new Rights(p_thread);
        animInstance().notifyRelationAdded("itsRights_0", itsRights_0);
        return itsRights_0;
    }
    
    //## auto_generated 
    public void deleteItsRights_0() {
        animInstance().notifyRelationRemoved("itsRights_0", itsRights_0);
        itsRights_0=null;
    }
    
    //## auto_generated 
    public SecurityPolicy getItsSecurityPolicy() {
        return itsSecurityPolicy;
    }
    
    //## auto_generated 
    public SecurityPolicy newItsSecurityPolicy(RiJThread p_thread) {
        itsSecurityPolicy = new SecurityPolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecurityPolicy", itsSecurityPolicy);
        return itsSecurityPolicy;
    }
    
    //## auto_generated 
    public void deleteItsSecurityPolicy() {
        animInstance().notifyRelationRemoved("itsSecurityPolicy", itsSecurityPolicy);
        itsSecurityPolicy=null;
    }
    
    //## auto_generated 
    public SecurityPolicy getItsSecurityPolicy_0() {
        return itsSecurityPolicy_0;
    }
    
    //## auto_generated 
    public SecurityPolicy newItsSecurityPolicy_0(RiJThread p_thread) {
        itsSecurityPolicy_0 = new SecurityPolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecurityPolicy_0", itsSecurityPolicy_0);
        return itsSecurityPolicy_0;
    }
    
    //## auto_generated 
    public void deleteItsSecurityPolicy_0() {
        animInstance().notifyRelationRemoved("itsSecurityPolicy_0", itsSecurityPolicy_0);
        itsSecurityPolicy_0=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint(RiJThread p_thread) {
        itsSingleAccessPoint = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint", itsSingleAccessPoint);
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint", itsSingleAccessPoint);
        itsSingleAccessPoint=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint_0() {
        return itsSingleAccessPoint_0;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint_0(RiJThread p_thread) {
        itsSingleAccessPoint_0 = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint_0", itsSingleAccessPoint_0);
        return itsSingleAccessPoint_0;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint_0() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint_0", itsSingleAccessPoint_0);
        itsSingleAccessPoint_0=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_field_ser = newP_field_ser();
        p_field_con = newP_field_con();
        p_field_innet = newP_field_innet();
        p_field_outnet = newP_field_outnet();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsCheckPoint_0 = newItsCheckPoint_0(p_thread);
        itsFieldService = newItsFieldService(p_thread);
        itsFieldService_0 = newItsFieldService_0(p_thread);
        itsFieldService_1 = newItsFieldService_1(p_thread);
        itsLocalController = newItsLocalController(p_thread);
        itsLocalController_0 = newItsLocalController_0(p_thread);
        itsLocalController_1 = newItsLocalController_1(p_thread);
        itsRights = newItsRights(p_thread);
        itsRights_0 = newItsRights_0(p_thread);
        itsSecurityPolicy = newItsSecurityPolicy(p_thread);
        itsSecurityPolicy_0 = newItsSecurityPolicy_0(p_thread);
        itsSingleAccessPoint = newItsSingleAccessPoint(p_thread);
        itsSingleAccessPoint_0 = newItsSingleAccessPoint_0(p_thread);
        {
            
            itsSingleAccessPoint.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSecurityPolicy.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_policy().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy.getP_policy_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_field_con().setItsDefaultProvidedInterface(itsLocalController_0.getP_loccon_ser().getItsDefaultProvidedInterface());
            
        }{
            
            itsLocalController_0.getP_loccon_ser().setItsDefaultRequiredInterface(getP_field_con().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsLocalController_0.getP_loccon_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_protected().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_protected().setItsDefaultRequiredInterface(itsLocalController_0.getP_loccon_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSingleAccessPoint_0.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_0.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint_0.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_right().setItsDefaultRequiredInterface(itsRights_0.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights_0.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy_0.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy_0.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_protected().setItsDefaultRequiredInterface(itsLocalController_1.getP_loccon_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsLocalController_1.getP_loccon_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_protected().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsLocalController_1.getP_loccon_ser().setItsDefaultRequiredInterface(itsFieldService_1.getP_ser_loccon().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldService_1.getP_ser_loccon().setItsDefaultRequiredInterface(itsLocalController_1.getP_loccon_ser().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_field_innet().setItsDefaultProvidedInterface(itsSingleAccessPoint_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_0.getP_single_user().setItsDefaultRequiredInterface(getP_field_innet().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_field_outnet().setItsDefaultProvidedInterface(itsFieldService_1.getP_ser_outnet().getItsDefaultProvidedInterface());
            
        }{
            
            itsFieldService_1.getP_ser_outnet().setItsDefaultRequiredInterface(getP_field_outnet().getItsDefaultRequiredInterface());
            
        }
        if(getP_field_ser() != null)
           getP_field_ser().connectFieldUnit(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsCheckPoint_0.startBehavior();
        done &= itsFieldService.startBehavior();
        done &= itsFieldService_0.startBehavior();
        done &= itsFieldService_1.startBehavior();
        done &= itsLocalController.startBehavior();
        done &= itsLocalController_0.startBehavior();
        done &= itsLocalController_1.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsRights_0.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSecurityPolicy_0.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
        done &= itsSingleAccessPoint_0.startBehavior();
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Idle:
                {
                    Idle_add(animStates);
                }
                break;
                case recievedFromCenter:
                {
                    recievedFromCenter_add(animStates);
                }
                break;
                case distributedFieldService:
                {
                    distributedFieldService_add(animStates);
                }
                break;
                case EnterEspaceField:
                {
                    EnterEspaceField_add(animStates);
                }
                break;
                case checkedPointField:
                {
                    checkedPointField_add(animStates);
                }
                break;
                case checkedPolicyField:
                {
                    checkedPolicyField_add(animStates);
                }
                break;
                case checkedRightsField:
                {
                    checkedRightsField_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Idle:
                {
                    res = Idle_takeEvent(id);
                }
                break;
                case recievedFromCenter:
                {
                    res = recievedFromCenter_takeEvent(id);
                }
                break;
                case distributedFieldService:
                {
                    res = distributedFieldService_takeEvent(id);
                }
                break;
                case EnterEspaceField:
                {
                    res = EnterEspaceField_takeEvent(id);
                }
                break;
                case checkedPointField:
                {
                    res = checkedPointField_takeEvent(id);
                }
                break;
                case checkedPolicyField:
                {
                    res = checkedPolicyField_takeEvent(id);
                }
                break;
                case checkedRightsField:
                {
                    res = checkedRightsField_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void recievedFromCenter_add(AnimStates animStates) {
            animStates.add("ROOT.recievedFromCenter");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void EnterEspaceField_add(AnimStates animStates) {
            animStates.add("ROOT.EnterEspaceField");
        }
        
        //## statechart_method 
        public void distributedFieldService_add(AnimStates animStates) {
            animStates.add("ROOT.distributedFieldService");
        }
        
        //## statechart_method 
        public void checkedRightsField_add(AnimStates animStates) {
            animStates.add("ROOT.checkedRightsField");
        }
        
        //## statechart_method 
        public void checkedPolicyField_add(AnimStates animStates) {
            animStates.add("ROOT.checkedPolicyField");
        }
        
        //## statechart_method 
        public void checkedPointField_add(AnimStates animStates) {
            animStates.add("ROOT.checkedPointField");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int checkedPointFieldTakerecieveFromCenterByNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            checkedPointField_exit();
            //#[ transition 1 
            sendRequestLocController();
            //#]
            recievedFromCenter_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void checkedPointFieldEnter() {
        }
        
        //## statechart_method 
        public int checkedPointFieldTaketoCheckFieldPolicy() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            checkedPointField_exit();
            checkedPolicyField_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int checkedPolicyField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(fieldPolicyFeedback.fieldPolicyFeedback_sysSCADA_id))
                {
                    res = checkedPolicyFieldTakefieldPolicyFeedback();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedPolicyFieldEnter() {
        }
        
        //## statechart_method 
        public int EnterEspaceField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(checkpointField.checkpointField_sysSCADA_id))
                {
                    res = EnterEspaceFieldTakecheckpointField();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedPointFieldExit() {
        }
        
        //## statechart_method 
        public void checkedPolicyField_enter() {
            animInstance().notifyStateEntered("ROOT.checkedPolicyField");
            rootState_subState = checkedPolicyField;
            rootState_active = checkedPolicyField;
            checkedPolicyFieldEnter();
        }
        
        //## statechart_method 
        public void distributedFieldService_exit() {
            distributedFieldServiceExit();
            animInstance().notifyStateExited("ROOT.distributedFieldService");
        }
        
        //## statechart_method 
        public void distributedFieldService_enter() {
            animInstance().notifyStateEntered("ROOT.distributedFieldService");
            rootState_subState = distributedFieldService;
            rootState_active = distributedFieldService;
            distributedFieldServiceEnter();
        }
        
        //## statechart_method 
        public int recievedFromCenterTakedistributeService() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            recievedFromCenter_exit();
            //#[ transition 2 
            requestFieldService();
            //#]
            distributedFieldService_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void checkedPointField_exit() {
            checkedPointFieldExit();
            animInstance().notifyStateExited("ROOT.checkedPointField");
        }
        
        //## statechart_method 
        public void checkedPolicyFieldExit() {
        }
        
        //## statechart_method 
        public void checkedPolicyField_exit() {
            checkedPolicyFieldExit();
            animInstance().notifyStateExited("ROOT.checkedPolicyField");
        }
        
        //## statechart_method 
        public void distributedFieldServiceExit() {
        }
        
        //## statechart_method 
        public void recievedFromCenterExit() {
        }
        
        //## statechart_method 
        public void checkedRightsField_entDef() {
            checkedRightsField_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(EnterSingleAccessField.EnterSingleAccessField_sysSCADA_id))
                {
                    res = IdleTakeEnterSingleAccessField();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int IdleTakeEnterSingleAccessField() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Idle_exit();
            EnterEspaceField_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Idle_enter() {
            animInstance().notifyStateEntered("ROOT.Idle");
            rootState_subState = Idle;
            rootState_active = Idle;
            IdleEnter();
        }
        
        //## statechart_method 
        public void recievedFromCenterEnter() {
        }
        
        //## statechart_method 
        public void checkedPointField_enter() {
            animInstance().notifyStateEntered("ROOT.checkedPointField");
            rootState_subState = checkedPointField;
            rootState_active = checkedPointField;
            checkedPointFieldEnter();
        }
        
        //## statechart_method 
        public void checkedPointField_entDef() {
            checkedPointField_enter();
        }
        
        //## statechart_method 
        public void recievedFromCenter_enter() {
            animInstance().notifyStateEntered("ROOT.recievedFromCenter");
            rootState_subState = recievedFromCenter;
            rootState_active = recievedFromCenter;
            recievedFromCenterEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int checkedRightsFieldTakefieldRightsFeedback() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            checkedRightsField_exit();
            checkedPointField_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public int checkedPointField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveFromCenterByNet.recieveFromCenterByNet_sysSCADA_id))
                {
                    res = checkedPointFieldTakerecieveFromCenterByNet();
                }
            else if(event.isTypeOf(toCheckFieldPolicy.toCheckFieldPolicy_sysSCADA_id))
                {
                    res = checkedPointFieldTaketoCheckFieldPolicy();
                }
            else if(event.isTypeOf(toCheckFieldRights.toCheckFieldRights_sysSCADA_id))
                {
                    res = checkedPointFieldTaketoCheckFieldRights();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int checkedPointFieldTaketoCheckFieldRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            checkedPointField_exit();
            checkedRightsField_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnterEspaceFieldExit() {
        }
        
        //## statechart_method 
        public void EnterEspaceFieldEnter() {
        }
        
        //## statechart_method 
        public void recievedFromCenter_exit() {
            recievedFromCenterExit();
            animInstance().notifyStateExited("ROOT.recievedFromCenter");
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void checkedRightsField_enter() {
            animInstance().notifyStateEntered("ROOT.checkedRightsField");
            rootState_subState = checkedRightsField;
            rootState_active = checkedRightsField;
            checkedRightsFieldEnter();
        }
        
        //## statechart_method 
        public void distributedFieldService_entDef() {
            distributedFieldService_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int recievedFromCenter_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(distributeService.distributeService_sysSCADA_id))
                {
                    res = recievedFromCenterTakedistributeService();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int checkedRightsField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(fieldRightsFeedback.fieldRightsFeedback_sysSCADA_id))
                {
                    res = checkedRightsFieldTakefieldRightsFeedback();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedRightsFieldExit() {
        }
        
        //## statechart_method 
        public void EnterEspaceField_exit() {
            EnterEspaceFieldExit();
            animInstance().notifyStateExited("ROOT.EnterEspaceField");
        }
        
        //## statechart_method 
        public void EnterEspaceField_entDef() {
            EnterEspaceField_enter();
        }
        
        //## statechart_method 
        public void recievedFromCenter_entDef() {
            recievedFromCenter_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int EnterEspaceFieldTakecheckpointField() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            EnterEspaceField_exit();
            checkedPointField_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void checkedRightsFieldEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int checkedPolicyFieldTakefieldPolicyFeedback() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            checkedPolicyField_exit();
            checkedPointField_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int distributedFieldService_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backServiceInfo.backServiceInfo_sysSCADA_id))
                {
                    res = distributedFieldServiceTakebackServiceInfo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int distributedFieldServiceTakebackServiceInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            distributedFieldService_exit();
            //#[ transition 3 
            sendBackServiceInfoToNet();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void EnterEspaceField_enter() {
            animInstance().notifyStateEntered("ROOT.EnterEspaceField");
            rootState_subState = EnterEspaceField;
            rootState_active = EnterEspaceField;
            EnterEspaceFieldEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void checkedPolicyField_entDef() {
            checkedPolicyField_enter();
        }
        
        //## statechart_method 
        public void checkedRightsField_exit() {
            checkedRightsFieldExit();
            animInstance().notifyStateExited("ROOT.checkedRightsField");
        }
        
        //## statechart_method 
        public void distributedFieldServiceEnter() {
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return FieldUnit.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_field_ser_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_ser_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFieldUnit(FieldUnit) 
        public void connectFieldUnit(FieldUnit part) {
            //#[ operation connectFieldUnit(FieldUnit) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_field_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_con_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_field_innet_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_innet_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_field_outnet_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_outnet_C() {
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFieldUnit; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsFieldService_0", true, true, itsFieldService_0);
        msg.add("itsLocalController_0", true, true, itsLocalController_0);
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
        msg.add("itsLocalController", true, true, itsLocalController);
        msg.add("itsCommNetwork", false, true, itsCommNetwork);
        msg.add("itsFieldService", true, true, itsFieldService);
        msg.add("itsSingleAccessPoint_0", true, true, itsSingleAccessPoint_0);
        msg.add("itsCheckPoint_0", true, true, itsCheckPoint_0);
        msg.add("itsRights_0", true, true, itsRights_0);
        msg.add("itsSecurityPolicy_0", true, true, itsSecurityPolicy_0);
        msg.add("itsLocalController_1", true, true, itsLocalController_1);
        msg.add("itsFieldService_1", true, true, itsFieldService_1);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(FieldUnit.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            FieldUnit.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            FieldUnit.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/FieldUnit.java
*********************************************************************/

