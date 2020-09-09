/**
 */
package exercise.impl;

import exercise.CourseCriteria;
import exercise.CourseGroup;
import exercise.ExercisePackage;
import exercise.Programme;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link exercise.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link exercise.impl.SemesterImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link exercise.impl.SemesterImpl#getCourseCriteria <em>Course Criteria</em>}</li>
 *   <li>{@link exercise.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
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
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseCriteria() <em>Course Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCriteria()
	 * @generated
	 * @ordered
	 */
	protected CourseCriteria courseCriteria;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mandatoryCourses;

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
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgramme() {
		if (eContainerFeatureID() != ExercisePackage.SEMESTER__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, ExercisePackage.SEMESTER__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != ExercisePackage.SEMESTER__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, ExercisePackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.SEMESTER__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseCriteria getCourseCriteria() {
		return courseCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseCriteria(CourseCriteria newCourseCriteria, NotificationChain msgs) {
		CourseCriteria oldCourseCriteria = courseCriteria;
		courseCriteria = newCourseCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExercisePackage.SEMESTER__COURSE_CRITERIA, oldCourseCriteria, newCourseCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCriteria(CourseCriteria newCourseCriteria) {
		if (newCourseCriteria != courseCriteria) {
			NotificationChain msgs = null;
			if (courseCriteria != null)
				msgs = ((InternalEObject)courseCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.SEMESTER__COURSE_CRITERIA, null, msgs);
			if (newCourseCriteria != null)
				msgs = ((InternalEObject)newCourseCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.SEMESTER__COURSE_CRITERIA, null, msgs);
			msgs = basicSetCourseCriteria(newCourseCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.SEMESTER__COURSE_CRITERIA, newCourseCriteria, newCourseCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EDataTypeUniqueEList<String>(String.class, this, ExercisePackage.SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.SEMESTER__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ExercisePackage.SEMESTER__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case ExercisePackage.SEMESTER__COURSE_CRITERIA:
				return basicSetCourseCriteria(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExercisePackage.SEMESTER__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, ExercisePackage.PROGRAMME__SEMESTERS, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ExercisePackage.SEMESTER__YEAR:
				return getYear();
			case ExercisePackage.SEMESTER__PROGRAMME:
				return getProgramme();
			case ExercisePackage.SEMESTER__COURSE_CRITERIA:
				return getCourseCriteria();
			case ExercisePackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
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
			case ExercisePackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case ExercisePackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case ExercisePackage.SEMESTER__COURSE_CRITERIA:
				setCourseCriteria((CourseCriteria)newValue);
				return;
			case ExercisePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends String>)newValue);
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
			case ExercisePackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ExercisePackage.SEMESTER__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case ExercisePackage.SEMESTER__COURSE_CRITERIA:
				setCourseCriteria((CourseCriteria)null);
				return;
			case ExercisePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
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
			case ExercisePackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case ExercisePackage.SEMESTER__PROGRAMME:
				return getProgramme() != null;
			case ExercisePackage.SEMESTER__COURSE_CRITERIA:
				return courseCriteria != null;
			case ExercisePackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
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
		result.append(", year: ");
		result.append(year);
		result.append(", mandatoryCourses: ");
		result.append(mandatoryCourses);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
