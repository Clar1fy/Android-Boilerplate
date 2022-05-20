package com.example.boilerplate.domain.useCases

import com.example.boilerplate.domain.repositories.FetchDummyRepository
import javax.inject.Inject

class FetchDummyUseCase @Inject constructor(
    private val fetchDummyRepository: FetchDummyRepository
) {
    operator fun invoke() = fetchDummyRepository.fetchDummies()
}