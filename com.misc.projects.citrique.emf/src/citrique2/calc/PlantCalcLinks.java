package citrique2.calc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.Plant;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PlantCalcLinks extends PropagatorFunctionAdapter {

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
		plant.refreshLinks();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ctr2Package.PLANT__BUFFER_SILO_LINK);
		this.addFeatureListener(ctr2Package.PLANT__SILO_REACTOR_LINK);
	}
	
}
