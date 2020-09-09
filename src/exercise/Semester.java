/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.Semester#getTimeOfYear <em>Time Of Year</em>}</li>
 *   <li>{@link exercise.Semester#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link exercise.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link exercise.Semester#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Of Year</b></em>' attribute.
	 * The literals are from the enumeration {@link exercise.TimeOfYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Year</em>' attribute.
	 * @see exercise.TimeOfYear
	 * @see #setTimeOfYear(TimeOfYear)
	 * @see exercise.ExercisePackage#getSemester_TimeOfYear()
	 * @model required="true"
	 * @generated
	 */
	TimeOfYear getTimeOfYear();

	/**
	 * Sets the value of the '{@link exercise.Semester#getTimeOfYear <em>Time Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Year</em>' attribute.
	 * @see exercise.TimeOfYear
	 * @see #getTimeOfYear()
	 * @generated
	 */
	void setTimeOfYear(TimeOfYear value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see exercise.ExercisePackage#getSemester_CourseGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see exercise.ExercisePackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link exercise.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link exercise.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see exercise.ExercisePackage#getSemester_Programme()
	 * @see exercise.Programme#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link exercise.Semester#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // Semester
