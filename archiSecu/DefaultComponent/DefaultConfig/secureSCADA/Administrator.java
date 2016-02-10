/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Administrator
//!	Generated Date	: Wed, 10, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/Administrator.java
*********************************************************************/

package secureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// secureSCADA/Administrator.java                                                                  
//----------------------------------------------------------------------------

//## package secureSCADA 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Administrator 
public class Administrator implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassAdministrator = new AnimClass("secureSCADA.Administrator",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Administrator() {
        try {
            animInstance().notifyConstructorEntered(animClassAdministrator.getUserClass(),
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
        return animClassAdministrator; 
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
            super(Administrator.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Administrator.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Administrator.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/Administrator.java
*********************************************************************/

