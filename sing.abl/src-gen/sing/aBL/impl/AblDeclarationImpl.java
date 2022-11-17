/**
 * generated by Xtext 2.28.0
 */
package sing.aBL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

import sing.aBL.ABLPackage;
import sing.aBL.AblDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abl Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.impl.AblDeclarationImpl#getAblVariable <em>Abl Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AblDeclarationImpl extends MinimalEObjectImpl.Container implements AblDeclaration
{
  /**
   * The cached value of the '{@link #getAblVariable() <em>Abl Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblVariable()
   * @generated
   * @ordered
   */
  protected XExpression ablVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AblDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ABLPackage.Literals.ABL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XExpression getAblVariable()
  {
    return ablVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAblVariable(XExpression newAblVariable, NotificationChain msgs)
  {
    XExpression oldAblVariable = ablVariable;
    ablVariable = newAblVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ABLPackage.ABL_DECLARATION__ABL_VARIABLE, oldAblVariable, newAblVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAblVariable(XExpression newAblVariable)
  {
    if (newAblVariable != ablVariable)
    {
      NotificationChain msgs = null;
      if (ablVariable != null)
        msgs = ((InternalEObject)ablVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ABLPackage.ABL_DECLARATION__ABL_VARIABLE, null, msgs);
      if (newAblVariable != null)
        msgs = ((InternalEObject)newAblVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ABLPackage.ABL_DECLARATION__ABL_VARIABLE, null, msgs);
      msgs = basicSetAblVariable(newAblVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ABLPackage.ABL_DECLARATION__ABL_VARIABLE, newAblVariable, newAblVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ABLPackage.ABL_DECLARATION__ABL_VARIABLE:
        return basicSetAblVariable(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ABLPackage.ABL_DECLARATION__ABL_VARIABLE:
        return getAblVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ABLPackage.ABL_DECLARATION__ABL_VARIABLE:
        setAblVariable((XExpression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ABLPackage.ABL_DECLARATION__ABL_VARIABLE:
        setAblVariable((XExpression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ABLPackage.ABL_DECLARATION__ABL_VARIABLE:
        return ablVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //AblDeclarationImpl