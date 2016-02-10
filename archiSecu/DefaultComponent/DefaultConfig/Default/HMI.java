/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: HMI
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/HMI.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/HMI.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class HMI 
public class HMI implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassHMI = new AnimClass("Default.HMI",false);
    //#]
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    
    // Constructors
    
    //## auto_generated 
    public  HMI() {
        try {
            animInstance().notifyConstructorEntered(animClassHMI.getUserClass(),
               new ArgData[] {
               });
        
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
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/HMI.java
*********************************************************************/

