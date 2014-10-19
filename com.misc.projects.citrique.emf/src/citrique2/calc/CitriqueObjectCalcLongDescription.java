package citrique2.calc;

import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterParent;
import com.misc.common.moplaf.propagator.Util;

public class CitriqueObjectCalcLongDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapterParent getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, ctr2Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapterParent parent = Util.getPropagatorFunctionAdapterParent(citriquedomain, CitriqueDomainLayerObjectDescription.class);
		return parent;
	}

	@Override
	protected void calculate() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		citriqueobject.refreshLongDescription();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ctr2Package.Literals.CITRIQUE_OBJECT__DESCRIPTION);
		this.addFeatureListener(ctr2Package.Literals.CITRIQUE_OBJECT__CHILD);
	}
};
