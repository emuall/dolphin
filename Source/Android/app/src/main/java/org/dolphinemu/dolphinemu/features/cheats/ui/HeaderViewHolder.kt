// SPDX-License-Identifier: GPL-2.0-or-later

package org.dolphinemu.dolphinemu.features.cheats.ui

import android.widget.TextView
import org.dolphinemu.dolphinemu.databinding.ListItemHeaderDolphinBinding

class HeaderViewHolder(binding: ListItemHeaderDolphinBinding) : CheatItemViewHolder(binding.root) {
    private val headerName: TextView

    init {
        headerName = binding.textHeaderName
    }

    override fun bind(activity: CheatsActivity, item: CheatItem, position: Int) {
        headerName.setText(item.string)
    }
}
