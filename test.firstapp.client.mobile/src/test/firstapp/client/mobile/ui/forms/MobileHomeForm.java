/**
 * 
 */
package test.firstapp.client.mobile.ui.forms;

/**
 * @author Phil Raquepau
 */
public class MobileHomeForm extends DesktopForm {

  /**
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  public MobileHomeForm() throws ProcessingException {
    super();
  }

  /**
   * @return the LogoutButton
   */
  public LogoutButton getLogoutButton() {
    return getFieldByClass(LogoutButton.class);
  }

  @Order(1000.0)
  @InjectFieldTo(DesktopForm.MainBox.class)
  public class LogoutButton extends AbstractExtensibleButton {

    @Override
    protected String getConfiguredLabel() {
      return TEXTS.get("Logoff");
    }

    @Override
    protected void execClickAction() throws ProcessingException {
      ClientJob.getCurrentSession().stopSession();
    }
  }
}