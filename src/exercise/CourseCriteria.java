/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.CourseCriteria#getLevel <em>Level</em>}</li>
 *   <li>{@link exercise.CourseCriteria#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getCourseCriteria()
 * @model
 * @generated
 */
public interface CourseCriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see exercise.ExercisePackage#getCourseCriteria_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link exercise.CourseCriteria#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute list.
	 * The list contents are of type {@link exercise.Field}.
	 * The literals are from the enumeration {@link exercise.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute list.
	 * @see exercise.Field
	 * @see exercise.ExercisePackage#getCourseCriteria_Field()
	 * @model
	 * @generated
	 */
	EList<Field> getField();

} // CourseCriteria
