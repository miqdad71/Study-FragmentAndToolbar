package com.miqdad71.arkademyandroidweek6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.miqdad71.arkademyandroidweek6.R

class FragmentA: Fragment() {

    private lateinit var rootView:View

    companion object{
        const val EXTRA_INFO = "EXTRA_INFO"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_a, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val infoA = arguments?.getString(EXTRA_INFO, "Fragment A")
        rootView?.findViewById<TextView>(R.id.tv_title_a).text = infoA
    }

}