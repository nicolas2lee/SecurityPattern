/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: HMI
//!	Generated Date	: Wed, 17, Feb 2016 
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
    
    protected HMI.p_HMI_net_C p_HMI_net;		//## ignore 
    
    protected HMI.p_HMI_backcen_C p_HMI_backcen;		//## ignore 
    
    protected HMI.p_HMI_single_C p_HMI_single;		//## ignore 
    
    protected HMI.p_HMI_usr_C p_HMI_usr;		//## ignore 
    
    protected HMI.p_HMI_backSingle_C p_HMI_backSingle;		//## ignore 
    
    protected HMI.p_backcen_net_C p_backcen_net;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToField=1;
    public static final int requestedDataServer=2;
    public static final int receivedFromUsr=3;
    public static final int receivedFromDataServer=4;
    public static final int Idle=5;
    public static final int AccessSucessed=6;
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
    
    //## auto_generated 
    public HMI.p_HMI_backcen_C getP_HMI_backcen() {
        return p_HMI_backcen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_backcen_C get_p_HMI_backcen() {
        return p_HMI_backcen;
    }
    
    //## auto_generated 
    public HMI.p_HMI_backcen_C newP_HMI_backcen() {
        p_HMI_backcen = new HMI.p_HMI_backcen_C();
        return p_HMI_backcen;
    }
    
    //## auto_generated 
    public void deleteP_HMI_backcen() {
        p_HMI_backcen=null;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C getP_HMI_single() {
        return p_HMI_single;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C get_p_HMI_single() {
        return p_HMI_single;
    }
    
    //## auto_generated 
    public HMI.p_HMI_single_C newP_HMI_single() {
        p_HMI_single = new HMI.p_HMI_single_C();
        return p_HMI_single;
    }
    
    //## auto_generated 
    public void deleteP_HMI_single() {
        p_HMI_single=null;
    }
    
    //## auto_generated 
    public HMI.p_HMI_usr_C getP_HMI_usr() {
        return p_HMI_usr;
    }
    
    //## auto_generated 
    public HMI.p_HMI_usr_C get_p_HMI_usr() {
        return p_HMI_usr;
    }
    
    //## auto_generated 
    public HMI.p_HMI_usr_C newP_HMI_usr() {
        p_HMI_usr = new HMI.p_HMI_usr_C();
        return p_HMI_usr;
    }
    
    //## auto_generated 
    public void deleteP_HMI_usr() {
        p_HMI_usr=null;
    }
    
    //## auto_generated 
    public HMI.p_HMI_backSingle_C getP_HMI_backSingle() {
        return p_HMI_backSingle;
    }
    
    //## auto_generated 
    public HMI.p_HMI_backSingle_C get_p_HMI_backSingle() {
        return p_HMI_backSingle;
    }
    
    //## auto_generated 
    public HMI.p_HMI_backSingle_C newP_HMI_backSingle() {
        p_HMI_backSingle = new HMI.p_HMI_backSingle_C();
        return p_HMI_backSingle;
    }
    
    //## auto_generated 
    public void deleteP_HMI_backSingle() {
        p_HMI_backSingle=null;
    }
    
    //## auto_generated 
    public HMI.p_backcen_net_C getP_backcen_net() {
        return p_backcen_net;
    }
    
    //## auto_generated 
    public HMI.p_backcen_net_C get_p_backcen_net() {
        return p_backcen_net;
    }
    
    //## auto_generated 
    public HMI.p_backcen_net_C newP_backcen_net() {
        p_backcen_net = new HMI.p_backcen_net_C();
        return p_backcen_net;
    }
    
    //## auto_generated 
    public void deleteP_backcen_net() {
        p_backcen_net=null;
    }
    
    //## operation queryDataServer() 
    public void queryDataServer() {
        try {
            animInstance().notifyMethodEntered("queryDataServer",
               new ArgData[] {
               });
        
        //#[ operation queryDataServer() 
        getP_HMI_dat().gen(new tiggerData());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToCenter() 
    public void sendToCenter() {
        try {
            animInstance().notifyMethodEntered("sendToCenter",
               new ArgData[] {
               });
        
        //#[ operation sendToCenter() 
        getP_HMI_backcen().gen(new receiveBackInfo());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToFieldByNet() 
    public void sendToFieldByNet() {
        try {
            animInstance().notifyMethodEntered("sendToFieldByNet",
               new ArgData[] {
               });
        
        //#[ operation sendToFieldByNet() 
        getP_HMI_net().gen(new recieveFromCenterByNet());
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
        p_HMI_net = newP_HMI_net();
        p_HMI_backcen = newP_HMI_backcen();
        p_HMI_single = newP_HMI_single();
        p_HMI_usr = newP_HMI_usr();
        p_HMI_backSingle = newP_HMI_backSingle();
        p_backcen_net = newP_backcen_net();
        if(getP_HMI_net() != null)
           getP_HMI_net().connectHMI(this);
        if(getP_HMI_backcen() != null)
           getP_HMI_backcen().connectHMI(this);
        if(getP_HMI_single() != null)
           getP_HMI_single().connectHMI(this);
        if(getP_HMI_usr() != null)
           getP_HMI_usr().connectHMI(this);
        if(getP_HMI_backSingle() != null)
           getP_HMI_backSingle().connectHMI(this);
        if(getP_backcen_net() != null)
           getP_backcen_net().connectHMI(this);
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
                case receivedFromUsr:
                {
                    receivedFromUsr_add(animStates);
                }
                break;
                case requestedDataServer:
                {
                    requestedDataServer_add(animStates);
                }
                break;
                case receivedFromDataServer:
                {
                    receivedFromDataServer_add(animStates);
                }
                break;
                case sentToField:
                {
                    sentToField_add(animStates);
                }
                break;
                case AccessSucessed:
                {
                    AccessSucessed_add(animStates);
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
                case receivedFromUsr:
                {
                    res = receivedFromUsr_takeEvent(id);
                }
                break;
                case requestedDataServer:
                {
                    res = requestedDataServer_takeEvent(id);
                }
                break;
                case receivedFromDataServer:
                {
                    res = receivedFromDataServer_takeEvent(id);
                }
                break;
                case sentToField:
                {
                    res = sentToField_takeEvent(id);
                }
                break;
                case AccessSucessed:
                {
                    res = AccessSucessed_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void sentToField_add(AnimStates animStates) {
            animStates.add("ROOT.sentToField");
        }
        
        //## statechart_method 
        public void requestedDataServer_add(AnimStates animStates) {
            animStates.add("ROOT.requestedDataServer");
        }
        
        //## statechart_method 
        public void receivedFromUsr_add(AnimStates animStates) {
            animStates.add("ROOT.receivedFromUsr");
        }
        
        //## statechart_method 
        public void receivedFromDataServer_add(AnimStates animStates) {
            animStates.add("ROOT.receivedFromDataServer");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void AccessSucessed_add(AnimStates animStates) {
            animStates.add("ROOT.AccessSucessed");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void AccessSucessed_enter() {
            animInstance().notifyStateEntered("ROOT.AccessSucessed");
            rootState_subState = AccessSucessed;
            rootState_active = AccessSucessed;
            AccessSucessedEnter();
        }
        
        //## statechart_method 
        public void receivedFromUsrEnter() {
        }
        
        //## statechart_method 
        public void sentToField_entDef() {
            sentToField_enter();
        }
        
        //## statechart_method 
        public void AccessSucessedExit() {
        }
        
        //## statechart_method 
        public void AccessSucessed_entDef() {
            AccessSucessed_enter();
        }
        
        //## statechart_method 
        public int receivedFromDataServer_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendToLocal.sendToLocal_sysSCADA_id))
                {
                    res = receivedFromDataServerTakesendToLocal();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int receivedFromDataServerTakesendToLocal() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            receivedFromDataServer_exit();
            //#[ transition 4 
            sendToFieldByNet();
            //#]
            sentToField_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedDataServer_enter() {
            animInstance().notifyStateEntered("ROOT.requestedDataServer");
            rootState_subState = requestedDataServer;
            rootState_active = requestedDataServer;
            requestedDataServerEnter();
        }
        
        //## statechart_method 
        public void sentToField_exit() {
            sentToFieldExit();
            animInstance().notifyStateExited("ROOT.sentToField");
        }
        
        //## statechart_method 
        public void receivedFromUsr_exit() {
            receivedFromUsrExit();
            animInstance().notifyStateExited("ROOT.receivedFromUsr");
        }
        
        //## statechart_method 
        public void requestedDataServerExit() {
        }
        
        //## statechart_method 
        public void requestedDataServerEnter() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestFromUsr.requestFromUsr_sysSCADA_id))
                {
                    res = IdleTakerequestFromUsr();
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
        public void receivedFromDataServerExit() {
        }
        
        //## statechart_method 
        public void receivedFromDataServerEnter() {
        }
        
        //## statechart_method 
        public int receivedFromUsrTakecheckSuccess() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            receivedFromUsr_exit();
            AccessSucessed_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void requestedDataServer_exit() {
            requestedDataServerExit();
            animInstance().notifyStateExited("ROOT.requestedDataServer");
        }
        
        //## statechart_method 
        public int sentToFieldTakebackServiceInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            sentToField_exit();
            //#[ transition 5 
            sendToCenter();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToField_enter() {
            animInstance().notifyStateEntered("ROOT.sentToField");
            rootState_subState = sentToField;
            rootState_active = sentToField;
            sentToFieldEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int AccessSucessedTakequeryData() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            AccessSucessed_exit();
            //#[ transition 2 
            queryDataServer();
            //#]
            requestedDataServer_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public void receivedFromDataServer_exit() {
            receivedFromDataServerExit();
            animInstance().notifyStateExited("ROOT.receivedFromDataServer");
        }
        
        //## statechart_method 
        public void receivedFromUsr_entDef() {
            receivedFromUsr_enter();
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
        public void AccessSucessedEnter() {
        }
        
        //## statechart_method 
        public void receivedFromDataServer_entDef() {
            receivedFromDataServer_enter();
        }
        
        //## statechart_method 
        public int AccessSucessed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(queryData.queryData_sysSCADA_id))
                {
                    res = AccessSucessedTakequeryData();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void receivedFromUsr_enter() {
            animInstance().notifyStateEntered("ROOT.receivedFromUsr");
            rootState_subState = receivedFromUsr;
            rootState_active = receivedFromUsr;
            receivedFromUsrEnter();
        }
        
        //## statechart_method 
        public int requestedDataServer_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(selectedData.selectedData_sysSCADA_id))
                {
                    res = requestedDataServerTakeselectedData();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToFieldExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void AccessSucessed_exit() {
            AccessSucessedExit();
            animInstance().notifyStateExited("ROOT.AccessSucessed");
        }
        
        //## statechart_method 
        public void requestedDataServer_entDef() {
            requestedDataServer_enter();
        }
        
        //## statechart_method 
        public int IdleTakerequestFromUsr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            receivedFromUsr_entDef();
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
        public int receivedFromUsr_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(checkSuccess.checkSuccess_sysSCADA_id))
                {
                    res = receivedFromUsrTakecheckSuccess();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void receivedFromUsrExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void receivedFromDataServer_enter() {
            animInstance().notifyStateEntered("ROOT.receivedFromDataServer");
            rootState_subState = receivedFromDataServer;
            rootState_active = receivedFromDataServer;
            receivedFromDataServerEnter();
        }
        
        //## statechart_method 
        public int requestedDataServerTakeselectedData() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            requestedDataServer_exit();
            receivedFromDataServer_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToField_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backServiceInfo.backServiceInfo_sysSCADA_id))
                {
                    res = sentToFieldTakebackServiceInfo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void sentToFieldEnter() {
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
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_HMI_backcen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_backcen_C() {
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
    public class p_HMI_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_single_C() {
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
    public class p_HMI_usr_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_usr_C() {
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
    public class p_HMI_backSingle_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_HMI_backSingle_C() {
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
    public class p_backcen_net_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_backcen_net_C() {
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

