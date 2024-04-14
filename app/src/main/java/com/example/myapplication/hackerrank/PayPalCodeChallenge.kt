package com.example.myapplication.hackerrank



fun main() {
    val songs = arrayOf(
        arrayOf("unforgettable", "3:30"),
        arrayOf("dora", "1:30"),
        arrayOf("bob", "4:30"),
        arrayOf("phone", "5:30"),
        arrayOf("zero", "6:30"),
        arrayOf("cap", "3:30"),
    )
    findPairsWithTotalDurationOf7Minutes(songs)

}

fun findPairsWithTotalDurationOf7Minutes(songs: Array<Array<String>>) {
    val songBuilders = songs.map { (song, duration) ->
        val (minutes, seconds) = duration.split(":").map { it.toInt() }
        SongBuilder(song = song, duration = minutes * 60 + seconds)
    }

    val uniquePairs = mutableSetOf<Pair<String, String>>()

    songBuilders.forEachIndexed { index1, songBuilder1 ->
        songBuilders.subList(index1 + 1, songBuilders.size).forEach { songBuilder2 ->
            val totalDuration = songBuilder1.duration + songBuilder2.duration
            if (totalDuration == 420) {
                val pair = songBuilder1.song to songBuilder2.song
                if (!uniquePairs.contains(pair) && !uniquePairs.contains(pair.second to pair.first)) {
                    uniquePairs.add(pair)
                }
            }
        }
    }

    if (uniquePairs.isEmpty()) {
        println("No pairs matching the criteria found.")
    } else {
        uniquePairs.forEach { (firstSong, secondSong) ->
            println("$firstSong && $secondSong are matching criteria")
        }
    }
}


data class SongBuilder(
    val duration: Int,
    val song: String
)