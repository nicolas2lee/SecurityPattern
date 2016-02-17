/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: user
//!	Generated Date	: Wed, 17, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/user.java
*********************************************************************/

package sysSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// sysSCADA/user.java                                                                  
//----------------------------------------------------------------------------

//## package sysSCADA 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor user 
public class user implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassuser = new AnimClass("sysSCADA.user",false);
    //#]
    
    protected user.p_user_cen_C p_user_cen;		//## ignore 
    
    protected user.p_usr_backcen_C p_usr_backcen;		//## ignore 
    
    protected centerController itsCenterController;		//## link itsCenterController 
    
    
    // Constructors
    
    //## auto_generated 
    public  user() {
        try {
            animInstance().notifyConstructorEntered(animClassuser.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public user.p_user_cen_C getP_user_cen() {
        return p_user_cen;
    }
    
    //## auto_generated 
    public user.p_user_cen_C get_p_user_cen() {
        return p_user_cen;
    }
    
    //## auto_generated 
    public user.p_user_cen_C newP_user_cen() {
        p_user_cen = new user.p_user_cen_C();
        return p_user_cen;
    }
    
    //## auto_generated 
    public void deleteP_user_cen() {
        p_user_cen=null;
    }
    
    //## auto_generated 
    public user.p_usr_backcen_C getP_usr_backcen() {
        return p_usr_backcen;
    }
    
    //## auto_generated 
    public user.p_usr_backcen_C get_p_usr_backcen() {
        return p_usr_backcen;
    }
    
    //## auto_generated 
    public user.p_usr_backcen_C newP_usr_backcen() {
        p_usr_backcen = new user.p_usr_backcen_C();
        return p_usr_backcen;
    }
    
    //## auto_generated 
    public void deleteP_usr_backcen() {
        p_usr_backcen=null;
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
                itsCenterController.__setItsUser(null);
            }
        __setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void setItsCenterController(centerController p_centerController) {
        if(p_centerController != null)
            {
                p_centerController._setItsUser(this);
            }
        _setItsCenterController(p_centerController);
    }
    
    //## auto_generated 
    public void _clearItsCenterController() {
        animInstance().notifyRelationCleared("itsCenterController");
        itsCenterController = null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        p_user_cen = newP_user_cen();
        p_usr_backcen = newP_usr_backcen();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_user_cen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_user_cen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUser(user) 
        public void connectUser(user part) {
            //#[ operation connectUser(user) 
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_usr_backcen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_usr_backcen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUser(user) 
        public void connectUser(user part) {
            //#[ operation connectUser(user) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassuser; 
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
            super(user.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            user.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            user.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/sysSCADA/user.java
*********************************************************************/

