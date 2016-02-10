/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Unknown
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/Unknown.java
*********************************************************************/

package secureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// secureSCADA/Unknown.java                                                                  
//----------------------------------------------------------------------------

//## package secureSCADA 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Unknown 
public class Unknown implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassUnknown = new AnimClass("secureSCADA.Unknown",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Unknown() {
        try {
            animInstance().notifyConstructorEntered(animClassUnknown.getUserClass(),
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
        return animClassUnknown; 
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
            super(Unknown.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Unknown.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Unknown.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/Unknown.java
*********************************************************************/

