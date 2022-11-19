package com.example.bens_restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bens_restaurant.databinding.DrinksFragmentsBinding

class drinks_fragment:Fragment(R.layout.drinks_fragments) {

    private var _binding : DrinksFragmentsBinding?=null

    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val view = inflater.inflate(R.layout.drinks_fragments , container, false)


    return view
    */



        //----------------------------------------drinks

        _binding=DrinksFragmentsBinding.inflate(inflater,container,false)
        binding.textViewMargarita.text=numOfMargarita.toString()
        binding.textViewSunsetSoda.text=numOfSunsetSoda.toString()
        binding.textViewStami.text=numOfStami.toString()


        binding.buttonAddMargarita.setOnClickListener{
            numOfMargarita++
            binding.textViewMargarita.text=numOfMargarita.toString()
        }
        binding.buttonMinMargarita.setOnClickListener{
            if(numOfMargarita>0){
                numOfMargarita--
                binding.textViewMargarita.text=numOfMargarita.toString()
            }
        }

        binding.buttonAddSunsetSoda.setOnClickListener{
            numOfSunsetSoda++
            binding.textViewSunsetSoda.text=numOfSunsetSoda.toString()
        }
        binding.buttonMinSunsetSoda.setOnClickListener{
            if(numOfSunsetSoda>0){
                numOfSunsetSoda--
                binding.textViewSunsetSoda.text=numOfSunsetSoda.toString()
            }
        }

        binding.buttonAddStami.setOnClickListener{
            numOfStami++
            binding.textViewStami.text=numOfStami.toString()
        }
        binding.buttonMinStami.setOnClickListener{
            if(numOfStami>0){
                numOfStami--
                binding.textViewStami.text=numOfStami.toString()
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