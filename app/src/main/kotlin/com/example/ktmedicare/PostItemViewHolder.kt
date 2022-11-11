package com.example.ktmedicare

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ktmedicare.FillListDTO
import com.example.medicare.R
import java.nio.file.Files.size

class PostItemViewHolder(private val parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val fillName: TextView = itemView.findViewById(R.id.fillName)
    val fillNumber: TextView = itemView.findViewById(R.id.fillNumber)
    val fillCount: TextView = itemView.findViewById(R.id.fillCount)
    val fillCount2: TextView = itemView.findViewById(R.id.fillCount2)
    val fillmorning: TextView = itemView.findViewById(R.id.fillmorning)
    val filllunch: TextView = itemView.findViewById(R.id.filllunch)
    val fillevening: TextView = itemView.findViewById(R.id.fillevening)
    //val cbScrap: CheckBox = itemView.findViewById(R.id.cbScrap)

    fun setPost(post: FillListDTO) {
        imageView.clipToOutline = true // 라운드 처리
        Glide.with(parent.context).load(Uri.parse(post.imageUri)).centerCrop().into(imageView)
        fillName.text = post.fillName
        fillNumber.text = post.fillNumber
        fillCount.text = post.fillCount.toString()
        fillCount2.text = post.fillCount2.toString()
        fillmorning.text = post.fillmorning
        filllunch.text = post.filllunch
        fillevening.text = post.fillevening
        //cbScrap.isChecked = post.isScrap
    }
}