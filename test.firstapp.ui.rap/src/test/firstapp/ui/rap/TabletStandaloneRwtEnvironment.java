package test.firstapp.ui.rap;

import test.firstapp.client.ClientSession;

public class TabletStandaloneRwtEnvironment extends AbstractTabletStandaloneRwtEnvironment {

  private static final long serialVersionUID = 1L;

  public TabletStandaloneRwtEnvironment() {
    super(Activator.getDefault().getBundle(), ClientSession.class);
  }
}
