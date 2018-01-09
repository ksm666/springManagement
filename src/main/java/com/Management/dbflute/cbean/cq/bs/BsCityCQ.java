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
 * The base condition-query of city.
 * @author DBFlute(AutoGenerator)
 */
public class BsCityCQ extends AbstractBsCityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CityCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from city) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CityCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CityCIQ xcreateCIQ() {
        CityCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CityCIQ xnewCIQ() {
        return new CityCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join city on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CityCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CityCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsCityCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _countrycode;
    public ConditionValue xdfgetCountrycode()
    { if (_countrycode == null) { _countrycode = nCV(); }
      return _countrycode; }
    protected ConditionValue xgetCValueCountrycode() { return xdfgetCountrycode(); }

    /** 
     * Add order-by as ascend. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Countrycode_Asc() { regOBA("countrycode"); return this; }

    /**
     * Add order-by as descend. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Countrycode_Desc() { regOBD("countrycode"); return this; }

    protected ConditionValue _district;
    public ConditionValue xdfgetDistrict()
    { if (_district == null) { _district = nCV(); }
      return _district; }
    protected ConditionValue xgetCValueDistrict() { return xdfgetDistrict(); }

    /** 
     * Add order-by as ascend. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_District_Asc() { regOBA("district"); return this; }

    /**
     * Add order-by as descend. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_District_Desc() { regOBD("district"); return this; }

    protected ConditionValue _population;
    public ConditionValue xdfgetPopulation()
    { if (_population == null) { _population = nCV(); }
      return _population; }
    protected ConditionValue xgetCValuePopulation() { return xdfgetPopulation(); }

    /** 
     * Add order-by as ascend. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Population_Asc() { regOBA("population"); return this; }

    /**
     * Add order-by as descend. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsCityCQ addOrderBy_Population_Desc() { regOBD("population"); return this; }

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
    public BsCityCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCityCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, CityCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CityCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CityCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CityCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CityCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CityCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CityCQ> _myselfExistsMap;
    public Map<String, CityCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CityCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CityCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CityCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CityCB.class.getName(); }
    protected String xCQ() { return CityCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
