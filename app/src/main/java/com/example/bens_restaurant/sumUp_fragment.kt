package com.example.bens_restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bens_restaurant.databinding.AppetizersFragmentBinding
import com.example.bens_restaurant.databinding.SumupFragmentBinding

class sumUp_fragment:Fragment() {


    private var _binding : SumupFragmentBinding?=null

    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        _binding= SumupFragmentBinding.inflate(inflater,container,false)
        binding.textViewSumupFries.text= numOfFries.toString()
        binding.textViewSumupCheese.text= numOfcheese.toString()
        binding.textViewSumupMargarita.text= numOfMargarita.toString()
        binding.textViewSumupStami.text= numOfStami.toString()
        binding.textViewSumupMushroom.text= numOfMushroom.toString()
        binding.textViewSumupSunsetSoda.text=numOfSunsetSoda.toString()


        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}