/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: protectedObject
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/securityPattern/protectedObject.java
*********************************************************************/

package securityPattern;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// securityPattern/protectedObject.java                                                                  
//----------------------------------------------------------------------------

//## package securityPattern 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor protectedObject 
public class protectedObject implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassprotectedObject = new AnimClass("securityPattern.protectedObject",false);
    //#]
    
    protected protectedObject.p_protected_check_C p_protected_check;		//## ignore 
    
    protected checkPoint itsCheckPoint;		//## link itsCheckPoint 
    
    
    // Constructors
    
    //## auto_generated 
    public  protectedObject() {
        try {
            animInstance().notifyConstructorEntered(animClassprotectedObject.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public protectedObject.p_protected_check_C getP_protected_check() {
        return p_protected_check;
    }
    
    //## auto_generated 
    public protectedObject.p_protected_check_C get_p_protected_check() {
        return p_protected_check;
    }
    
    //## auto_generated 
    public protectedObject.p_protected_check_C newP_protected_check() {
        p_protected_check = new protectedObject.p_protected_check_C();
        return p_protected_check;
    }
    
    //## auto_generated 
    public void deleteP_protected_check() {
        p_protected_check=null;
    }
    
    //## auto_generated 
    public checkPoint getItsCheckPoint() {
        return itsCheckPoint;
    }
    
    //## auto_generated 
    public void __setItsCheckPoint(checkPoint p_checkPoint) {
        itsCheckPoint = p_checkPoint;
        if(p_checkPoint != null)
            {
                animInstance().notifyRelationAdded("itsCheckPoint", p_checkPoint);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCheckPoint");
            }
    }
    
    //## auto_generated 
    public void _setItsCheckPoint(checkPoint p_checkPoint) {
        if(itsCheckPoint != null)
            {
                itsCheckPoint.__setItsProtectedObject(null);
            }
        __setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void setItsCheckPoint(checkPoint p_checkPoint) {
        if(p_checkPoint != null)
            {
                p_checkPoint._setItsProtectedObject(this);
            }
        _setItsCheckPoint(p_checkPoint);
    }
    
    //## auto_generated 
    public void _clearItsCheckPoint() {
        animInstance().notifyRelationCleared("itsCheckPoint");
        itsCheckPoint = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_protected_check = newP_protected_check();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_protected_check_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_protected_check_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectProtectedObject(protectedObject) 
        public void connectProtectedObject(protectedObject part) {
            //#[ operation connectProtectedObject(protectedObject) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassprotectedObject; 
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
        
        msg.add("itsCheckPoint", false, true, itsCheckPoint);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(protectedObject.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            protectedObject.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            protectedObject.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/securityPattern/protectedObject.java
*********************************************************************/

