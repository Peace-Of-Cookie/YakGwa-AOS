package com.prography.yakgwa.di

import com.prography.domain.repository.MeetRepository
import com.prography.domain.repository.NaverRepository
import com.prography.domain.usecase.GetLocationListUseCase
import com.prography.domain.usecase.GetMeetInformationDetailUseCase
import com.prography.domain.usecase.GetParticipantMeetListUseCase
import com.prography.domain.usecase.GetThemeListUseCase
import com.prography.domain.usecase.GetVoteTimePlaceCandidateInfoUseCase
import com.prography.domain.usecase.PostMeetParticipantUseCase
import com.prography.domain.usecase.PostNewMeetCreateUseCase
import com.prography.domain.usecase.PostUserVotePlaceUseCase
import com.prography.domain.usecase.PostUserVoteTimeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun providesGetThemeListUseCase(meetRepository: MeetRepository): GetThemeListUseCase =
        GetThemeListUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesPostNewMeetCreateUseCase(meetRepository: MeetRepository): PostNewMeetCreateUseCase =
        PostNewMeetCreateUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesGetParticipantMeetListUseCase(meetRepository: MeetRepository): GetParticipantMeetListUseCase =
        GetParticipantMeetListUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesGetLocationListUseCase(naverRepository: NaverRepository): GetLocationListUseCase =
        GetLocationListUseCase(naverRepository)

    @Provides
    @Singleton
    fun providesGetMeetDetailInformationUseCase(meetRepository: MeetRepository): GetMeetInformationDetailUseCase =
        GetMeetInformationDetailUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesPostMeetParticipantUseCase(meetRepository: MeetRepository): PostMeetParticipantUseCase =
        PostMeetParticipantUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesGetVoteTimeCandidateInfoUseCase(meetRepository: MeetRepository): GetVoteTimePlaceCandidateInfoUseCase =
        GetVoteTimePlaceCandidateInfoUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesPostUserVoteTimeUseCase(meetRepository: MeetRepository): PostUserVoteTimeUseCase =
        PostUserVoteTimeUseCase(meetRepository)

    @Provides
    @Singleton
    fun providesPostUserVotePlaceUseCase(meetRepository: MeetRepository): PostUserVotePlaceUseCase =
        PostUserVotePlaceUseCase(meetRepository)
}