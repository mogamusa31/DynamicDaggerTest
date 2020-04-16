package com.ironflowers.fbt2.core.data.remote.content

/**
 * @property imageUrl Url of the image on the storage, relative to the storage content root.
 */
data class RemoteContentItem(
    var id: String = "",
    val title: String = "",
    val description: String = "",
    val imageUrl: String? = null
)