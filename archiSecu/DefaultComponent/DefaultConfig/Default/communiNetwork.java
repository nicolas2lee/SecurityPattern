/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: communiNetwork
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/communiNetwork.java
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
// Default/communiNetwork.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class communiNetwork 
public class communiNetwork implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscommuniNetwork = new AnimClass("Default.communiNetwork",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected communiNetwork.p_net_cen_C p_net_cen;		//## ignore 
    
    protected communiNetwork.p_net_field_C p_net_field;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
    public static final int sentToCenter=2;
    public static final int recievedFromCenter=3;
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
    public  communiNetwork(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscommuniNetwork.getUserClass(),
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
    public communiNetwork.p_net_cen_C getP_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public communiNetwork.p_net_cen_C get_p_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public communiNetwork.p_net_cen_C newP_net_cen() {
        p_net_cen = new communiNetwork.p_net_cen_C();
        return p_net_cen;
    }
    
    //## auto_generated 
    public void deleteP_net_cen() {
        p_net_cen=null;
    }
    
    //## auto_generated 
    public communiNetwork.p_net_field_C getP_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public communiNetwork.p_net_field_C get_p_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public communiNetwork.p_net_field_C newP_net_field() {
        p_net_field = new communiNetwork.p_net_field_C();
        return p_net_field;
    }
    
    //## auto_generated 
    public void deleteP_net_field() {
        p_net_field=null;
    }
    
    //## operation sendLocalToCenter() 
    public void sendLocalToCenter() {
        try {
            animInstance().notifyMethodEntered("sendLocalToCenter",
               new ArgData[] {
               });
        
        //#[ operation sendLocalToCenter() 
        getP_net_cen().gen(new sendToUser());
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
                itsCenterController.__setItsCommuniNetwork(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsCommuniNetwork(this);
            }
        _setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
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
                itsFieldUnit.__setItsCommuniNetwork(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsCommuniNetwork(this);
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
        p_net_cen = newP_net_cen();
        p_net_field = newP_net_field();
        if(getP_net_cen() != null)
           getP_net_cen().connectCommuniNetwork(this);
        if(getP_net_field() != null)
           getP_net_field().connectCommuniNetwork(this);
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
                case sentToLocal:
                {
                    sentToLocal_add(animStates);
                }
                break;
                case recievedFromCenter:
                {
                    recievedFromCenter_add(animStates);
                }
                break;
                case sentToCenter:
                {
                    sentToCenter_add(animStates);
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
                case recievedFromCenter:
                {
                    res = recievedFromCenter_takeEvent(id);
                }
                break;
                case sentToCenter:
                {
                    res = sentToCenter_takeEvent(id);
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
        public void sentToCenter_add(AnimStates animStates) {
            animStates.add("ROOT.sentToCenter");
        }
        
        //## statechart_method 
        public void recievedFromCenter_add(AnimStates animStates) {
            animStates.add("ROOT.recievedFromCenter");
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
        public void sentToLocal_exit() {
            sentToLocalExit();
            animInstance().notifyStateExited("ROOT.sentToLocal");
        }
        
        //## statechart_method 
        public int sentToLocalTakesendToCenter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            sentToLocal_exit();
            //#[ transition 3 
            sendLocalToCenter();
            //#]
            sentToCenter_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToCenterEnter() {
        }
        
        //## statechart_method 
        public void recievedFromCenterExit() {
        }
        
        //## statechart_method 
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveFromCenter.recieveFromCenter_Default_id))
                {
                    res = IdleTakerecieveFromCenter();
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
        public int sentToCenterTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            sentToCenter_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToCenter_enter() {
            animInstance().notifyStateEntered("ROOT.sentToCenter");
            pushNullConfig();
            rootState_subState = sentToCenter;
            rootState_active = sentToCenter;
            sentToCenterEnter();
        }
        
        //## statechart_method 
        public void recievedFromCenter_enter() {
            animInstance().notifyStateEntered("ROOT.recievedFromCenter");
            pushNullConfig();
            rootState_subState = recievedFromCenter;
            rootState_active = recievedFromCenter;
            recievedFromCenterEnter();
        }
        
        //## statechart_method 
        public void sentToCenter_exit() {
            popNullConfig();
            sentToCenterExit();
            animInstance().notifyStateExited("ROOT.sentToCenter");
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
            popNullConfig();
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
        public void sentToCenterExit() {
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int recievedFromCenter_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = recievedFromCenterTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public int IdleTakerecieveFromCenter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Idle_exit();
            recievedFromCenter_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int recievedFromCenterTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            recievedFromCenter_exit();
            //#[ transition 1 
            sendToField();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToCenter_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sentToCenterTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendToCenter.sendToCenter_Default_id))
                {
                    res = sentToLocalTakesendToCenter();
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
        public void sentToCenter_entDef() {
            sentToCenter_enter();
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
            return communiNetwork.this.animInstance(); 
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
        
        /**
         * @param part
        */
        //## operation connectCommuniNetwork(communiNetwork) 
        public void connectCommuniNetwork(communiNetwork part) {
            //#[ operation connectCommuniNetwork(communiNetwork) 
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
    public class p_net_field_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_net_field_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCommuniNetwork(communiNetwork) 
        public void connectCommuniNetwork(communiNetwork part) {
            //#[ operation connectCommuniNetwork(communiNetwork) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscommuniNetwork; 
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
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(communiNetwork.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            communiNetwork.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            communiNetwork.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/communiNetwork.java
*********************************************************************/

