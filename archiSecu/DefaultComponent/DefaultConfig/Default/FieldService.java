/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FieldService
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/FieldService.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/FieldService.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class FieldService 
public class FieldService implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassFieldService = new AnimClass("Default.FieldService",false);
    //#]
    
    protected FieldUnit itsFieldUnit;		//## link itsFieldUnit 
    
    
    // Constructors
    
    //## auto_generated 
    public  FieldService() {
        try {
            animInstance().notifyConstructorEntered(animClassFieldService.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                itsFieldUnit.__setItsFieldService(null);
            }
        __setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void setItsFieldUnit(FieldUnit p_FieldUnit) {
        if(p_FieldUnit != null)
            {
                p_FieldUnit._setItsFieldService(this);
            }
        _setItsFieldUnit(p_FieldUnit);
    }
    
    //## auto_generated 
    public void _clearItsFieldUnit() {
        animInstance().notifyRelationCleared("itsFieldUnit");
        itsFieldUnit = null;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassFieldService; 
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
        
        msg.add("itsFieldUnit", false, true, itsFieldUnit);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(FieldService.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            FieldService.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            FieldService.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/FieldService.java
*********************************************************************/

