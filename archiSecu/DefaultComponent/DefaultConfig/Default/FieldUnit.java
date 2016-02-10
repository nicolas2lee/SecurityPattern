/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldUnit
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/FieldUnit.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/FieldUnit.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class FieldUnit 
public class FieldUnit implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldUnit = new AnimClass("Default.FieldUnit",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected FieldUnit.p_field_net_C p_field_net;		//## ignore 
    
    protected communiNetwork itsCommuniNetwork;		//## link itsCommuniNetwork 
    
    protected FieldService itsFieldService;		//## link itsFieldService 
    
    protected LocalController itsLocalController;		//## link itsLocalController 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int recievedFromCenter=1;
    public static final int Idle=2;
    public static final int doneSomething=3;
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
    
    //## operation sendFeedbackByNet() 
    public void sendFeedbackByNet() {
        try {
            animInstance().notifyMethodEntered("sendFeedbackByNet",
               new ArgData[] {
               });
        
        //#[ operation sendFeedbackByNet() 
        getP_field_net().gen(new sendToCenter());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public communiNetwork getItsCommuniNetwork() {
        return itsCommuniNetwork;
    }
    
    //## auto_generated 
    public void __setItsCommuniNetwork(communiNetwork p_communiNetwork) {
        itsCommuniNetwork = p_communiNetwork;
        if(p_communiNetwork != null)
            {
                animInstance().notifyRelationAdded("itsCommuniNetwork", p_communiNetwork);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCommuniNetwork");
            }
    }
    
    //## auto_generated 
    public void _setItsCommuniNetwork(communiNetwork p_communiNetwork) {
        if(itsCommuniNetwork != null)
            {
                itsCommuniNetwork.__setItsFieldUnit(null);
            }
        __setItsCommuniNetwork(p_communiNetwork);
    }
    
    //## auto_generated 
    public void setItsCommuniNetwork(communiNetwork p_communiNetwork) {
        if(p_communiNetwork != null)
            {
                p_communiNetwork._setItsFieldUnit(this);
            }
        _setItsCommuniNetwork(p_communiNetwork);
    }
    
    //## auto_generated 
    public void _clearItsCommuniNetwork() {
        animInstance().notifyRelationCleared("itsCommuniNetwork");
        itsCommuniNetwork = null;
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
    public FieldService newItsFieldService() {
        itsFieldService = new FieldService();
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
    public LocalController newItsLocalController() {
        itsLocalController = new LocalController();
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
    protected void initRelations(RiJThread p_thread) {
        p_field_net = newP_field_net();
        itsFieldService = newItsFieldService();
        itsLocalController = newItsLocalController();
        if(getP_field_net() != null)
           getP_field_net().connectFieldUnit(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
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
                case doneSomething:
                {
                    doneSomething_add(animStates);
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
                case doneSomething:
                {
                    res = doneSomething_takeEvent(id);
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
        public void doneSomething_add(AnimStates animStates) {
            animStates.add("ROOT.doneSomething");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void doneSomething_exit() {
            popNullConfig();
            doneSomethingExit();
            animInstance().notifyStateExited("ROOT.doneSomething");
        }
        
        //## statechart_method 
        public int recievedFromCenterTakedoSomething() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            recievedFromCenter_exit();
            doneSomething_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doneSomethingExit() {
        }
        
        //## statechart_method 
        public void recievedFromCenterExit() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveFromCenterByNet.recieveFromCenterByNet_Default_id))
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
            if(event.isTypeOf(doSomething.doSomething_Default_id))
                {
                    res = recievedFromCenterTakedoSomething();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int doneSomething_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = doneSomethingTakeNull();
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
        public int doneSomethingTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            doneSomething_exit();
            //#[ transition 2 
            sendFeedbackByNet();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doneSomething_entDef() {
            doneSomething_enter();
        }
        
        //## statechart_method 
        public void doneSomething_enter() {
            animInstance().notifyStateEntered("ROOT.doneSomething");
            pushNullConfig();
            rootState_subState = doneSomething;
            rootState_active = doneSomething;
            doneSomethingEnter();
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
        public void doneSomethingEnter() {
        }
        
        //## statechart_method 
        public int IdleTakerecieveFromCenterByNet() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
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
        msg.add("itsFieldService", true, true, itsFieldService);
        msg.add("itsCommuniNetwork", false, true, itsCommuniNetwork);
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
	File Path	: DefaultComponent/DefaultConfig/Default/FieldUnit.java
*********************************************************************/

