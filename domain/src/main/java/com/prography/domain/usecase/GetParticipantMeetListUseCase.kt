package com.prography.domain.usecase

import com.prography.domain.model.response.MeetsResponseEntity
import com.prography.domain.repository.MeetRepository
import kotlinx.coroutines.flow.Flow

class GetParticipantMeetListUseCase(
    private val meetRepository: MeetRepository
) {
    suspend operator fun invoke(userId: Int): Flow<List<MeetsResponseEntity>> =
        meetRepository.getParticipantMeets(userId)
}