package com.Management.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Management.dbflute.exbhv.*;
import com.Management.dbflute.exentity.*;

/**
 * The referrer loader of city as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCity {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<City> _selectedList;
    protected BehaviorSelector _selector;
    protected CityBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCity ready(List<City> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CityBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CityBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<City> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
