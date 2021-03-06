/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package android.support.v17.leanback.streamingapp.utils;

import android.support.v17.leanback.streamingapp.old.oldapp.olddetails.OldShadowRowPresenterSelector;
import android.support.v17.leanback.streamingapp.old.oldmodels.OldCardRow;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ObjectAdapter;

/**
 * The {@link OldCardListRow} allows the {@link OldShadowRowPresenterSelector} to access the {@link OldCardRow}
 * held by the row and determine whether to use a {@link android.support.v17.leanback.widget.Presenter}
 * with or without a shadow.
 */
public class OldCardListRow extends ListRow {

    private OldCardRow mOldCardRow;

    public OldCardListRow(HeaderItem header, ObjectAdapter adapter, OldCardRow oldCardRow) {
        super(header, adapter);
        setCardRow(oldCardRow);
    }

    public OldCardRow getCardRow() {
        return mOldCardRow;
    }

    public void setCardRow(OldCardRow oldCardRow) {
        this.mOldCardRow = oldCardRow;
    }
}
