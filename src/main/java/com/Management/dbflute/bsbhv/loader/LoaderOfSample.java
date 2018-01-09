package com.Management.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Management.dbflute.exbhv.*;
import com.Management.dbflute.exentity.*;

/**
 * The referrer loader of sample as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSample {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Sample> _selectedList;
    protected BehaviorSelector _selector;
    protected SampleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSample ready(List<Sample> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SampleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SampleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Sample> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
