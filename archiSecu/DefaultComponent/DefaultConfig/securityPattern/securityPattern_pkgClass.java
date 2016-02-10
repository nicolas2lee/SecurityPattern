/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: securityPattern
//!	Generated Date	: Thu, 14, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/securityPattern_pkgClass.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// securityPattern/securityPattern_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


//## ignore 
public class securityPattern_pkgClass {
    
    public static checkPoint itsCheckPoint;		//## classInstance itsCheckPoint 
    
    public static counterMeasure itsCounterMeasure;		//## classInstance itsCounterMeasure 
    
    public static protectedObject itsProtectedObject;		//## classInstance itsProtectedObject 
    
    public static Rights itsRights;		//## classInstance itsRights 
    
    public static SecurityPolicy itsSecurityPolicy;		//## classInstance itsSecurityPolicy 
    
    public static SingleAccessPoint itsSingleAccessPoint;		//## classInstance itsSingleAccessPoint 
    
    public static user_securityPattern itsUser_securityPattern;		//## classInstance itsUser_securityPattern 
    
    
    // Constructors
    
    //## auto_generated 
    public  securityPattern_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsSecurityPolicy != null)
            {
                AnimServices.setInstanceName(itsSecurityPolicy, "itsSecurityPolicy");
            }
        if(itsRights != null)
            {
                AnimServices.setInstanceName(itsRights, "itsRights");
            }
        if(itsUser_securityPattern != null)
            {
                AnimServices.setInstanceName(itsUser_securityPattern, "itsUser_securityPattern");
            }
        if(itsProtectedObject != null)
            {
                AnimServices.setInstanceName(itsProtectedObject, "itsProtectedObject");
            }
        if(itsCounterMeasure != null)
            {
                AnimServices.setInstanceName(itsCounterMeasure, "itsCounterMeasure");
            }
        if(itsSingleAccessPoint != null)
            {
                AnimServices.setInstanceName(itsSingleAccessPoint, "itsSingleAccessPoint");
            }
        if(itsCheckPoint != null)
            {
                AnimServices.setInstanceName(itsCheckPoint, "itsCheckPoint");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCheckPoint = new checkPoint(p_thread);
        itsCounterMeasure = new counterMeasure(p_thread);
        itsProtectedObject = new protectedObject();
        itsRights = new Rights(p_thread);
        itsSecurityPolicy = new SecurityPolicy(p_thread);
        itsSingleAccessPoint = new SingleAccessPoint(p_thread);
        itsUser_securityPattern = new user_securityPattern();
        {
            
            itsUser_securityPattern.getP_user_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_user().getItsDefaultProvidedInterface());
            
        }{
            
            itsSingleAccessPoint.getP_single_user().setItsDefaultRequiredInterface(itsUser_securityPattern.getP_user_single().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSecurityPolicy.getP_policy_cm().setItsDefaultRequiredInterface(itsCounterMeasure.getP_cm_policy().getItsDefaultProvidedInterface());
            
        }{
            
            itsCounterMeasure.getP_cm_policy().setItsDefaultRequiredInterface(itsSecurityPolicy.getP_policy_cm().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSingleAccessPoint.getP_single_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_single().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_single().setItsDefaultRequiredInterface(itsSingleAccessPoint.getP_single_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsRights.getP_right_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_right().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_right().setItsDefaultRequiredInterface(itsRights.getP_right_check().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCheckPoint.getP_check_policy().setItsDefaultRequiredInterface(itsSecurityPolicy.getP_policy_check().getItsDefaultProvidedInterface());
            
        }{
            
            itsSecurityPolicy.getP_policy_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_policy().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsProtectedObject.getP_protected_check().setItsDefaultRequiredInterface(itsCheckPoint.getP_check_protected().getItsDefaultProvidedInterface());
            
        }{
            
            itsCheckPoint.getP_check_protected().setItsDefaultRequiredInterface(itsProtectedObject.getP_protected_check().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCheckPoint.startBehavior();
        done &= itsCounterMeasure.startBehavior();
        done &= itsRights.startBehavior();
        done &= itsSecurityPolicy.startBehavior();
        done &= itsSingleAccessPoint.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/securityPattern_pkgClass.java
*********************************************************************/

