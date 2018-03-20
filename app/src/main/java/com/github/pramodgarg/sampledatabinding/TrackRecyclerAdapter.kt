package com.github.pramodgarg.sampledatabinding

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.pramodgarg.sampledatabinding.databinding.ItemTrackBinding

/**
 * Created by pramod on 20/03/18.
 */
class TrackRecyclerAdapter(private val mTrackList: List<Track>) : RecyclerView.Adapter<TrackRecyclerAdapter.TrackVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackVH {
        val binding: ItemTrackBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_track, parent, false)
        return TrackVH(binding)
    }

    override fun getItemCount() = mTrackList.size

    override fun onBindViewHolder(holder: TrackVH, position: Int) {
        holder.bind(mTrackList.get(holder.adapterPosition))
    }

    class TrackVH(private val binding: ItemTrackBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(track: Track) {
            binding.track = track
            binding.executePendingBindings()
        }
    }
}