/**
 * generated by Xtext 2.28.0
 */
package sing.aBL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import sing.aBL.ABLPackage;
import sing.aBL.PropertyDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sing.aBL.impl.PropertyDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link sing.aBL.impl.PropertyDeclarationImpl#getAblName <em>Abl Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDeclarationImpl extends AblDeclarationImpl implements PropertyDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected XExpression type;

  /**
   * The default value of the '{@link #getAblName() <em>Abl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblName()
   * @generated
   * @ordered
   */
  protected static final String ABL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAblName() <em>Abl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblName()
   * @generated
   * @ordered
   */
  protected String ablName = ABL_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDeclarationImpl()
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
    return ABLPackage.Literals.PROPERTY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XExpression getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(XExpression newType, NotificationChain msgs)
  {
    XExpression oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ABLPackage.PROPERTY_DECLARATION__TYPE, oldType, newType);
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
  public void setType(XExpression newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ABLPackage.PROPERTY_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ABLPackage.PROPERTY_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ABLPackage.PROPERTY_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAblName()
  {
    return ablName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAblName(String newAblName)
  {
    String oldAblName = ablName;
    ablName = newAblName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ABLPackage.PROPERTY_DECLARATION__ABL_NAME, oldAblName, ablName));
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
      case ABLPackage.PROPERTY_DECLARATION__TYPE:
        return basicSetType(null, msgs);
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
      case ABLPackage.PROPERTY_DECLARATION__TYPE:
        return getType();
      case ABLPackage.PROPERTY_DECLARATION__ABL_NAME:
        return getAblName();
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
      case ABLPackage.PROPERTY_DECLARATION__TYPE:
        setType((XExpression)newValue);
        return;
      case ABLPackage.PROPERTY_DECLARATION__ABL_NAME:
        setAblName((String)newValue);
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
      case ABLPackage.PROPERTY_DECLARATION__TYPE:
        setType((XExpression)null);
        return;
      case ABLPackage.PROPERTY_DECLARATION__ABL_NAME:
        setAblName(ABL_NAME_EDEFAULT);
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
      case ABLPackage.PROPERTY_DECLARATION__TYPE:
        return type != null;
      case ABLPackage.PROPERTY_DECLARATION__ABL_NAME:
        return ABL_NAME_EDEFAULT == null ? ablName != null : !ABL_NAME_EDEFAULT.equals(ablName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ablName: ");
    result.append(ablName);
    result.append(')');
    return result.toString();
  }

} //PropertyDeclarationImpl
