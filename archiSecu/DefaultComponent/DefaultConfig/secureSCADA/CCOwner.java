/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CCOwner
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/CCOwner.java
*********************************************************************/

package secureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// secureSCADA/CCOwner.java                                                                  
//----------------------------------------------------------------------------

//## package secureSCADA 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor CCOwner 
public class CCOwner implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCCOwner = new AnimClass("secureSCADA.CCOwner",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  CCOwner() {
        try {
            animInstance().notifyConstructorEntered(animClassCCOwner.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    protected void OMCreateInstances() {
    }
    
    //## auto_generated 
    protected void OMConnectRelations() {
    }
    
    //## auto_generated 
    protected void initRelations() {
        OMCreateInstances();
        OMConnectRelations();
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCCOwner; 
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
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(CCOwner.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            CCOwner.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            CCOwner.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/CCOwner.java
*********************************************************************/

