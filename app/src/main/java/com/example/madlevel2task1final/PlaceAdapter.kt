package com.example.madlevel2task1final

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1final.databinding.ItemPlaceBinding

class PlaceAdapter {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place){
            binding.tvPlaceTitle.text = place.name
            binding.ivPlaceImage.setImageResource(place.imageResId)
        }
    }

}