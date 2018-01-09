package com.Management.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Management.dbflute.allcommon.DBMetaInstanceHandler;
import com.Management.dbflute.exentity.*;

/**
 * The entity of city as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, name, countrycode, district, population
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
 * String countrycode = entity.getCountrycode();
 * String district = entity.getDistrict();
 * Integer population = entity.getPopulation();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setCountrycode(countrycode);
 * entity.setDistrict(district);
 * entity.setPopulation(population);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCity extends AbstractEntity implements DomainEntity {

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

    /** name: {NotNull, bpchar(1), default=[''::bpchar]} */
    protected String _name;

    /** countrycode: {NotNull, bpchar(3), default=[''::bpchar]} */
    protected String _countrycode;

    /** district: {NotNull, bpchar(20), default=[''::bpchar]} */
    protected String _district;

    /** population: {NotNull, int4(10), default=[0]} */
    protected Integer _population;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "city";
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
        if (obj instanceof BsCity) {
            BsCity other = (BsCity)obj;
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
        sb.append(dm).append(xfND(_countrycode));
        sb.append(dm).append(xfND(_district));
        sb.append(dm).append(xfND(_population));
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
    public City clone() {
        return (City)super.clone();
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
     * [get] name: {NotNull, bpchar(1), default=[''::bpchar]} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, bpchar(1), default=[''::bpchar]} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] countrycode: {NotNull, bpchar(3), default=[''::bpchar]} <br>
     * @return The value of the column 'countrycode'. (basically NotNull if selected: for the constraint)
     */
    public String getCountrycode() {
        checkSpecifiedProperty("countrycode");
        return _countrycode;
    }

    /**
     * [set] countrycode: {NotNull, bpchar(3), default=[''::bpchar]} <br>
     * @param countrycode The value of the column 'countrycode'. (basically NotNull if update: for the constraint)
     */
    public void setCountrycode(String countrycode) {
        registerModifiedProperty("countrycode");
        _countrycode = countrycode;
    }

    /**
     * [get] district: {NotNull, bpchar(20), default=[''::bpchar]} <br>
     * @return The value of the column 'district'. (basically NotNull if selected: for the constraint)
     */
    public String getDistrict() {
        checkSpecifiedProperty("district");
        return _district;
    }

    /**
     * [set] district: {NotNull, bpchar(20), default=[''::bpchar]} <br>
     * @param district The value of the column 'district'. (basically NotNull if update: for the constraint)
     */
    public void setDistrict(String district) {
        registerModifiedProperty("district");
        _district = district;
    }

    /**
     * [get] population: {NotNull, int4(10), default=[0]} <br>
     * @return The value of the column 'population'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPopulation() {
        checkSpecifiedProperty("population");
        return _population;
    }

    /**
     * [set] population: {NotNull, int4(10), default=[0]} <br>
     * @param population The value of the column 'population'. (basically NotNull if update: for the constraint)
     */
    public void setPopulation(Integer population) {
        registerModifiedProperty("population");
        _population = population;
    }
}
