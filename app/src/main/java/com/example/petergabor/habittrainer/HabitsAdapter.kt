package com.example.petergabor.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*

/**
 * Created by PepovPC on 12/19/2017.
 */

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){


    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    override fun onBindViewHolder(holder: HabitViewHolder?, position: Int) {
        if (holder != null) {
            holder.card.tv_title.text = habits[position].title
            holder.card.tv_description.text = habits[position].description
            holder.card.iv_icon.setImageResource(habits[position].image)
        }
    }


    override fun getItemCount(): Int = habits.size
}

