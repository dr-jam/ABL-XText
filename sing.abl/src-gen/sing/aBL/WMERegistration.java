/**
 * generated by Xtext 2.28.0
 */
package sing.aBL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WME Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.WMERegistration#getWmeClass <em>Wme Class</em>}</li>
 *   <li>{@link sing.aBL.WMERegistration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sing.aBL.ABLPackage#getWMERegistration()
 * @model
 * @generated
 */
public interface WMERegistration extends AblDeclaration
{
  /**
   * Returns the value of the '<em><b>Wme Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wme Class</em>' attribute.
   * @see #setWmeClass(String)
   * @see sing.aBL.ABLPackage#getWMERegistration_WmeClass()
   * @model
   * @generated
   */
  String getWmeClass();

  /**
   * Sets the value of the '{@link sing.aBL.WMERegistration#getWmeClass <em>Wme Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wme Class</em>' attribute.
   * @see #getWmeClass()
   * @generated
   */
  void setWmeClass(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sing.aBL.ABLPackage#getWMERegistration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sing.aBL.WMERegistration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // WMERegistration
