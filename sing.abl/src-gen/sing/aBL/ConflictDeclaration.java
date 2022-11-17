/**
 * generated by Xtext 2.28.0
 */
package sing.aBL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.ConflictDeclaration#getConflictNames <em>Conflict Names</em>}</li>
 * </ul>
 *
 * @see sing.aBL.ABLPackage#getConflictDeclaration()
 * @model
 * @generated
 */
public interface ConflictDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Conflict Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Names</em>' attribute list.
   * @see sing.aBL.ABLPackage#getConflictDeclaration_ConflictNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getConflictNames();

} // ConflictDeclaration
