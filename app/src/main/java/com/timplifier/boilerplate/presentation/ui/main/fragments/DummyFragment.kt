package com.timplifier.boilerplate.presentation.ui.main.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.boilerplate.R
import com.timplifier.boilerplate.databinding.FragmentDummyBinding
import com.timplifier.boilerplate.presentation.base.BaseFragment


class DummyFragment : BaseFragment<FragmentDummyBinding, DummyViewModel>(R.layout.fragment_dummy) {
    override val binding by viewBinding(FragmentDummyBinding::bind)
    override val viewModel: DummyViewModel by viewModels()

    override fun launchObservers() {
        viewModel.dummyState.spectateUiState(
            success = {

            }, error = {

            }
        )
    }

}