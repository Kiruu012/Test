package com.example.mp3reader.data

/**
 * Model placeholder for local audio metadata.
 */
data class AudioTrack(
    val id: Long,
    val title: String,
    val artist: String?,
    val durationMs: Long,
    val uri: String
)
