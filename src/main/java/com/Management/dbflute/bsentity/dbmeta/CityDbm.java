package com.Management.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.Management.dbflute.allcommon.*;
import com.Management.dbflute.exentity.*;

/**
 * The DB meta of city. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CityDbm _instance = new CityDbm();
    private CityDbm() {}
    public static CityDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((City)et).getId(), (et, vl) -> ((City)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((City)et).getName(), (et, vl) -> ((City)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((City)et).getCountrycode(), (et, vl) -> ((City)et).setCountrycode((String)vl), "countrycode");
        setupEpg(_epgMap, et -> ((City)et).getDistrict(), (et, vl) -> ((City)et).setDistrict((String)vl), "district");
        setupEpg(_epgMap, et -> ((City)et).getPopulation(), (et, vl) -> ((City)et).setPopulation(cti(vl)), "population");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "city";
    protected final String _tableDispName = "city";
    protected final String _tablePropertyName = "city";
    protected final TableSqlName _tableSqlName = new TableSqlName("city", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "bpchar", 1, 0, null, "''::bpchar", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountrycode = cci("countrycode", "countrycode", null, null, String.class, "countrycode", null, false, false, true, "bpchar", 3, 0, null, "''::bpchar", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistrict = cci("district", "district", null, null, String.class, "district", null, false, false, true, "bpchar", 20, 0, null, "''::bpchar", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPopulation = cci("population", "population", null, null, Integer.class, "population", null, false, false, true, "int4", 10, 0, null, "0", false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * name: {NotNull, bpchar(1), default=[''::bpchar]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * countrycode: {NotNull, bpchar(3), default=[''::bpchar]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountrycode() { return _columnCountrycode; }
    /**
     * district: {NotNull, bpchar(20), default=[''::bpchar]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistrict() { return _columnDistrict; }
    /**
     * population: {NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPopulation() { return _columnPopulation; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnCountrycode());
        ls.add(columnDistrict());
        ls.add(columnPopulation());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Management.dbflute.exentity.City"; }
    public String getConditionBeanTypeName() { return "com.Management.dbflute.cbean.CityCB"; }
    public String getBehaviorTypeName() { return "com.Management.dbflute.exbhv.CityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<City> getEntityType() { return City.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public City newEntity() { return new City(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((City)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((City)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
