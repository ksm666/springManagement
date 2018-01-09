package com.Management.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Management.dbflute.allcommon.DBMetaInstanceHandler;
import com.Management.dbflute.exentity.*;

/**
 * The entity of Member as TABLE. <br>
 * 登録情報管理テーブル
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     sei, mei, tel, adress, id
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String sei = entity.getSei();
 * String mei = entity.getMei();
 * Integer tel = entity.getTel();
 * String adress = entity.getAdress();
 * Integer id = entity.getId();
 * entity.setSei(sei);
 * entity.setMei(mei);
 * entity.setTel(tel);
 * entity.setAdress(adress);
 * entity.setId(id);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** sei: {char(1)} */
    protected String _sei;

    /** mei: {char(1)} */
    protected String _mei;

    /** tel: {int4(10)} */
    protected Integer _tel;

    /** adress: {text(2147483647)} */
    protected String _adress;

    /** id: {PK, NotNull, int4(10)} */
    protected Integer _id;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "Member";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMember) {
            BsMember other = (BsMember)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sei));
        sb.append(dm).append(xfND(_mei));
        sb.append(dm).append(xfND(_tel));
        sb.append(dm).append(xfND(_adress));
        sb.append(dm).append(xfND(_id));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Member clone() {
        return (Member)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] sei: {char(1)} <br>
     * @return The value of the column 'sei'. (NullAllowed even if selected: for no constraint)
     */
    public String getSei() {
        checkSpecifiedProperty("sei");
        return _sei;
    }

    /**
     * [set] sei: {char(1)} <br>
     * @param sei The value of the column 'sei'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSei(String sei) {
        registerModifiedProperty("sei");
        _sei = sei;
    }

    /**
     * [get] mei: {char(1)} <br>
     * @return The value of the column 'mei'. (NullAllowed even if selected: for no constraint)
     */
    public String getMei() {
        checkSpecifiedProperty("mei");
        return _mei;
    }

    /**
     * [set] mei: {char(1)} <br>
     * @param mei The value of the column 'mei'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMei(String mei) {
        registerModifiedProperty("mei");
        _mei = mei;
    }

    /**
     * [get] tel: {int4(10)} <br>
     * @return The value of the column 'tel'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTel() {
        checkSpecifiedProperty("tel");
        return _tel;
    }

    /**
     * [set] tel: {int4(10)} <br>
     * @param tel The value of the column 'tel'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTel(Integer tel) {
        registerModifiedProperty("tel");
        _tel = tel;
    }

    /**
     * [get] adress: {text(2147483647)} <br>
     * @return The value of the column 'adress'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdress() {
        checkSpecifiedProperty("adress");
        return _adress;
    }

    /**
     * [set] adress: {text(2147483647)} <br>
     * @param adress The value of the column 'adress'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdress(String adress) {
        registerModifiedProperty("adress");
        _adress = adress;
    }

    /**
     * [get] id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, NotNull, int4(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }
}
