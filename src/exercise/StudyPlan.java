/**
 */
package exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.StudyPlan#getProgramme <em>Programme</em>}</li>
 *   <li>{@link exercise.StudyPlan#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference.
	 * @see #setProgramme(Programme)
	 * @see exercise.ExercisePackage#getStudyPlan_Programme()
	 * @model containment="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link exercise.StudyPlan#getProgramme <em>Programme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' containment reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exercise.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see exercise.ExercisePackage#getStudyPlan_Student()
	 * @see exercise.Student#getStudyPlan
	 * @model opposite="studyPlan"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link exercise.StudyPlan#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // StudyPlan
