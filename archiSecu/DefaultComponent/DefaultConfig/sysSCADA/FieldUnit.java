/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldUnit
//!	Generated Date	: Thu, 28, Jan 2016 
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
    
    protected FieldUnit.p_field_net_C p_field_net;		//## ignore 
    
    protected FieldUnit.p_field_ser_C p_field_ser;		//## ignore 
    
    protected FieldUnit.p_field_con_C p_field_con;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected commNetwork itsCommNetwork;		//## link itsCommNetwork 
    
    protected FieldService itsFieldService;		//## link itsFieldService 
    
    protected FieldService itsFieldService_0;		//## classInstance itsFieldService_0 
    
    protected LocalController itsLocalController;		//## link itsLocalController 
    
    protected LocalController itsLocalController_0;		//## classInstance itsLocalController_0 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int requestedLocController=1;
    public static final int recievedFromCenter=2;
    public static final int Idle=3;
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
    public FieldUnit.p_field_net_C getP_field_net() {
        return p_field_net;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_net_C get_p_field_net() {
        return p_field_net;
    }
    
    //## auto_generated 
    public FieldUnit.p_field_net_C newP_field_net() {
        p_field_net = new FieldUnit.p_field_net_C();
        return p_field_net;
    }
    
    //## auto_generated 
    public void deleteP_field_net() {
        p_field_net=null;
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
        getP_field_con().gen(new requestService());
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
    protected void initRelations(RiJThread p_thread) {
        p_field_net = newP_field_net();
        p_field_ser = newP_field_ser();
        p_field_con = newP_field_con();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsFieldService = newItsFieldService(p_thread);
        itsFieldService_0 = newItsFieldService_0(p_thread);
        itsLocalController = newItsLocalController(p_thread);
        itsLocalController_0 = newItsLocalController_0(p_thread);
        itsRights = newItsRights(p_thread);
        itsSecurityPolicy = newItsSecurityPolicy(p_thread);
        itsSingleAccessPoint = newItsSingleAccessPoint(p_thread);
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
            
            getP_field_net().setItsDefaultProvidedInterface(itsSingleAccessPoint.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_user().setItsDefaultRequiredInterface(getP_field_net().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_field_con().setItsDefaultProvidedInterface(itsLocalController_0.getP_con_field().getItsDefaultProvidedInterface());
            
        }{
            
            itsLocalController_0.getP_con_field().setItsDefaultRequiredInterface(getP_field_con().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsLocalController_0.getP_con_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_protected().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_protected().setItsDefaultRequiredInterface(itsLocalController_0.getP_con_check().getItsDefaultProvidedInterface());
            
        }
        if(getP_field_ser() != null)
           getP_field_ser().connectFieldUnit(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsFieldService.startBehavior();
        done &= itsFieldService_0.startBehavior();
        done &= itsLocalController.startBehavior();
        done &= itsLocalController_0.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
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
                case requestedLocController:
                {
                    requestedLocController_add(animStates);
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
                case requestedLocController:
                {
                    res = requestedLocController_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void requestedLocController_add(AnimStates animStates) {
            animStates.add("ROOT.requestedLocController");
        }
        
        //## statechart_method 
        public void recievedFromCenter_add(AnimStates animStates) {
            animStates.add("ROOT.recievedFromCenter");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int recievedFromCenterTakedistributeService() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            recievedFromCenter_exit();
            //#[ transition 2 
            requestFieldService();
            //#]
            requestedLocController_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedFromCenterExit() {
        }
        
        //## statechart_method 
        public int requestedLocController_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backServiceInfo.backServiceInfo_sysSCADA_id))
                {
                    res = requestedLocControllerTakebackServiceInfo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void requestedLocControllerEnter() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveFromCenterByNet.recieveFromCenterByNet_sysSCADA_id))
                {
                    res = IdleTakerecieveFromCenterByNet();
                }
            
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
        public void recievedFromCenter_enter() {
            animInstance().notifyStateEntered("ROOT.recievedFromCenter");
            rootState_subState = recievedFromCenter;
            rootState_active = recievedFromCenter;
            recievedFromCenterEnter();
        }
        
        //## statechart_method 
        public int requestedLocControllerTakebackServiceInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            requestedLocController_exit();
            //#[ transition 3 
            sendBackServiceInfoToNet();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedLocController_entDef() {
            requestedLocController_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
        public void requestedLocController_exit() {
            requestedLocControllerExit();
            animInstance().notifyStateExited("ROOT.requestedLocController");
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
        public void requestedLocControllerExit() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void requestedLocController_enter() {
            animInstance().notifyStateEntered("ROOT.requestedLocController");
            rootState_subState = requestedLocController;
            rootState_active = requestedLocController;
            requestedLocControllerEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int IdleTakerecieveFromCenterByNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            sendRequestLocController();
            //#]
            recievedFromCenter_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
    public class p_field_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_field_net_C() {
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
        
        msg.add("itsLocalController", true, true, itsLocalController);
        msg.add("itsCommNetwork", false, true, itsCommNetwork);
        msg.add("itsFieldService", true, true, itsFieldService);
        msg.add("itsFieldService_0", true, true, itsFieldService_0);
        msg.add("itsLocalController_0", true, true, itsLocalController_0);
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
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

