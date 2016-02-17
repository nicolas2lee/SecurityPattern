/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: centerController
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/centerController.java
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
// sysSCADA/centerController.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


//## class centerController 
public class centerController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClasscenterController = new AnimClass("sysSCADA.centerController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected centerController.p_cen_net_C p_cen_net;		//## ignore 
    
    protected centerController.p_cen_HMI_C p_cen_HMI;		//## ignore 
    
    protected centerController.p_cen_data_C p_cen_data;		//## ignore 
    
    protected centerController.p_cen_user_C p_cen_user;		//## ignore 
    
    protected centerController.p_cen_backnet_C p_cen_backnet;		//## ignore 
    
    protected centerController.p_cen_backusr_C p_cen_backusr;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    protected checkPoint itsCheckPoint_0;		//## classInstance itsCheckPoint_0 
    
    protected checkPoint itsCheckPoint_1;		//## classInstance itsCheckPoint_1 
    
    protected commNetwork itsCommNetwork;		//## link itsCommNetwork 
    
    protected dataServer itsDataServer;		//## link itsDataServer 
    
    protected dataServer itsDataServer_0;		//## classInstance itsDataServer_0 
    
    protected dataServer itsDataServer_1;		//## classInstance itsDataServer_1 
    
    protected HMI itsHMI;		//## link itsHMI 
    
    protected HMI itsHMI_0;		//## classInstance itsHMI_0 
    
    protected HMI itsHMI_2;		//## classInstance itsHMI_2 
    
    protected Rights itsRights;		//## classInstance itsRights 
    
    protected Rights itsRights_0;		//## classInstance itsRights_0 
    
    protected SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    protected SecurityPolicy itsSecurityPolicy_0;		//## classInstance itsSecurityPolicy_0 
    
    protected SecurityPolicy itsSecurityPolicy_1;		//## classInstance itsSecurityPolicy_1 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    protected SingleAccessPoint itsSingleAccessPoint_1_0;		//## classInstance itsSingleAccessPoint_1_0 
    
    protected user itsUser;		//## link itsUser 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int sentToLocal=1;
    public static final int requestedHMI=2;
    public static final int Idle=3;
    public static final int ernteredCenterSingleAccess=4;
    public static final int checkedPointCenter=5;
    public static final int checkedCenterSecurityPolicy=6;
    public static final int checkedCenterRights=7;
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
    
    //## auto_generated 
    public centerController.p_cen_HMI_C getP_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public centerController.p_cen_HMI_C get_p_cen_HMI() {
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public centerController.p_cen_HMI_C newP_cen_HMI() {
        p_cen_HMI = new centerController.p_cen_HMI_C();
        return p_cen_HMI;
    }
    
    //## auto_generated 
    public void deleteP_cen_HMI() {
        p_cen_HMI=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C getP_cen_data() {
        return p_cen_data;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C get_p_cen_data() {
        return p_cen_data;
    }
    
    //## auto_generated 
    public centerController.p_cen_data_C newP_cen_data() {
        p_cen_data = new centerController.p_cen_data_C();
        return p_cen_data;
    }
    
    //## auto_generated 
    public void deleteP_cen_data() {
        p_cen_data=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C getP_cen_user() {
        return p_cen_user;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C get_p_cen_user() {
        return p_cen_user;
    }
    
    //## auto_generated 
    public centerController.p_cen_user_C newP_cen_user() {
        p_cen_user = new centerController.p_cen_user_C();
        return p_cen_user;
    }
    
    //## auto_generated 
    public void deleteP_cen_user() {
        p_cen_user=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_backnet_C getP_cen_backnet() {
        return p_cen_backnet;
    }
    
    //## auto_generated 
    public centerController.p_cen_backnet_C get_p_cen_backnet() {
        return p_cen_backnet;
    }
    
    //## auto_generated 
    public centerController.p_cen_backnet_C newP_cen_backnet() {
        p_cen_backnet = new centerController.p_cen_backnet_C();
        return p_cen_backnet;
    }
    
    //## auto_generated 
    public void deleteP_cen_backnet() {
        p_cen_backnet=null;
    }
    
    //## auto_generated 
    public centerController.p_cen_backusr_C getP_cen_backusr() {
        return p_cen_backusr;
    }
    
    //## auto_generated 
    public centerController.p_cen_backusr_C get_p_cen_backusr() {
        return p_cen_backusr;
    }
    
    //## auto_generated 
    public centerController.p_cen_backusr_C newP_cen_backusr() {
        p_cen_backusr = new centerController.p_cen_backusr_C();
        return p_cen_backusr;
    }
    
    //## auto_generated 
    public void deleteP_cen_backusr() {
        p_cen_backusr=null;
    }
    
    //## operation Operation_16() 
    public void Operation_16() {
        try {
            animInstance().notifyMethodEntered("Operation_16",
               new ArgData[] {
               });
        
        //#[ operation Operation_16() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param p
    */
    //## operation checkPoint(String) 
    public void checkPoint(final String p) {
        try {
            animInstance().notifyMethodEntered("checkPoint",
               new ArgData[] {
                   new ArgData(String.class, "p", AnimInstance.animToString(p))
               });
        
        //#[ operation checkPoint(String) 
        gen(new tocheckPolicy(p));
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param cP
    */
    //## operation checkPolicy(String) 
    public void checkPolicy(final String cP) {
        try {
            animInstance().notifyMethodEntered("checkPolicy",
               new ArgData[] {
                   new ArgData(String.class, "cP", AnimInstance.animToString(cP))
               });
        
        //#[ operation checkPolicy(String) 
        if(cP == "Admin"){
        	gen();
        }else    
        if(cP == "CC Owner"){
        
        }  
        
        else   
        if(cP == "LC Owner"){
        
        }else
        {
        
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param role
    */
    //## operation checkRole(String) 
    public void checkRole(final String role) {
        try {
            animInstance().notifyMethodEntered("checkRole",
               new ArgData[] {
                   new ArgData(String.class, "role", AnimInstance.animToString(role))
               });
        
        //#[ operation checkRole(String) 
        getP_HMI_single().gen(new toCheckPoint(role));
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation handleHMI() 
    public void handleHMI() {
        try {
            animInstance().notifyMethodEntered("handleHMI",
               new ArgData[] {
               });
        
        //#[ operation handleHMI() 
        System.out.println("center handle with HMI");
        getP_check_protected().gen(new requestFromUsr());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation requestData() 
    public void requestData() {
        try {
            animInstance().notifyMethodEntered("requestData",
               new ArgData[] {
               });
        
        //#[ operation requestData() 
        System.out.println("center requests data to DataServer");              
        getP_cen_data().gen(new triggerData());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
    public checkPoint getItsCheckPoint_0() {
        return itsCheckPoint_0;
    }
    
    //## auto_generated 
    public checkPoint newItsCheckPoint_0(RiJThread p_thread) {
        itsCheckPoint_0 = new checkPoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckPoint_0", itsCheckPoint_0);
        return itsCheckPoint_0;
    }
    
    //## auto_generated 
    public void deleteItsCheckPoint_0() {
        animInstance().notifyRelationRemoved("itsCheckPoint_0", itsCheckPoint_0);
        itsCheckPoint_0=null;
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint_1() {
        return itsCheckPoint_1;
    }
    
    //## auto_generated 
    public checkPoint newItsCheckPoint_1(RiJThread p_thread) {
        itsCheckPoint_1 = new checkPoint(p_thread);
        animInstance().notifyRelationAdded("itsCheckPoint_1", itsCheckPoint_1);
        return itsCheckPoint_1;
    }
    
    //## auto_generated 
    public void deleteItsCheckPoint_1() {
        animInstance().notifyRelationRemoved("itsCheckPoint_1", itsCheckPoint_1);
        itsCheckPoint_1=null;
    }
    
    //## auto_generated 
    public commNetwork getItsCommNetwork() {
        return itsCommNetwork;
    }
    
    //## auto_generated 
    public void __setItsCommNetwork(commNetwork p_commNetwork) {
        itsCommNetwork = p_commNetwork;
        if(p_commNetwork != null)
            {
                animInstance().notifyRelationAdded("itsCommNetwork", p_commNetwork);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCommNetwork");
            }
    }
    
    //## auto_generated 
    public void _setItsCommNetwork(commNetwork p_commNetwork) {
        if(itsCommNetwork != null)
            {
                itsCommNetwork.__setItsCenterController(null);
            }
        __setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void setItsCommNetwork(commNetwork p_commNetwork) {
        if(p_commNetwork != null)
            {
                p_commNetwork._setItsCenterController(this);
            }
        _setItsCommNetwork(p_commNetwork);
    }
    
    //## auto_generated 
    public void _clearItsCommNetwork() {
        animInstance().notifyRelationCleared("itsCommNetwork");
        itsCommNetwork = null;
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
    public dataServer newItsDataServer(RiJThread p_thread) {
        itsDataServer = new dataServer(p_thread);
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
    public dataServer getItsDataServer_0() {
        return itsDataServer_0;
    }
    
    //## auto_generated 
    public dataServer newItsDataServer_0(RiJThread p_thread) {
        itsDataServer_0 = new dataServer(p_thread);
        animInstance().notifyRelationAdded("itsDataServer_0", itsDataServer_0);
        return itsDataServer_0;
    }
    
    //## auto_generated 
    public void deleteItsDataServer_0() {
        animInstance().notifyRelationRemoved("itsDataServer_0", itsDataServer_0);
        itsDataServer_0=null;
    }
    
    //## auto_generated 
    public dataServer getItsDataServer_1() {
        return itsDataServer_1;
    }
    
    //## auto_generated 
    public dataServer newItsDataServer_1(RiJThread p_thread) {
        itsDataServer_1 = new dataServer(p_thread);
        animInstance().notifyRelationAdded("itsDataServer_1", itsDataServer_1);
        return itsDataServer_1;
    }
    
    //## auto_generated 
    public void deleteItsDataServer_1() {
        animInstance().notifyRelationRemoved("itsDataServer_1", itsDataServer_1);
        itsDataServer_1=null;
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
    public HMI newItsHMI(RiJThread p_thread) {
        itsHMI = new HMI(p_thread);
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
    public HMI getItsHMI_0() {
        return itsHMI_0;
    }
    
    //## auto_generated 
    public HMI newItsHMI_0(RiJThread p_thread) {
        itsHMI_0 = new HMI(p_thread);
        animInstance().notifyRelationAdded("itsHMI_0", itsHMI_0);
        return itsHMI_0;
    }
    
    //## auto_generated 
    public void deleteItsHMI_0() {
        animInstance().notifyRelationRemoved("itsHMI_0", itsHMI_0);
        itsHMI_0=null;
    }
    
    //## auto_generated 
    public HMI getItsHMI_2() {
        return itsHMI_2;
    }
    
    //## auto_generated 
    public HMI newItsHMI_2(RiJThread p_thread) {
        itsHMI_2 = new HMI(p_thread);
        animInstance().notifyRelationAdded("itsHMI_2", itsHMI_2);
        return itsHMI_2;
    }
    
    //## auto_generated 
    public void deleteItsHMI_2() {
        animInstance().notifyRelationRemoved("itsHMI_2", itsHMI_2);
        itsHMI_2=null;
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
    public Rights getItsRights_0() {
        return itsRights_0;
    }
    
    //## auto_generated 
    public Rights newItsRights_0(RiJThread p_thread) {
        itsRights_0 = new Rights(p_thread);
        animInstance().notifyRelationAdded("itsRights_0", itsRights_0);
        return itsRights_0;
    }
    
    //## auto_generated 
    public void deleteItsRights_0() {
        animInstance().notifyRelationRemoved("itsRights_0", itsRights_0);
        itsRights_0=null;
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
    public SecurityPolicy getItsSecurityPolicy_0() {
        return itsSecurityPolicy_0;
    }
    
    //## auto_generated 
    public SecurityPolicy newItsSecurityPolicy_0(RiJThread p_thread) {
        itsSecurityPolicy_0 = new SecurityPolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecurityPolicy_0", itsSecurityPolicy_0);
        return itsSecurityPolicy_0;
    }
    
    //## auto_generated 
    public void deleteItsSecurityPolicy_0() {
        animInstance().notifyRelationRemoved("itsSecurityPolicy_0", itsSecurityPolicy_0);
        itsSecurityPolicy_0=null;
    }
    
    //## auto_generated 
    public SecurityPolicy getItsSecurityPolicy_1() {
        return itsSecurityPolicy_1;
    }
    
    //## auto_generated 
    public SecurityPolicy newItsSecurityPolicy_1(RiJThread p_thread) {
        itsSecurityPolicy_1 = new SecurityPolicy(p_thread);
        animInstance().notifyRelationAdded("itsSecurityPolicy_1", itsSecurityPolicy_1);
        return itsSecurityPolicy_1;
    }
    
    //## auto_generated 
    public void deleteItsSecurityPolicy_1() {
        animInstance().notifyRelationRemoved("itsSecurityPolicy_1", itsSecurityPolicy_1);
        itsSecurityPolicy_1=null;
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
    public SingleAccessPoint getItsSingleAccessPoint_1_0() {
        return itsSingleAccessPoint_1_0;
    }
    
    //## auto_generated 
    public SingleAccessPoint newItsSingleAccessPoint_1_0(RiJThread p_thread) {
        itsSingleAccessPoint_1_0 = new SingleAccessPoint(p_thread);
        animInstance().notifyRelationAdded("itsSingleAccessPoint_1_0", itsSingleAccessPoint_1_0);
        return itsSingleAccessPoint_1_0;
    }
    
    //## auto_generated 
    public void deleteItsSingleAccessPoint_1_0() {
        animInstance().notifyRelationRemoved("itsSingleAccessPoint_1_0", itsSingleAccessPoint_1_0);
        itsSingleAccessPoint_1_0=null;
    }
    
    //## auto_generated 
    public user getItsUser() {
        return itsUser;
    }
    
    //## auto_generated 
    public void __setItsUser(user p_user) {
        itsUser = p_user;
        if(p_user != null)
            {
                animInstance().notifyRelationAdded("itsUser", p_user);
            }
        else
            {
                animInstance().notifyRelationCleared("itsUser");
            }
    }
    
    //## auto_generated 
    public void _setItsUser(user p_user) {
        if(itsUser != null)
            {
                itsUser.__setItsCenterController(null);
            }
        __setItsUser(p_user);
    }
    
    //## auto_generated 
    public void setItsUser(user p_user) {
        if(p_user != null)
            {
                p_user._setItsCenterController(this);
            }
        _setItsUser(p_user);
    }
    
    //## auto_generated 
    public void _clearItsUser() {
        animInstance().notifyRelationCleared("itsUser");
        itsUser = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_cen_net = newP_cen_net();
        p_cen_HMI = newP_cen_HMI();
        p_cen_data = newP_cen_data();
        p_cen_user = newP_cen_user();
        p_cen_backnet = newP_cen_backnet();
        p_cen_backusr = newP_cen_backusr();
        itsCheckPoint = newItsCheckPoint(p_thread);
        itsCheckPoint_0 = newItsCheckPoint_0(p_thread);
        itsCheckPoint_1 = newItsCheckPoint_1(p_thread);
        itsDataServer = newItsDataServer(p_thread);
        itsDataServer_0 = newItsDataServer_0(p_thread);
        itsDataServer_1 = newItsDataServer_1(p_thread);
        itsHMI = newItsHMI(p_thread);
        itsHMI_0 = newItsHMI_0(p_thread);
        itsHMI_2 = newItsHMI_2(p_thread);
        itsRights = newItsRights(p_thread);
        itsRights_0 = newItsRights_0(p_thread);
        itsSecurityPolicy = newItsSecurityPolicy(p_thread);
        itsSecurityPolicy_0 = newItsSecurityPolicy_0(p_thread);
        itsSecurityPolicy_1 = newItsSecurityPolicy_1(p_thread);
        itsSingleAccessPoint = newItsSingleAccessPoint(p_thread);
        itsSingleAccessPoint_1_0 = newItsSingleAccessPoint_1_0(p_thread);
        {
            
            itsSingleAccessPoint_1_0.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_0.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint_1_0.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_right().setItsDefaultRequiredInterface(itsRights_0.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights_0.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_0.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy_0.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy_0.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint_0.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_user().setItsDefaultProvidedInterface(itsSingleAccessPoint_1_0.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint_1_0.getP_single_user().setItsDefaultRequiredInterface(getP_cen_user().getItsDefaultRequiredInterface());
            
        }
        {
            
            getP_cen_net().setItsDefaultProvidedInterface(itsHMI_2.getP_HMI_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_2.getP_HMI_net().setItsDefaultRequiredInterface(getP_cen_net().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsSingleAccessPoint.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_1.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSecurityPolicy_1.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_check_policy().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_1.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy_1.getP_policy_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_1.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_check_right().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_backusr().setItsDefaultProvidedInterface(itsHMI_0.getP_HMI_backcen().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_0.getP_HMI_backcen().setItsDefaultRequiredInterface(getP_cen_backusr().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsCheckPoint_1.getP_check_protected().setItsDefaultRequiredInterface(itsDataServer_0.getP_ser_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsDataServer_0.getP_ser_check().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_check_protected().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_user().setItsDefaultProvidedInterface(itsHMI_0.getP_HMI_usr().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_0.getP_HMI_usr().setItsDefaultRequiredInterface(getP_cen_user().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsHMI_0.getP_HMI_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_user().setItsDefaultRequiredInterface(itsHMI_0.getP_HMI_single().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsDataServer_0.getP_backSer_check().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_check_backSer().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint_1.getP_check_backSer().setItsDefaultRequiredInterface(itsDataServer_0.getP_backSer_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint_1.getP_backCheck_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_backCheck().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_backCheck().setItsDefaultRequiredInterface(itsCheckPoint_1.getP_backCheck_single().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_net().setItsDefaultProvidedInterface(itsHMI_0.getP_HMI_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_0.getP_HMI_net().setItsDefaultRequiredInterface(getP_cen_net().getItsDefaultRequiredInterface());
            
        }
        {
            
            itsHMI_0.getP_HMI_backSingle().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_backSingle_HMI().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_backSingle_HMI().setItsDefaultRequiredInterface(itsHMI_0.getP_HMI_backSingle().getItsDefaultProvidedInterface());
            
        }
        {
            
            getP_cen_backnet().setItsDefaultProvidedInterface(itsHMI_0.getP_backcen_net().getItsDefaultProvidedInterface());
            
        }{
            
            itsHMI_0.getP_backcen_net().setItsDefaultRequiredInterface(getP_cen_backnet().getItsDefaultRequiredInterface());
            
        }
        if(getP_cen_HMI() != null)
           getP_cen_HMI().connectCenterController(this);
        if(getP_cen_data() != null)
           getP_cen_data().connectCenterController(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsCheckPoint_0.startBehavior();
        done &= itsCheckPoint_1.startBehavior();
        done &= itsDataServer.startBehavior();
        done &= itsDataServer_0.startBehavior();
        done &= itsDataServer_1.startBehavior();
        done &= itsHMI.startBehavior();
        done &= itsHMI_0.startBehavior();
        done &= itsHMI_2.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsRights_0.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSecurityPolicy_0.startBehavior();
        done &= itsSecurityPolicy_1.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
        done &= itsSingleAccessPoint_1_0.startBehavior();
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
                case requestedHMI:
                {
                    requestedHMI_add(animStates);
                }
                break;
                case sentToLocal:
                {
                    sentToLocal_add(animStates);
                }
                break;
                case ernteredCenterSingleAccess:
                {
                    ernteredCenterSingleAccess_add(animStates);
                }
                break;
                case checkedPointCenter:
                {
                    checkedPointCenter_add(animStates);
                }
                break;
                case checkedCenterSecurityPolicy:
                {
                    checkedCenterSecurityPolicy_add(animStates);
                }
                break;
                case checkedCenterRights:
                {
                    checkedCenterRights_add(animStates);
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
                case requestedHMI:
                {
                    res = requestedHMI_takeEvent(id);
                }
                break;
                case sentToLocal:
                {
                    res = sentToLocal_takeEvent(id);
                }
                break;
                case ernteredCenterSingleAccess:
                {
                    res = ernteredCenterSingleAccess_takeEvent(id);
                }
                break;
                case checkedPointCenter:
                {
                    res = checkedPointCenter_takeEvent(id);
                }
                break;
                case checkedCenterSecurityPolicy:
                {
                    res = checkedCenterSecurityPolicy_takeEvent(id);
                }
                break;
                case checkedCenterRights:
                {
                    res = checkedCenterRights_takeEvent(id);
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
        public void requestedHMI_add(AnimStates animStates) {
            animStates.add("ROOT.requestedHMI");
        }
        
        //## statechart_method 
        public void Idle_add(AnimStates animStates) {
            animStates.add("ROOT.Idle");
        }
        
        //## statechart_method 
        public void ernteredCenterSingleAccess_add(AnimStates animStates) {
            animStates.add("ROOT.ernteredCenterSingleAccess");
        }
        
        //## statechart_method 
        public void checkedPointCenter_add(AnimStates animStates) {
            animStates.add("ROOT.checkedPointCenter");
        }
        
        //## statechart_method 
        public void checkedCenterSecurityPolicy_add(AnimStates animStates) {
            animStates.add("ROOT.checkedCenterSecurityPolicy");
        }
        
        //## statechart_method 
        public void checkedCenterRights_add(AnimStates animStates) {
            animStates.add("ROOT.checkedCenterRights");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void checkedCenterSecurityPolicy_exit() {
            checkedCenterSecurityPolicyExit();
            animInstance().notifyStateExited("ROOT.checkedCenterSecurityPolicy");
        }
        
        //## statechart_method 
        public void requestedHMI_enter() {
            animInstance().notifyStateEntered("ROOT.requestedHMI");
            rootState_subState = requestedHMI;
            rootState_active = requestedHMI;
            requestedHMIEnter();
        }
        
        //## statechart_method 
        public void sentToLocal_exit() {
            sentToLocalExit();
            animInstance().notifyStateExited("ROOT.sentToLocal");
        }
        
        //## statechart_method 
        public void checkedCenterRightsExit() {
        }
        
        //## statechart_method 
        public void checkedCenterRightsEnter() {
        }
        
        //## statechart_method 
        public int ernteredCenterSingleAccess_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int checkedPointCenterTaketoCheckPolicy() {
            toCheckPolicy params = (toCheckPolicy) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            checkedPointCenter_exit();
            //#[ transition 6 
            cP=params.cPolicy;
            checkPolicy(cP);
            //#]
            checkedCenterSecurityPolicy_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToLocalTakereceivedBackInfo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            sentToLocal_exit();
            Idle_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int checkedCenterSecurityPolicyTakereturnPolicyToCen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            checkedCenterSecurityPolicy_exit();
            checkedPointCenter_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int checkedCenterRights_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(returnRightsToCen.returnRightsToCen_sysSCADA_id))
                {
                    res = checkedCenterRightsTakereturnRightsToCen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedCenterRights_exit() {
            checkedCenterRightsExit();
            animInstance().notifyStateExited("ROOT.checkedCenterRights");
        }
        
        //## statechart_method 
        public void checkedPointCenterEnter() {
        }
        
        //## statechart_method 
        public void sentToLocal_entDef() {
            sentToLocal_enter();
        }
        
        //## statechart_method 
        public int checkedCenterRightsTakereturnRightsToCen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            checkedCenterRights_exit();
            checkedPointCenter_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void checkedCenterSecurityPolicy_entDef() {
            checkedCenterSecurityPolicy_enter();
        }
        
        //## statechart_method 
        public void checkedPointCenter_entDef() {
            checkedPointCenter_enter();
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestToHMI.requestToHMI_sysSCADA_id))
                {
                    res = IdleTakerequestToHMI();
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
        public void requestedHMIExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void checkedCenterRights_entDef() {
            checkedCenterRights_enter();
        }
        
        //## statechart_method 
        public void checkedPointCenter_exit() {
            checkedPointCenterExit();
            animInstance().notifyStateExited("ROOT.checkedPointCenter");
        }
        
        //## statechart_method 
        public void ernteredCenterSingleAccess_enter() {
            animInstance().notifyStateEntered("ROOT.ernteredCenterSingleAccess");
            rootState_subState = ernteredCenterSingleAccess;
            rootState_active = ernteredCenterSingleAccess;
            ernteredCenterSingleAccessEnter();
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public void checkedCenterRights_enter() {
            animInstance().notifyStateEntered("ROOT.checkedCenterRights");
            rootState_subState = checkedCenterRights;
            rootState_active = checkedCenterRights;
            checkedCenterRightsEnter();
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
        public void checkedCenterSecurityPolicy_enter() {
            animInstance().notifyStateEntered("ROOT.checkedCenterSecurityPolicy");
            rootState_subState = checkedCenterSecurityPolicy;
            rootState_active = checkedCenterSecurityPolicy;
            checkedCenterSecurityPolicyEnter();
        }
        
        //## statechart_method 
        public int checkedPointCenterTaketoCheckRights() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            checkedPointCenter_exit();
            checkedCenterRights_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ernteredCenterSingleAccess_entDef() {
            ernteredCenterSingleAccess_enter();
        }
        
        //## statechart_method 
        public int IdleTakerequestToHMI() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Idle_exit();
            //#[ transition 1 
            handleHMI();
            //#]
            requestedHMI_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int requestedHMI_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(requestToLogin.requestToLogin_sysSCADA_id))
                {
                    res = requestedHMITakerequestToLogin();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedPointCenterExit() {
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public int requestedHMITakerequestToLogin() {
            requestToLogin params = (requestToLogin) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            requestedHMI_exit();
            //#[ transition 4 
            role = params.userId;
            checkRole(role);
            //#]
            ernteredCenterSingleAccess_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentToLocalExit() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Idle_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void checkedPointCenter_enter() {
            animInstance().notifyStateEntered("ROOT.checkedPointCenter");
            rootState_subState = checkedPointCenter;
            rootState_active = checkedPointCenter;
            checkedPointCenterEnter();
        }
        
        //## statechart_method 
        public void ernteredCenterSingleAccessEnter() {
        }
        
        //## statechart_method 
        public void requestedHMIEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            IdleExit();
            animInstance().notifyStateExited("ROOT.Idle");
        }
        
        //## statechart_method 
        public void requestedHMI_entDef() {
            requestedHMI_enter();
        }
        
        //## statechart_method 
        public int checkedCenterSecurityPolicy_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(returnPolicyToCen.returnPolicyToCen_sysSCADA_id))
                {
                    res = checkedCenterSecurityPolicyTakereturnPolicyToCen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void checkedCenterSecurityPolicyEnter() {
        }
        
        //## statechart_method 
        public int checkedPointCenterTakeselectData() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            checkedPointCenter_exit();
            //#[ transition 3 
            sendToLocalByNet();
            //#]
            sentToLocal_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int sentToLocal_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receivedBackInfo.receivedBackInfo_sysSCADA_id))
                {
                    res = sentToLocalTakereceivedBackInfo();
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
        public void ernteredCenterSingleAccess_exit() {
            ernteredCenterSingleAccessExit();
            animInstance().notifyStateExited("ROOT.ernteredCenterSingleAccess");
        }
        
        //## statechart_method 
        public void requestedHMI_exit() {
            requestedHMIExit();
            animInstance().notifyStateExited("ROOT.requestedHMI");
        }
        
        //## statechart_method 
        public void checkedCenterSecurityPolicyExit() {
        }
        
        //## statechart_method 
        public int checkedPointCenter_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(toCheckPolicy.toCheckPolicy_sysSCADA_id))
                {
                    res = checkedPointCenterTaketoCheckPolicy();
                }
            else if(event.isTypeOf(selectData.selectData_sysSCADA_id))
                {
                    res = checkedPointCenterTakeselectData();
                }
            else if(event.isTypeOf(toCheckRights.toCheckRights_sysSCADA_id))
                {
                    res = checkedPointCenterTaketoCheckRights();
                }
            else if(event.isTypeOf(toCheckPoint.toCheckPoint_sysSCADA_id))
                {
                    res = checkedPointCenterTaketoCheckPoint();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int checkedPointCenterTaketoCheckPoint() {
            toCheckPoint params = (toCheckPoint) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            checkedPointCenter_exit();
            //#[ transition 5 
            p= params.policy;
            checkPoint(p);
            //#]
            checkedPointCenter_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ernteredCenterSingleAccessExit() {
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
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_HMI_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_HMI_C() {
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
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_data_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_data_C() {
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
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_user_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_user_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_backnet_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_backnet_C() {
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cen_backusr_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cen_backusr_C() {
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
        
        msg.add("itsCheckPoint", true, true, itsCheckPoint);
        msg.add("itsSecurityPolicy", true, true, itsSecurityPolicy);
        msg.add("itsSingleAccessPoint_1_0", true, true, itsSingleAccessPoint_1_0);
        msg.add("itsCheckPoint_0", true, true, itsCheckPoint_0);
        msg.add("itsRights_0", true, true, itsRights_0);
        msg.add("itsSecurityPolicy_0", true, true, itsSecurityPolicy_0);
        msg.add("itsDataServer_1", true, true, itsDataServer_1);
        msg.add("itsHMI_2", true, true, itsHMI_2);
        msg.add("itsHMI", true, true, itsHMI);
        msg.add("itsDataServer", true, true, itsDataServer);
        msg.add("itsCommNetwork", false, true, itsCommNetwork);
        msg.add("itsUser", false, true, itsUser);
        msg.add("itsSingleAccessPoint", true, true, itsSingleAccessPoint);
        msg.add("itsCheckPoint_1", true, true, itsCheckPoint_1);
        msg.add("itsRights", true, true, itsRights);
        msg.add("itsSecurityPolicy_1", true, true, itsSecurityPolicy_1);
        msg.add("itsHMI_0", true, true, itsHMI_0);
        msg.add("itsDataServer_0", true, true, itsDataServer_0);
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
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/centerController.java
*********************************************************************/

