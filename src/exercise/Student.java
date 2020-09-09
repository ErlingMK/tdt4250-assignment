/**
 */
package exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.Student#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exercise.StudyPlan#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see exercise.ExercisePackage#getStudent_StudyPlan()
	 * @see exercise.StudyPlan#getStudent
	 * @model opposite="student"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link exercise.Student#getStudyPlan <em>Study Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // Student
