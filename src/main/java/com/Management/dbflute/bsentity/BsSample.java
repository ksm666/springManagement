package com.Management.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Management.dbflute.allcommon.DBMetaInstanceHandler;
import com.Management.dbflute.exentity.*;

/**
 * The entity of sample as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, name, point, flag
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
 * String name = entity.getName();
 * Integer point = entity.getPoint();
 * String flag = entity.getFlag();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setPoint(point);
 * entity.setFlag(flag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSample extends AbstractEntity implements DomainEntity {

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

    /** name: {NotNull, varchar(64)} */
    protected String _name;

    /** point: {NotNull, int4(10)} */
    protected Integer _point;

    /** flag: {NotNull, varchar(64)} */
    protected String _flag;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "sample";
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
        if (obj instanceof BsSample) {
            BsSample other = (BsSample)obj;
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
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_point));
        sb.append(dm).append(xfND(_flag));
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
    public Sample clone() {
        return (Sample)super.clone();
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
     * [get] name: {NotNull, varchar(64)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, varchar(64)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] point: {NotNull, int4(10)} <br>
     * @return The value of the column 'point'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPoint() {
        checkSpecifiedProperty("point");
        return _point;
    }

    /**
     * [set] point: {NotNull, int4(10)} <br>
     * @param point The value of the column 'point'. (basically NotNull if update: for the constraint)
     */
    public void setPoint(Integer point) {
        registerModifiedProperty("point");
        _point = point;
    }

    /**
     * [get] flag: {NotNull, varchar(64)} <br>
     * @return The value of the column 'flag'. (basically NotNull if selected: for the constraint)
     */
    public String getFlag() {
        checkSpecifiedProperty("flag");
        return _flag;
    }

    /**
     * [set] flag: {NotNull, varchar(64)} <br>
     * @param flag The value of the column 'flag'. (basically NotNull if update: for the constraint)
     */
    public void setFlag(String flag) {
        registerModifiedProperty("flag");
        _flag = flag;
    }
}
