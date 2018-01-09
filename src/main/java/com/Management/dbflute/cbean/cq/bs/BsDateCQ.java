package com.Management.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.Management.dbflute.cbean.cq.ciq.*;
import com.Management.dbflute.cbean.*;
import com.Management.dbflute.cbean.cq.*;

/**
 * The base condition-query of date.
 * @author DBFlute(AutoGenerator)
 */
public class BsDateCQ extends AbstractBsDateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DateCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDateCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from date) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DateCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DateCIQ xcreateCIQ() {
        DateCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DateCIQ xnewCIQ() {
        return new DateCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join date on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DateCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DateCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /** 
     * Add order-by as ascend. <br>
     * id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _registname;
    public ConditionValue xdfgetRegistname()
    { if (_registname == null) { _registname = nCV(); }
      return _registname; }
    protected ConditionValue xgetCValueRegistname() { return xdfgetRegistname(); }

    /** 
     * Add order-by as ascend. <br>
     * registName: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Registname_Asc() { regOBA("registName"); return this; }

    /**
     * Add order-by as descend. <br>
     * registName: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Registname_Desc() { regOBD("registName"); return this; }

    protected ConditionValue _sei;
    public ConditionValue xdfgetSei()
    { if (_sei == null) { _sei = nCV(); }
      return _sei; }
    protected ConditionValue xgetCValueSei() { return xdfgetSei(); }

    /** 
     * Add order-by as ascend. <br>
     * sei: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Sei_Asc() { regOBA("sei"); return this; }

    /**
     * Add order-by as descend. <br>
     * sei: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Sei_Desc() { regOBD("sei"); return this; }

    protected ConditionValue _mei;
    public ConditionValue xdfgetMei()
    { if (_mei == null) { _mei = nCV(); }
      return _mei; }
    protected ConditionValue xgetCValueMei() { return xdfgetMei(); }

    /** 
     * Add order-by as ascend. <br>
     * mei: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Mei_Asc() { regOBA("mei"); return this; }

    /**
     * Add order-by as descend. <br>
     * mei: {char(1)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Mei_Desc() { regOBD("mei"); return this; }

    protected ConditionValue _tel;
    public ConditionValue xdfgetTel()
    { if (_tel == null) { _tel = nCV(); }
      return _tel; }
    protected ConditionValue xgetCValueTel() { return xdfgetTel(); }

    /** 
     * Add order-by as ascend. <br>
     * tel: {int4(10)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Tel_Asc() { regOBA("tel"); return this; }

    /**
     * Add order-by as descend. <br>
     * tel: {int4(10)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Tel_Desc() { regOBD("tel"); return this; }

    protected ConditionValue _adress;
    public ConditionValue xdfgetAdress()
    { if (_adress == null) { _adress = nCV(); }
      return _adress; }
    protected ConditionValue xgetCValueAdress() { return xdfgetAdress(); }

    /** 
     * Add order-by as ascend. <br>
     * adress: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Adress_Asc() { regOBA("adress"); return this; }

    /**
     * Add order-by as descend. <br>
     * adress: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsDateCQ addOrderBy_Adress_Desc() { regOBD("adress"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDateCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDateCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DateCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DateCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DateCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DateCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DateCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DateCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DateCQ> _myselfExistsMap;
    public Map<String, DateCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DateCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DateCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DateCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DateCB.class.getName(); }
    protected String xCQ() { return DateCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
