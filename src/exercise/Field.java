/**
 */
package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Field</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see exercise.ExercisePackage#getField()
 * @model
 * @generated
 */
public enum Field implements Enumerator {
	/**
	 * The '<em><b>Datateknikk og informasjonsvitenskap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNIKK_OG_INFORMASJONSVITENSKAP_VALUE
	 * @generated
	 * @ordered
	 */
	DATATEKNIKK_OG_INFORMASJONSVITENSKAP(0, "Datateknikk_og_informasjonsvitenskap", "Datateknikk_og_informasjonsvitenskap"),

	/**
	 * The '<em><b>Datateknikk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNIKK_VALUE
	 * @generated
	 * @ordered
	 */
	DATATEKNIKK(1, "Datateknikk", "Datateknikk"),

	/**
	 * The '<em><b>Informatikk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIKK_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIKK(2, "Informatikk", "Informatikk");

	/**
	 * The '<em><b>Datateknikk og informasjonsvitenskap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNIKK_OG_INFORMASJONSVITENSKAP
	 * @model name="Datateknikk_og_informasjonsvitenskap"
	 * @generated
	 * @ordered
	 */
	public static final int DATATEKNIKK_OG_INFORMASJONSVITENSKAP_VALUE = 0;

	/**
	 * The '<em><b>Datateknikk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATEKNIKK
	 * @model name="Datateknikk"
	 * @generated
	 * @ordered
	 */
	public static final int DATATEKNIKK_VALUE = 1;

	/**
	 * The '<em><b>Informatikk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIKK
	 * @model name="Informatikk"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIKK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Field[] VALUES_ARRAY =
		new Field[] {
			DATATEKNIKK_OG_INFORMASJONSVITENSKAP,
			DATATEKNIKK,
			INFORMATIKK,
		};

	/**
	 * A public read-only list of all the '<em><b>Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Field> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Field result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Field result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Field get(int value) {
		switch (value) {
			case DATATEKNIKK_OG_INFORMASJONSVITENSKAP_VALUE: return DATATEKNIKK_OG_INFORMASJONSVITENSKAP;
			case DATATEKNIKK_VALUE: return DATATEKNIKK;
			case INFORMATIKK_VALUE: return INFORMATIKK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Field(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Field
