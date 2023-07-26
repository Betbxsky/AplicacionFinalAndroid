package com.example.myapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.ImageView
import android.widget.LinearLayout

class TemarioFragment : Fragment() {

    companion object {
        fun newInstance() = TemarioFragment()
    }

    private lateinit var viewModel: TemarioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_temario, container, false)
        val scrollView: ScrollView = rootView.findViewById(R.id.scrollViewa1)
        val linearLayout: LinearLayout = rootView.findViewById(R.id.linearlayouta1)

        for (i in 0 until 3) {
            val imageView = ImageView(requireContext())
            imageView.setImageResource(R.drawable.whatsapp_image_2023_07_20_at_02_39_39)
            imageView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            imageView.setImageResource(R.drawable.whatsapp_image_2023_07_20_at_02_39_39__1_)
            imageView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            imageView.setImageResource(R.drawable.whatsapp_image_2023_07_20_at_02_39_39__2_)
            imageView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            linearLayout.addView(imageView)
        }

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TemarioViewModel::class.java)
        // TODO: Use the ViewModel


    }

}