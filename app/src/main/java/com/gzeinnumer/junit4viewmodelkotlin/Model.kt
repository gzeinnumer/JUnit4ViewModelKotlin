package com.gzeinnumer.junit4viewmodelkotlin

interface Repository<T> {
    fun getOne(id: String): Single<T>
}

interface FavoriteVenueController {
    fun markAs(venueId: String, favorite: Boolean): Completable
    fun checkIsFavorite(venueId: String): Single<Boolean>
}

data class VenueDisplayable(
    val id: String,
    val name: String,
    val location: String
)