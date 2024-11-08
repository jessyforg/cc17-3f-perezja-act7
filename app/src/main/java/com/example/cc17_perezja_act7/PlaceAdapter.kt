package com.example.cc17_perezja_act7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_perezja_act7.databinding.ItemPlaceBinding

class PlaceAdapter(private val onClick: (Place) -> Unit) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {
    private var places: List<Place> = emptyList()

    fun setPlaces(places: List<Place>) {
        this.places = places
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding = ItemPlaceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position], onClick)

    }

    override fun getItemCount(): Int = places.size

    class PlaceViewHolder(private val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(place: Place, onClick: (Place) -> Unit) {
            binding.placeName.text = place.name
            binding.root.setOnClickListener { onClick(place) }

            val typeface = ResourcesCompat.getFont(binding.root.context, R.font.tryroboto3medium)
            binding.placeName.typeface = typeface
        }
    }
}
