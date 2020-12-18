package com.miqdad71.arkademyandroidweek6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.miqdad71.arkademyandroidweek6.R
import java.util.zip.Inflater

class FragmentB(private val listener: BListener?): Fragment() {
    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_b, container, false)
        return rootView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnChangeB = rootView.findViewById<Button>(R.id.btn_info_b)
        btnChangeB.setOnClickListener {
            //action to passing data
            listener?.onChangeBclick("B")
        }
    }

    interface BListener{
        fun onChangeBclick(info: String)
    }
}