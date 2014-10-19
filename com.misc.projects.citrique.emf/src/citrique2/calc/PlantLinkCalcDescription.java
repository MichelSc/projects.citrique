package citrique2.calc;

import org.eclipse.emf.common.notify.Notification;

import citrique2.ctr2Package;

public class PlantLinkCalcDescription extends CitriqueObjectCalcDescription {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ctr2Package.PLANT_LINK__LENGTH);
	}
	
}
