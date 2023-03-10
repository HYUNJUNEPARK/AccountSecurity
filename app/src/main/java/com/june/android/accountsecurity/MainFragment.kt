package com.june.android.accountsecurity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.june.android.accountsecurity.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    //다른 프래그먼트에서 다시 MainFragment로 돌아오면
    //기존 MainFragment는 onDestroy 되고, 새로운 Fragment 를 생성하기 때문에 캐시가 보존되지 않음
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onOptionsItemSelected()
    }

    private fun onOptionsItemSelected() {
        binding.mainFragmentToolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.item_search -> {
                    findNavController().navigate(R.id.action_mainFragment_to_searchFragment)
                    true
                }
                R.id.item_setting -> {
                    findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
                    true
                }
                else -> false
            }
        }
    }
}