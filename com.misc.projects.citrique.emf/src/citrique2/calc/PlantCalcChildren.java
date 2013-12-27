package citrique2.calc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import citrique2.CitriqueObject;
import citrique2.Plant;
import citrique2.ctr2Package;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PlantCalcChildren extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CitriqueObject citriqueobject = (CitriqueObject)this.getTarget();
		EObject citriquedomain = Util.getContainer(citriqueobject, ctr2Package.Literals.CITRIQUE_DOMAIN);
		PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter) Util.getAdapter(citriquedomain, CitriqueDomainLayerObjectChildren.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Plant plant= (Plant)this.getTarget();
		plant.refreshChildren();
	}

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (  this.isFeatureChanged(msg, ctr2Package.eINSTANCE.getPlant_PlantObject())){
			this.touch();				
		}
	}

	@Override
	protected List<PropagatorFunctionAdapter> getAntecedents() {
		Plant plant= (Plant)this.getTarget();
		PropagatorFunctionAdapter calcobjects = (PropagatorFunctionAdapter)Util.getAdapter(plant, PlantCalcObjects.class);
		
		ArrayList<PropagatorFunctionAdapter> antecedents = new ArrayList<PropagatorFunctionAdapter>();
		antecedents.add(calcobjects);
		return antecedents;
	}
}
