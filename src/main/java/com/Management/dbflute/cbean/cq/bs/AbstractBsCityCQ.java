package com.Management.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.Management.dbflute.allcommon.*;
import com.Management.dbflute.cbean.*;
import com.Management.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of city.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "city";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, int4(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_Equal(String countrycode) {
        doSetCountrycode_Equal(fRES(countrycode));
    }

    protected void doSetCountrycode_Equal(String countrycode) {
        regCountrycode(CK_EQ, countrycode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_NotEqual(String countrycode) {
        doSetCountrycode_NotEqual(fRES(countrycode));
    }

    protected void doSetCountrycode_NotEqual(String countrycode) {
        regCountrycode(CK_NES, countrycode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_GreaterThan(String countrycode) {
        regCountrycode(CK_GT, fRES(countrycode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_LessThan(String countrycode) {
        regCountrycode(CK_LT, fRES(countrycode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_GreaterEqual(String countrycode) {
        regCountrycode(CK_GE, fRES(countrycode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_LessEqual(String countrycode) {
        regCountrycode(CK_LE, fRES(countrycode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycodeList The collection of countrycode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_InScope(Collection<String> countrycodeList) {
        doSetCountrycode_InScope(countrycodeList);
    }

    protected void doSetCountrycode_InScope(Collection<String> countrycodeList) {
        regINS(CK_INS, cTL(countrycodeList), xgetCValueCountrycode(), "countrycode");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycodeList The collection of countrycode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycode_NotInScope(Collection<String> countrycodeList) {
        doSetCountrycode_NotInScope(countrycodeList);
    }

    protected void doSetCountrycode_NotInScope(Collection<String> countrycodeList) {
        regINS(CK_NINS, cTL(countrycodeList), xgetCValueCountrycode(), "countrycode");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]} <br>
     * <pre>e.g. setCountrycode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param countrycode The value of countrycode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountrycode_LikeSearch(String countrycode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountrycode_LikeSearch(countrycode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]} <br>
     * <pre>e.g. setCountrycode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countrycode The value of countrycode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCountrycode_LikeSearch(String countrycode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countrycode), xgetCValueCountrycode(), "countrycode", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountrycode_NotLikeSearch(String countrycode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountrycode_NotLikeSearch(countrycode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @param countrycode The value of countrycode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCountrycode_NotLikeSearch(String countrycode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countrycode), xgetCValueCountrycode(), "countrycode", likeSearchOption);
    }

    protected void regCountrycode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountrycode(), "countrycode"); }
    protected abstract ConditionValue xgetCValueCountrycode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_Equal(String district) {
        doSetDistrict_Equal(fRES(district));
    }

    protected void doSetDistrict_Equal(String district) {
        regDistrict(CK_EQ, district);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_NotEqual(String district) {
        doSetDistrict_NotEqual(fRES(district));
    }

    protected void doSetDistrict_NotEqual(String district) {
        regDistrict(CK_NES, district);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_GreaterThan(String district) {
        regDistrict(CK_GT, fRES(district));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_LessThan(String district) {
        regDistrict(CK_LT, fRES(district));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_GreaterEqual(String district) {
        regDistrict(CK_GE, fRES(district));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_LessEqual(String district) {
        regDistrict(CK_LE, fRES(district));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param districtList The collection of district as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_InScope(Collection<String> districtList) {
        doSetDistrict_InScope(districtList);
    }

    protected void doSetDistrict_InScope(Collection<String> districtList) {
        regINS(CK_INS, cTL(districtList), xgetCValueDistrict(), "district");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param districtList The collection of district as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrict_NotInScope(Collection<String> districtList) {
        doSetDistrict_NotInScope(districtList);
    }

    protected void doSetDistrict_NotInScope(Collection<String> districtList) {
        regINS(CK_NINS, cTL(districtList), xgetCValueDistrict(), "district");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]} <br>
     * <pre>e.g. setDistrict_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param district The value of district as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDistrict_LikeSearch(String district, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDistrict_LikeSearch(district, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]} <br>
     * <pre>e.g. setDistrict_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param district The value of district as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDistrict_LikeSearch(String district, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(district), xgetCValueDistrict(), "district", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDistrict_NotLikeSearch(String district, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDistrict_NotLikeSearch(district, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @param district The value of district as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDistrict_NotLikeSearch(String district, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(district), xgetCValueDistrict(), "district", likeSearchOption);
    }

    protected void regDistrict(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistrict(), "district"); }
    protected abstract ConditionValue xgetCValueDistrict();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_Equal(Integer population) {
        doSetPopulation_Equal(population);
    }

    protected void doSetPopulation_Equal(Integer population) {
        regPopulation(CK_EQ, population);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_NotEqual(Integer population) {
        doSetPopulation_NotEqual(population);
    }

    protected void doSetPopulation_NotEqual(Integer population) {
        regPopulation(CK_NES, population);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_GreaterThan(Integer population) {
        regPopulation(CK_GT, population);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_LessThan(Integer population) {
        regPopulation(CK_LT, population);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_GreaterEqual(Integer population) {
        regPopulation(CK_GE, population);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param population The value of population as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPopulation_LessEqual(Integer population) {
        regPopulation(CK_LE, population);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of population. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of population. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPopulation_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPopulation_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of population. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of population. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPopulation_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePopulation(), "population", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param populationList The collection of population as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPopulation_InScope(Collection<Integer> populationList) {
        doSetPopulation_InScope(populationList);
    }

    protected void doSetPopulation_InScope(Collection<Integer> populationList) {
        regINS(CK_INS, cTL(populationList), xgetCValuePopulation(), "population");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * population: {NotNull, int4(10), default=[0]}
     * @param populationList The collection of population as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPopulation_NotInScope(Collection<Integer> populationList) {
        doSetPopulation_NotInScope(populationList);
    }

    protected void doSetPopulation_NotInScope(Collection<Integer> populationList) {
        regINS(CK_NINS, cTL(populationList), xgetCValuePopulation(), "population");
    }

    protected void regPopulation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePopulation(), "population"); }
    protected abstract ConditionValue xgetCValuePopulation();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CityCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CityCB&gt;() {
     *     public void query(CityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CityCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CityCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CityCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CityCQ sq);

    protected CityCB xcreateScalarConditionCB() {
        CityCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CityCB xcreateScalarConditionPartitionByCB() {
        CityCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CityCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CityCB cb = new CityCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CityCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CityCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CityCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CityCB cb = new CityCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CityCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CityCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CityCB cb = new CityCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CityCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected CityCB newMyCB() {
        return new CityCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CityCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
