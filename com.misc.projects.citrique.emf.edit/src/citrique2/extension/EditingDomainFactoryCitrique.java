package citrique2.extension;

import java.util.EventObject;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.tools.api.editing.DefaultEditingDomainFactory;
import org.eclipse.sirius.common.tools.api.editing.IEditingDomainFactory;

import citrique2.CitriqueDomain;

public class EditingDomainFactoryCitrique extends DefaultEditingDomainFactory
		implements IEditingDomainFactory {

	public EditingDomainFactoryCitrique() {
		CommonPlugin.INSTANCE.log( "Create Editing Domain Factory Citrique");
	}

	@Override
	public TransactionalEditingDomain createEditingDomain() {
		CommonPlugin.INSTANCE.log( "Create Editing Domain Citrique begin");
		TransactionalEditingDomain neweditingdomain = super.createEditingDomain();
		CommonPlugin.INSTANCE.log( "Create Editing Domain Citrique end");
		return neweditingdomain;
		
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(
			ResourceSet rset) {
		CommonPlugin.INSTANCE.log( "Create Editing Domain Citrique gegin, set "+rset.getResources().size());
		final TransactionalEditingDomain neweditingdomain = super.createEditingDomain(rset);
		CommonPlugin.INSTANCE.log( "Create Editing Domain Citrique end, set "+rset.getResources().size());
		neweditingdomain.addResourceSetListener(new ResourceSetListenerImpl() {
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				
				CommonPlugin.INSTANCE.log( "ResourceListener,resourcesetchanged "+event.toString());
				Transaction transaction = event.getTransaction();
				CommonPlugin.INSTANCE.log( "..transaction "+(transaction==null?"null":transaction.getChangeDescription().toString()));
				/*
				ResourceSet resourceSet = editingDomain.getResourceSet();
				CommonPlugin.INSTANCE.log( "..resourceSet "+resourceSet.toString());
				for(Resource resource : resourceSet.getResources()){
					CommonPlugin.INSTANCE.log( "....resource "+resource.getURI().toString());
				}*/
			} // resourceSetChanged

			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
				CommonPlugin.INSTANCE.log( "ResourceListener,transaction about to commit "+event.toString());
				Transaction transaction = event.getTransaction();
				CommonPlugin.INSTANCE.log( "..transaction "+(transaction==null?"null":transaction.getChangeDescription().toString()));
				final TransactionalEditingDomain editingDomain = event.getEditingDomain();
				Command refreshcommand = new AbstractCommand(){
					
					@Override
					protected boolean prepare(){
						return true;
					}

					@Override
					public void execute() {
						for (Resource resource : editingDomain.getResourceSet().getResources()) {
							 for ( EObject object : resource.getContents()){
								 if ( object instanceof CitriqueDomain ){
									 CitriqueDomain domain = (CitriqueDomain)object;
									 CommonPlugin.INSTANCE.log( "..: refresh domain "+ domain.toString());
									 domain.refresh();
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
		});
		/*
		neweditingdomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			 public void commandStackChanged(final EventObject event) {
				// some command has done something
				CommonPlugin.INSTANCE.log( "Citrique diagram Command stack changed: "+ event.toString());
				for (Resource resource : neweditingdomain.getResourceSet().getResources()) {
					 for ( EObject object : resource.getContents()){
						 if ( object instanceof CitriqueDomain ){
							 CitriqueDomain domain = (CitriqueDomain)object;
							 CommonPlugin.INSTANCE.log( "..: refresh domain "+ domain.toString());
							 domain.refresh();
						 }  // traversed Object is a CitriqueDomain
					 }  // traverse the EObjects
				} // traverse the Resources
			 }  // command stack changed
		 }); // add command stack listener
		 */
		return neweditingdomain;
	}

	@Override
	public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
		CommonPlugin.INSTANCE.log( "Get Editing Domain Citrique, set"+rset.getResources().size());
		return super.getEditingDomain(rset);
	}

}
