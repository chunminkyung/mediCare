package com.example.ktmedicare

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ktmedicare.FillListDTO
import com.example.ktmedicare.PostItemViewHolder

class PostListAdapter(var postList: List<FillListDTO>): RecyclerView.Adapter<PostItemViewHolder>() {

    /*var fillList : ArrayList<FillListDTO> = arrayListOf()

    init {  // telephoneBook의 문서를 불러온 뒤 Person으로 변환해 ArrayList에 담음
        firestore?.collection("telephoneBook")?.addSnapshotListener { querySnapshot, firebaseFirestoreException ->
            // ArrayList 비워줌
            fillList.clear()

            for (snapshot in querySnapshot!!.documents) {
                var item = snapshot.toObject(FillListDTO::class.java)
                fillList.add(item!!)
            }
            notifyDataSetChanged()
        }
    }*/

    // ViewHolder를 만들어 View를 생성한다
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostItemViewHolder {
        return PostItemViewHolder(parent)
    }

    // ViewHolder와 postList의 데이터를 하나씩 연결한다
    override fun onBindViewHolder(holder: PostItemViewHolder, position: Int) {
        postList[position].let { post ->
            with(holder) {
                setPost(post)
                /*cbScrap.setOnClickListener {
                    post.isScrap = cbScrap.isChecked
                    notifyItemChanged(position)
                }*/
            }
        }
    }

    // 게시물 수 만큼 리스트를 보여주기 위해 size를 반환한다
    override fun getItemCount(): Int {
        return postList.size
    }
}