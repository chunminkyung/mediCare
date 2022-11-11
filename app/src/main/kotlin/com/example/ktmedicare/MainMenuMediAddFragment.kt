package com.example.ktmedicare

import android.os.Bundle
import com.example.ktmedicare.MainMenuMediAddFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.medicare.R
import com.example.medicare.databinding.FragmentMainMenuMediAddBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MainMenuMediAddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainMenuMediAddFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    val binding by lazy { FragmentMainMenuMediAddBinding.inflate(layoutInflater) }
    //private lateinit var binding: FragmentMainMenuMediAddBinding
    /*private var binding: FragmentMainMenuMediAddBinding by lazy {
        FragmentMainMenuMediAddBinding()
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(ARG_PARAM1)
            mParam2 = requireArguments().getString(ARG_PARAM2)
        }
        //binding = FragmentMainMenuMediAddBinding.inflate(layoutInflater)
        //setContentView(binding.root)
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
        // 데이터를 Adapter에 넘겨 Adapter를 생성한다
        val postAdapter = PostListAdapter(postList)

        //postAdapter.notifyItemInserted(postList.size);

        binding.rvPost.apply {
            // RecyclerView에 Adapter 연동
            adapter = postAdapter
            // LinearLayoutManager - default vertical 방향 옵션 설정
            layoutManager = LinearLayoutManager(context)//this@MainMenuMediAddFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main_menu_medi_add, container, false)
        //binding = FragmentMainMenuMediAddBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainMenuMediAddFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): MainMenuMediAddFragment {
            val fragment = MainMenuMediAddFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}