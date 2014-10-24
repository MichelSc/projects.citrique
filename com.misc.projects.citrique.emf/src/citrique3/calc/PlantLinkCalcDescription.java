package citrique3.calc;


import citrique3.Citrique3Package;

public class PlantLinkCalcDescription extends CitriqueObjectCalcDescription {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(Citrique3Package.Literals.PLANT_LINK__LENGTH);
	}
	
}
