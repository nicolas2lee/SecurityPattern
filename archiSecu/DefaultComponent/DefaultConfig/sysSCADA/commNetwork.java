/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: commNetwork
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/commNetwork.java
*********************************************************************/

package sysSCADA;

//## classInstance itsRights 
import securityPattern.Rights;
//## classInstance itsCheckPoint 
import securityPattern.checkPoint;
//## classInstance itsSecurityPolicy 
import securityPattern.SecurityPolicy;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## classInstance itsSingleAccessPoint 
import securityPattern.SingleAccessPoint;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/commNetwork.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class commNetwork 
public class commNetwork implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscommNetwork = new AnimClass("sysSCADA.commNetwork",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected commNetwork.p_net_cen_C p_net_cen;		//## ignore 
    
    protected commNetwork.p_net_field_C p_net_field;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
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
    public  commNetwork(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClasscommNetwork.getUserClass(),
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
    public commNetwork.p_net_cen_C getP_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_cen_C get_p_net_cen() {
        return p_net_cen;
    }
    
    //## auto_generated 
    public commNetwork.p_net_cen_C newP_net_cen() {
        p_net_cen = new commNetwork.p_net_cen_C();
        return p_net_cen;
    }
    
    //## auto_generated 
    public void deleteP_net_cen() {
        p_net_cen=null;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C getP_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C get_p_net_field() {
        return p_net_field;
    }
    
    //## auto_generated 
    public commNetwork.p_net_field_C newP_net_field() {
        p_net_field = new commNetwork.p_net_field_C();
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
                itsCenterController.__setItsCommNetwork(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsCommNetwork(this);
            }
        _setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint() {
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public checkPoint newItsCheckPoint(RiJThread p_thread) {
        itsCheckPoint = new checkPoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckPoint", itsCheckPoint);
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public void deleteItsCheckPoint() {
        animInstance().notifyRelationRemoved("itsCheckPoint", itsCheckPoint);
        itsCheckPoint=null;
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
                itsFieldUnit.__setItsCommNetwork(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsCommNetwork(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
    }
    
    //## auto_generated 
    public Rights getItsRights() {
        return itsRights;
    }
    
    //## auto_generated 
    public Rights newItsRights(RiJThread p_thread) {
        itsRights = new Rights(p_thread);
        animInstance().notifyRelationAdded("itsRights", itsRights);
        return itsRights;
    }
    
    //## auto_generated 
    public void deleteItsRights() {
        animInstance().notifyRelationRemoved("itsRights", itsRights);
        itsRights=null;
    }
    
    //## auto_generated 
    public SecurityPolicy getItsSecurityPolicy() {
        return itsSecurityPolicy;
    }
    
    //## auto_generated 
    public SecurityPolicy newItsSecurityPolicy(RiJThread p_thread) {
        itsSecurityPolicy = new SecurityPolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecurityPolicy", itsSecurityPolicy);
        return itsSecurityPolicy;
    }
    
    //## auto_generated 
    public void deleteItsSecurityPolicy() {
        animInstance().notifyRelationRemoved("itsSecurityPolicy", itsSecurityPolicy);
        itsSecurityPolicy=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint(RiJThread p_thread) {
        itsSingleAccessPoint = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint", itsSingleAccessPoint);
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint", itsSingleAccessPoint);
        itsSingleAccessPoint=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_net_cen = newP_net_cen();
        p_net_field = newP_net_field();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsRights = newItsRights(p_thread);
        itsSecurityPolicy = newItsSecurityPolicy(p_thread);
        itsSingleAccessPoint = newItsSingleAccessPoint(p_thread);
        {
            
            itsSingleAccessPoint.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_net_cen().setItsDefaultProvidedInterface(itsSingleAccessPoint.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_user().setItsDefaultRequiredInterface(getP_net_cen().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_net_field().setItsDefaultProvidedInterface(itsCheckPoint.getP_check_protected().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_protected().setItsDefaultRequiredInterface(getP_net_field().getItsDefaultRequiredInterface());
            
        }
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
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
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(recieveFromCenter.recieveFromCenter_sysSCADA_id))
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
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public int IdleTakerecieveFromCenter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            sendToField();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(backServiceInfo.backServiceInfo_sysSCADA_id))
                {
                    res = sentToLocalTakebackServiceInfo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int sentToLocalTakebackServiceInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            sentToLocal_exit();
            //#[ transition 2 
            sendLocalToCenter();
            //#]
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
            return commNetwork.this.animInstance(); 
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
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClasscommNetwork; 
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
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(commNetwork.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            commNetwork.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            commNetwork.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/commNetwork.java
*********************************************************************/

