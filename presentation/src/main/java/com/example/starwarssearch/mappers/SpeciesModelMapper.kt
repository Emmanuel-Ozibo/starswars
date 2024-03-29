package com.example.starwarssearch.mappers

import com.example.core.base.BaseMapper
import com.example.domain.models.Species
import com.example.starwarssearch.models.SpeciesModel
import javax.inject.Inject

class SpeciesModelMapper  @Inject constructor(
    private val homeWorldModelMapper: HomeWorldModelMapper
): BaseMapper<SpeciesModel, Species> {
    override fun mapTo(to: Species): SpeciesModel {
        return SpeciesModel(
            average_height = to.average_height,
            average_lifespan = to.average_lifespan,
            classification = to.classification,
            created = to.created,
            designation = to.designation,
            edited = to.edited,
            eye_colors = to.eye_colors,
            films = to.films,
            hair_colors = to.hair_colors,
            homeworld = to.homeworld,
            language = to.language,
            name = to.name,
            people = to.people,
            skin_colors = to.skin_colors, url = to.url,
            homeWorld = homeWorldModelMapper.mapTo(to.homeWorld)
        )
    }

    override fun mapFrom(from: SpeciesModel): Species {
        return Species(
            average_height = from.average_height,
            average_lifespan = from.average_lifespan,
            classification = from.classification,
            created = from.created,
            designation = from.designation,
            edited = from.edited,
            eye_colors = from.eye_colors,
            films = from.films,
            hair_colors = from.hair_colors,
            homeworld = from.homeworld,
            language = from.language,
            name = from.name,
            people = from.people,
            skin_colors = from.skin_colors, url = from.url,
            homeWorld = homeWorldModelMapper.mapFrom(from.homeWorld)
        )
    }


}