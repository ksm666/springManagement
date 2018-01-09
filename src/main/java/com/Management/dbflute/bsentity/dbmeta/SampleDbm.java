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
 * The DB meta of sample. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SampleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SampleDbm _instance = new SampleDbm();
    private SampleDbm() {}
    public static SampleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Sample)et).getId(), (et, vl) -> ((Sample)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Sample)et).getName(), (et, vl) -> ((Sample)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Sample)et).getPoint(), (et, vl) -> ((Sample)et).setPoint(cti(vl)), "point");
        setupEpg(_epgMap, et -> ((Sample)et).getFlag(), (et, vl) -> ((Sample)et).setFlag((String)vl), "flag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "sample";
    protected final String _tableDispName = "sample";
    protected final String _tablePropertyName = "sample";
    protected final TableSqlName _tableSqlName = new TableSqlName("sample", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPoint = cci("point", "point", null, null, Integer.class, "point", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlag = cci("flag", "flag", null, null, String.class, "flag", null, false, false, true, "varchar", 64, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * name: {NotNull, varchar(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * point: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPoint() { return _columnPoint; }
    /**
     * flag: {NotNull, varchar(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlag() { return _columnFlag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnPoint());
        ls.add(columnFlag());
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
    public String getEntityTypeName() { return "com.Management.dbflute.exentity.Sample"; }
    public String getConditionBeanTypeName() { return "com.Management.dbflute.cbean.SampleCB"; }
    public String getBehaviorTypeName() { return "com.Management.dbflute.exbhv.SampleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Sample> getEntityType() { return Sample.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Sample newEntity() { return new Sample(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Sample)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Sample)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
