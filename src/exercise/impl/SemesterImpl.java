/**
 */
package exercise.impl;

import exercise.CourseCriteria;
import exercise.CourseGroup;
import exercise.ExercisePackage;
import exercise.Semester;
import exercise.TimeOfYear;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exercise.impl.SemesterImpl#getTimeOfYear <em>Time Of Year</em>}</li>
 *   <li>{@link exercise.impl.SemesterImpl#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link exercise.impl.SemesterImpl#getCourseCriteriums <em>Course Criteriums</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getTimeOfYear() <em>Time Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final TimeOfYear TIME_OF_YEAR_EDEFAULT = TimeOfYear.FALL;

	/**
	 * The cached value of the '{@link #getTimeOfYear() <em>Time Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfYear()
	 * @generated
	 * @ordered
	 */
	protected TimeOfYear timeOfYear = TIME_OF_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * The cached value of the '{@link #getCourseCriteriums() <em>Course Criteriums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCriteriums()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseCriteria> courseCriteriums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOfYear getTimeOfYear() {
		return timeOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfYear(TimeOfYear newTimeOfYear) {
		TimeOfYear oldTimeOfYear = timeOfYear;
		timeOfYear = newTimeOfYear == null ? TIME_OF_YEAR_EDEFAULT : newTimeOfYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.SEMESTER__TIME_OF_YEAR, oldTimeOfYear, timeOfYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, ExercisePackage.SEMESTER__COURSE_GROUPS);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseCriteria> getCourseCriteriums() {
		if (courseCriteriums == null) {
			courseCriteriums = new EObjectContainmentEList<CourseCriteria>(CourseCriteria.class, this, ExercisePackage.SEMESTER__COURSE_CRITERIUMS);
		}
		return courseCriteriums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
			case ExercisePackage.SEMESTER__COURSE_CRITERIUMS:
				return ((InternalEList<?>)getCourseCriteriums()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.SEMESTER__TIME_OF_YEAR:
				return getTimeOfYear();
			case ExercisePackage.SEMESTER__COURSE_GROUPS:
				return getCourseGroups();
			case ExercisePackage.SEMESTER__COURSE_CRITERIUMS:
				return getCourseCriteriums();
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
			case ExercisePackage.SEMESTER__TIME_OF_YEAR:
				setTimeOfYear((TimeOfYear)newValue);
				return;
			case ExercisePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case ExercisePackage.SEMESTER__COURSE_CRITERIUMS:
				getCourseCriteriums().clear();
				getCourseCriteriums().addAll((Collection<? extends CourseCriteria>)newValue);
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
			case ExercisePackage.SEMESTER__TIME_OF_YEAR:
				setTimeOfYear(TIME_OF_YEAR_EDEFAULT);
				return;
			case ExercisePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				return;
			case ExercisePackage.SEMESTER__COURSE_CRITERIUMS:
				getCourseCriteriums().clear();
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
			case ExercisePackage.SEMESTER__TIME_OF_YEAR:
				return timeOfYear != TIME_OF_YEAR_EDEFAULT;
			case ExercisePackage.SEMESTER__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
			case ExercisePackage.SEMESTER__COURSE_CRITERIUMS:
				return courseCriteriums != null && !courseCriteriums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timeOfYear: ");
		result.append(timeOfYear);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
