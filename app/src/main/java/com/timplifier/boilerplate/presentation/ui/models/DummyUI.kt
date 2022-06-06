package com.timplifier.boilerplate.presentation.ui.models

import com.example.boilerplate.domain.models.DummyModel
import com.timplifier.boilerplate.presentation.base.BaseDiffModel

data class DummyUI(
    override val id: Any
) : BaseDiffModel

fun DummyModel.toUI() = DummyUI(id)
