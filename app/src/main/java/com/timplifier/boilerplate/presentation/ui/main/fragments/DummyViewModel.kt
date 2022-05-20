package com.timplifier.boilerplate.presentation.ui.main.fragments

import com.example.boilerplate.domain.useCases.FetchDummyUseCase
import com.timplifier.boilerplate.presentation.base.BaseViewModel
import com.timplifier.boilerplate.presentation.ui.models.DummyUI
import com.timplifier.boilerplate.presentation.ui.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor(
    private val fetchDummyUseCase: FetchDummyUseCase
) : BaseViewModel() {
    private val _dummyState = mutableUiStateFlow<List<DummyUI>>()
    var dummyState = _dummyState.asStateFlow()

    fun fetchDummies() =
        fetchDummyUseCase().gatherRequest(_dummyState) { dummyList -> dummyList.map { it.toUI() } }

}