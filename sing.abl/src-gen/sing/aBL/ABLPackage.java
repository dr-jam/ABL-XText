/**
 * generated by Xtext 2.28.0
 */
package sing.aBL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sing.aBL.ABLFactory
 * @model kind="package"
 * @generated
 */
public interface ABLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aBL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ABL.sing";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aBL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ABLPackage eINSTANCE = sing.aBL.impl.ABLPackageImpl.init();

  /**
   * The meta object id for the '{@link sing.aBL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.ModelImpl
   * @see sing.aBL.impl.ABLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONSTANTS = 2;

  /**
   * The feature id for the '<em><b>Behaving Entity Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BEHAVING_ENTITY_NAME = 3;

  /**
   * The feature id for the '<em><b>Team Needed For Success Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TEAM_NEEDED_FOR_SUCCESS_DEFAULT = 4;

  /**
   * The feature id for the '<em><b>Decision Cycle SM Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECISION_CYCLE_SM_CALL = 5;

  /**
   * The feature id for the '<em><b>Conflicits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONFLICITS = 6;

  /**
   * The feature id for the '<em><b>Abl Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ABL_DECLARATIONS = 7;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link sing.aBL.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.ImportDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sing.aBL.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.ConstantDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getConstantDeclaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Constant Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sing.aBL.impl.DecisionCycleSMCallDelcarationImpl <em>Decision Cycle SM Call Delcaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.DecisionCycleSMCallDelcarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getDecisionCycleSMCallDelcaration()
   * @generated
   */
  int DECISION_CYCLE_SM_CALL_DELCARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_CYCLE_SM_CALL_DELCARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Decision Cycle SM Call Delcaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_CYCLE_SM_CALL_DELCARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sing.aBL.impl.ConflictDeclarationImpl <em>Conflict Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.ConflictDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getConflictDeclaration()
   * @generated
   */
  int CONFLICT_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Conflict Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT_DECLARATION__CONFLICT_NAMES = 0;

  /**
   * The number of structural features of the '<em>Conflict Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sing.aBL.impl.AblDeclarationImpl <em>Abl Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.AblDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getAblDeclaration()
   * @generated
   */
  int ABL_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Abl Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABL_DECLARATION__ABL_VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Abl Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABL_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sing.aBL.impl.WMERegistrationImpl <em>WME Registration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.WMERegistrationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getWMERegistration()
   * @generated
   */
  int WME_REGISTRATION = 6;

  /**
   * The feature id for the '<em><b>Abl Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_REGISTRATION__ABL_VARIABLE = ABL_DECLARATION__ABL_VARIABLE;

  /**
   * The feature id for the '<em><b>Wme Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_REGISTRATION__WME_CLASS = ABL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_REGISTRATION__NAME = ABL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>WME Registration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_REGISTRATION_FEATURE_COUNT = ABL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sing.aBL.impl.ActionRegistrationImpl <em>Action Registration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.ActionRegistrationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getActionRegistration()
   * @generated
   */
  int ACTION_REGISTRATION = 7;

  /**
   * The feature id for the '<em><b>Abl Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION__ABL_VARIABLE = ABL_DECLARATION__ABL_VARIABLE;

  /**
   * The feature id for the '<em><b>Abl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION__ABL_NAME = ABL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abl Name2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION__ABL_NAME2 = ABL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION__TYPES = ABL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Act Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION__ACT_NAME = ABL_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Action Registration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REGISTRATION_FEATURE_COUNT = ABL_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link sing.aBL.impl.WMEDeclarationImpl <em>WME Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.WMEDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getWMEDeclaration()
   * @generated
   */
  int WME_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Abl Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_DECLARATION__ABL_VARIABLE = ABL_DECLARATION__ABL_VARIABLE;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_DECLARATION__VAR_NAME = ABL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extend Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_DECLARATION__EXTEND_NAME = ABL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abl Variable Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_DECLARATION__ABL_VARIABLE_DECLARATION = ABL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>WME Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WME_DECLARATION_FEATURE_COUNT = ABL_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sing.aBL.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.PropertyDeclarationImpl
   * @see sing.aBL.impl.ABLPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Abl Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__ABL_VARIABLE = ABL_DECLARATION__ABL_VARIABLE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__TYPE = ABL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abl Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__ABL_NAME = ABL_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = ABL_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sing.aBL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sing.aBL.impl.TypeImpl
   * @see sing.aBL.impl.ABLPackageImpl#getType()
   * @generated
   */
  int TYPE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link sing.aBL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see sing.aBL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sing.aBL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link sing.aBL.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see sing.aBL.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link sing.aBL.Model#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see sing.aBL.Model#getConstants()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Constants();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.Model#getBehavingEntityName <em>Behaving Entity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behaving Entity Name</em>'.
   * @see sing.aBL.Model#getBehavingEntityName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_BehavingEntityName();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.Model#getTeamNeededForSuccessDefault <em>Team Needed For Success Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Team Needed For Success Default</em>'.
   * @see sing.aBL.Model#getTeamNeededForSuccessDefault()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_TeamNeededForSuccessDefault();

  /**
   * Returns the meta object for the containment reference '{@link sing.aBL.Model#getDecisionCycleSMCall <em>Decision Cycle SM Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decision Cycle SM Call</em>'.
   * @see sing.aBL.Model#getDecisionCycleSMCall()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DecisionCycleSMCall();

  /**
   * Returns the meta object for the containment reference list '{@link sing.aBL.Model#getConflicits <em>Conflicits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conflicits</em>'.
   * @see sing.aBL.Model#getConflicits()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Conflicits();

  /**
   * Returns the meta object for the containment reference list '{@link sing.aBL.Model#getAblDeclarations <em>Abl Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abl Declarations</em>'.
   * @see sing.aBL.Model#getAblDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AblDeclarations();

  /**
   * Returns the meta object for class '{@link sing.aBL.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see sing.aBL.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.ImportDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sing.aBL.ImportDeclaration#getName()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_Name();

  /**
   * Returns the meta object for class '{@link sing.aBL.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Declaration</em>'.
   * @see sing.aBL.ConstantDeclaration
   * @generated
   */
  EClass getConstantDeclaration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.ConstantDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sing.aBL.ConstantDeclaration#getName()
   * @see #getConstantDeclaration()
   * @generated
   */
  EAttribute getConstantDeclaration_Name();

  /**
   * Returns the meta object for class '{@link sing.aBL.DecisionCycleSMCallDelcaration <em>Decision Cycle SM Call Delcaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Cycle SM Call Delcaration</em>'.
   * @see sing.aBL.DecisionCycleSMCallDelcaration
   * @generated
   */
  EClass getDecisionCycleSMCallDelcaration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.DecisionCycleSMCallDelcaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sing.aBL.DecisionCycleSMCallDelcaration#getName()
   * @see #getDecisionCycleSMCallDelcaration()
   * @generated
   */
  EAttribute getDecisionCycleSMCallDelcaration_Name();

  /**
   * Returns the meta object for class '{@link sing.aBL.ConflictDeclaration <em>Conflict Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conflict Declaration</em>'.
   * @see sing.aBL.ConflictDeclaration
   * @generated
   */
  EClass getConflictDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link sing.aBL.ConflictDeclaration#getConflictNames <em>Conflict Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Conflict Names</em>'.
   * @see sing.aBL.ConflictDeclaration#getConflictNames()
   * @see #getConflictDeclaration()
   * @generated
   */
  EAttribute getConflictDeclaration_ConflictNames();

  /**
   * Returns the meta object for class '{@link sing.aBL.AblDeclaration <em>Abl Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abl Declaration</em>'.
   * @see sing.aBL.AblDeclaration
   * @generated
   */
  EClass getAblDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link sing.aBL.AblDeclaration#getAblVariable <em>Abl Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abl Variable</em>'.
   * @see sing.aBL.AblDeclaration#getAblVariable()
   * @see #getAblDeclaration()
   * @generated
   */
  EReference getAblDeclaration_AblVariable();

  /**
   * Returns the meta object for class '{@link sing.aBL.WMERegistration <em>WME Registration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WME Registration</em>'.
   * @see sing.aBL.WMERegistration
   * @generated
   */
  EClass getWMERegistration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.WMERegistration#getWmeClass <em>Wme Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wme Class</em>'.
   * @see sing.aBL.WMERegistration#getWmeClass()
   * @see #getWMERegistration()
   * @generated
   */
  EAttribute getWMERegistration_WmeClass();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.WMERegistration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sing.aBL.WMERegistration#getName()
   * @see #getWMERegistration()
   * @generated
   */
  EAttribute getWMERegistration_Name();

  /**
   * Returns the meta object for class '{@link sing.aBL.ActionRegistration <em>Action Registration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Registration</em>'.
   * @see sing.aBL.ActionRegistration
   * @generated
   */
  EClass getActionRegistration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.ActionRegistration#getAblName <em>Abl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abl Name</em>'.
   * @see sing.aBL.ActionRegistration#getAblName()
   * @see #getActionRegistration()
   * @generated
   */
  EAttribute getActionRegistration_AblName();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.ActionRegistration#getAblName2 <em>Abl Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abl Name2</em>'.
   * @see sing.aBL.ActionRegistration#getAblName2()
   * @see #getActionRegistration()
   * @generated
   */
  EAttribute getActionRegistration_AblName2();

  /**
   * Returns the meta object for the attribute list '{@link sing.aBL.ActionRegistration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Types</em>'.
   * @see sing.aBL.ActionRegistration#getTypes()
   * @see #getActionRegistration()
   * @generated
   */
  EAttribute getActionRegistration_Types();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.ActionRegistration#getActName <em>Act Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Act Name</em>'.
   * @see sing.aBL.ActionRegistration#getActName()
   * @see #getActionRegistration()
   * @generated
   */
  EAttribute getActionRegistration_ActName();

  /**
   * Returns the meta object for class '{@link sing.aBL.WMEDeclaration <em>WME Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WME Declaration</em>'.
   * @see sing.aBL.WMEDeclaration
   * @generated
   */
  EClass getWMEDeclaration();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.WMEDeclaration#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see sing.aBL.WMEDeclaration#getVarName()
   * @see #getWMEDeclaration()
   * @generated
   */
  EAttribute getWMEDeclaration_VarName();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.WMEDeclaration#getExtendName <em>Extend Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extend Name</em>'.
   * @see sing.aBL.WMEDeclaration#getExtendName()
   * @see #getWMEDeclaration()
   * @generated
   */
  EAttribute getWMEDeclaration_ExtendName();

  /**
   * Returns the meta object for the containment reference list '{@link sing.aBL.WMEDeclaration#getAblVariableDeclaration <em>Abl Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abl Variable Declaration</em>'.
   * @see sing.aBL.WMEDeclaration#getAblVariableDeclaration()
   * @see #getWMEDeclaration()
   * @generated
   */
  EReference getWMEDeclaration_AblVariableDeclaration();

  /**
   * Returns the meta object for class '{@link sing.aBL.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see sing.aBL.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link sing.aBL.PropertyDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see sing.aBL.PropertyDeclaration#getType()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.PropertyDeclaration#getAblName <em>Abl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abl Name</em>'.
   * @see sing.aBL.PropertyDeclaration#getAblName()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EAttribute getPropertyDeclaration_AblName();

  /**
   * Returns the meta object for class '{@link sing.aBL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see sing.aBL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link sing.aBL.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see sing.aBL.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ABLFactory getABLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sing.aBL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.ModelImpl
     * @see sing.aBL.impl.ABLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONSTANTS = eINSTANCE.getModel_Constants();

    /**
     * The meta object literal for the '<em><b>Behaving Entity Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__BEHAVING_ENTITY_NAME = eINSTANCE.getModel_BehavingEntityName();

    /**
     * The meta object literal for the '<em><b>Team Needed For Success Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__TEAM_NEEDED_FOR_SUCCESS_DEFAULT = eINSTANCE.getModel_TeamNeededForSuccessDefault();

    /**
     * The meta object literal for the '<em><b>Decision Cycle SM Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECISION_CYCLE_SM_CALL = eINSTANCE.getModel_DecisionCycleSMCall();

    /**
     * The meta object literal for the '<em><b>Conflicits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONFLICITS = eINSTANCE.getModel_Conflicits();

    /**
     * The meta object literal for the '<em><b>Abl Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ABL_DECLARATIONS = eINSTANCE.getModel_AblDeclarations();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.ImportDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__NAME = eINSTANCE.getImportDeclaration_Name();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.ConstantDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getConstantDeclaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__NAME = eINSTANCE.getConstantDeclaration_Name();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.DecisionCycleSMCallDelcarationImpl <em>Decision Cycle SM Call Delcaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.DecisionCycleSMCallDelcarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getDecisionCycleSMCallDelcaration()
     * @generated
     */
    EClass DECISION_CYCLE_SM_CALL_DELCARATION = eINSTANCE.getDecisionCycleSMCallDelcaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION_CYCLE_SM_CALL_DELCARATION__NAME = eINSTANCE.getDecisionCycleSMCallDelcaration_Name();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.ConflictDeclarationImpl <em>Conflict Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.ConflictDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getConflictDeclaration()
     * @generated
     */
    EClass CONFLICT_DECLARATION = eINSTANCE.getConflictDeclaration();

    /**
     * The meta object literal for the '<em><b>Conflict Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFLICT_DECLARATION__CONFLICT_NAMES = eINSTANCE.getConflictDeclaration_ConflictNames();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.AblDeclarationImpl <em>Abl Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.AblDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getAblDeclaration()
     * @generated
     */
    EClass ABL_DECLARATION = eINSTANCE.getAblDeclaration();

    /**
     * The meta object literal for the '<em><b>Abl Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABL_DECLARATION__ABL_VARIABLE = eINSTANCE.getAblDeclaration_AblVariable();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.WMERegistrationImpl <em>WME Registration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.WMERegistrationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getWMERegistration()
     * @generated
     */
    EClass WME_REGISTRATION = eINSTANCE.getWMERegistration();

    /**
     * The meta object literal for the '<em><b>Wme Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WME_REGISTRATION__WME_CLASS = eINSTANCE.getWMERegistration_WmeClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WME_REGISTRATION__NAME = eINSTANCE.getWMERegistration_Name();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.ActionRegistrationImpl <em>Action Registration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.ActionRegistrationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getActionRegistration()
     * @generated
     */
    EClass ACTION_REGISTRATION = eINSTANCE.getActionRegistration();

    /**
     * The meta object literal for the '<em><b>Abl Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_REGISTRATION__ABL_NAME = eINSTANCE.getActionRegistration_AblName();

    /**
     * The meta object literal for the '<em><b>Abl Name2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_REGISTRATION__ABL_NAME2 = eINSTANCE.getActionRegistration_AblName2();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_REGISTRATION__TYPES = eINSTANCE.getActionRegistration_Types();

    /**
     * The meta object literal for the '<em><b>Act Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_REGISTRATION__ACT_NAME = eINSTANCE.getActionRegistration_ActName();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.WMEDeclarationImpl <em>WME Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.WMEDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getWMEDeclaration()
     * @generated
     */
    EClass WME_DECLARATION = eINSTANCE.getWMEDeclaration();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WME_DECLARATION__VAR_NAME = eINSTANCE.getWMEDeclaration_VarName();

    /**
     * The meta object literal for the '<em><b>Extend Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WME_DECLARATION__EXTEND_NAME = eINSTANCE.getWMEDeclaration_ExtendName();

    /**
     * The meta object literal for the '<em><b>Abl Variable Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WME_DECLARATION__ABL_VARIABLE_DECLARATION = eINSTANCE.getWMEDeclaration_AblVariableDeclaration();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.PropertyDeclarationImpl
     * @see sing.aBL.impl.ABLPackageImpl#getPropertyDeclaration()
     * @generated
     */
    EClass PROPERTY_DECLARATION = eINSTANCE.getPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DECLARATION__TYPE = eINSTANCE.getPropertyDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Abl Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DECLARATION__ABL_NAME = eINSTANCE.getPropertyDeclaration_AblName();

    /**
     * The meta object literal for the '{@link sing.aBL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sing.aBL.impl.TypeImpl
     * @see sing.aBL.impl.ABLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

  }

} //ABLPackage
