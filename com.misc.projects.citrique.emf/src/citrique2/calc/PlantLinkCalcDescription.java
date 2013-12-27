package citrique2.calc;

import org.eclipse.emf.common.notify.Notification;

import citrique2.ctr2Package;

public class PlantLinkCalcDescription extends CitriqueObjectCalcDescription {

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (  this.isFeatureChanged(msg, ctr2Package.eINSTANCE.getPlantLink_Length() )) {
			this.touch();				
		}
	}
}
