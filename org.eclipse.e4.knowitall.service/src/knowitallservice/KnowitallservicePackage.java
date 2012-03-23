/**
 */
package knowitallservice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see knowitallservice.KnowitallserviceFactory
 * @model kind="package"
 * @generated
 */
public interface KnowitallservicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "knowitallservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://knowitallservice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "knowitallservice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KnowitallservicePackage eINSTANCE = knowitallservice.impl.KnowitallservicePackageImpl.init();

	/**
	 * The meta object id for the '{@link knowitallservice.IKnowItAll <em>IKnow It All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowitallservice.IKnowItAll
	 * @see knowitallservice.impl.KnowitallservicePackageImpl#getIKnowItAll()
	 * @generated
	 */
	int IKNOW_IT_ALL = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKNOW_IT_ALL__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKNOW_IT_ALL__ANSWER = 1;

	/**
	 * The number of structural features of the '<em>IKnow It All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IKNOW_IT_ALL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link knowitallservice.IKnowItAll <em>IKnow It All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IKnow It All</em>'.
	 * @see knowitallservice.IKnowItAll
	 * @generated
	 */
	EClass getIKnowItAll();

	/**
	 * Returns the meta object for the attribute '{@link knowitallservice.IKnowItAll#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see knowitallservice.IKnowItAll#getQuestion()
	 * @see #getIKnowItAll()
	 * @generated
	 */
	EAttribute getIKnowItAll_Question();

	/**
	 * Returns the meta object for the attribute '{@link knowitallservice.IKnowItAll#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see knowitallservice.IKnowItAll#getAnswer()
	 * @see #getIKnowItAll()
	 * @generated
	 */
	EAttribute getIKnowItAll_Answer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KnowitallserviceFactory getKnowitallserviceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link knowitallservice.IKnowItAll <em>IKnow It All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowitallservice.IKnowItAll
		 * @see knowitallservice.impl.KnowitallservicePackageImpl#getIKnowItAll()
		 * @generated
		 */
		EClass IKNOW_IT_ALL = eINSTANCE.getIKnowItAll();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IKNOW_IT_ALL__QUESTION = eINSTANCE.getIKnowItAll_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IKNOW_IT_ALL__ANSWER = eINSTANCE.getIKnowItAll_Answer();

	}

} //KnowitallservicePackage
