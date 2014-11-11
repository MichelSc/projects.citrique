package citrique3.calc;

import org.eclipse.emf.ecore.EObject;

import citrique3.Plant;
import citrique3.Citrique3Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PlantCalcNodes extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Plant plant= (Plant)this.getTarget();
		EObject citriquedomain = Util.getContainer(plant, Citrique3Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(citriquedomain, CitriqueDomainLayerObjectChildren.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Plant plant= (Plant)this.getTarget();
		plant.refreshNodes();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(Citrique3Package.Literals.PLANT__BUFFER);
		this.addFeatureListener(Citrique3Package.Literals.PLANT__REACTOR);
		this.addFeatureListener(Citrique3Package.Literals.PLANT__SILO);
	}
	
}
