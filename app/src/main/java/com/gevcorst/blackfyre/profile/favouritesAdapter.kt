package com.gevcorst.blackfyre.profile

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.gevcorst.blackfyre.R

class FavouriteAdapter():RecyclerView.Adapter<FavouriteAdapter.ImageViewHolder>(){
    var data =  listOf<Favorite>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.userfavorites_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        //holder.imageView
    }

    override fun getItemCount(): Int {
      return data.count()
    }
    class ImageViewHolder(val view:View,position:Int = 0):
        RecyclerView.ViewHolder(view){
        val imageView =  view.findViewById<ImageView>(R.id.favoriteId) as ImageView
        init {
            imageView.setOnClickListener{
                Toast.makeText(view.context.applicationContext,"Your clicked "+position,
                    Toast.LENGTH_LONG).show()
            }
        }

    }
}
