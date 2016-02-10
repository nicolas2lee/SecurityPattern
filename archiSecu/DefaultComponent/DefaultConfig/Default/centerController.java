/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: centerController
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/centerController.java
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
// Default/centerController.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class centerController 
public class centerController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscenterController = new AnimClass("Default.centerController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected centerController.p_cen_net_C p_cen_net;		//## ignore 
    
    protected communiNetwork itsCommuniNetwork;		//## link itsCommuniNetwork 
    
    protected dataServer itsDataServer;		//## link itsDataServer 
    
    protected HMI itsHMI;		//## link itsHMI 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
    public static final int Requested=2;
    public static final int Idle=3;
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
    public  centerController(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscenterController.getUserClass(),
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
    public centerController.p_cen_net_C getP_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public centerController.p_cen_net_C get_p_cen_net() {
        return p_cen_net;
    }
    
    //## auto_generated 
    public centerController.p_cen_net_C newP_cen_net() {
        p_cen_net = new centerController.p_cen_net_C();
        return p_cen_net;
    }
    
    //## auto_generated 
    public void deleteP_cen_net() {
        p_cen_net=null;
    }
    
    //## operation sendToLocalByNet() 
    public void sendToLocalByNet() {
        try {
            animInstance().notifyMethodEntered("sendToLocalByNet",
               new ArgData[] {
               });
        
        //#[ operation sendToLocalByNet() 
        getP_cen_net().gen(new recieveFromCenter());
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
                itsCommuniNetwork.__setItsCenterController(null);
            }
        __setItsCommuniNetwork(p_communiNetwork);
    }
    
    //## auto_generated 
    public void setItsCommuniNetwork(communiNetwork p_communiNetwork) {
        if(p_communiNetwork != null)
            {
                p_communiNetwork._setItsCenterController(this);
            }
        _setItsCommuniNetwork(p_communiNetwork);
    }
    
    //## auto_generated 
    public void _clearItsCommuniNetwork() {
        animInstance().notifyRelationCleared("itsCommuniNetwork");
        itsCommuniNetwork = null;
    }
    
    //## auto_generated 
    public dataServer getItsDataServer() {
        return itsDataServer;
    }
    
    //## auto_generated 
    public void __setItsDataServer(dataServer p_dataServer) {
        itsDataServer = p_dataServer;
        if(p_dataServer != null)
            {
                animInstance().notifyRelationAdded("itsDataServer", p_dataServer);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDataServer");
            }
    }
    
    //## auto_generated 
    public void _setItsDataServer(dataServer p_dataServer) {
        if(itsDataServer != null)
            {
                itsDataServer.__setItsCenterController(null);
            }
        __setItsDataServer(p_dataServer);
    }
    
    //## auto_generated 
    public dataServer newItsDataServer() {
        itsDataServer = new dataServer();
        itsDataServer._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsDataServer", itsDataServer);
        return itsDataServer;
    }
    
    //## auto_generated 
    public void deleteItsDataServer() {
        itsDataServer.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsDataServer", itsDataServer);
        itsDataServer=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI() {
        return itsHMI;
    }
    
    //## auto_generated 
    public void __setItsHMI(HMI p_HMI) {
        itsHMI = p_HMI;
        if(p_HMI != null)
            {
                animInstance().notifyRelationAdded("itsHMI", p_HMI);
            }
        else
            {
                animInstance().notifyRelationCleared("itsHMI");
            }
    }
    
    //## auto_generated 
    public void _setItsHMI(HMI p_HMI) {
        if(itsHMI != null)
            {
                itsHMI.__setItsCenterController(null);
            }
        __setItsHMI(p_HMI);
    }
    
    //## auto_generated 
    public HMI newItsHMI() {
        itsHMI = new HMI();
        itsHMI._setItsCenterController(this);
        animInstance().notifyRelationAdded("itsHMI", itsHMI);
        return itsHMI;
    }
    
    //## auto_generated 
    public void deleteItsHMI() {
        itsHMI.__setItsCenterController(null);
        animInstance().notifyRelationRemoved("itsHMI", itsHMI);
        itsHMI=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_cen_net = newP_cen_net();
        itsDataServer = newItsDataServer();
        itsHMI = newItsHMI();
        if(getP_cen_net() != null)
           getP_cen_net().connectCenterController(this);
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
                case Requested:
                {
                    Requested_add(animStates);
                }
                break;
                case sentToLocal:
                {
                    sentToLocal_add(animStates);
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
                case Requested:
                {
                    res = Requested_takeEvent(id);
                }
                break;
                case sentToLocal:
                {
                    res = sentToLocal_takeEvent(id);
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
        public void Requested_add(AnimStates animStates) {
            animStates.add("ROOT.Requested");
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
        public void Requested_entDef() {
            Requested_enter();
        }
        
        //## statechart_method 
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestToCenter.requestToCenter_Default_id))
                {
                    res = IdleTakerequestToCenter();
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
        public int RequestedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Requested_exit();
            //#[ transition 3 
            sendToLocalByNet();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int sentToLocalTakesendToUser() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            sentToLocal_exit();
            Idle_entDef();
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
        public void RequestedExit() {
        }
        
        //## statechart_method 
        public int IdleTakerequestToCenter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            Requested_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void RequestedEnter() {
        }
        
        //## statechart_method 
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public int Requested_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = RequestedTakeNull();
                }
            
            return res;
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
        public void Requested_exit() {
            popNullConfig();
            RequestedExit();
            animInstance().notifyStateExited("ROOT.Requested");
        }
        
        //## statechart_method 
        public void Requested_enter() {
            animInstance().notifyStateEntered("ROOT.Requested");
            pushNullConfig();
            rootState_subState = Requested;
            rootState_active = Requested;
            RequestedEnter();
        }
        
        //## statechart_method 
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendToUser.sendToUser_Default_id))
                {
                    res = sentToLocalTakesendToUser();
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
            return centerController.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_net_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCenterController(centerController) 
        public void connectCenterController(centerController part) {
            //#[ operation connectCenterController(centerController) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscenterController; 
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
        
        msg.add("itsHMI", true, true, itsHMI);
        msg.add("itsDataServer", true, true, itsDataServer);
        msg.add("itsCommuniNetwork", false, true, itsCommuniNetwork);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(centerController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            centerController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            centerController.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/centerController.java
*********************************************************************/

