/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldService
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/FieldService.java
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
// sysSCADA/FieldService.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class FieldService 
public class FieldService implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldService = new AnimClass("sysSCADA.FieldService",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected FieldService.p_ser_field_C p_ser_field;		//## ignore 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int receivedService=1;
    public static final int Idle=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int FieldService_Timeout_receivedService_id = 1;		//## ignore 
    
    
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
    public  FieldService(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassFieldService.getUserClass(),
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
    public FieldService.p_ser_field_C getP_ser_field() {
        return p_ser_field;
    }
    
    //## auto_generated 
    public FieldService.p_ser_field_C get_p_ser_field() {
        return p_ser_field;
    }
    
    //## auto_generated 
    public FieldService.p_ser_field_C newP_ser_field() {
        p_ser_field = new FieldService.p_ser_field_C();
        return p_ser_field;
    }
    
    //## auto_generated 
    public void deleteP_ser_field() {
        p_ser_field=null;
    }
    
    //## operation sendbackServiceInfo() 
    public void sendbackServiceInfo() {
        try {
            animInstance().notifyMethodEntered("sendbackServiceInfo",
               new ArgData[] {
               });
        
        //#[ operation sendbackServiceInfo() 
        getP_ser_field().gen (new backServiceInfo());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                itsFieldUnit.__setItsFieldService(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsFieldService(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_ser_field = newP_ser_field();
        if(getP_ser_field() != null)
           getP_ser_field().connectFieldService(this);
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
                case receivedService:
                {
                    receivedService_add(animStates);
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
                case receivedService:
                {
                    res = receivedService_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void receivedService_add(AnimStates animStates) {
            animStates.add("ROOT.receivedService");
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
        public int receivedServiceTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == FieldService_Timeout_receivedService_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    receivedService_exit();
                    Idle_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void receivedService_entDef() {
            receivedService_enter();
        }
        
        //## statechart_method 
        public int IdleTakeofferService() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            sendbackServiceInfo();
            //#]
            receivedService_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receivedServiceEnter() {
            itsRiJThread.schedTimeout(5, FieldService_Timeout_receivedService_id, this, "ROOT.receivedService");
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(offerService.offerService_sysSCADA_id))
                {
                    res = IdleTakeofferService();
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
        public void receivedService_exit() {
            receivedServiceExit();
            animInstance().notifyStateExited("ROOT.receivedService");
        }
        
        //## statechart_method 
        public void receivedServiceExit() {
            itsRiJThread.unschedTimeout(FieldService_Timeout_receivedService_id, this);
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
        public void receivedService_enter() {
            animInstance().notifyStateEntered("ROOT.receivedService");
            rootState_subState = receivedService;
            rootState_active = receivedService;
            receivedServiceEnter();
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
        public int receivedService_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = receivedServiceTakeRiJTimeout();
                }
            
            return res;
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
            return FieldService.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_ser_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_ser_field_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectFieldService(FieldService) 
        public void connectFieldService(FieldService part) {
            //#[ operation connectFieldService(FieldService) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFieldService; 
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
        
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(FieldService.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            FieldService.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            FieldService.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/FieldService.java
*********************************************************************/

