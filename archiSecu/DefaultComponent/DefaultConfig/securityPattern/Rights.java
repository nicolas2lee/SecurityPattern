/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Rights
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/Rights.java
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
// securityPattern/Rights.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## class Rights 
public class Rights implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassRights = new AnimClass("securityPattern.Rights",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Rights.p_right_check_C p_right_check;		//## ignore 
    
    protected String CCR;		//## attribute CCR 
    
    protected String LCR;		//## attribute LCR 
    
    protected checkPoint itsCheckPoint;		//## link itsCheckPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int receviedRequest=1;
    public static final int Idle=2;
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
    public  Rights(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassRights.getUserClass(),
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
    public Rights.p_right_check_C getP_right_check() {
        return p_right_check;
    }
    
    //## auto_generated 
    public Rights.p_right_check_C get_p_right_check() {
        return p_right_check;
    }
    
    //## auto_generated 
    public Rights.p_right_check_C newP_right_check() {
        p_right_check = new Rights.p_right_check_C();
        return p_right_check;
    }
    
    //## auto_generated 
    public void deleteP_right_check() {
        p_right_check=null;
    }
    
    //## operation sendInvalidToCheckpoint() 
    public void sendInvalidToCheckpoint() {
        try {
            animInstance().notifyMethodEntered("sendInvalidToCheckpoint",
               new ArgData[] {
               });
        
        //#[ operation sendInvalidToCheckpoint() 
        getP_right_check().gen (new rejectedRights());
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
        getP_right_check().gen (new approvedRights());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public String getCCR() {
        return CCR;
    }
    
    //## auto_generated 
    public void setCCR(String p_CCR) {
        CCR = p_CCR;
    }
    
    //## auto_generated 
    public String getLCR() {
        return LCR;
    }
    
    //## auto_generated 
    public void setLCR(String p_LCR) {
        LCR = p_LCR;
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
                itsCheckPoint.__setItsRights(null);
            }
        __setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void setItsCheckPoint(checkPoint p_checkPoint) {
        if(p_checkPoint != null)
            {
                p_checkPoint._setItsRights(this);
            }
        _setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void _clearItsCheckPoint() {
        animInstance().notifyRelationCleared("itsCheckPoint");
        itsCheckPoint = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_right_check = newP_right_check();
        if(getP_right_check() != null)
           getP_right_check().connectRights(this);
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
                case receviedRequest:
                {
                    receviedRequest_add(animStates);
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
                case receviedRequest:
                {
                    res = receviedRequest_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void receviedRequest_add(AnimStates animStates) {
            animStates.add("ROOT.receviedRequest");
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
        public int receviedRequest_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(rejected.rejected_securityPattern_id))
                {
                    res = receviedRequestTakerejected();
                }
            else if(event.isTypeOf(approved.approved_securityPattern_id))
                {
                    res = receviedRequestTakeapproved();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void receviedRequest_exit() {
            receviedRequestExit();
            animInstance().notifyStateExited("ROOT.receviedRequest");
        }
        
        //## statechart_method 
        public int receviedRequestTakeapproved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            receviedRequest_exit();
            //#[ transition 2 
            sendValidToCheckpoint();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int IdleTakecheckRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            receviedRequest_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receviedRequestExit() {
        }
        
        //## statechart_method 
        public void receviedRequest_enter() {
            animInstance().notifyStateEntered("ROOT.receviedRequest");
            rootState_subState = receviedRequest;
            rootState_active = receviedRequest;
            receviedRequestEnter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(checkRights.checkRights_securityPattern_id))
                {
                    res = IdleTakecheckRights();
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
        public void receviedRequest_entDef() {
            receviedRequest_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int receviedRequestTakerejected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            receviedRequest_exit();
            //#[ transition 3 
            sendInvalidToCheckpoint();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receviedRequestEnter() {
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
            return Rights.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_right_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_right_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectRights(Rights) 
        public void connectRights(Rights part) {
            //#[ operation connectRights(Rights) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassRights; 
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
        
        msg.add("CCR", CCR);
        msg.add("LCR", LCR);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsCheckPoint", false, true, itsCheckPoint);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Rights.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Rights.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Rights.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/Rights.java
*********************************************************************/

