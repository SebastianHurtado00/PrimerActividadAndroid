package com.sebastian.primeractividadandroid.ui.gallery

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.sebastian.primeractividadandroid.databinding.FragmentCarBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentCarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentCarBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = "Formularios Automoviles"
        }
        return root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}