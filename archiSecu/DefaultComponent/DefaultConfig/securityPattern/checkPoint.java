/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: checkPoint
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkPoint.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/checkPoint.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## class checkPoint 
public class checkPoint implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscheckPoint = new AnimClass("securityPattern.checkPoint",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected checkPoint.p_check_protected_C p_check_protected;		//## ignore 
    
    protected checkPoint.p_check_right_C p_check_right;		//## ignore 
    
    protected checkPoint.p_check_single_C p_check_single;		//## ignore 
    
    protected checkPoint.p_check_policy_C p_check_policy;		//## ignore 
    
    protected checkPoint.p_check_backSer_C p_check_backSer;		//## ignore 
    
    protected checkPoint.p_backCheck_single_C p_backCheck_single;		//## ignore 
    
    protected String Role;		//## attribute Role 
    
    protected protectedObject itsProtectedObject;		//## link itsProtectedObject 
    
    protected Rights itsRights;		//## link itsRights 
    
    protected SecurityPolicy itsSecurityPolicy;		//## link itsSecurityPolicy 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## link itsSingleAccessPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int ValidPolicy=1;
    public static final int sentToPolicy=2;
    public static final int sentToCheckrights=3;
    public static final int RightsValid=4;
    public static final int RightsInvalid=5;
    public static final int requesedtProtectedSys=6;
    public static final int recievedRequest=7;
    public static final int InvalidPolicy=8;
    public static final int Idle=9;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int checkPoint_Timeout_RightsValid_id = 1;		//## ignore 
    
    public static final int checkPoint_Timeout_RightsInvalid_id = 2;		//## ignore 
    
    public static final int checkPoint_Timeout_requesedtProtectedSys_id = 3;		//## ignore 
    
    public static final int checkPoint_Timeout_InvalidPolicy_id = 4;		//## ignore 
    
    
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
    public  checkPoint(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscheckPoint.getUserClass(),
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
    public checkPoint.p_check_protected_C getP_check_protected() {
        return p_check_protected;
    }
    
    //## auto_generated 
    public checkPoint.p_check_protected_C get_p_check_protected() {
        return p_check_protected;
    }
    
    //## auto_generated 
    public checkPoint.p_check_protected_C newP_check_protected() {
        p_check_protected = new checkPoint.p_check_protected_C();
        return p_check_protected;
    }
    
    //## auto_generated 
    public void deleteP_check_protected() {
        p_check_protected=null;
    }
    
    //## auto_generated 
    public checkPoint.p_check_right_C getP_check_right() {
        return p_check_right;
    }
    
    //## auto_generated 
    public checkPoint.p_check_right_C get_p_check_right() {
        return p_check_right;
    }
    
    //## auto_generated 
    public checkPoint.p_check_right_C newP_check_right() {
        p_check_right = new checkPoint.p_check_right_C();
        return p_check_right;
    }
    
    //## auto_generated 
    public void deleteP_check_right() {
        p_check_right=null;
    }
    
    //## auto_generated 
    public checkPoint.p_check_single_C getP_check_single() {
        return p_check_single;
    }
    
    //## auto_generated 
    public checkPoint.p_check_single_C get_p_check_single() {
        return p_check_single;
    }
    
    //## auto_generated 
    public checkPoint.p_check_single_C newP_check_single() {
        p_check_single = new checkPoint.p_check_single_C();
        return p_check_single;
    }
    
    //## auto_generated 
    public void deleteP_check_single() {
        p_check_single=null;
    }
    
    //## auto_generated 
    public checkPoint.p_check_policy_C getP_check_policy() {
        return p_check_policy;
    }
    
    //## auto_generated 
    public checkPoint.p_check_policy_C get_p_check_policy() {
        return p_check_policy;
    }
    
    //## auto_generated 
    public checkPoint.p_check_policy_C newP_check_policy() {
        p_check_policy = new checkPoint.p_check_policy_C();
        return p_check_policy;
    }
    
    //## auto_generated 
    public void deleteP_check_policy() {
        p_check_policy=null;
    }
    
    //## auto_generated 
    public checkPoint.p_check_backSer_C getP_check_backSer() {
        return p_check_backSer;
    }
    
    //## auto_generated 
    public checkPoint.p_check_backSer_C get_p_check_backSer() {
        return p_check_backSer;
    }
    
    //## auto_generated 
    public checkPoint.p_check_backSer_C newP_check_backSer() {
        p_check_backSer = new checkPoint.p_check_backSer_C();
        return p_check_backSer;
    }
    
    //## auto_generated 
    public void deleteP_check_backSer() {
        p_check_backSer=null;
    }
    
    //## auto_generated 
    public checkPoint.p_backCheck_single_C getP_backCheck_single() {
        return p_backCheck_single;
    }
    
    //## auto_generated 
    public checkPoint.p_backCheck_single_C get_p_backCheck_single() {
        return p_backCheck_single;
    }
    
    //## auto_generated 
    public checkPoint.p_backCheck_single_C newP_backCheck_single() {
        p_backCheck_single = new checkPoint.p_backCheck_single_C();
        return p_backCheck_single;
    }
    
    //## auto_generated 
    public void deleteP_backCheck_single() {
        p_backCheck_single=null;
    }
    
    //## operation sendBackserviceToCheckpoint() 
    public void sendBackserviceToCheckpoint() {
        try {
            animInstance().notifyMethodEntered("sendBackserviceToCheckpoint",
               new ArgData[] {
               });
        
        //#[ operation sendBackserviceToCheckpoint() 
        getP_check_single().gen(new backService());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendCheckPolicy() 
    public void sendCheckPolicy() {
        try {
            animInstance().notifyMethodEntered("sendCheckPolicy",
               new ArgData[] {
               });
        
        //#[ operation sendCheckPolicy() 
        getP_check_policy().gen(new checkPolicy());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendRejectedToSingle() 
    public void sendRejectedToSingle() {
        try {
            animInstance().notifyMethodEntered("sendRejectedToSingle",
               new ArgData[] {
               });
        
        //#[ operation sendRejectedToSingle() 
        getP_check_single().gen(new rejected());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendRejectedTryAgain() 
    public void sendRejectedTryAgain() {
        try {
            animInstance().notifyMethodEntered("sendRejectedTryAgain",
               new ArgData[] {
               });
        
        //#[ operation sendRejectedTryAgain() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendRightsRejectedToSingle() 
    public void sendRightsRejectedToSingle() {
        try {
            animInstance().notifyMethodEntered("sendRightsRejectedToSingle",
               new ArgData[] {
               });
        
        //#[ operation sendRightsRejectedToSingle() 
        getP_check_single().gen (new rejected());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToCheckRights() 
    public void sendToCheckRights() {
        try {
            animInstance().notifyMethodEntered("sendToCheckRights",
               new ArgData[] {
               });
        
        //#[ operation sendToCheckRights() 
        getP_check_right().gen(new checkRights());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public String getRole() {
        return Role;
    }
    
    //## auto_generated 
    public void setRole(String p_Role) {
        Role = p_Role;
    }
    
    //## auto_generated 
    public protectedObject getItsProtectedObject() {
        return itsProtectedObject;
    }
    
    //## auto_generated 
    public void __setItsProtectedObject(protectedObject p_protectedObject) {
        itsProtectedObject = p_protectedObject;
        if(p_protectedObject != null)
            {
                animInstance().notifyRelationAdded("itsProtectedObject", p_protectedObject);
            }
        else
            {
                animInstance().notifyRelationCleared("itsProtectedObject");
            }
    }
    
    //## auto_generated 
    public void _setItsProtectedObject(protectedObject p_protectedObject) {
        if(itsProtectedObject != null)
            {
                itsProtectedObject.__setItsCheckPoint(null);
            }
        __setItsProtectedObject(p_protectedObject);
    }
    
    //## auto_generated 
    public void setItsProtectedObject(protectedObject p_protectedObject) {
        if(p_protectedObject != null)
            {
                p_protectedObject._setItsCheckPoint(this);
            }
        _setItsProtectedObject(p_protectedObject);
    }
    
    //## auto_generated 
    public void _clearItsProtectedObject() {
        animInstance().notifyRelationCleared("itsProtectedObject");
        itsProtectedObject = null;
    }
    
    //## auto_generated 
    public Rights getItsRights() {
        return itsRights;
    }
    
    //## auto_generated 
    public void __setItsRights(Rights p_Rights) {
        itsRights = p_Rights;
        if(p_Rights != null)
            {
                animInstance().notifyRelationAdded("itsRights", p_Rights);
            }
        else
            {
                animInstance().notifyRelationCleared("itsRights");
            }
    }
    
    //## auto_generated 
    public void _setItsRights(Rights p_Rights) {
        if(itsRights != null)
            {
                itsRights.__setItsCheckPoint(null);
            }
        __setItsRights(p_Rights);
    }
    
    //## auto_generated 
    public void setItsRights(Rights p_Rights) {
        if(p_Rights != null)
            {
                p_Rights._setItsCheckPoint(this);
            }
        _setItsRights(p_Rights);
    }
    
    //## auto_generated 
    public void _clearItsRights() {
        animInstance().notifyRelationCleared("itsRights");
        itsRights = null;
    }
    
    //## auto_generated 
    public SecurityPolicy getItsSecurityPolicy() {
        return itsSecurityPolicy;
    }
    
    //## auto_generated 
    public void __setItsSecurityPolicy(SecurityPolicy p_SecurityPolicy) {
        itsSecurityPolicy = p_SecurityPolicy;
        if(p_SecurityPolicy != null)
            {
                animInstance().notifyRelationAdded("itsSecurityPolicy", p_SecurityPolicy);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSecurityPolicy");
            }
    }
    
    //## auto_generated 
    public void _setItsSecurityPolicy(SecurityPolicy p_SecurityPolicy) {
        if(itsSecurityPolicy != null)
            {
                itsSecurityPolicy.__setItsCheckPoint(null);
            }
        __setItsSecurityPolicy(p_SecurityPolicy);
    }
    
    //## auto_generated 
    public void setItsSecurityPolicy(SecurityPolicy p_SecurityPolicy) {
        if(p_SecurityPolicy != null)
            {
                p_SecurityPolicy._setItsCheckPoint(this);
            }
        _setItsSecurityPolicy(p_SecurityPolicy);
    }
    
    //## auto_generated 
    public void _clearItsSecurityPolicy() {
        animInstance().notifyRelationCleared("itsSecurityPolicy");
        itsSecurityPolicy = null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void __setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        itsSingleAccessPoint = p_SingleAccessPoint;
        if(p_SingleAccessPoint != null)
            {
                animInstance().notifyRelationAdded("itsSingleAccessPoint", p_SingleAccessPoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSingleAccessPoint");
            }
    }
    
    //## auto_generated 
    public void _setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(itsSingleAccessPoint != null)
            {
                itsSingleAccessPoint.__setItsCheckPoint(null);
            }
        __setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(p_SingleAccessPoint != null)
            {
                p_SingleAccessPoint._setItsCheckPoint(this);
            }
        _setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void _clearItsSingleAccessPoint() {
        animInstance().notifyRelationCleared("itsSingleAccessPoint");
        itsSingleAccessPoint = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_check_protected = newP_check_protected();
        p_check_right = newP_check_right();
        p_check_single = newP_check_single();
        p_check_policy = newP_check_policy();
        p_check_backSer = newP_check_backSer();
        p_backCheck_single = newP_backCheck_single();
        if(getP_check_protected() != null)
           getP_check_protected().connectCheckPoint(this);
        if(getP_check_right() != null)
           getP_check_right().connectCheckPoint(this);
        if(getP_check_single() != null)
           getP_check_single().connectCheckPoint(this);
        if(getP_check_policy() != null)
           getP_check_policy().connectCheckPoint(this);
        if(getP_check_backSer() != null)
           getP_check_backSer().connectCheckPoint(this);
        if(getP_backCheck_single() != null)
           getP_backCheck_single().connectCheckPoint(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
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
                case recievedRequest:
                {
                    recievedRequest_add(animStates);
                }
                break;
                case sentToPolicy:
                {
                    sentToPolicy_add(animStates);
                }
                break;
                case ValidPolicy:
                {
                    ValidPolicy_add(animStates);
                }
                break;
                case InvalidPolicy:
                {
                    InvalidPolicy_add(animStates);
                }
                break;
                case sentToCheckrights:
                {
                    sentToCheckrights_add(animStates);
                }
                break;
                case RightsValid:
                {
                    RightsValid_add(animStates);
                }
                break;
                case RightsInvalid:
                {
                    RightsInvalid_add(animStates);
                }
                break;
                case requesedtProtectedSys:
                {
                    requesedtProtectedSys_add(animStates);
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
                case recievedRequest:
                {
                    res = recievedRequest_takeEvent(id);
                }
                break;
                case sentToPolicy:
                {
                    res = sentToPolicy_takeEvent(id);
                }
                break;
                case ValidPolicy:
                {
                    res = ValidPolicy_takeEvent(id);
                }
                break;
                case InvalidPolicy:
                {
                    res = InvalidPolicy_takeEvent(id);
                }
                break;
                case sentToCheckrights:
                {
                    res = sentToCheckrights_takeEvent(id);
                }
                break;
                case RightsValid:
                {
                    res = RightsValid_takeEvent(id);
                }
                break;
                case RightsInvalid:
                {
                    res = RightsInvalid_takeEvent(id);
                }
                break;
                case requesedtProtectedSys:
                {
                    res = requesedtProtectedSys_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.ValidPolicy");
        }
        
        //## statechart_method 
        public void sentToPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.sentToPolicy");
        }
        
        //## statechart_method 
        public void sentToCheckrights_add(AnimStates animStates) {
            animStates.add("ROOT.sentToCheckrights");
        }
        
        //## statechart_method 
        public void RightsValid_add(AnimStates animStates) {
            animStates.add("ROOT.RightsValid");
        }
        
        //## statechart_method 
        public void RightsInvalid_add(AnimStates animStates) {
            animStates.add("ROOT.RightsInvalid");
        }
        
        //## statechart_method 
        public void requesedtProtectedSys_add(AnimStates animStates) {
            animStates.add("ROOT.requesedtProtectedSys");
        }
        
        //## statechart_method 
        public void recievedRequest_add(AnimStates animStates) {
            animStates.add("ROOT.recievedRequest");
        }
        
        //## statechart_method 
        public void InvalidPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.InvalidPolicy");
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
        public void InvalidPolicy_exit() {
            InvalidPolicyExit();
            animInstance().notifyStateExited("ROOT.InvalidPolicy");
        }
        
        //## statechart_method 
        public void requesedtProtectedSys_exit() {
            requesedtProtectedSysExit();
            animInstance().notifyStateExited("ROOT.requesedtProtectedSys");
        }
        
        //## statechart_method 
        public void RightsValidExit() {
            itsRiJThread.unschedTimeout(checkPoint_Timeout_RightsValid_id, this);
        }
        
        //## statechart_method 
        public int sentToCheckrights_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(rejectedRights.rejectedRights_securityPattern_id))
                {
                    res = sentToCheckrightsTakerejectedRights();
                }
            else if(event.isTypeOf(approvedRights.approvedRights_securityPattern_id))
                {
                    res = sentToCheckrightsTakeapprovedRights();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int sentToPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(rejected.rejected_securityPattern_id))
                {
                    res = sentToPolicyTakerejected();
                }
            else if(event.isTypeOf(approved.approved_securityPattern_id))
                {
                    res = sentToPolicyTakeapproved();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int InvalidPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = InvalidPolicyTakeRiJTimeout();
                }
            else if(event.isTypeOf(checkAgain.checkAgain_securityPattern_id))
                {
                    res = InvalidPolicyTakecheckAgain();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void InvalidPolicy_entDef() {
            InvalidPolicy_enter();
        }
        
        //## statechart_method 
        public void sentToPolicy_exit() {
            sentToPolicyExit();
            animInstance().notifyStateExited("ROOT.sentToPolicy");
        }
        
        //## statechart_method 
        public void recievedRequest_exit() {
            popNullConfig();
            recievedRequestExit();
            animInstance().notifyStateExited("ROOT.recievedRequest");
        }
        
        //## statechart_method 
        public void recievedRequest_entDef() {
            recievedRequest_enter();
        }
        
        //## statechart_method 
        public void RightsInvalid_enter() {
            animInstance().notifyStateEntered("ROOT.RightsInvalid");
            rootState_subState = RightsInvalid;
            rootState_active = RightsInvalid;
            RightsInvalidEnter();
        }
        
        //## statechart_method 
        public void sentToCheckrightsEnter() {
        }
        
        //## statechart_method 
        public void sentToCheckrights_entDef() {
            sentToCheckrights_enter();
        }
        
        //## statechart_method 
        public void InvalidPolicyExit() {
            itsRiJThread.unschedTimeout(checkPoint_Timeout_InvalidPolicy_id, this);
        }
        
        //## statechart_method 
        public void requesedtProtectedSys_entDef() {
            requesedtProtectedSys_enter();
        }
        
        //## statechart_method 
        public int sentToCheckrightsTakeapprovedRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            sentToCheckrights_exit();
            RightsValid_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RightsInvalidExit() {
            itsRiJThread.unschedTimeout(checkPoint_Timeout_RightsInvalid_id, this);
        }
        
        //## statechart_method 
        public void RightsInvalidEnter() {
            itsRiJThread.schedTimeout(1, checkPoint_Timeout_RightsInvalid_id, this, "ROOT.RightsInvalid");
        }
        
        //## statechart_method 
        public void ValidPolicyEnter() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveRequestFromSingle.recieveRequestFromSingle_securityPattern_id))
                {
                    res = IdleTakerecieveRequestFromSingle();
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
        public int recievedRequestTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            recievedRequest_exit();
            //#[ transition 2 
            sendCheckPolicy();
            //#]
            sentToPolicy_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int RightsValidTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == checkPoint_Timeout_RightsValid_id)
                {
                    animInstance().notifyTransitionStarted("9");
                    RightsValid_exit();
                    requesedtProtectedSys_entDef();
                    animInstance().notifyTransitionEnded("9");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void sentToCheckrights_exit() {
            sentToCheckrightsExit();
            animInstance().notifyStateExited("ROOT.sentToCheckrights");
        }
        
        //## statechart_method 
        public int recievedRequest_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = recievedRequestTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void recievedRequestExit() {
        }
        
        //## statechart_method 
        public void RightsValidEnter() {
            itsRiJThread.schedTimeout(1, checkPoint_Timeout_RightsValid_id, this, "ROOT.RightsValid");
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
        public int requesedtProtectedSysTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == checkPoint_Timeout_requesedtProtectedSys_id)
                {
                    animInstance().notifyTransitionStarted("11");
                    requesedtProtectedSys_exit();
                    //#[ transition 11 
                    sendBackserviceToCheckpoint();
                    //#]
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("11");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void RightsInvalid_exit() {
            RightsInvalidExit();
            animInstance().notifyStateExited("ROOT.RightsInvalid");
        }
        
        //## statechart_method 
        public int sentToPolicyTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            sentToPolicy_exit();
            //#[ transition 4 
            sendRejectedTryAgain();
            //#]
            InvalidPolicy_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicy_exit() {
            popNullConfig();
            ValidPolicyExit();
            animInstance().notifyStateExited("ROOT.ValidPolicy");
        }
        
        //## statechart_method 
        public void ValidPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.ValidPolicy");
            pushNullConfig();
            rootState_subState = ValidPolicy;
            rootState_active = ValidPolicy;
            ValidPolicyEnter();
        }
        
        //## statechart_method 
        public int IdleTakerecieveRequestFromSingle() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            recievedRequest_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedRequest_enter() {
            animInstance().notifyStateEntered("ROOT.recievedRequest");
            pushNullConfig();
            rootState_subState = recievedRequest;
            rootState_active = recievedRequest;
            recievedRequestEnter();
        }
        
        //## statechart_method 
        public void requesedtProtectedSysExit() {
            itsRiJThread.unschedTimeout(checkPoint_Timeout_requesedtProtectedSys_id, this);
        }
        
        //## statechart_method 
        public int RightsInvalid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = RightsInvalidTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToCheckrights_enter() {
            animInstance().notifyStateEntered("ROOT.sentToCheckrights");
            rootState_subState = sentToCheckrights;
            rootState_active = sentToCheckrights;
            sentToCheckrightsEnter();
        }
        
        //## statechart_method 
        public void sentToPolicy_entDef() {
            sentToPolicy_enter();
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
        public void requesedtProtectedSys_enter() {
            animInstance().notifyStateEntered("ROOT.requesedtProtectedSys");
            rootState_subState = requesedtProtectedSys;
            rootState_active = requesedtProtectedSys;
            requesedtProtectedSysEnter();
        }
        
        //## statechart_method 
        public void RightsInvalid_entDef() {
            RightsInvalid_enter();
        }
        
        //## statechart_method 
        public int RightsValid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = RightsValidTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RightsValid_exit() {
            RightsValidExit();
            animInstance().notifyStateExited("ROOT.RightsValid");
        }
        
        //## statechart_method 
        public void sentToCheckrightsExit() {
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int InvalidPolicyTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == checkPoint_Timeout_InvalidPolicy_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    InvalidPolicy_exit();
                    //#[ transition 5 
                    sendRejectedToSingle();
                    //#]
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int ValidPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ValidPolicyTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int sentToPolicyTakeapproved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            sentToPolicy_exit();
            ValidPolicy_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToPolicyExit() {
        }
        
        //## statechart_method 
        public void ValidPolicy_entDef() {
            ValidPolicy_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int InvalidPolicyTakecheckAgain() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            InvalidPolicy_exit();
            recievedRequest_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToCheckrightsTakerejectedRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            sentToCheckrights_exit();
            RightsInvalid_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int requesedtProtectedSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = requesedtProtectedSysTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void RightsValid_entDef() {
            RightsValid_enter();
        }
        
        //## statechart_method 
        public void InvalidPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.InvalidPolicy");
            rootState_subState = InvalidPolicy;
            rootState_active = InvalidPolicy;
            InvalidPolicyEnter();
        }
        
        //## statechart_method 
        public void InvalidPolicyEnter() {
            itsRiJThread.schedTimeout(1, checkPoint_Timeout_InvalidPolicy_id, this, "ROOT.InvalidPolicy");
        }
        
        //## statechart_method 
        public void requesedtProtectedSysEnter() {
            itsRiJThread.schedTimeout(1, checkPoint_Timeout_requesedtProtectedSys_id, this, "ROOT.requesedtProtectedSys");
        }
        
        //## statechart_method 
        public int RightsInvalidTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == checkPoint_Timeout_RightsInvalid_id)
                {
                    animInstance().notifyTransitionStarted("10");
                    RightsInvalid_exit();
                    //#[ transition 10 
                    sendRightsRejectedToSingle();
                    //#]
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("10");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int ValidPolicyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            ValidPolicy_exit();
            //#[ transition 6 
            sendToCheckRights();
            //#]
            sentToCheckrights_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ValidPolicyExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void RightsValid_enter() {
            animInstance().notifyStateEntered("ROOT.RightsValid");
            rootState_subState = RightsValid;
            rootState_active = RightsValid;
            RightsValidEnter();
        }
        
        //## statechart_method 
        public void sentToPolicyEnter() {
        }
        
        //## statechart_method 
        public void recievedRequestEnter() {
        }
        
        //## statechart_method 
        public void sentToPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.sentToPolicy");
            rootState_subState = sentToPolicy;
            rootState_active = sentToPolicy;
            sentToPolicyEnter();
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
            return checkPoint.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_check_protected_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_protected_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
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
    public class p_check_right_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_right_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
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
    public class p_check_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_single_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
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
    public class p_check_policy_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_policy_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
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
    public class p_check_backSer_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_check_backSer_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
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
    public class p_backCheck_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_backCheck_single_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCheckPoint(checkPoint) 
        public void connectCheckPoint(checkPoint part) {
            //#[ operation connectCheckPoint(checkPoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscheckPoint; 
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
        
        msg.add("Role", Role);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsSingleAccessPoint", false, true, itsSingleAccessPoint);
        msg.add("itsSecurityPolicy", false, true, itsSecurityPolicy);
        msg.add("itsProtectedObject", false, true, itsProtectedObject);
        msg.add("itsRights", false, true, itsRights);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(checkPoint.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            checkPoint.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            checkPoint.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/checkPoint.java
*********************************************************************/

