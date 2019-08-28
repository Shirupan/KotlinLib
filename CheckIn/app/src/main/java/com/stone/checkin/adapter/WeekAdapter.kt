package com.stone.checkin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.stone.checkin.R
import kotlinx.android.synthetic.main.item_date_gv.view.*

/**
 * @Description:
 * @Author:         Stone
 * @CreateDate:     2019/8/28 14:39
 * @UpdateDate:     2019/8/28 14:39
 */

class WeekAdapter(val context: Context) : BaseAdapter() {

    private val week = context.resources.getStringArray(R.array.weeks)

    override fun getCount(): Int {
        return week.size
    }

    override fun getItem(i: Int): Any {
        return week[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var root = view
        val viewHolder: ViewHolder
        if (root == null) {
            root = LayoutInflater.from(context).inflate(R.layout.item_date_gv, null)
            viewHolder = ViewHolder()
            root!!.tag = viewHolder
        } else {
            viewHolder = root.tag as ViewHolder
        }
        viewHolder.tv = root.tvWeek
        viewHolder.tv?.text = week[i]
        return root
    }

    internal inner class ViewHolder {
        var tv: TextView? = null
    }
}