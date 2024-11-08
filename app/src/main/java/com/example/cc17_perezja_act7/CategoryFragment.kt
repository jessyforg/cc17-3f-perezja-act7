package com.example.cc17_perezja_act7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cc17_perezja_act7.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PlaceViewModel by viewModels()  // Use by viewModels() to properly initialize ViewModel
    private lateinit var adapter: PlaceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val category = arguments?.getString("category") ?: return
        viewModel.loadPlaces(category)

        adapter = PlaceAdapter { place -> navigateToRecommendation(place) }
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        viewModel.places.observe(viewLifecycleOwner) { places ->
            adapter.setPlaces(places)
        }
    }

    private fun navigateToRecommendation(place: Place) {
        val action = CategoryFragmentDirections.actionCategoryFragmentToRecommendationFragment(
            placeName = place.name,
            imageResId = place.imageResId,
            description = place.description
        )
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}