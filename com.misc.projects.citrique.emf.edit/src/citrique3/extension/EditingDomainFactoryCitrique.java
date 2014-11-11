package citrique3.extension;


import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;
import org.eclipse.sirius.common.tools.api.editing.IEditingDomainFactory;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapterManager;


public class EditingDomainFactoryCitrique extends FactoryImpl implements IEditingDomainFactory {

	public EditingDomainFactoryCitrique() {
		CommonPlugin.INSTANCE.log( "Create Editing Domain Factory Citrique");
	}
	
	
	class ResourceSetListenerCitrique extends ResourceSetListenerImpl {
		
		@Override
		public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
			//CommonPlugin.INSTANCE.log( "ResourceListener,transaction about to commit "+event.toString());
			
	
			//Transaction transaction = event.getTransaction();
			//CommonPlugin.INSTANCE.log( "..transaction "+(transaction==null?"null":transaction.getChangeDescription().toString()));
			final TransactionalEditingDomain editingDomain = event.getEditingDomain();
			Command refreshcommand = new AbstractCommand(){
				
				@Override
				protected boolean prepare(){
					return true;
				}
				
				@Override
				public void undo() {
				}

				@Override
				public void execute() {
					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						 for ( EObject object : resource.getContents()){
							 if ( object instanceof ObjectWithPropagatorFunctionAdapterScope ){
								 ObjectWithPropagatorFunctionAdapterScope scope = (ObjectWithPropagatorFunctionAdapterScope)object;
								 CommonPlugin.INSTANCE.log( "..: refresh object "+ scope.toString());
								 scope.refresh();
							 }  // traversed Object is a CitriqueDomain
						 }  // traverse the EObjects
					} // traverse the Resources
				} // Command.execute()

				@Override
				public void redo() {
					this.execute();
					
				}
			};// new abstract command
			return refreshcommand;
		}  // transaction about to commit
	};


	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		final TransactionalEditingDomain neweditingdomain = new TransactionalEditingDomainImpl(
				new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE),
				rset);
			
			mapResourceSet(neweditingdomain);
			
			neweditingdomain.addResourceSetListener(new ResourceSetListenerCitrique());
			
			rset.eAdapters().add(new PropagatorFunctionAdapterManager());
	
			return neweditingdomain;
		}

};
