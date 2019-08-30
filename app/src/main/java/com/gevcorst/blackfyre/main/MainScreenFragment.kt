package com.gevcorst.blackfyre.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gevcorst.blackfyre.R
import com.gevcorst.blackfyre.databinding.MainscreenBinding

// TODO: Rename parameter arguments, choose names that match

class MainScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =
            DataBindingUtil.inflate<MainscreenBinding>(inflater,
                R.layout.mainscreen, container, false)
        return binding.root
        }
}
