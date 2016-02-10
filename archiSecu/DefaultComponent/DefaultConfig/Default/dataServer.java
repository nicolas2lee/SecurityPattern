/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: dataServer
//!	Generated Date	: Fri, 8, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Default/dataServer.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/dataServer.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class dataServer 
public class dataServer implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassdataServer = new AnimClass("Default.dataServer",false);
    //#]
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    
    // Constructors
    
    //## auto_generated 
    public  dataServer() {
        try {
            animInstance().notifyConstructorEntered(animClassdataServer.getUserClass(),
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
                itsCenterController.__setItsDataServer(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsDataServer(this);
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
        return animClassdataServer; 
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
            super(dataServer.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            dataServer.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            dataServer.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/dataServer.java
*********************************************************************/

