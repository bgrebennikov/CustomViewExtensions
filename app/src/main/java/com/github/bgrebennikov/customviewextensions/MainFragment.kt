package com.github.bgrebennikov.customviewextensions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.bgrebennikov.customviewextensions.databinding.FragmentMainBinding
import com.github.bgrebennikov.customviewextensions.extensions.setupMainAppbar

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            changeBtn.setOnClickListener {
                setupMainAppbar(
                    binding.mainToolbar.id,
                    "New Title Value",
                    "And new subtitle value"
                )
            }
        }

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            MainFragment()
    }

}