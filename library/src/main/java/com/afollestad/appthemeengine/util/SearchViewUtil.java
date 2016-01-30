package com.afollestad.appthemeengine.util;

import android.support.v7.widget.SearchView;
import android.view.View;

/**
 * @author Aidan Follestad (afollestad)
 */
public final class SearchViewUtil {

    // External class is used after checking if SearchView is on the class path. Avoids compile errors.
    public static boolean isSearchViewAutoComplete(View view) {
        return view instanceof SearchView.SearchAutoComplete;
    }

    private SearchViewUtil() {
    }
}