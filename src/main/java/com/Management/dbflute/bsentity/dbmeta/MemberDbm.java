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
 * The DB meta of Member. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Member)et).getSei(), (et, vl) -> ((Member)et).setSei((String)vl), "sei");
        setupEpg(_epgMap, et -> ((Member)et).getMei(), (et, vl) -> ((Member)et).setMei((String)vl), "mei");
        setupEpg(_epgMap, et -> ((Member)et).getTel(), (et, vl) -> ((Member)et).setTel(cti(vl)), "tel");
        setupEpg(_epgMap, et -> ((Member)et).getAdress(), (et, vl) -> ((Member)et).setAdress((String)vl), "adress");
        setupEpg(_epgMap, et -> ((Member)et).getId(), (et, vl) -> ((Member)et).setId(cti(vl)), "id");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "Member";
    protected final String _tableDispName = "Member";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("Member", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSei = cci("sei", "sei", null, null, String.class, "sei", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMei = cci("mei", "mei", null, null, String.class, "mei", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTel = cci("tel", "tel", null, null, Integer.class, "tel", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdress = cci("adress", "adress", null, null, String.class, "adress", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);

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
    /**
     * id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSei());
        ls.add(columnMei());
        ls.add(columnTel());
        ls.add(columnAdress());
        ls.add(columnId());
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
    public String getEntityTypeName() { return "com.Management.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "com.Management.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "com.Management.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Member newEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
