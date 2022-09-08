package com.example.letters_and_words

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [cardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class cardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var letterArrayList : ArrayList<Letters>

    lateinit var letters :Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment cardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            cardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(letterArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize(){
        letterArrayList = arrayListOf<Letters>()

        letters = arrayOf(
            getString(R.string.huruf1),
            getString(R.string.huruf2),
            getString(R.string.huruf3),
            getString(R.string.huruf4),
            getString(R.string.huruf5),
            getString(R.string.huruf6),
            getString(R.string.huruf7),
            getString(R.string.huruf8),
            getString(R.string.huruf9),
            getString(R.string.huruf10),
            getString(R.string.huruf11),
            getString(R.string.huruf12),
            getString(R.string.huruf13),
            getString(R.string.huruf14),
            getString(R.string.huruf15),
            getString(R.string.huruf16),
            getString(R.string.huruf17),
            getString(R.string.huruf18),
            getString(R.string.huruf19),
            getString(R.string.huruf20),
            getString(R.string.huruf21),
            getString(R.string.huruf22),
            getString(R.string.huruf23),
            getString(R.string.huruf24),
            getString(R.string.huruf25),
            getString(R.string.huruf26)
            )
        for (i in letters.indices){
            val letters = Letters(letters[i])
            letterArrayList.add(letters)
        }
    }
}