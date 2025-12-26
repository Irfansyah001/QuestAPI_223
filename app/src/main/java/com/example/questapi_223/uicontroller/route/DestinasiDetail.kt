package com.example.questapi_223.uicontroller.route

import com.example.questapi_223.R

object DestinasiDetail: DestinasiNavigasi {

    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"

}

