/**
 */
package exercise.impl;

import exercise.Course;
import exercise.ExercisePackage;
import exercise.NTNU;
import exercise.Student;
import exercise.StudyPlan;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTNU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exercise.impl.NTNUImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link exercise.impl.NTNUImpl#getStudyPlans <em>Study Plans</em>}</li>
 *   <li>{@link exercise.impl.NTNUImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTNUImpl extends MinimalEObjectImpl.Container implements NTNU {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getStudyPlans() <em>Study Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlan> studyPlans;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NTNUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.NTNU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyPlan> getStudyPlans() {
		if (studyPlans == null) {
			studyPlans = new EObjectContainmentEList<StudyPlan>(StudyPlan.class, this, ExercisePackage.NTNU__STUDY_PLANS);
		}
		return studyPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, ExercisePackage.NTNU__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, ExercisePackage.NTNU__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.NTNU__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case ExercisePackage.NTNU__STUDY_PLANS:
				return ((InternalEList<?>)getStudyPlans()).basicRemove(otherEnd, msgs);
			case ExercisePackage.NTNU__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.NTNU__COURSES:
				return getCourses();
			case ExercisePackage.NTNU__STUDY_PLANS:
				return getStudyPlans();
			case ExercisePackage.NTNU__STUDENTS:
				return getStudents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExercisePackage.NTNU__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ExercisePackage.NTNU__STUDY_PLANS:
				getStudyPlans().clear();
				getStudyPlans().addAll((Collection<? extends StudyPlan>)newValue);
				return;
			case ExercisePackage.NTNU__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExercisePackage.NTNU__COURSES:
				getCourses().clear();
				return;
			case ExercisePackage.NTNU__STUDY_PLANS:
				getStudyPlans().clear();
				return;
			case ExercisePackage.NTNU__STUDENTS:
				getStudents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExercisePackage.NTNU__COURSES:
				return courses != null && !courses.isEmpty();
			case ExercisePackage.NTNU__STUDY_PLANS:
				return studyPlans != null && !studyPlans.isEmpty();
			case ExercisePackage.NTNU__STUDENTS:
				return students != null && !students.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NTNUImpl
