package citrique2.calc;

import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectCalcDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, ctr2Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(citriquedomain, CitriqueDomainLayerObjectDescription.class);
		return parent;
	}

	@Override
	protected void calculate() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		citriqueobject.refreshDescription();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ctr2Package.CITRIQUE_OBJECT__NAME);
		this.addFeatureListener(ctr2Package.CITRIQUE_OBJECT__TYPE);
	}

};
