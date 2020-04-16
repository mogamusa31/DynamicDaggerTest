package com.ironflowers.fbt2.core.data.remote.content


class RemoteContentRepo() : ContentRepo {

    companion object {
        const val COLLECTION_CONTENT = "content"
    }

    override suspend fun getAll(): List<RemoteContentItem> {
        return arrayOf(
            RemoteContentItem("id1", "title 1", "description 1"),
            RemoteContentItem("id2", "title 2", "description 2"),
            RemoteContentItem("id3", "title 3", "description 3"),
            RemoteContentItem("id4", "title 4", "description 4"),
            RemoteContentItem("id5", "title 5", "description 5"),
            RemoteContentItem("id6", "title 6", "description 6"),
            RemoteContentItem("id7", "title 7", "description 7"),
            RemoteContentItem("id8", "title 8", "description 8")
        ).toList()
    }

    override suspend fun get(id: String): RemoteContentItem {
        return RemoteContentItem("id $id", "title $id", "description $id")
    }
}