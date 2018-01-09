package com.Management.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Management.dbflute.exbhv.*;
import com.Management.dbflute.exentity.*;

/**
 * The referrer loader of date as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDate {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Date> _selectedList;
    protected BehaviorSelector _selector;
    protected DateBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDate ready(List<Date> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DateBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DateBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Date> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
