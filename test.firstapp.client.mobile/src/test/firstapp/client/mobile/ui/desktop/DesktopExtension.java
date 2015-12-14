/**
 * 
 */
package test.firstapp.client.mobile.ui.desktop;

import test.firstapp.client.mobile.ui.forms.MobileHomeForm;

/**
 * @author Phil Raquepau
 */
public class DesktopExtension extends AbstractDesktopExtension {

  private MobileHomeForm m_homeForm;
  private boolean m_active;

  /**
   * 
   */
  public DesktopExtension() {
    setActive(!UserAgentUtility.isDesktopDevice());

  }

  @Override
  protected ContributionCommand execGuiAttached() throws ProcessingException {
    if (!isActive()) {
      return super.execGuiAttached();
    }

    if (m_homeForm == null) {
      m_homeForm = new MobileHomeForm();
      m_homeForm.startView();
    }
    return ContributionCommand.Continue;

  }

  @Override
  protected ContributionCommand execGuiDetached() throws ProcessingException {
    if (!isActive()) {
      return super.execGuiDetached();
    }

    if (m_homeForm != null) {
      m_homeForm.doClose();
    }
    return ContributionCommand.Continue;

  }

  /**
   * @return the Active
   */
  public boolean isActive() {
    return m_active;
  }

  /**
   * @param active
   *          the Active to set
   */
  public void setActive(boolean active) {
    m_active = active;
  }
}