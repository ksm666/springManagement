package com.Management.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Management.dbflute.allcommon.DBMetaInstanceHandler;
import com.Management.dbflute.exentity.*;

/**
 * The entity of date as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, registName, sei, mei, tel, adress
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
 * Integer id = entity.getId();
 * String registname = entity.getRegistname();
 * String sei = entity.getSei();
 * String mei = entity.getMei();
 * Integer tel = entity.getTel();
 * String adress = entity.getAdress();
 * entity.setId(id);
 * entity.setRegistname(registname);
 * entity.setSei(sei);
 * entity.setMei(mei);
 * entity.setTel(tel);
 * entity.setAdress(adress);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDate extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, NotNull, int4(10)} */
    protected Integer _id;

    /** registName: {char(1)} */
    protected String _registname;

    /** sei: {char(1)} */
    protected String _sei;

    /** mei: {char(1)} */
    protected String _mei;

    /** tel: {int4(10)} */
    protected Integer _tel;

    /** adress: {text(2147483647)} */
    protected String _adress;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "date";
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
        if (obj instanceof BsDate) {
            BsDate other = (BsDate)obj;
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
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_registname));
        sb.append(dm).append(xfND(_sei));
        sb.append(dm).append(xfND(_mei));
        sb.append(dm).append(xfND(_tel));
        sb.append(dm).append(xfND(_adress));
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
    public Date clone() {
        return (Date)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

    /**
     * [get] registName: {char(1)} <br>
     * @return The value of the column 'registName'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegistname() {
        checkSpecifiedProperty("registname");
        return _registname;
    }

    /**
     * [set] registName: {char(1)} <br>
     * @param registname The value of the column 'registName'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegistname(String registname) {
        registerModifiedProperty("registname");
        _registname = registname;
    }

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
}
