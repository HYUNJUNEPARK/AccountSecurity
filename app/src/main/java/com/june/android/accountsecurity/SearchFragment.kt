package com.june.android.accountsecurity

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.june.android.accountsecurity.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBackButtonClicked()
    }

    private fun onBackButtonClicked() {
        binding.searchFragmentToolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_searchFragment_to_mainFragment)
        }
    }
}