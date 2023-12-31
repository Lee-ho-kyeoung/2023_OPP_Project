package com.example.teamprojectsolocode.Notice


import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class NoticeItemDecoration(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.top = spaceHeight
        outRect.bottom = spaceHeight
    }
}
