/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.Year#getYearOfProgramme <em>Year Of Programme</em>}</li>
 *   <li>{@link exercise.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link exercise.Year#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkSemesters'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Year Of Programme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Of Programme</em>' attribute.
	 * @see #setYearOfProgramme(int)
	 * @see exercise.ExercisePackage#getYear_YearOfProgramme()
	 * @model
	 * @generated
	 */
	int getYearOfProgramme();

	/**
	 * Sets the value of the '{@link exercise.Year#getYearOfProgramme <em>Year Of Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Of Programme</em>' attribute.
	 * @see #getYearOfProgramme()
	 * @generated
	 */
	void setYearOfProgramme(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see exercise.ExercisePackage#getYear_Semesters()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see exercise.ExercisePackage#getYear_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

} // Year
