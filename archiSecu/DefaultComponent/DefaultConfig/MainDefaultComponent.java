/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import sysSCADA.*;
//## auto_generated
import secureSCADA.*;
//## auto_generated
import securityPattern.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("securityPattern.approved");
            Class.forName("securityPattern.approvedRights");
            Class.forName("securityPattern.backService");
            Class.forName("securityPattern.checkAgain");
            Class.forName("securityPattern.checkedPolicy");
            Class.forName("securityPattern.checkPolicy");
            Class.forName("securityPattern.checkRights");
            Class.forName("securityPattern.countRejected");
            Class.forName("securityPattern.recieveCheck");
            Class.forName("securityPattern.recieveDeniedAccess");
            Class.forName("securityPattern.recieveRequestFromSingle");
            Class.forName("securityPattern.recieveRequestFromUser");
            Class.forName("securityPattern.reject");
            Class.forName("securityPattern.rejected");
            Class.forName("securityPattern.rejectedRights");
            Class.forName("securityPattern.requested");
            Class.forName("securityPattern.triedMorethanThreetimes");
            Class.forName("sysSCADA.backServiceInfo");
            Class.forName("sysSCADA.checkpointField");
            Class.forName("sysSCADA.checkSuccess");
            Class.forName("sysSCADA.distributeService");
            Class.forName("sysSCADA.doSomething");
            Class.forName("sysSCADA.EnterSingleAccessField");
            Class.forName("sysSCADA.fieldPolicyFeedback");
            Class.forName("sysSCADA.fieldRightsFeedback");
            Class.forName("sysSCADA.interactHMI");
            Class.forName("sysSCADA.offerService");
            Class.forName("sysSCADA.queryData");
            Class.forName("sysSCADA.queryDataserver");
            Class.forName("sysSCADA.receivedBackInfo");
            Class.forName("sysSCADA.recieveFromCenter");
            Class.forName("sysSCADA.recieveFromCenterByNet");
            Class.forName("sysSCADA.request");
            Class.forName("sysSCADA.requestFromUsr");
            Class.forName("sysSCADA.requestService");
            Class.forName("sysSCADA.requestToAccessNet");
            Class.forName("sysSCADA.requestToCenter");
            Class.forName("sysSCADA.requestToHMI");
            Class.forName("sysSCADA.requestToLogin");
            Class.forName("sysSCADA.ReturnNetPolicy");
            Class.forName("sysSCADA.returnNetRights");
            Class.forName("sysSCADA.returnPolicy");
            Class.forName("sysSCADA.returnPolicyToCen");
            Class.forName("sysSCADA.returnRightsToCen");
            Class.forName("sysSCADA.selectData");
            Class.forName("sysSCADA.selectedData");
            Class.forName("sysSCADA.sendFeedback");
            Class.forName("sysSCADA.sendToCenter");
            Class.forName("sysSCADA.sendToLocal");
            Class.forName("sysSCADA.toCheckFieldPolicy");
            Class.forName("sysSCADA.toCheckFieldRights");
            Class.forName("sysSCADA.toCheckPoint");
            Class.forName("sysSCADA.toCheckPointNet");
            Class.forName("sysSCADA.toCheckPolicy");
            Class.forName("sysSCADA.toCheckPolicyNet");
            Class.forName("sysSCADA.toCheckRights");
            Class.forName("sysSCADA.toCheckRightsNet");
            Class.forName("sysSCADA.triggerData");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    private secureSCADA_pkgClass initializer_secureSCADA = new secureSCADA_pkgClass(RiJMainThread.instance());
    private securityPattern_pkgClass initializer_securityPattern = new securityPattern_pkgClass(RiJMainThread.instance());
    private sysSCADA_pkgClass initializer_sysSCADA = new sysSCADA_pkgClass(RiJMainThread.instance());
    
    //## configuration DefaultComponent::DefaultConfig 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        //#[ configuration DefaultComponent::DefaultConfig 
        //#]
        RiJOXF.Start();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/

