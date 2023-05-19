package dev.kevalkanpariya.deepthoughtedutech.ui.screens

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.kevalkanpariya.deepthoughtedutech.remote.repository.ProjectRepository
import javax.inject.Inject

@HiltViewModel
class ProjectViewModel @Inject constructor(
     repository: ProjectRepository
): ViewModel() {

}