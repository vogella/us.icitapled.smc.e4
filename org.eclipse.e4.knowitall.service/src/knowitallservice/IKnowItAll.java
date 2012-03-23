/**
 */
package knowitallservice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IKnow It All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link knowitallservice.IKnowItAll#getQuestion <em>Question</em>}</li>
 *   <li>{@link knowitallservice.IKnowItAll#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see knowitallservice.KnowitallservicePackage#getIKnowItAll()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IKnowItAll extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see knowitallservice.KnowitallservicePackage#getIKnowItAll_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link knowitallservice.IKnowItAll#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see knowitallservice.KnowitallservicePackage#getIKnowItAll_Answer()
	 * @model
	 * @generated
	 */
	String getAnswer();

	/**
	 * Sets the value of the '{@link knowitallservice.IKnowItAll#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String answer(String question);

} // IKnowItAll
