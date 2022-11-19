package com.example.bens_restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bens_restaurant.databinding.AppetizersFragmentBinding
import com.example.bens_restaurant.databinding.DrinksFragmentsBinding

class appetizers_fragments :Fragment(R.layout.appetizers_fragment){

    private var _binding : AppetizersFragmentBinding?=null

    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        _binding= AppetizersFragmentBinding.inflate(inflater,container,false)

        binding.textViewcheese.text=numOfcheese.toString()
        binding.textViewFries.text=numOfFries.toString()
        binding.textViewMushroom.text=numOfMushroom.toString()



        binding.buttonAddCheese.setOnClickListener{
            numOfcheese++
            binding.textViewcheese.text=numOfcheese.toString()
        }
        binding.buttonMinCheese.setOnClickListener{
            if(numOfcheese>0){
                numOfcheese--
                binding.textViewcheese.text=numOfcheese.toString()
            }

        }

        binding.buttonAddFries.setOnClickListener{
            numOfFries++
            binding.textViewFries.text=numOfFries.toString()
        }
        binding.buttonMinFries.setOnClickListener{
            if(numOfFries>0){
                numOfFries--
                binding.textViewFries.text=numOfFries.toString()
            }

        }

        binding.buttonAddMushroom.setOnClickListener{
            numOfMushroom++
            binding.textViewMushroom.text=numOfMushroom.toString()
        }
        binding.buttonMinMushroom.setOnClickListener{
            if(numOfMushroom>0){
                numOfMushroom--
                binding.textViewMushroom.text=numOfMushroom.toString()
            }

        }


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