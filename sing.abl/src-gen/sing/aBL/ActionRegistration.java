/**
 * generated by Xtext 2.28.0
 */
package sing.aBL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.ActionRegistration#getAblName <em>Abl Name</em>}</li>
 *   <li>{@link sing.aBL.ActionRegistration#getAblName2 <em>Abl Name2</em>}</li>
 *   <li>{@link sing.aBL.ActionRegistration#getTypes <em>Types</em>}</li>
 *   <li>{@link sing.aBL.ActionRegistration#getActName <em>Act Name</em>}</li>
 * </ul>
 *
 * @see sing.aBL.ABLPackage#getActionRegistration()
 * @model
 * @generated
 */
public interface ActionRegistration extends AblDeclaration
{
  /**
   * Returns the value of the '<em><b>Abl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abl Name</em>' attribute.
   * @see #setAblName(String)
   * @see sing.aBL.ABLPackage#getActionRegistration_AblName()
   * @model
   * @generated
   */
  String getAblName();

  /**
   * Sets the value of the '{@link sing.aBL.ActionRegistration#getAblName <em>Abl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abl Name</em>' attribute.
   * @see #getAblName()
   * @generated
   */
  void setAblName(String value);

  /**
   * Returns the value of the '<em><b>Abl Name2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abl Name2</em>' attribute.
   * @see #setAblName2(String)
   * @see sing.aBL.ABLPackage#getActionRegistration_AblName2()
   * @model
   * @generated
   */
  String getAblName2();

  /**
   * Sets the value of the '{@link sing.aBL.ActionRegistration#getAblName2 <em>Abl Name2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abl Name2</em>' attribute.
   * @see #getAblName2()
   * @generated
   */
  void setAblName2(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see sing.aBL.ABLPackage#getActionRegistration_Types()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypes();

  /**
   * Returns the value of the '<em><b>Act Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act Name</em>' attribute.
   * @see #setActName(String)
   * @see sing.aBL.ABLPackage#getActionRegistration_ActName()
   * @model
   * @generated
   */
  String getActName();

  /**
   * Sets the value of the '{@link sing.aBL.ActionRegistration#getActName <em>Act Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act Name</em>' attribute.
   * @see #getActName()
   * @generated
   */
  void setActName(String value);

} // ActionRegistration