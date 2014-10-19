package citrique2.calc;


import citrique2.ctr2Package;

public class PlantLinkCalcDescription extends CitriqueObjectCalcDescription {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ctr2Package.Literals.PLANT_LINK__LENGTH);
	}
	
}
