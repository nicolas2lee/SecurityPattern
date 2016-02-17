/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: commNetwork
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/commNetwork.java
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
// sysSCADA/commNetwork.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class commNetwork 
public class commNetwork implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscommNetwork = new AnimClass("sysSCADA.commNetwork",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected commNetwork.p_net_cen_C p_net_cen;		//## ignore 
    
    protected commNetwork.p_net_field_C p_net_field;		//## ignore 
    
    protected commNetwork.p_outnet_field_C p_outnet_field;		//## ignore 
    
    protected commNetwork.p_net_backcen_C p_net_backcen;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected checkPoint itsCheckPoint_0;		//## classInstance itsCheckPoint_0 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected Rights itsRights_0;		//## classInstance itsRights_0 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SecurityPolicy itsSecurityPolicy_0;		//## classInstance itsSecurityPolicy_0 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    protected SingleAccessPoint itsSingleAccessPoint_0;		//## classInstance itsSingleAccessPoint_0 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
    public static final int Idle=2;
    public static final int EnterSingleAccessNet=3;
    public static final int CkeckedPointNet=4;
    public static final int CheckedRightsNet=5;
    public static final int CheckedPolicyNet=6;
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
    public  commNetwork(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscommNetwork.getUserClass(),
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
    public commNetwork.p_net_cen_C getP_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_cen_C get_p_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_cen_C newP_net_cen() {
        p_net_cen = new commNetwork.p_net_cen_C();
        return p_net_cen;
    }
    
    //## auto_generated 
    public void deleteP_net_cen() {
        p_net_cen=null;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C getP_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C get_p_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C newP_net_field() {
        p_net_field = new commNetwork.p_net_field_C();
        return p_net_field;
    }
    
    //## auto_generated 
    public void deleteP_net_field() {
        p_net_field=null;
    }
    
    //## auto_generated 
    public commNetwork.p_outnet_field_C getP_outnet_field() {
        return p_outnet_field;
    }
    
    //## auto_generated 
    public commNetwork.p_outnet_field_C get_p_outnet_field() {
        return p_outnet_field;
    }
    
    //## auto_generated 
    public commNetwork.p_outnet_field_C newP_outnet_field() {
        p_outnet_field = new commNetwork.p_outnet_field_C();
        return p_outnet_field;
    }
    
    //## auto_generated 
    public void deleteP_outnet_field() {
        p_outnet_field=null;
    }
    
    //## auto_generated 
    public commNetwork.p_net_backcen_C getP_net_backcen() {
        return p_net_backcen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_backcen_C get_p_net_backcen() {
        return p_net_backcen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_backcen_C newP_net_backcen() {
        p_net_backcen = new commNetwork.p_net_backcen_C();
        return p_net_backcen;
    }
    
    //## auto_generated 
    public void deleteP_net_backcen() {
        p_net_backcen=null;
    }
    
    //## operation sendLocalToCenter() 
    public void sendLocalToCenter() {
        try {
            animInstance().notifyMethodEntered("sendLocalToCenter",
               new ArgData[] {
               });
        
        //#[ operation sendLocalToCenter() 
        getP_net_backcen().gen(new receivedBackInfo());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToField() 
    public void sendToField() {
        try {
            animInstance().notifyMethodEntered("sendToField",
               new ArgData[] {
               });
        
        //#[ operation sendToField() 
        getP_net_field().gen(new recieveFromCenterByNet());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public centerController getItsCenterController() {
        return itsCenterController;
    }
    
    //## auto_generated 
    public void __setItsCenterController(centerController p_centerController) {
        itsCenterController = p_centerController;
        if(p_centerController != null)
            {
                animInstance().notifyRelationAdded("itsCenterController", p_centerController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCenterController");
            }
    }
    
    //## auto_generated 
    public void _setItsCenterController(centerController p_centerController) {
        if(itsCenterController != null)
            {
                itsCenterController.__setItsCommNetwork(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsCommNetwork(this);
            }
        _setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
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
    public FieldUnit getItsFieldUnit() {
        return itsFieldUnit;
    }
    
    //## auto_generated 
    public void __setItsFieldUnit(FieldUnit p_FieldUnit) {
        itsFieldUnit = p_FieldUnit;
        if(p_FieldUnit != null)
            {
                animInstance().notifyRelationAdded("itsFieldUnit", p_FieldUnit);
            }
        else
            {
                animInstance().notifyRelationCleared("itsFieldUnit");
            }
    }
    
    //## auto_generated 
    public void _setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(itsFieldUnit != null)
            {
                itsFieldUnit.__setItsCommNetwork(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsCommNetwork(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
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
        p_net_cen = newP_net_cen();
        p_net_field = newP_net_field();
        p_outnet_field = newP_outnet_field();
        p_net_backcen = newP_net_backcen();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsCheckPoint_0 = newItsCheckPoint_0(p_thread);
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
            
            itsCheckPoint.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_net_cen().setItsDefaultProvidedInterface(itsSingleAccessPoint.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_user().setItsDefaultRequiredInterface(getP_net_cen().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsSingleAccessPoint_0.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_0.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint_0.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy_0.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy_0.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_right().setItsDefaultRequiredInterface(itsRights_0.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights_0.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_net_field().setItsDefaultProvidedInterface(itsCheckPoint_0.getP_check_protected().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_0.getP_check_protected().setItsDefaultRequiredInterface(getP_net_field().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_net_cen().setItsDefaultProvidedInterface(itsSingleAccessPoint_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_0.getP_single_user().setItsDefaultRequiredInterface(getP_net_cen().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_outnet_field().setItsDefaultProvidedInterface(itsSingleAccessPoint_0.getP_backSingle_HMI().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_0.getP_backSingle_HMI().setItsDefaultRequiredInterface(getP_outnet_field().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_outnet_field().setItsDefaultProvidedInterface(itsSingleAccessPoint.getP_backSingle_HMI().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_backSingle_HMI().setItsDefaultRequiredInterface(getP_outnet_field().getItsDefaultRequiredInterface());
            
        }
        if(getP_net_backcen() != null)
           getP_net_backcen().connectCommNetwork(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsCheckPoint_0.startBehavior();
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
                case sentToLocal:
                {
                    sentToLocal_add(animStates);
                }
                break;
                case EnterSingleAccessNet:
                {
                    EnterSingleAccessNet_add(animStates);
                }
                break;
                case CkeckedPointNet:
                {
                    CkeckedPointNet_add(animStates);
                }
                break;
                case CheckedPolicyNet:
                {
                    CheckedPolicyNet_add(animStates);
                }
                break;
                case CheckedRightsNet:
                {
                    CheckedRightsNet_add(animStates);
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
                case sentToLocal:
                {
                    res = sentToLocal_takeEvent(id);
                }
                break;
                case EnterSingleAccessNet:
                {
                    res = EnterSingleAccessNet_takeEvent(id);
                }
                break;
                case CkeckedPointNet:
                {
                    res = CkeckedPointNet_takeEvent(id);
                }
                break;
                case CheckedPolicyNet:
                {
                    res = CheckedPolicyNet_takeEvent(id);
                }
                break;
                case CheckedRightsNet:
                {
                    res = CheckedRightsNet_takeEvent(id);
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
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void EnterSingleAccessNet_add(AnimStates animStates) {
            animStates.add("ROOT.EnterSingleAccessNet");
        }
        
        //## statechart_method 
        public void CkeckedPointNet_add(AnimStates animStates) {
            animStates.add("ROOT.CkeckedPointNet");
        }
        
        //## statechart_method 
        public void CheckedRightsNet_add(AnimStates animStates) {
            animStates.add("ROOT.CheckedRightsNet");
        }
        
        //## statechart_method 
        public void CheckedPolicyNet_add(AnimStates animStates) {
            animStates.add("ROOT.CheckedPolicyNet");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void CheckedPolicyNet_entDef() {
            CheckedPolicyNet_enter();
        }
        
        //## statechart_method 
        public int CkeckedPointNet_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(toCheckPolicyNet.toCheckPolicyNet_sysSCADA_id))
                {
                    res = CkeckedPointNetTaketoCheckPolicyNet();
                }
            else if(event.isTypeOf(recieveFromCenter.recieveFromCenter_sysSCADA_id))
                {
                    res = CkeckedPointNetTakerecieveFromCenter();
                }
            else if(event.isTypeOf(toCheckRightsNet.toCheckRightsNet_sysSCADA_id))
                {
                    res = CkeckedPointNetTaketoCheckRightsNet();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToLocal_exit() {
            sentToLocalExit();
            animInstance().notifyStateExited("ROOT.sentToLocal");
        }
        
        //## statechart_method 
        public void CheckedPolicyNet_exit() {
            CheckedPolicyNetExit();
            animInstance().notifyStateExited("ROOT.CheckedPolicyNet");
        }
        
        //## statechart_method 
        public int CheckedRightsNetTakereturnNetRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            CheckedRightsNet_exit();
            CkeckedPointNet_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int CkeckedPointNetTakerecieveFromCenter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            CkeckedPointNet_exit();
            //#[ transition 1 
            sendToField();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CheckedRightsNetEnter() {
        }
        
        //## statechart_method 
        public void CkeckedPointNet_enter() {
            animInstance().notifyStateEntered("ROOT.CkeckedPointNet");
            rootState_subState = CkeckedPointNet;
            rootState_active = CkeckedPointNet;
            CkeckedPointNetEnter();
        }
        
        //## statechart_method 
        public void CheckedPolicyNet_enter() {
            animInstance().notifyStateEntered("ROOT.CheckedPolicyNet");
            rootState_subState = CheckedPolicyNet;
            rootState_active = CheckedPolicyNet;
            CheckedPolicyNetEnter();
        }
        
        //## statechart_method 
        public void EnterSingleAccessNetExit() {
        }
        
        //## statechart_method 
        public void CheckedRightsNetExit() {
        }
        
        //## statechart_method 
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public void CheckedRightsNet_exit() {
            CheckedRightsNetExit();
            animInstance().notifyStateExited("ROOT.CheckedRightsNet");
        }
        
        //## statechart_method 
        public void EnterSingleAccessNet_enter() {
            animInstance().notifyStateEntered("ROOT.EnterSingleAccessNet");
            rootState_subState = EnterSingleAccessNet;
            rootState_active = EnterSingleAccessNet;
            EnterSingleAccessNetEnter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestToAccessNet.requestToAccessNet_sysSCADA_id))
                {
                    res = IdleTakerequestToAccessNet();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int IdleTakerequestToAccessNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Idle_exit();
            EnterSingleAccessNet_entDef();
            animInstance().notifyTransitionEnded("3");
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
        public int CheckedPolicyNet_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(ReturnNetPolicy.ReturnNetPolicy_sysSCADA_id))
                {
                    res = CheckedPolicyNetTakeReturnNetPolicy();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CkeckedPointNetExit() {
        }
        
        //## statechart_method 
        public int EnterSingleAccessNet_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(toCheckPointNet.toCheckPointNet_sysSCADA_id))
                {
                    res = EnterSingleAccessNetTaketoCheckPointNet();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EnterSingleAccessNet_entDef() {
            EnterSingleAccessNet_enter();
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
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void CheckedPolicyNetExit() {
        }
        
        //## statechart_method 
        public int CkeckedPointNetTaketoCheckRightsNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            CkeckedPointNet_exit();
            CheckedRightsNet_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public void CheckedRightsNet_enter() {
            animInstance().notifyStateEntered("ROOT.CheckedRightsNet");
            rootState_subState = CheckedRightsNet;
            rootState_active = CheckedRightsNet;
            CheckedRightsNetEnter();
        }
        
        //## statechart_method 
        public void EnterSingleAccessNetEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int CheckedRightsNet_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(returnNetRights.returnNetRights_sysSCADA_id))
                {
                    res = CheckedRightsNetTakereturnNetRights();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int CheckedPolicyNetTakeReturnNetPolicy() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            CheckedPolicyNet_exit();
            CkeckedPointNet_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CheckedRightsNet_entDef() {
            CheckedRightsNet_enter();
        }
        
        //## statechart_method 
        public void CkeckedPointNetEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void CkeckedPointNet_entDef() {
            CkeckedPointNet_enter();
        }
        
        //## statechart_method 
        public void EnterSingleAccessNet_exit() {
            EnterSingleAccessNetExit();
            animInstance().notifyStateExited("ROOT.EnterSingleAccessNet");
        }
        
        //## statechart_method 
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backServiceInfo.backServiceInfo_sysSCADA_id))
                {
                    res = sentToLocalTakebackServiceInfo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int sentToLocalTakebackServiceInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            sentToLocal_exit();
            //#[ transition 2 
            sendLocalToCenter();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToLocalEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void CheckedPolicyNetEnter() {
        }
        
        //## statechart_method 
        public int CkeckedPointNetTaketoCheckPolicyNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            CkeckedPointNet_exit();
            CheckedPolicyNet_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CkeckedPointNet_exit() {
            CkeckedPointNetExit();
            animInstance().notifyStateExited("ROOT.CkeckedPointNet");
        }
        
        //## statechart_method 
        public int EnterSingleAccessNetTaketoCheckPointNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            EnterSingleAccessNet_exit();
            CkeckedPointNet_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return commNetwork.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_net_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_cen_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_net_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_field_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_outnet_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_outnet_field_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_net_backcen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_backcen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCommNetwork(commNetwork) 
        public void connectCommNetwork(commNetwork part) {
            //#[ operation connectCommNetwork(commNetwork) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscommNetwork; 
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
        
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
        msg.add("itsCenterController", false, true, itsCenterController);
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
        msg.add("itsSingleAccessPoint_0", true, true, itsSingleAccessPoint_0);
        msg.add("itsCheckPoint_0", true, true, itsCheckPoint_0);
        msg.add("itsRights_0", true, true, itsRights_0);
        msg.add("itsSecurityPolicy_0", true, true, itsSecurityPolicy_0);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(commNetwork.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            commNetwork.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            commNetwork.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/commNetwork.java
*********************************************************************/

