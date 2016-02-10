/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: counterMeasure
//!	Generated Date	: Thu, 14, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/counterMeasure.java
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
// securityPattern/counterMeasure.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## class counterMeasure 
public class counterMeasure implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscounterMeasure = new AnimClass("securityPattern.counterMeasure",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected counterMeasure.p_cm_policy_C p_cm_policy;		//## ignore 
    
    protected SecurityPolicy itsSecurityPolicy;		//## link itsSecurityPolicy 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int thirdRejected=1;
    public static final int secondRejected=2;
    public static final int Idle=3;
    public static final int firstRejected=4;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int counterMeasure_Timeout_thirdRejected_id = 1;		//## ignore 
    
    
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
    public  counterMeasure(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscounterMeasure.getUserClass(),
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
    public counterMeasure.p_cm_policy_C getP_cm_policy() {
        return p_cm_policy;
    }
    
    //## auto_generated 
    public counterMeasure.p_cm_policy_C get_p_cm_policy() {
        return p_cm_policy;
    }
    
    //## auto_generated 
    public counterMeasure.p_cm_policy_C newP_cm_policy() {
        p_cm_policy = new counterMeasure.p_cm_policy_C();
        return p_cm_policy;
    }
    
    //## auto_generated 
    public void deleteP_cm_policy() {
        p_cm_policy=null;
    }
    
    //## operation sendCheckAgain() 
    public void sendCheckAgain() {
        try {
            animInstance().notifyMethodEntered("sendCheckAgain",
               new ArgData[] {
               });
        
        //#[ operation sendCheckAgain() 
        getP_cm_policy().gen(new checkAgain());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendTryMorethanThreeTimes() 
    public void sendTryMorethanThreeTimes() {
        try {
            animInstance().notifyMethodEntered("sendTryMorethanThreeTimes",
               new ArgData[] {
               });
        
        //#[ operation sendTryMorethanThreeTimes() 
        getP_cm_policy().gen(new triedMorethanThreetimes());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                itsSecurityPolicy.__setItsCounterMeasure(null);
            }
        __setItsSecurityPolicy(p_SecurityPolicy);
    }
    
    //## auto_generated 
    public void setItsSecurityPolicy(SecurityPolicy p_SecurityPolicy) {
        if(p_SecurityPolicy != null)
            {
                p_SecurityPolicy._setItsCounterMeasure(this);
            }
        _setItsSecurityPolicy(p_SecurityPolicy);
    }
    
    //## auto_generated 
    public void _clearItsSecurityPolicy() {
        animInstance().notifyRelationCleared("itsSecurityPolicy");
        itsSecurityPolicy = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_cm_policy = newP_cm_policy();
        if(getP_cm_policy() != null)
           getP_cm_policy().connectCounterMeasure(this);
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
                case firstRejected:
                {
                    firstRejected_add(animStates);
                }
                break;
                case secondRejected:
                {
                    secondRejected_add(animStates);
                }
                break;
                case thirdRejected:
                {
                    thirdRejected_add(animStates);
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
                case firstRejected:
                {
                    res = firstRejected_takeEvent(id);
                }
                break;
                case secondRejected:
                {
                    res = secondRejected_takeEvent(id);
                }
                break;
                case thirdRejected:
                {
                    res = thirdRejected_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void thirdRejected_add(AnimStates animStates) {
            animStates.add("ROOT.thirdRejected");
        }
        
        //## statechart_method 
        public void secondRejected_add(AnimStates animStates) {
            animStates.add("ROOT.secondRejected");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void firstRejected_add(AnimStates animStates) {
            animStates.add("ROOT.firstRejected");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void thirdRejected_exit() {
            thirdRejectedExit();
            animInstance().notifyStateExited("ROOT.thirdRejected");
        }
        
        //## statechart_method 
        public void firstRejected_enter() {
            animInstance().notifyStateEntered("ROOT.firstRejected");
            rootState_subState = firstRejected;
            rootState_active = firstRejected;
            firstRejectedEnter();
        }
        
        //## statechart_method 
        public void thirdRejectedExit() {
            itsRiJThread.unschedTimeout(counterMeasure_Timeout_thirdRejected_id, this);
        }
        
        //## statechart_method 
        public void thirdRejected_enter() {
            animInstance().notifyStateEntered("ROOT.thirdRejected");
            rootState_subState = thirdRejected;
            rootState_active = thirdRejected;
            thirdRejectedEnter();
        }
        
        //## statechart_method 
        public int secondRejected_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(countRejected.countRejected_securityPattern_id))
                {
                    res = secondRejectedTakecountRejected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void secondRejected_entDef() {
            secondRejected_enter();
        }
        
        //## statechart_method 
        public int thirdRejected_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = thirdRejectedTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void firstRejectedEnter() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(countRejected.countRejected_securityPattern_id))
                {
                    res = IdleTakecountRejected();
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
        public int firstRejectedTakecountRejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            firstRejected_exit();
            //#[ transition 2 
            sendCheckAgain();
            //#]
            secondRejected_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int thirdRejectedTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == counterMeasure_Timeout_thirdRejected_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    thirdRejected_exit();
                    //#[ transition 4 
                    sendTryMorethanThreeTimes();
                    //#]
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
        public void secondRejectedExit() {
        }
        
        //## statechart_method 
        public void firstRejected_exit() {
            firstRejectedExit();
            animInstance().notifyStateExited("ROOT.firstRejected");
        }
        
        //## statechart_method 
        public void firstRejected_entDef() {
            firstRejected_enter();
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
        public void secondRejectedEnter() {
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int IdleTakecountRejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            sendCheckAgain();
            //#]
            firstRejected_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int secondRejectedTakecountRejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            secondRejected_exit();
            thirdRejected_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void secondRejected_exit() {
            secondRejectedExit();
            animInstance().notifyStateExited("ROOT.secondRejected");
        }
        
        //## statechart_method 
        public void thirdRejected_entDef() {
            thirdRejected_enter();
        }
        
        //## statechart_method 
        public void firstRejectedExit() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void secondRejected_enter() {
            animInstance().notifyStateEntered("ROOT.secondRejected");
            rootState_subState = secondRejected;
            rootState_active = secondRejected;
            secondRejectedEnter();
        }
        
        //## statechart_method 
        public int firstRejected_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(countRejected.countRejected_securityPattern_id))
                {
                    res = firstRejectedTakecountRejected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void thirdRejectedEnter() {
            itsRiJThread.schedTimeout(1, counterMeasure_Timeout_thirdRejected_id, this, "ROOT.thirdRejected");
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return counterMeasure.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cm_policy_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cm_policy_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCounterMeasure(counterMeasure) 
        public void connectCounterMeasure(counterMeasure part) {
            //#[ operation connectCounterMeasure(counterMeasure) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscounterMeasure; 
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
        
        msg.add("itsSecurityPolicy", false, true, itsSecurityPolicy);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(counterMeasure.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            counterMeasure.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            counterMeasure.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/counterMeasure.java
*********************************************************************/

