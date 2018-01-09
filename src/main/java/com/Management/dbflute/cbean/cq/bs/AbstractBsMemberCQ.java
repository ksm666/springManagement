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
 * The abstract condition-query of Member.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "Member";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_Equal(String sei) {
        doSetSei_Equal(fRES(sei));
    }

    protected void doSetSei_Equal(String sei) {
        regSei(CK_EQ, sei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_NotEqual(String sei) {
        doSetSei_NotEqual(fRES(sei));
    }

    protected void doSetSei_NotEqual(String sei) {
        regSei(CK_NES, sei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_GreaterThan(String sei) {
        regSei(CK_GT, fRES(sei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_LessThan(String sei) {
        regSei(CK_LT, fRES(sei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_GreaterEqual(String sei) {
        regSei(CK_GE, fRES(sei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_LessEqual(String sei) {
        regSei(CK_LE, fRES(sei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * sei: {char(1)}
     * @param seiList The collection of sei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_InScope(Collection<String> seiList) {
        doSetSei_InScope(seiList);
    }

    protected void doSetSei_InScope(Collection<String> seiList) {
        regINS(CK_INS, cTL(seiList), xgetCValueSei(), "sei");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * sei: {char(1)}
     * @param seiList The collection of sei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSei_NotInScope(Collection<String> seiList) {
        doSetSei_NotInScope(seiList);
    }

    protected void doSetSei_NotInScope(Collection<String> seiList) {
        regINS(CK_NINS, cTL(seiList), xgetCValueSei(), "sei");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * sei: {char(1)} <br>
     * <pre>e.g. setSei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sei The value of sei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSei_LikeSearch(String sei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSei_LikeSearch(sei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * sei: {char(1)} <br>
     * <pre>e.g. setSei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sei The value of sei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSei_LikeSearch(String sei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sei), xgetCValueSei(), "sei", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSei_NotLikeSearch(String sei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSei_NotLikeSearch(sei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * sei: {char(1)}
     * @param sei The value of sei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSei_NotLikeSearch(String sei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sei), xgetCValueSei(), "sei", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * sei: {char(1)}
     */
    public void setSei_IsNull() { regSei(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * sei: {char(1)}
     */
    public void setSei_IsNotNull() { regSei(CK_ISNN, DOBJ); }

    protected void regSei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSei(), "sei"); }
    protected abstract ConditionValue xgetCValueSei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_Equal(String mei) {
        doSetMei_Equal(fRES(mei));
    }

    protected void doSetMei_Equal(String mei) {
        regMei(CK_EQ, mei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_NotEqual(String mei) {
        doSetMei_NotEqual(fRES(mei));
    }

    protected void doSetMei_NotEqual(String mei) {
        regMei(CK_NES, mei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_GreaterThan(String mei) {
        regMei(CK_GT, fRES(mei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_LessThan(String mei) {
        regMei(CK_LT, fRES(mei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_GreaterEqual(String mei) {
        regMei(CK_GE, fRES(mei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_LessEqual(String mei) {
        regMei(CK_LE, fRES(mei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mei: {char(1)}
     * @param meiList The collection of mei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_InScope(Collection<String> meiList) {
        doSetMei_InScope(meiList);
    }

    protected void doSetMei_InScope(Collection<String> meiList) {
        regINS(CK_INS, cTL(meiList), xgetCValueMei(), "mei");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mei: {char(1)}
     * @param meiList The collection of mei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMei_NotInScope(Collection<String> meiList) {
        doSetMei_NotInScope(meiList);
    }

    protected void doSetMei_NotInScope(Collection<String> meiList) {
        regINS(CK_NINS, cTL(meiList), xgetCValueMei(), "mei");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mei: {char(1)} <br>
     * <pre>e.g. setMei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mei The value of mei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMei_LikeSearch(String mei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMei_LikeSearch(mei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mei: {char(1)} <br>
     * <pre>e.g. setMei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mei The value of mei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMei_LikeSearch(String mei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mei), xgetCValueMei(), "mei", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMei_NotLikeSearch(String mei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMei_NotLikeSearch(mei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mei: {char(1)}
     * @param mei The value of mei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMei_NotLikeSearch(String mei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mei), xgetCValueMei(), "mei", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * mei: {char(1)}
     */
    public void setMei_IsNull() { regMei(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * mei: {char(1)}
     */
    public void setMei_IsNotNull() { regMei(CK_ISNN, DOBJ); }

    protected void regMei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMei(), "mei"); }
    protected abstract ConditionValue xgetCValueMei();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_Equal(Integer tel) {
        doSetTel_Equal(tel);
    }

    protected void doSetTel_Equal(Integer tel) {
        regTel(CK_EQ, tel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_NotEqual(Integer tel) {
        doSetTel_NotEqual(tel);
    }

    protected void doSetTel_NotEqual(Integer tel) {
        regTel(CK_NES, tel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_GreaterThan(Integer tel) {
        regTel(CK_GT, tel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_LessThan(Integer tel) {
        regTel(CK_LT, tel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_GreaterEqual(Integer tel) {
        regTel(CK_GE, tel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param tel The value of tel as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTel_LessEqual(Integer tel) {
        regTel(CK_LE, tel);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param minNumber The min number of tel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTel_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTel_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     * @param minNumber The min number of tel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tel. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTel_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTel(), "tel", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * tel: {int4(10)}
     * @param telList The collection of tel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_InScope(Collection<Integer> telList) {
        doSetTel_InScope(telList);
    }

    protected void doSetTel_InScope(Collection<Integer> telList) {
        regINS(CK_INS, cTL(telList), xgetCValueTel(), "tel");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * tel: {int4(10)}
     * @param telList The collection of tel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_NotInScope(Collection<Integer> telList) {
        doSetTel_NotInScope(telList);
    }

    protected void doSetTel_NotInScope(Collection<Integer> telList) {
        regINS(CK_NINS, cTL(telList), xgetCValueTel(), "tel");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     */
    public void setTel_IsNull() { regTel(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * tel: {int4(10)}
     */
    public void setTel_IsNotNull() { regTel(CK_ISNN, DOBJ); }

    protected void regTel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTel(), "tel"); }
    protected abstract ConditionValue xgetCValueTel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_Equal(String adress) {
        doSetAdress_Equal(fRES(adress));
    }

    protected void doSetAdress_Equal(String adress) {
        regAdress(CK_EQ, adress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_NotEqual(String adress) {
        doSetAdress_NotEqual(fRES(adress));
    }

    protected void doSetAdress_NotEqual(String adress) {
        regAdress(CK_NES, adress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_GreaterThan(String adress) {
        regAdress(CK_GT, fRES(adress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_LessThan(String adress) {
        regAdress(CK_LT, fRES(adress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_GreaterEqual(String adress) {
        regAdress(CK_GE, fRES(adress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_LessEqual(String adress) {
        regAdress(CK_LE, fRES(adress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)}
     * @param adressList The collection of adress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_InScope(Collection<String> adressList) {
        doSetAdress_InScope(adressList);
    }

    protected void doSetAdress_InScope(Collection<String> adressList) {
        regINS(CK_INS, cTL(adressList), xgetCValueAdress(), "adress");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)}
     * @param adressList The collection of adress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdress_NotInScope(Collection<String> adressList) {
        doSetAdress_NotInScope(adressList);
    }

    protected void doSetAdress_NotInScope(Collection<String> adressList) {
        regINS(CK_NINS, cTL(adressList), xgetCValueAdress(), "adress");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)} <br>
     * <pre>e.g. setAdress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param adress The value of adress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdress_LikeSearch(String adress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdress_LikeSearch(adress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)} <br>
     * <pre>e.g. setAdress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adress The value of adress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAdress_LikeSearch(String adress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adress), xgetCValueAdress(), "adress", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdress_NotLikeSearch(String adress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdress_NotLikeSearch(adress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * adress: {text(2147483647)}
     * @param adress The value of adress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAdress_NotLikeSearch(String adress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adress), xgetCValueAdress(), "adress", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     */
    public void setAdress_IsNull() { regAdress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     */
    public void setAdress_IsNullOrEmpty() { regAdress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * adress: {text(2147483647)}
     */
    public void setAdress_IsNotNull() { regAdress(CK_ISNN, DOBJ); }

    protected void regAdress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdress(), "adress"); }
    protected abstract ConditionValue xgetCValueAdress();

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
    public HpSLCFunction<MemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberCQ sq);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberCQ sq);

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
    protected MemberCB newMyCB() {
        return new MemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
