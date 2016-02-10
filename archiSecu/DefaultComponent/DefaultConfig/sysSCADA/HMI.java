/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: HMI
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/HMI.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/HMI.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class HMI 
public class HMI implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassHMI = new AnimClass("sysSCADA.HMI",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected HMI.p_HMI_cen_C p_HMI_cen;		//## ignore 
    
    protected HMI.p_HMI_net_C p_HMI_net;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int receivedInteraction=1;
    public static final int Idle=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int HMI_Timeout_receivedInteraction_id = 1;		//## ignore 
    
    
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
    public  HMI(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassHMI.getUserClass(),
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
    public HMI.p_HMI_cen_C getP_HMI_cen() {
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_cen_C get_p_HMI_cen() {
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_cen_C newP_HMI_cen() {
        p_HMI_cen = new HMI.p_HMI_cen_C();
        return p_HMI_cen;
    }
    
    //## auto_generated 
    public void deleteP_HMI_cen() {
        p_HMI_cen=null;
    }
    
    //## auto_generated 
    public HMI.p_HMI_net_C getP_HMI_net() {
        return p_HMI_net;
    }
    
    //## auto_generated 
    public HMI.p_HMI_net_C get_p_HMI_net() {
        return p_HMI_net;
    }
    
    //## auto_generated 
    public HMI.p_HMI_net_C newP_HMI_net() {
        p_HMI_net = new HMI.p_HMI_net_C();
        return p_HMI_net;
    }
    
    //## auto_generated 
    public void deleteP_HMI_net() {
        p_HMI_net=null;
    }
    
    //## operation backInfo() 
    public void backInfo() {
        try {
            animInstance().notifyMethodEntered("backInfo",
               new ArgData[] {
               });
        
        //#[ operation backInfo() 
        System.out.println("HMI back info to center");
        getP_HMI_cen().gen(new backInteraction());
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
                itsCenterController.__setItsHMI(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsHMI(this);
            }
        _setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_HMI_cen = newP_HMI_cen();
        p_HMI_net = newP_HMI_net();
        if(getP_HMI_cen() != null)
           getP_HMI_cen().connectHMI(this);
        if(getP_HMI_net() != null)
           getP_HMI_net().connectHMI(this);
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
                case receivedInteraction:
                {
                    receivedInteraction_add(animStates);
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
                case receivedInteraction:
                {
                    res = receivedInteraction_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void receivedInteraction_add(AnimStates animStates) {
            animStates.add("ROOT.receivedInteraction");
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
        public int receivedInteractionTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == HMI_Timeout_receivedInteraction_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    receivedInteraction_exit();
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void receivedInteractionEnter() {
            itsRiJThread.schedTimeout(5, HMI_Timeout_receivedInteraction_id, this, "ROOT.receivedInteraction");
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(interactHMI.interactHMI_sysSCADA_id))
                {
                    res = IdleTakeinteractHMI();
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
        public void receivedInteractionExit() {
            itsRiJThread.unschedTimeout(HMI_Timeout_receivedInteraction_id, this);
        }
        
        //## statechart_method 
        public void receivedInteraction_exit() {
            receivedInteractionExit();
            animInstance().notifyStateExited("ROOT.receivedInteraction");
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
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int receivedInteraction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = receivedInteractionTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int IdleTakeinteractHMI() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            backInfo();
            //#]
            receivedInteraction_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receivedInteraction_entDef() {
            receivedInteraction_enter();
        }
        
        //## statechart_method 
        public void receivedInteraction_enter() {
            animInstance().notifyStateEntered("ROOT.receivedInteraction");
            rootState_subState = receivedInteraction;
            rootState_active = receivedInteraction;
            receivedInteractionEnter();
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
            return HMI.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_HMI_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_cen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectHMI(HMI) 
        public void connectHMI(HMI part) {
            //#[ operation connectHMI(HMI) 
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
    public class p_HMI_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_net_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectHMI(HMI) 
        public void connectHMI(HMI part) {
            //#[ operation connectHMI(HMI) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassHMI; 
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
        
        msg.add("itsCenterController", false, true, itsCenterController);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(HMI.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            HMI.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            HMI.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/HMI.java
*********************************************************************/

