package com.timplifier.boilerplate.presentation.ui.models

import com.example.boilerplate.domain.models.DummyModel

data class DummyUI(
    val id: Any
)

fun DummyModel.toUI() = DummyUI(id)
