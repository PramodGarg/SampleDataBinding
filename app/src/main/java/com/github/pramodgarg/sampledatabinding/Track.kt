package com.github.pramodgarg.sampledatabinding

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by pramod on 20/03/18.
 */
@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) = Glide.with(view.context).load(url).into(view)

data class Track(val title: String, val artist: String, val noOfComments: Int, val noOfLikes: Int, val imageUrl: String)