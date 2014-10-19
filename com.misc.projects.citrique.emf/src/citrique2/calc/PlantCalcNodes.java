package citrique2.calc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.Plant;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PlantCalcNodes extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, ctr2Package.Literals.CITRIQUE_DOMAIN);
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
		this.addFeatureListener(ctr2Package.PLANT__BUFFER);
		this.addFeatureListener(ctr2Package.PLANT__REACTOR);
		this.addFeatureListener(ctr2Package.PLANT__SILO);
	}
	
}
