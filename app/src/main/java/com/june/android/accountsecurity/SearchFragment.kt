package com.june.android.accountsecurity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.june.android.accountsecurity.AppConst.TAG
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
        onSearchEditTextviewChanged()
    }

    private fun onBackButtonClicked() {
        binding.searchFragmentToolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_searchFragment_to_mainFragment)
        }
    }

    private fun onSearchEditTextviewChanged() {
        binding.fragmentSearchEditTv.addTextChangedListener(object : TextWatcher {
            //입력하여 변화가 생기기 전에 처리
            override fun beforeTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
            //변화와 동시에 처리를 해주고자 할 때
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //TODO DB 애서 해당 키워드로 검색
                Toast.makeText(requireContext(), "$s", Toast.LENGTH_SHORT).show()
            }
            //입력이 끝났을 때 처리
            override fun afterTextChanged(s: Editable?) { }
        })
    }
}