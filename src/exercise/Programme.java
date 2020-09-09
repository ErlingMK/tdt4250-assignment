/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.Programme#getName <em>Name</em>}</li>
 *   <li>{@link exercise.Programme#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link exercise.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link exercise.Programme#getNumberOfYears <em>Number Of Years</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validateMaxNumberOfSemesters'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 validateMaxNumberOfSemesters='self.semesters-&gt;size() &lt;= self.numberOfYears*2'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see exercise.ExercisePackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exercise.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see exercise.ExercisePackage#getProgramme_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.Semester}.
	 * It is bidirectional and its opposite is '{@link exercise.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see exercise.ExercisePackage#getProgramme_Semesters()
	 * @see exercise.Semester#getProgramme
	 * @model opposite="programme" containment="true" lower="4" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see exercise.ExercisePackage#getProgramme_NumberOfYears()
	 * @model
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link exercise.Programme#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

} // Programme
