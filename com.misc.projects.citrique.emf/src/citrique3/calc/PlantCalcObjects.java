package citrique3.calc;

import org.eclipse.emf.ecore.EObject;

import citrique3.CitriqueObject;
import citrique3.Plant;
import citrique3.Citrique3Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterParent;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;

public class PlantCalcObjects extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapterParent getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, Citrique3Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapterParent parent = Util.getPropagatorFunctionAdapterParent(citriquedomain, CitriqueDomainLayerObjectChildren.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Plant plant= (Plant)this.getTarget();
		PropagatorFunctionAdapter calcnode = Util.getPropagatorFunctionAdapter(plant, PlantCalcNodes.class);
		PropagatorFunctionAdapter calclink = Util.getPropagatorFunctionAdapter(plant, PlantCalcLinks.class);
		
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		antecedents.add(calcnode);
		antecedents.add(calclink);
		return antecedents;
	}

	@Override
	protected void calculate() {
		Plant plant= (Plant)this.getTarget();
		plant.refreshObjects();
	}

	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(Citrique3Package.Literals.PLANT__NODE);
		this.addFeatureListener(Citrique3Package.Literals.PLANT__LINK);
	}
	
}
