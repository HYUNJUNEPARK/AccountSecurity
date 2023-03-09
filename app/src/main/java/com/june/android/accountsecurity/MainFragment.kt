package com.june.android.accountsecurity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.june.android.accountsecurity.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onOptionsItemSelected(view)
    }

    private fun onOptionsItemSelected(view: View) {
        binding.mainFragmentToolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.item_search -> {
                    Navigation.findNavController(view).navigate((R.id.action_mainFragment_to_searchFragment))
                    true
                }
                R.id.item_setting -> {
                    Navigation.findNavController(view).navigate((R.id.action_mainFragment_to_settingFragment))
                    true
                }
                else -> false
            }
        }
    }
}