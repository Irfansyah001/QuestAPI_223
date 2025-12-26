package com.example.questapi_223.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questapi_223.modeldata.DetailSiswa
import com.example.questapi_223.modeldata.UIStateSiswa
import com.example.questapi_223.modeldata.toDataSiswa
import com.example.questapi_223.modeldata.toUiStateSiswa
import com.example.questapi_223.repositori.RepositoryDataSiswa
import com.example.questapi_223.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import retrofit2.Response


