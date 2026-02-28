package com.a6w.memo.route.home.ui.model

import com.a6w.memo.domain.model.Label
import com.a6w.memo.domain.model.Mapmo

/**
 * Mapmo List UI Item
 * - Used for Item of UI List
 * - Can be either [LabelUiItem] or [MapmoUiItem]
 */
sealed interface HomeListUiItem {
    // Item for label
    data class LabelUiItem(
        val label: Label,
    ): HomeListUiItem

    // Item for mapmo
    data class MapmoUiItem(
        val mapmo: Mapmo,
    ): HomeListUiItem
}