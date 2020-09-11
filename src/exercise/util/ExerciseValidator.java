/**
 */
package exercise.util;

import exercise.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see exercise.ExercisePackage
 * @generated
 */
public class ExerciseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExerciseValidator INSTANCE = new ExerciseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "exercise";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExercisePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExercisePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ExercisePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case ExercisePackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case ExercisePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case ExercisePackage.COURSE_CRITERIA:
				return validateCourseCriteria((CourseCriteria)value, diagnostics, context);
			case ExercisePackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case ExercisePackage.NTNU:
				return validateNTNU((NTNU)value, diagnostics, context);
			case ExercisePackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case ExercisePackage.TIME_OF_YEAR:
				return validateTimeOfYear((TimeOfYear)value, diagnostics, context);
			case ExercisePackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_validateMaxNumberOfSemesters(programme, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validateMaxNumberOfSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAMME__VALIDATE_MAX_NUMBER_OF_SEMESTERS__EEXPRESSION = "self.semesters->size() <= self.numberOfYears*2";

	/**
	 * Validates the validateMaxNumberOfSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme_validateMaxNumberOfSemesters(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExercisePackage.Literals.PROGRAMME,
				 programme,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateMaxNumberOfSemesters",
				 PROGRAMME__VALIDATE_MAX_NUMBER_OF_SEMESTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialisation_semestersMustBeContainedInParentProgramme(specialisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialisation_durationCantBeLongerThanParentProgrammeDuration(specialisation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the semestersMustBeContainedInParentProgramme constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSpecialisation_semestersMustBeContainedInParentProgramme(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = false;
		
		Programme parentProgramme = (Programme) specialisation.eContainer();
		EList<Semester> semesters = specialisation.getSemesters();
		
		for (Semester semester : semesters) {			
			isValid = parentProgramme.getSemesters().contains(semester);
			if (!isValid) break;
		}
		
		if (!isValid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "semestersMustBeContainedInParentProgramme", getObjectLabel(specialisation, context) },
						 new Object[] { specialisation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the durationCantBeLongerThanParentProgrammeDuration constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALISATION__DURATION_CANT_BE_LONGER_THAN_PARENT_PROGRAMME_DURATION__EEXPRESSION = "self.duration <= self.eContainer().numberOfYears";

	/**
	 * Validates the durationCantBeLongerThanParentProgrammeDuration constraint of '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation_durationCantBeLongerThanParentProgrammeDuration(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExercisePackage.Literals.SPECIALISATION,
				 specialisation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "durationCantBeLongerThanParentProgrammeDuration",
				 SPECIALISATION__DURATION_CANT_BE_LONGER_THAN_PARENT_PROGRAMME_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_courseGroupsMustContainMandatoryCourses(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_coursesMustFulfillCourseCriteria(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseGroupsMustContainMandatoryCourses constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_courseGroupsMustContainMandatoryCourses(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = false; 
		
		EList<CourseGroup> courseGroups = semester.getCourseGroups();
		EList<String> mandatoryCourses = semester.getMandatoryCourses();
		
		for (String mandatoryCourse : mandatoryCourses) {
			boolean courseExists = false;
			
			for (CourseGroup group : courseGroups) {
				if (courseExists) break;
				EList<Course> courses = group.getCourses();
				
				for (Course course : courses) {
					if (course.getCode().equals(mandatoryCourse)) {
						courseExists = true;
						break;
					}
				}
			}
			isValid = courseExists;
		}
		
		
		// Ensure that you remove @generated or mark it @generated NOT
		if (isValid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseGroupsMustContainMandatoryCourses", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the coursesMustFulfillCourseCriteria constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_coursesMustFulfillCourseCriteria(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "coursesMustFulfillCourseCriteria", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCriteria(CourseCriteria courseCriteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseCriteria, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNTNU(NTNU ntnu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ntnu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOfYear(TimeOfYear timeOfYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ExerciseValidator
