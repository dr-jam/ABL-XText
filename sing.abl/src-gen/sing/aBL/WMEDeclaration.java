/**
 * generated by Xtext 2.28.0
 */
package sing.aBL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WME Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.WMEDeclaration#getVarName <em>Var Name</em>}</li>
 *   <li>{@link sing.aBL.WMEDeclaration#getExtendName <em>Extend Name</em>}</li>
 *   <li>{@link sing.aBL.WMEDeclaration#getAblVariableDeclaration <em>Abl Variable Declaration</em>}</li>
 * </ul>
 *
 * @see sing.aBL.ABLPackage#getWMEDeclaration()
 * @model
 * @generated
 */
public interface WMEDeclaration extends AblDeclaration
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see sing.aBL.ABLPackage#getWMEDeclaration_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link sing.aBL.WMEDeclaration#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Extend Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend Name</em>' attribute.
   * @see #setExtendName(String)
   * @see sing.aBL.ABLPackage#getWMEDeclaration_ExtendName()
   * @model
   * @generated
   */
  String getExtendName();

  /**
   * Sets the value of the '{@link sing.aBL.WMEDeclaration#getExtendName <em>Extend Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend Name</em>' attribute.
   * @see #getExtendName()
   * @generated
   */
  void setExtendName(String value);

  /**
   * Returns the value of the '<em><b>Abl Variable Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abl Variable Declaration</em>' containment reference list.
   * @see sing.aBL.ABLPackage#getWMEDeclaration_AblVariableDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getAblVariableDeclaration();

} // WMEDeclaration
