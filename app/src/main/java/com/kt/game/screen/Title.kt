package com.kt.game.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kt.androidkotlinstart.R
import com.kt.androidkotlinstart.databinding.LayoutTitleBinding


class Title : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,  container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val binding:LayoutTitleBinding=DataBindingUtil.inflate(inflater,R.layout.layout_title,container,false);

       binding.playGameButton.setOnClickListener { findNavController().navigate(TitleDirections.actionTitleToGame()) }
        return binding.root;
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

