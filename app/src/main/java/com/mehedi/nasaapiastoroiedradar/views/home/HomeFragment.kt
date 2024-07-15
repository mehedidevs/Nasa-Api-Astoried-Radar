package com.mehedi.nasaapiastoroiedradar.views.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import coil.load
import com.mehedi.nasaapiastoroiedradar.databinding.FragmentHomeBinding
import com.squareup.picasso.Picasso


class HomeFragment : Fragment() {
    
    private val viewModel by viewModels<HomeViewModel>()
    
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)
        
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        viewModel.imageOfTheDay.observe(viewLifecycleOwner) { imageOfTheDay ->
            imageOfTheDay?.let {
                Picasso.with(context)
                    .load(it.url) // Assuming 'url' is the URL string in ResponseImageOfTheDay
                    .into(binding.ivNasa)

            }
        }

    }
    
    
}


