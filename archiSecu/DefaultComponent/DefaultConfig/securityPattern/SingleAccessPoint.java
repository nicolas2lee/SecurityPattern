/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SingleAccessPoint
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/SingleAccessPoint.java
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
// securityPattern/SingleAccessPoint.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## class SingleAccessPoint 
public class SingleAccessPoint implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSingleAccessPoint = new AnimClass("securityPattern.SingleAccessPoint",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected SingleAccessPoint.p_single_user_C p_single_user;		//## ignore 
    
    protected SingleAccessPoint.p_single_check_C p_single_check;		//## ignore 
    
    protected int judgeRole;		//## attribute judgeRole 
    
    protected checkPoint itsCheckPoint;		//## link itsCheckPoint 
    
    protected user_securityPattern itsUser_securityPattern;		//## link itsUser_securityPattern 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Valid=1;
    public static final int recievedMessage=2;
    public static final int Invalid=3;
    public static final int Idle=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int SingleAccessPoint_Timeout_Valid_id = 1;		//## ignore 
    
    public static final int SingleAccessPoint_Timeout_Invalid_id = 2;		//## ignore 
    
    
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
    public  SingleAccessPoint(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSingleAccessPoint.getUserClass(),
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
    public SingleAccessPoint.p_single_user_C getP_single_user() {
        return p_single_user;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_user_C get_p_single_user() {
        return p_single_user;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_user_C newP_single_user() {
        p_single_user = new SingleAccessPoint.p_single_user_C();
        return p_single_user;
    }
    
    //## auto_generated 
    public void deleteP_single_user() {
        p_single_user=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C getP_single_check() {
        return p_single_check;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C get_p_single_check() {
        return p_single_check;
    }
    
    //## auto_generated 
    public SingleAccessPoint.p_single_check_C newP_single_check() {
        p_single_check = new SingleAccessPoint.p_single_check_C();
        return p_single_check;
    }
    
    //## auto_generated 
    public void deleteP_single_check() {
        p_single_check=null;
    }
    
    //## TriggeredOperation request() 
    public void request() {
        try {
            animInstance().notifyTrgOpEntered("request",
               new ArgData[] {
               });
        
        request_SingleAccessPoint_Event triggerEvent = new request_SingleAccessPoint_Event();
        reactive.takeTrigger(triggerEvent);
        }
        finally {
            animInstance().notifyTrgOpExit();
        }
        
    }
    
    //## operation sendToCheckPoint() 
    public void sendToCheckPoint() {
        try {
            animInstance().notifyMethodEntered("sendToCheckPoint",
               new ArgData[] {
               });
        
        //#[ operation sendToCheckPoint() 
        getP_single_check().gen(new recieveRequestFromSingle());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getJudgeRole() {
        return judgeRole;
    }
    
    //## auto_generated 
    public void setJudgeRole(int p_judgeRole) {
        judgeRole = p_judgeRole;
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint() {
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public void __setItsCheckPoint(checkPoint p_checkPoint) {
        itsCheckPoint = p_checkPoint;
        if(p_checkPoint != null)
            {
                animInstance().notifyRelationAdded("itsCheckPoint", p_checkPoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCheckPoint");
            }
    }
    
    //## auto_generated 
    public void _setItsCheckPoint(checkPoint p_checkPoint) {
        if(itsCheckPoint != null)
            {
                itsCheckPoint.__setItsSingleAccessPoint(null);
            }
        __setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void setItsCheckPoint(checkPoint p_checkPoint) {
        if(p_checkPoint != null)
            {
                p_checkPoint._setItsSingleAccessPoint(this);
            }
        _setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void _clearItsCheckPoint() {
        animInstance().notifyRelationCleared("itsCheckPoint");
        itsCheckPoint = null;
    }
    
    //## auto_generated 
    public user_securityPattern getItsUser_securityPattern() {
        return itsUser_securityPattern;
    }
    
    //## auto_generated 
    public void __setItsUser_securityPattern(user_securityPattern p_user_securityPattern) {
        itsUser_securityPattern = p_user_securityPattern;
        if(p_user_securityPattern != null)
            {
                animInstance().notifyRelationAdded("itsUser_securityPattern", p_user_securityPattern);
            }
        else
            {
                animInstance().notifyRelationCleared("itsUser_securityPattern");
            }
    }
    
    //## auto_generated 
    public void _setItsUser_securityPattern(user_securityPattern p_user_securityPattern) {
        if(itsUser_securityPattern != null)
            {
                itsUser_securityPattern.__setItsSingleAccessPoint(null);
            }
        __setItsUser_securityPattern(p_user_securityPattern);
    }
    
    //## auto_generated 
    public void setItsUser_securityPattern(user_securityPattern p_user_securityPattern) {
        if(p_user_securityPattern != null)
            {
                p_user_securityPattern._setItsSingleAccessPoint(this);
            }
        _setItsUser_securityPattern(p_user_securityPattern);
    }
    
    //## auto_generated 
    public void _clearItsUser_securityPattern() {
        animInstance().notifyRelationCleared("itsUser_securityPattern");
        itsUser_securityPattern = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_single_user = newP_single_user();
        p_single_check = newP_single_check();
        if(getP_single_user() != null)
           getP_single_user().connectSingleAccessPoint(this);
        if(getP_single_check() != null)
           getP_single_check().connectSingleAccessPoint(this);
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
                case recievedMessage:
                {
                    recievedMessage_add(animStates);
                }
                break;
                case Valid:
                {
                    Valid_add(animStates);
                }
                break;
                case Invalid:
                {
                    Invalid_add(animStates);
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
                case recievedMessage:
                {
                    res = recievedMessage_takeEvent(id);
                }
                break;
                case Valid:
                {
                    res = Valid_takeEvent(id);
                }
                break;
                case Invalid:
                {
                    res = Invalid_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Valid_add(AnimStates animStates) {
            animStates.add("ROOT.Valid");
        }
        
        //## statechart_method 
        public void recievedMessage_add(AnimStates animStates) {
            animStates.add("ROOT.recievedMessage");
        }
        
        //## statechart_method 
        public void Invalid_add(AnimStates animStates) {
            animStates.add("ROOT.Invalid");
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
        public void InvalidExit() {
            itsRiJThread.unschedTimeout(SingleAccessPoint_Timeout_Invalid_id, this);
        }
        
        //## statechart_method 
        public void InvalidEnter() {
            itsRiJThread.schedTimeout(1, SingleAccessPoint_Timeout_Invalid_id, this, "ROOT.Invalid");
        }
        
        //## statechart_method 
        public int IdleTakerequested() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            sendToCheckPoint();
            //#]
            recievedMessage_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int recievedMessage_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backService.backService_securityPattern_id))
                {
                    res = recievedMessageTakebackService();
                }
            else if(event.isTypeOf(rejected.rejected_securityPattern_id))
                {
                    res = recievedMessageTakerejected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int recievedMessageTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            recievedMessage_exit();
            Invalid_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedMessage_entDef() {
            recievedMessage_enter();
        }
        
        //## statechart_method 
        public void Invalid_exit() {
            InvalidExit();
            animInstance().notifyStateExited("ROOT.Invalid");
        }
        
        //## statechart_method 
        public int Invalid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = InvalidTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requested.requested_securityPattern_id))
                {
                    res = IdleTakerequested();
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
        public int ValidTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == SingleAccessPoint_Timeout_Valid_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    Valid_exit();
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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
        public void recievedMessage_enter() {
            animInstance().notifyStateEntered("ROOT.recievedMessage");
            rootState_subState = recievedMessage;
            rootState_active = recievedMessage;
            recievedMessageEnter();
        }
        
        //## statechart_method 
        public void recievedMessageEnter() {
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
        public void recievedMessageExit() {
        }
        
        //## statechart_method 
        public void Valid_entDef() {
            Valid_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int recievedMessageTakebackService() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            recievedMessage_exit();
            Valid_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedMessage_exit() {
            recievedMessageExit();
            animInstance().notifyStateExited("ROOT.recievedMessage");
        }
        
        //## statechart_method 
        public void Valid_enter() {
            animInstance().notifyStateEntered("ROOT.Valid");
            rootState_subState = Valid;
            rootState_active = Valid;
            ValidEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Invalid_entDef() {
            Invalid_enter();
        }
        
        //## statechart_method 
        public void ValidEnter() {
            itsRiJThread.schedTimeout(1, SingleAccessPoint_Timeout_Valid_id, this, "ROOT.Valid");
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void Invalid_enter() {
            animInstance().notifyStateEntered("ROOT.Invalid");
            rootState_subState = Invalid;
            rootState_active = Invalid;
            InvalidEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Valid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = ValidTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Valid_exit() {
            ValidExit();
            animInstance().notifyStateExited("ROOT.Valid");
        }
        
        //## statechart_method 
        public int InvalidTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == SingleAccessPoint_Timeout_Invalid_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    Invalid_exit();
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void ValidExit() {
            itsRiJThread.unschedTimeout(SingleAccessPoint_Timeout_Valid_id, this);
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
            return SingleAccessPoint.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_single_user_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_single_user_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSingleAccessPoint(SingleAccessPoint) 
        public void connectSingleAccessPoint(SingleAccessPoint part) {
            //#[ operation connectSingleAccessPoint(SingleAccessPoint) 
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
    public class p_single_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_single_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSingleAccessPoint(SingleAccessPoint) 
        public void connectSingleAccessPoint(SingleAccessPoint part) {
            //#[ operation connectSingleAccessPoint(SingleAccessPoint) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSingleAccessPoint; 
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
        
        msg.add("judgeRole", judgeRole);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsUser_securityPattern", false, true, itsUser_securityPattern);
        msg.add("itsCheckPoint", false, true, itsCheckPoint);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(SingleAccessPoint.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SingleAccessPoint.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SingleAccessPoint.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
//## ignore 
class request_SingleAccessPoint_Event extends RiJEvent {
    
    public static final int request_SingleAccessPoint_Event_id = 31000;
    
    // Constructors
    
    public  request_SingleAccessPoint_Event() {
        lId = request_SingleAccessPoint_Event_id;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/SingleAccessPoint.java
*********************************************************************/

