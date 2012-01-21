package bubba.possum.servlet;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class EnginePopulatorListener
 * 
 */
public class EnginePopulatorListener implements ServletContextListener {

  /**
   * Default constructor.
   */
  public EnginePopulatorListener() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see ServletContextListener#contextInitialized(ServletContextEvent)
   */
  public void contextInitialized(ServletContextEvent evt) {
    ScriptEngineManager mgr = new ScriptEngineManager();
    evt.getServletContext().setAttribute("ENGINES", mgr.getEngineFactories());
  }

  /**
   * @see ServletContextListener#contextDestroyed(ServletContextEvent)
   */
  public void contextDestroyed(ServletContextEvent arg0) {
    // TODO Auto-generated method stub
  }

}
