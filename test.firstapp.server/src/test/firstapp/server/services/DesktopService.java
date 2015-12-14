/**
 * 
 */
package test.firstapp.server.services;

import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.service.AbstractService;

import test.firstapp.shared.services.DesktopFormData;
import test.firstapp.shared.services.IDesktopService;

/**
 * @author Phil Raquepau
 */
public class DesktopService extends AbstractService implements IDesktopService {

  @Override
  public DesktopFormData load(DesktopFormData formData) throws ProcessingException {
    // TODO [Phil Raquepau] Auto-generated method stub.
    return formData;
  }
}