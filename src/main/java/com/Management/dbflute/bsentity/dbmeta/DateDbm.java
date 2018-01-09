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
 * The DB meta of date. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DateDbm _instance = new DateDbm();
    private DateDbm() {}
    public static DateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Date)et).getId(), (et, vl) -> ((Date)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Date)et).getRegistname(), (et, vl) -> ((Date)et).setRegistname((String)vl), "registname");
        setupEpg(_epgMap, et -> ((Date)et).getSei(), (et, vl) -> ((Date)et).setSei((String)vl), "sei");
        setupEpg(_epgMap, et -> ((Date)et).getMei(), (et, vl) -> ((Date)et).setMei((String)vl), "mei");
        setupEpg(_epgMap, et -> ((Date)et).getTel(), (et, vl) -> ((Date)et).setTel(cti(vl)), "tel");
        setupEpg(_epgMap, et -> ((Date)et).getAdress(), (et, vl) -> ((Date)et).setAdress((String)vl), "adress");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "date";
    protected final String _tableDispName = "date";
    protected final String _tablePropertyName = "date";
    protected final TableSqlName _tableSqlName = new TableSqlName("date", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegistname = cci("registName", "registName", null, null, String.class, "registname", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSei = cci("sei", "sei", null, null, String.class, "sei", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMei = cci("mei", "mei", null, null, String.class, "mei", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTel = cci("tel", "tel", null, null, Integer.class, "tel", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdress = cci("adress", "adress", null, null, String.class, "adress", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * registName: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegistname() { return _columnRegistname; }
    /**
     * sei: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSei() { return _columnSei; }
    /**
     * mei: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMei() { return _columnMei; }
    /**
     * tel: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTel() { return _columnTel; }
    /**
     * adress: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdress() { return _columnAdress; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnRegistname());
        ls.add(columnSei());
        ls.add(columnMei());
        ls.add(columnTel());
        ls.add(columnAdress());
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
    public String getEntityTypeName() { return "com.Management.dbflute.exentity.Date"; }
    public String getConditionBeanTypeName() { return "com.Management.dbflute.cbean.DateCB"; }
    public String getBehaviorTypeName() { return "com.Management.dbflute.exbhv.DateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Date> getEntityType() { return Date.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Date newEntity() { return new Date(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Date)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Date)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
