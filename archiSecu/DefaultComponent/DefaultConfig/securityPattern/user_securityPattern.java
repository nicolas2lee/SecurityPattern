/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: user_securityPattern
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/user_securityPattern.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/user_securityPattern.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor user_securityPattern 
public class user_securityPattern implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassuser_securityPattern = new AnimClass("securityPattern.user_securityPattern",false);
    //#]
    
    protected user_securityPattern.p_user_single_C p_user_single;		//## ignore 
    
    protected SingleAccessPoint itsSingleAccessPoint;		//## link itsSingleAccessPoint 
    
    
    // Constructors
    
    //## auto_generated 
    public  user_securityPattern() {
        try {
            animInstance().notifyConstructorEntered(animClassuser_securityPattern.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public user_securityPattern.p_user_single_C getP_user_single() {
        return p_user_single;
    }
    
    //## auto_generated 
    public user_securityPattern.p_user_single_C get_p_user_single() {
        return p_user_single;
    }
    
    //## auto_generated 
    public user_securityPattern.p_user_single_C newP_user_single() {
        p_user_single = new user_securityPattern.p_user_single_C();
        return p_user_single;
    }
    
    //## auto_generated 
    public void deleteP_user_single() {
        p_user_single=null;
    }
    
    //## auto_generated 
    public SingleAccessPoint getItsSingleAccessPoint() {
        return itsSingleAccessPoint;
    }
    
    //## auto_generated 
    public void __setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        itsSingleAccessPoint = p_SingleAccessPoint;
        if(p_SingleAccessPoint != null)
            {
                animInstance().notifyRelationAdded("itsSingleAccessPoint", p_SingleAccessPoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSingleAccessPoint");
            }
    }
    
    //## auto_generated 
    public void _setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(itsSingleAccessPoint != null)
            {
                itsSingleAccessPoint.__setItsUser_securityPattern(null);
            }
        __setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void setItsSingleAccessPoint(SingleAccessPoint p_SingleAccessPoint) {
        if(p_SingleAccessPoint != null)
            {
                p_SingleAccessPoint._setItsUser_securityPattern(this);
            }
        _setItsSingleAccessPoint(p_SingleAccessPoint);
    }
    
    //## auto_generated 
    public void _clearItsSingleAccessPoint() {
        animInstance().notifyRelationCleared("itsSingleAccessPoint");
        itsSingleAccessPoint = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_user_single = newP_user_single();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_user_single_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_user_single_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUser_securityPattern(user_securityPattern) 
        public void connectUser_securityPattern(user_securityPattern part) {
            //#[ operation connectUser_securityPattern(user_securityPattern) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassuser_securityPattern; 
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
        
        msg.add("itsSingleAccessPoint", false, true, itsSingleAccessPoint);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(user_securityPattern.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            user_securityPattern.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            user_securityPattern.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/user_securityPattern.java
*********************************************************************/

