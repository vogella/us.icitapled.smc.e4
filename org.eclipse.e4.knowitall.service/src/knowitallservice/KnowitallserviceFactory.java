/**
 */
package knowitallservice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see knowitallservice.KnowitallservicePackage
 * @generated
 */
public interface KnowitallserviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KnowitallserviceFactory eINSTANCE = knowitallservice.impl.KnowitallserviceFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KnowitallservicePackage getKnowitallservicePackage();

} //KnowitallserviceFactory
