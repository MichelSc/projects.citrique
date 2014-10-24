package citrique3.calc;

import org.eclipse.emf.ecore.EObject;

import citrique3.CitriqueObject;
import citrique3.Citrique3Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterParent;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectCalcShortDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapterParent getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, Citrique3Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapterParent parent = Util.getPropagatorFunctionAdapterParent(citriquedomain, CitriqueDomainLayerObjectDescription.class);
		return parent;
	}

	@Override
	protected void calculate() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		citriqueobject.refreshShortDescription();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(Citrique3Package.Literals.CITRIQUE_OBJECT__SHORT_NAME);
		this.addFeatureListener(Citrique3Package.Literals.CITRIQUE_OBJECT__SHORT_TYPE);
	}
};
