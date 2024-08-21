package com.mehedi.nasaapiastoroiedradar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mehedi.nasaapiastoroiedradar.Base.BaseFragment
import com.mehedi.nasaapiastoroiedradar.databinding.FragmentStartBinding


class StartFragment :  BaseFragment<FragmentStartBinding>(FragmentStartBinding::inflate){
    override fun setListener() {
       binding.imageofthedaybtn.setOnClickListener {
           findNavController().navigate(R.id.action_startFragment_to_homeFragment)
       }
    }

    override fun allObserver() {

    }


}