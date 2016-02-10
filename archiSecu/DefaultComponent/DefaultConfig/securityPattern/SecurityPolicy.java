/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SecurityPolicy
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/SecurityPolicy.java
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
// securityPattern/SecurityPolicy.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## class SecurityPolicy 
public class SecurityPolicy implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSecurityPolicy = new AnimClass("securityPattern.SecurityPolicy",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected SecurityPolicy.p_policy_check_C p_policy_check;		//## ignore 
    
    protected SecurityPolicy.p_policy_cm_C p_policy_cm;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## link itsCheckPoint 
    
    protected counterMeasure itsCounterMeasure;		//## link itsCounterMeasure 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Valid=1;
    public static final int recievedCheck=2;
    public static final int Invalid=3;
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
    public  SecurityPolicy(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSecurityPolicy.getUserClass(),
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
    public SecurityPolicy.p_policy_check_C getP_policy_check() {
        return p_policy_check;
    }
    
    //## auto_generated 
    public SecurityPolicy.p_policy_check_C get_p_policy_check() {
        return p_policy_check;
    }
    
    //## auto_generated 
    public SecurityPolicy.p_policy_check_C newP_policy_check() {
        p_policy_check = new SecurityPolicy.p_policy_check_C();
        return p_policy_check;
    }
    
    //## auto_generated 
    public void deleteP_policy_check() {
        p_policy_check=null;
    }
    
    //## auto_generated 
    public SecurityPolicy.p_policy_cm_C getP_policy_cm() {
        return p_policy_cm;
    }
    
    //## auto_generated 
    public SecurityPolicy.p_policy_cm_C get_p_policy_cm() {
        return p_policy_cm;
    }
    
    //## auto_generated 
    public SecurityPolicy.p_policy_cm_C newP_policy_cm() {
        p_policy_cm = new SecurityPolicy.p_policy_cm_C();
        return p_policy_cm;
    }
    
    //## auto_generated 
    public void deleteP_policy_cm() {
        p_policy_cm=null;
    }
    
    //## operation sendInvalidToCheckpoint() 
    public void sendInvalidToCheckpoint() {
        try {
            animInstance().notifyMethodEntered("sendInvalidToCheckpoint",
               new ArgData[] {
               });
        
        //#[ operation sendInvalidToCheckpoint() 
        getP_policy_check().gen(new rejected());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToCounterMeasure() 
    public void sendToCounterMeasure() {
        try {
            animInstance().notifyMethodEntered("sendToCounterMeasure",
               new ArgData[] {
               });
        
        //#[ operation sendToCounterMeasure() 
        getP_policy_cm().gen (new countRejected());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendValidToCheckpoint() 
    public void sendValidToCheckpoint() {
        try {
            animInstance().notifyMethodEntered("sendValidToCheckpoint",
               new ArgData[] {
               });
        
        //#[ operation sendValidToCheckpoint() 
        getP_policy_check().gen(new approved());
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
                itsCheckPoint.__setItsSecurityPolicy(null);
            }
        __setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void setItsCheckPoint(checkPoint p_checkPoint) {
        if(p_checkPoint != null)
            {
                p_checkPoint._setItsSecurityPolicy(this);
            }
        _setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void _clearItsCheckPoint() {
        animInstance().notifyRelationCleared("itsCheckPoint");
        itsCheckPoint = null;
    }
    
    //## auto_generated 
    public counterMeasure getItsCounterMeasure() {
        return itsCounterMeasure;
    }
    
    //## auto_generated 
    public void __setItsCounterMeasure(counterMeasure p_counterMeasure) {
        itsCounterMeasure = p_counterMeasure;
        if(p_counterMeasure != null)
            {
                animInstance().notifyRelationAdded("itsCounterMeasure", p_counterMeasure);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCounterMeasure");
            }
    }
    
    //## auto_generated 
    public void _setItsCounterMeasure(counterMeasure p_counterMeasure) {
        if(itsCounterMeasure != null)
            {
                itsCounterMeasure.__setItsSecurityPolicy(null);
            }
        __setItsCounterMeasure(p_counterMeasure);
    }
    
    //## auto_generated 
    public void setItsCounterMeasure(counterMeasure p_counterMeasure) {
        if(p_counterMeasure != null)
            {
                p_counterMeasure._setItsSecurityPolicy(this);
            }
        _setItsCounterMeasure(p_counterMeasure);
    }
    
    //## auto_generated 
    public void _clearItsCounterMeasure() {
        animInstance().notifyRelationCleared("itsCounterMeasure");
        itsCounterMeasure = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_policy_check = newP_policy_check();
        p_policy_cm = newP_policy_cm();
        if(getP_policy_check() != null)
           getP_policy_check().connectSecurityPolicy(this);
        if(getP_policy_cm() != null)
           getP_policy_cm().connectSecurityPolicy(this);
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
                case recievedCheck:
                {
                    recievedCheck_add(animStates);
                }
                break;
                case Invalid:
                {
                    Invalid_add(animStates);
                }
                break;
                case Valid:
                {
                    Valid_add(animStates);
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
                case recievedCheck:
                {
                    res = recievedCheck_takeEvent(id);
                }
                break;
                case Invalid:
                {
                    res = Invalid_takeEvent(id);
                }
                break;
                case Valid:
                {
                    res = Valid_takeEvent(id);
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
        public void recievedCheck_add(AnimStates animStates) {
            animStates.add("ROOT.recievedCheck");
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
        public int InvalidTaketriedMorethanThreetimes() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Invalid_exit();
            //#[ transition 4 
            sendInvalidToCheckpoint();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void InvalidExit() {
        }
        
        //## statechart_method 
        public void InvalidEnter() {
        }
        
        //## statechart_method 
        public void recievedCheck_exit() {
            recievedCheckExit();
            animInstance().notifyStateExited("ROOT.recievedCheck");
        }
        
        //## statechart_method 
        public void recievedCheckExit() {
        }
        
        //## statechart_method 
        public int InvalidTakecheckAgain() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Invalid_exit();
            recievedCheck_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedCheck_enter() {
            animInstance().notifyStateEntered("ROOT.recievedCheck");
            rootState_subState = recievedCheck;
            rootState_active = recievedCheck;
            recievedCheckEnter();
        }
        
        //## statechart_method 
        public void Invalid_exit() {
            InvalidExit();
            animInstance().notifyStateExited("ROOT.Invalid");
        }
        
        //## statechart_method 
        public int Invalid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(triedMorethanThreetimes.triedMorethanThreetimes_securityPattern_id))
                {
                    res = InvalidTaketriedMorethanThreetimes();
                }
            else if(event.isTypeOf(checkAgain.checkAgain_securityPattern_id))
                {
                    res = InvalidTakecheckAgain();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int recievedCheckTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            recievedCheck_exit();
            //#[ transition 3 
            sendToCounterMeasure();
            //#]
            Invalid_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(checkPolicy.checkPolicy_securityPattern_id))
                {
                    res = IdleTakecheckPolicy();
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
        public int recievedCheckTakeapproved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            recievedCheck_exit();
            //#[ transition 2 
            sendValidToCheckpoint();
            //#]
            Valid_entDef();
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
        public int ValidTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Valid_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Valid_entDef() {
            Valid_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void recievedCheck_entDef() {
            recievedCheck_enter();
        }
        
        //## statechart_method 
        public void Valid_enter() {
            animInstance().notifyStateEntered("ROOT.Valid");
            pushNullConfig();
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
        public int recievedCheck_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(rejected.rejected_securityPattern_id))
                {
                    res = recievedCheckTakerejected();
                }
            else if(event.isTypeOf(approved.approved_securityPattern_id))
                {
                    res = recievedCheckTakeapproved();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void ValidEnter() {
        }
        
        //## statechart_method 
        public int IdleTakecheckPolicy() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            recievedCheck_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void recievedCheckEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Valid_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ValidTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Valid_exit() {
            popNullConfig();
            ValidExit();
            animInstance().notifyStateExited("ROOT.Valid");
        }
        
        //## statechart_method 
        public void ValidExit() {
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
            return SecurityPolicy.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_policy_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_policy_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSecurityPolicy(SecurityPolicy) 
        public void connectSecurityPolicy(SecurityPolicy part) {
            //#[ operation connectSecurityPolicy(SecurityPolicy) 
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
    public class p_policy_cm_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_policy_cm_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSecurityPolicy(SecurityPolicy) 
        public void connectSecurityPolicy(SecurityPolicy part) {
            //#[ operation connectSecurityPolicy(SecurityPolicy) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSecurityPolicy; 
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
        
        msg.add("itsCheckPoint", false, true, itsCheckPoint);
        msg.add("itsCounterMeasure", false, true, itsCounterMeasure);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(SecurityPolicy.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SecurityPolicy.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SecurityPolicy.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/SecurityPolicy.java
*********************************************************************/

