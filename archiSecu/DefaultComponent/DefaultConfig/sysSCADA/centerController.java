/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: centerController
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/centerController.java
*********************************************************************/

package sysSCADA;

//## classInstance itsRights_0 
import securityPattern.Rights;
//## classInstance itsCheckPoint 
import securityPattern.checkPoint;
//## classInstance itsSecurityPolicy 
import securityPattern.SecurityPolicy;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## classInstance itsSingleAccessPoint_1_0 
import securityPattern.SingleAccessPoint;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/centerController.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class centerController 
public class centerController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscenterController = new AnimClass("sysSCADA.centerController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected centerController.p_cen_net_C p_cen_net;		//## ignore 
    
    protected centerController.p_cen_HMI_C p_cen_HMI;		//## ignore 
    
    protected centerController.p_cen_data_C p_cen_data;		//## ignore 
    
    protected centerController.p_cen_user_C p_cen_user;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected checkPoint itsCheckPoint_0;		//## classInstance itsCheckPoint_0 
    
    protected commNetwork itsCommNetwork;		//## link itsCommNetwork 
    
    protected dataServer itsDataServer;		//## link itsDataServer 
    
    protected dataServer itsDataServer_1;		//## classInstance itsDataServer_1 
    
    protected HMI itsHMI;		//## link itsHMI 
    
    protected HMI itsHMI_2;		//## classInstance itsHMI_2 
    
    protected Rights itsRights_0;		//## classInstance itsRights_0 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SecurityPolicy itsSecurityPolicy_0;		//## classInstance itsSecurityPolicy_0 
    
    protected SingleAccessPoint itsSingleAccessPoint_1_0;		//## classInstance itsSingleAccessPoint_1_0 
    
    protected user itsUser;		//## link itsUser 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
    public static final int requestedHMI=2;
    public static final int requestedDataServer=3;
    public static final int Idle=4;
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
    public  centerController(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscenterController.getUserClass(),
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
    public centerController.p_cen_net_C getP_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public centerController.p_cen_net_C get_p_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public centerController.p_cen_net_C newP_cen_net() {
        p_cen_net = new centerController.p_cen_net_C();
        return p_cen_net;
    }
    
    //## auto_generated 
    public void deleteP_cen_net() {
        p_cen_net=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_HMI_C getP_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public centerController.p_cen_HMI_C get_p_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public centerController.p_cen_HMI_C newP_cen_HMI() {
        p_cen_HMI = new centerController.p_cen_HMI_C();
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public void deleteP_cen_HMI() {
        p_cen_HMI=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C getP_cen_data() {
        return p_cen_data;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C get_p_cen_data() {
        return p_cen_data;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C newP_cen_data() {
        p_cen_data = new centerController.p_cen_data_C();
        return p_cen_data;
    }
    
    //## auto_generated 
    public void deleteP_cen_data() {
        p_cen_data=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C getP_cen_user() {
        return p_cen_user;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C get_p_cen_user() {
        return p_cen_user;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C newP_cen_user() {
        p_cen_user = new centerController.p_cen_user_C();
        return p_cen_user;
    }
    
    //## auto_generated 
    public void deleteP_cen_user() {
        p_cen_user=null;
    }
    
    //## operation handleHMI() 
    public void handleHMI() {
        try {
            animInstance().notifyMethodEntered("handleHMI",
               new ArgData[] {
               });
        
        //#[ operation handleHMI() 
        System.out.println("center handle with HMI");
        getP_cen_HMI().gen(new interactHMI());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation requestData() 
    public void requestData() {
        try {
            animInstance().notifyMethodEntered("requestData",
               new ArgData[] {
               });
        
        //#[ operation requestData() 
        System.out.println("center requests data to DataServer");              
        getP_cen_data().gen(new triggerData());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToLocalByNet() 
    public void sendToLocalByNet() {
        try {
            animInstance().notifyMethodEntered("sendToLocalByNet",
               new ArgData[] {
               });
        
        //#[ operation sendToLocalByNet() 
        getP_cen_net().gen(new recieveFromCenter());
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
                itsCommNetwork.__setItsCenterController(null);
            }
        __setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void setItsCommNetwork(commNetwork p_commNetwork) {
        if(p_commNetwork != null)
            {
                p_commNetwork._setItsCenterController(this);
            }
        _setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void _clearItsCommNetwork() {
        animInstance().notifyRelationCleared("itsCommNetwork");
        itsCommNetwork = null;
    }
    
    //## auto_generated 
    public dataServer getItsDataServer() {
        return itsDataServer;
    }
    
    //## auto_generated 
    public void __setItsDataServer(dataServer p_dataServer) {
        itsDataServer = p_dataServer;
        if(p_dataServer != null)
            {
                animInstance().notifyRelationAdded("itsDataServer", p_dataServer);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDataServer");
            }
    }
    
    //## auto_generated 
    public void _setItsDataServer(dataServer p_dataServer) {
        if(itsDataServer != null)
            {
                itsDataServer.__setItsCenterController(null);
            }
        __setItsDataServer(p_dataServer);
    }
    
    //## auto_generated 
    public dataServer newItsDataServer(RiJThread p_thread) {
        itsDataServer = new dataServer(p_thread);
        itsDataServer._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsDataServer", itsDataServer);
        return itsDataServer;
    }
    
    //## auto_generated 
    public void deleteItsDataServer() {
        itsDataServer.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsDataServer", itsDataServer);
        itsDataServer=null;
    }
    
    //## auto_generated 
    public dataServer getItsDataServer_1() {
        return itsDataServer_1;
    }
    
    //## auto_generated 
    public dataServer newItsDataServer_1(RiJThread p_thread) {
        itsDataServer_1 = new dataServer(p_thread);
        animInstance().notifyRelationAdded("itsDataServer_1", itsDataServer_1);
        return itsDataServer_1;
    }
    
    //## auto_generated 
    public void deleteItsDataServer_1() {
        animInstance().notifyRelationRemoved("itsDataServer_1", itsDataServer_1);
        itsDataServer_1=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI() {
        return itsHMI;
    }
    
    //## auto_generated 
    public void __setItsHMI(HMI p_HMI) {
        itsHMI = p_HMI;
        if(p_HMI != null)
            {
                animInstance().notifyRelationAdded("itsHMI", p_HMI);
            }
        else
            {
                animInstance().notifyRelationCleared("itsHMI");
            }
    }
    
    //## auto_generated 
    public void _setItsHMI(HMI p_HMI) {
        if(itsHMI != null)
            {
                itsHMI.__setItsCenterController(null);
            }
        __setItsHMI(p_HMI);
    }
    
    //## auto_generated 
    public HMI newItsHMI(RiJThread p_thread) {
        itsHMI = new HMI(p_thread);
        itsHMI._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsHMI", itsHMI);
        return itsHMI;
    }
    
    //## auto_generated 
    public void deleteItsHMI() {
        itsHMI.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsHMI", itsHMI);
        itsHMI=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI_2() {
        return itsHMI_2;
    }
    
    //## auto_generated 
    public HMI newItsHMI_2(RiJThread p_thread) {
        itsHMI_2 = new HMI(p_thread);
        animInstance().notifyRelationAdded("itsHMI_2", itsHMI_2);
        return itsHMI_2;
    }
    
    //## auto_generated 
    public void deleteItsHMI_2() {
        animInstance().notifyRelationRemoved("itsHMI_2", itsHMI_2);
        itsHMI_2=null;
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
    public SingleAccessPoint getItsSingleAccessPoint_1_0() {
        return itsSingleAccessPoint_1_0;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint_1_0(RiJThread p_thread) {
        itsSingleAccessPoint_1_0 = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint_1_0", itsSingleAccessPoint_1_0);
        return itsSingleAccessPoint_1_0;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint_1_0() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint_1_0", itsSingleAccessPoint_1_0);
        itsSingleAccessPoint_1_0=null;
    }
    
    //## auto_generated 
    public user getItsUser() {
        return itsUser;
    }
    
    //## auto_generated 
    public void __setItsUser(user p_user) {
        itsUser = p_user;
        if(p_user != null)
            {
                animInstance().notifyRelationAdded("itsUser", p_user);
            }
        else
            {
                animInstance().notifyRelationCleared("itsUser");
            }
    }
    
    //## auto_generated 
    public void _setItsUser(user p_user) {
        if(itsUser != null)
            {
                itsUser.__setItsCenterController(null);
            }
        __setItsUser(p_user);
    }
    
    //## auto_generated 
    public void setItsUser(user p_user) {
        if(p_user != null)
            {
                p_user._setItsCenterController(this);
            }
        _setItsUser(p_user);
    }
    
    //## auto_generated 
    public void _clearItsUser() {
        animInstance().notifyRelationCleared("itsUser");
        itsUser = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_cen_net = newP_cen_net();
        p_cen_HMI = newP_cen_HMI();
        p_cen_data = newP_cen_data();
        p_cen_user = newP_cen_user();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsCheckPoint_0 = newItsCheckPoint_0(p_thread);
        itsDataServer = newItsDataServer(p_thread);
        itsDataServer_1 = newItsDataServer_1(p_thread);
        itsHMI = newItsHMI(p_thread);
        itsHMI_2 = newItsHMI_2(p_thread);
        itsRights_0 = newItsRights_0(p_thread);
        itsSecurityPolicy = newItsSecurityPolicy(p_thread);
        itsSecurityPolicy_0 = newItsSecurityPolicy_0(p_thread);
        itsSingleAccessPoint_1_0 = newItsSingleAccessPoint_1_0(p_thread);
        {
            
            itsSingleAccessPoint_1_0.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_0.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint_1_0.getP_single_check().getItsDefaultProvidedInterface());
            
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
            
            getP_cen_user().setItsDefaultProvidedInterface(itsSingleAccessPoint_1_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_1_0.getP_single_user().setItsDefaultRequiredInterface(getP_cen_user().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_protected().setItsDefaultRequiredInterface(itsHMI_2.getP_HMI_cen().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_2.getP_HMI_cen().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_protected().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_net().setItsDefaultProvidedInterface(itsHMI_2.getP_HMI_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_2.getP_HMI_net().setItsDefaultRequiredInterface(getP_cen_net().getItsDefaultRequiredInterface());
            
        }
        if(getP_cen_HMI() != null)
           getP_cen_HMI().connectCenterController(this);
        if(getP_cen_data() != null)
           getP_cen_data().connectCenterController(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsCheckPoint_0.startBehavior();
        done &= itsDataServer.startBehavior();
        done &= itsDataServer_1.startBehavior();
        done &= itsHMI.startBehavior();
        done &= itsHMI_2.startBehavior();
        done &= itsRights_0.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSecurityPolicy_0.startBehavior();
        done &= itsSingleAccessPoint_1_0.startBehavior();
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
                case requestedHMI:
                {
                    requestedHMI_add(animStates);
                }
                break;
                case sentToLocal:
                {
                    sentToLocal_add(animStates);
                }
                break;
                case requestedDataServer:
                {
                    requestedDataServer_add(animStates);
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
                case requestedHMI:
                {
                    res = requestedHMI_takeEvent(id);
                }
                break;
                case sentToLocal:
                {
                    res = sentToLocal_takeEvent(id);
                }
                break;
                case requestedDataServer:
                {
                    res = requestedDataServer_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void sentToLocal_add(AnimStates animStates) {
            animStates.add("ROOT.sentToLocal");
        }
        
        //## statechart_method 
        public void requestedHMI_add(AnimStates animStates) {
            animStates.add("ROOT.requestedHMI");
        }
        
        //## statechart_method 
        public void requestedDataServer_add(AnimStates animStates) {
            animStates.add("ROOT.requestedDataServer");
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
        public void requestedHMI_enter() {
            animInstance().notifyStateEntered("ROOT.requestedHMI");
            rootState_subState = requestedHMI;
            rootState_active = requestedHMI;
            requestedHMIEnter();
        }
        
        //## statechart_method 
        public void sentToLocal_exit() {
            sentToLocalExit();
            animInstance().notifyStateExited("ROOT.sentToLocal");
        }
        
        //## statechart_method 
        public void requestedDataServer_enter() {
            animInstance().notifyStateEntered("ROOT.requestedDataServer");
            rootState_subState = requestedDataServer;
            rootState_active = requestedDataServer;
            requestedDataServerEnter();
        }
        
        //## statechart_method 
        public int IdleTakerequest() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            handleHMI();
            //#]
            requestedHMI_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedDataServerExit() {
        }
        
        //## statechart_method 
        public void requestedDataServerEnter() {
        }
        
        //## statechart_method 
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(request.request_sysSCADA_id))
                {
                    res = IdleTakerequest();
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
        public int requestedDataServerTakebackData() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            requestedDataServer_exit();
            //#[ transition 3 
            sendToLocalByNet();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedHMIExit() {
        }
        
        //## statechart_method 
        public void requestedDataServer_exit() {
            requestedDataServerExit();
            animInstance().notifyStateExited("ROOT.requestedDataServer");
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
        public int sentToLocalTakesendToUser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            sentToLocal_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public int requestedHMI_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backInteraction.backInteraction_sysSCADA_id))
                {
                    res = requestedHMITakebackInteraction();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public int requestedDataServer_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backData.backData_sysSCADA_id))
                {
                    res = requestedDataServerTakebackData();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void requestedDataServer_entDef() {
            requestedDataServer_enter();
        }
        
        //## statechart_method 
        public void requestedHMIEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int requestedHMITakebackInteraction() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            requestedHMI_exit();
            //#[ transition 4 
            requestData();
            //#]
            requestedDataServer_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedHMI_entDef() {
            requestedHMI_enter();
        }
        
        //## statechart_method 
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendToUser.sendToUser_sysSCADA_id))
                {
                    res = sentToLocalTakesendToUser();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToLocalEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void requestedHMI_exit() {
            requestedHMIExit();
            animInstance().notifyStateExited("ROOT.requestedHMI");
        }
        
        //## statechart_method 
        public void sentToLocal_enter() {
            animInstance().notifyStateEntered("ROOT.sentToLocal");
            rootState_subState = sentToLocal;
            rootState_active = sentToLocal;
            sentToLocalEnter();
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
            return centerController.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_net_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_HMI_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_HMI_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCenterController(centerController) 
        public void connectCenterController(centerController part) {
            //#[ operation connectCenterController(centerController) 
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
    public class p_cen_data_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_data_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCenterController(centerController) 
        public void connectCenterController(centerController part) {
            //#[ operation connectCenterController(centerController) 
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
    public class p_cen_user_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_user_C() {
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscenterController; 
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
        
        msg.add("itsHMI", true, true, itsHMI);
        msg.add("itsDataServer", true, true, itsDataServer);
        msg.add("itsCommNetwork", false, true, itsCommNetwork);
        msg.add("itsUser", false, true, itsUser);
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
        msg.add("itsSingleAccessPoint_1_0", true, true, itsSingleAccessPoint_1_0);
        msg.add("itsCheckPoint_0", true, true, itsCheckPoint_0);
        msg.add("itsRights_0", true, true, itsRights_0);
        msg.add("itsSecurityPolicy_0", true, true, itsSecurityPolicy_0);
        msg.add("itsDataServer_1", true, true, itsDataServer_1);
        msg.add("itsHMI_2", true, true, itsHMI_2);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(centerController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            centerController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            centerController.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/centerController.java
*********************************************************************/

