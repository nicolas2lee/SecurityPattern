/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: User
//!	Generated Date	: Thu, 28, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/User.java
*********************************************************************/

package secureSCADA;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// secureSCADA/User.java                                                                  
//----------------------------------------------------------------------------

//## package secureSCADA 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor User 
public class User implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassUser = new AnimClass("secureSCADA.User",false);
    //#]
    
    protected User.p_user_C p_user;		//## ignore 
    
    protected String Password;		//## attribute Password 
    
    protected String Role;		//## attribute Role 
    
    protected String Username;		//## attribute Username 
    
    
    // Constructors
    
    //## auto_generated 
    public  User() {
        try {
            animInstance().notifyConstructorEntered(animClassUser.getUserClass(),
               new ArgData[] {
               });
        
        initRelations();
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public User.p_user_C getP_user() {
        return p_user;
    }
    
    //## auto_generated 
    public User.p_user_C get_p_user() {
        return p_user;
    }
    
    //## auto_generated 
    public User.p_user_C newP_user() {
        p_user = new User.p_user_C();
        return p_user;
    }
    
    //## auto_generated 
    public void deleteP_user() {
        p_user=null;
    }
    
    //## auto_generated 
    public String getPassword() {
        return Password;
    }
    
    //## auto_generated 
    public void setPassword(String p_Password) {
        Password = p_Password;
    }
    
    //## auto_generated 
    public String getRole() {
        return Role;
    }
    
    //## auto_generated 
    public void setRole(String p_Role) {
        Role = p_Role;
    }
    
    //## auto_generated 
    public String getUsername() {
        return Username;
    }
    
    //## auto_generated 
    public void setUsername(String p_Username) {
        Username = p_Username;
    }
    
    //## auto_generated 
    protected void OMCreateInstances() {
        p_user = newP_user();
    }
    
    //## auto_generated 
    protected void OMConnectRelations() {
    }
    
    //## auto_generated 
    protected void initRelations() {
        OMCreateInstances();
        OMConnectRelations();
    }
    
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_user_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_user_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectUser(User) 
        public void connectUser(User part) {
            //#[ operation connectUser(User) 
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassUser; 
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
        
        msg.add("Role", Role);
        msg.add("Username", Username);
        msg.add("Password", Password);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(User.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            User.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            User.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/secureSCADA/User.java
*********************************************************************/

