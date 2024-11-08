package com.example.cc17_perezja_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.cc17_perezja_act7.databinding.FragmentRecommendationBinding

class RecommendationFragment : Fragment() {
    private var _binding: FragmentRecommendationBinding? = null
    private val binding get() = _binding!!
    private val args: RecommendationFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecommendationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recommendationTitle.text = args.placeName
        binding.recommendationImage.setImageResource(args.imageResId)
        binding.recommendationDetails.text = args.description
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
