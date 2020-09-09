/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTNU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.NTNU#getStudyPlans <em>Study Plans</em>}</li>
 *   <li>{@link exercise.NTNU#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getNTNU()
 * @model
 * @generated
 */
public interface NTNU extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Plans</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plans</em>' containment reference list.
	 * @see exercise.ExercisePackage#getNTNU_StudyPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyPlans();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link exercise.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see exercise.ExercisePackage#getNTNU_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // NTNU
