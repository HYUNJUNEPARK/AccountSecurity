package com.june.android.accountsecurity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.june.android.accountsecurity.databinding.FragmentMypageBinding

class MyPageFragment : Fragment() {
    private lateinit var binding: FragmentMypageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMypageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onBackButtonClicked()
    }

    private fun onBackButtonClicked() {
        binding.settingFragmentToolbar.setNavigationOnClickListener {
            findNavController().navigate((R.id.action_myPageFragment_to_mainFragment))
        }
    }
}