package test.firstapp.ui.swt.editor;

import org.eclipse.scout.rt.ui.swt.ISwtEnvironment;
import org.eclipse.scout.rt.ui.swt.window.desktop.editor.AbstractScoutEditorPart;

import test.firstapp.ui.swt.Activator;

public class ScoutEditorPart extends AbstractScoutEditorPart {

  @Override
  protected ISwtEnvironment getSwtEnvironment() {
    return Activator.getDefault().getEnvironment();
  }
}
