package com.example.ktmedicare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.medicare.R
import com.example.medicare.databinding.MedilistBinding


class MediList : AppCompatActivity() {
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)*/

    private lateinit var binding: MedilistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MedilistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val postList: ArrayList<FillListDTO> = ArrayList()


        // 파이어스토어 인스턴스 초기화
        //firestore = FirebaseFirestore.getInstance()


        val postList: List<FillListDTO> = mutableListOf(
            FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "1정",
                "하루 3번",
                "매일",
                "아침 7:30",
                "점심 12:00",
                "저녁 9:00"
            ),
            FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "2정",
                "하루 3번",
                "하루 2번",
                "아침 9:00",
                "점심 12:00",
                "저녁 9:00"
            ),
            FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "2정",
                "하루 3번",
                "하루 2번",
                "아침 9:00",
                "점심 12:00",
                "저녁 9:00"
            ),
            FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "2정",
                "하루 3번",
                "하루 2번",
                "아침 9:00",
                "점심 12:00",
                "저녁 9:00"
            ),
            FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "2정",
                "하루 3번",
                "하루 2번",
                "아침 9:00",
                "점심 12:00",
                "저녁 9:00"
            ),FillListDTO(
                "R.drawable.ic_launcher_background",
                "타이레놀",
                "2정",
                "하루 3번",
                "하루 2번",
                "아침 9:00",
                "점심 12:00",
                "저녁 9:00"
            )
        )

        //postList.add(FillListDTO("","1","3","매일", "7:30", "12:00", "9:00"))
        //PostListAdapter.addData("","타이레놀", )
        //rvAdapter.addData("타일런트", Race.Zombie, 10, listOf(100,10,50), false)
        //setSampleList() // 데이터 리스트


        // 데이터를 Adapter에 넘겨 Adapter를 생성한다
        val postAdapter = PostListAdapter(postList)

        //postAdapter.notifyItemInserted(postList.size);

        binding.rvPost.apply {
            // RecyclerView에 Adapter 연동
            adapter = postAdapter
            // LinearLayoutManager - default vertical 방향 옵션 설정
            layoutManager = LinearLayoutManager(this@MediList)
        }
    }

}