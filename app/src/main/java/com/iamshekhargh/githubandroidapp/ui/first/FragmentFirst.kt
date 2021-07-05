package com.iamshekhargh.githubandroidapp.ui.first

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.iamshekhargh.githubandroidapp.R
import com.iamshekhargh.githubandroidapp.databinding.FragmentFirstBinding

/**
 * Created by <<-- iamShekharGH -->>
 * on 04 July 2021, Sunday
 * at 4:14 PM
 */
class FragmentFirst : Fragment(R.layout.fragment_first) {

    val viewModel: FirstFragmentViewModel by viewModels()
    lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstBinding.bind(view)

        binding.apply {

        }
    }
}