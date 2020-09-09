/**
 */
package exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exercise.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link exercise.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link exercise.CourseGroup#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link exercise.CourseGroup#getCourseCriteria <em>Course Criteria</em>}</li>
 * </ul>
 *
 * @see exercise.ExercisePackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see exercise.ExercisePackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exercise.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link exercise.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see exercise.ExercisePackage#getCourseGroup_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' attribute list.
	 * @see exercise.ExercisePackage#getCourseGroup_MandatoryCourses()
	 * @model
	 * @generated
	 */
	EList<String> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Course Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Criteria</em>' containment reference.
	 * @see #setCourseCriteria(CourseCriteria)
	 * @see exercise.ExercisePackage#getCourseGroup_CourseCriteria()
	 * @model containment="true"
	 * @generated
	 */
	CourseCriteria getCourseCriteria();

	/**
	 * Sets the value of the '{@link exercise.CourseGroup#getCourseCriteria <em>Course Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Criteria</em>' containment reference.
	 * @see #getCourseCriteria()
	 * @generated
	 */
	void setCourseCriteria(CourseCriteria value);

} // CourseGroup