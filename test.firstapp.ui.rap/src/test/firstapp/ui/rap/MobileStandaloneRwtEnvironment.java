package test.firstapp.ui.rap;

import test.firstapp.client.ClientSession;

public class MobileStandaloneRwtEnvironment extends AbstractMobileStandaloneRwtEnvironment {

  private static final long serialVersionUID = 1L;

  public MobileStandaloneRwtEnvironment() {
    super(Activator.getDefault().getBundle(), ClientSession.class);
  }
}
