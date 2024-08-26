package com.mehedi.nasaapiastoroiedradar


import com.squareup.moshi.Json
import androidx.annotation.Keep

@Keep
data class response_ast(
    @Json(name = "element_count")
    val elementCount: Int? = null,
    @Json(name = "links")
    val links: Links? = null,
    @Json(name = "near_earth_objects")
    val nearEarthObjects: NearEarthObjects? = null
) {
    @Keep
    data class Links(
        @Json(name = "next")
        val next: String? = null,
        @Json(name = "previous")
        val previous: String? = null,
        @Json(name = "self")
        val self: String? = null
    )

    @Keep
    data class NearEarthObjects(
        @Json(name = "2024-08-20")
        val x20240820: List<X20240820?>? = null,
        @Json(name = "2024-08-21")
        val x20240821: List<X20240821?>? = null,
        @Json(name = "2024-08-22")
        val x20240822: List<X20240822?>? = null,
        @Json(name = "2024-08-23")
        val x20240823: List<X20240823?>? = null,
        @Json(name = "2024-08-24")
        val x20240824: List<X20240824?>? = null,
        @Json(name = "2024-08-25")
        val x20240825: List<X20240825?>? = null,
        @Json(name = "2024-08-26")
        val x20240826: List<X20240826?>? = null,
        @Json(name = "2024-08-27")
        val x20240827: List<X20240827?>? = null
    ) {
        @Keep
        data class X20240820(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240821(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240822(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240823(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240824(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240825(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240826(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }

        @Keep
        data class X20240827(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = null,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = null,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = null,
            @Json(name = "id")
            val id: String? = null,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = null,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean? = null,
            @Json(name = "links")
            val links: Links? = null,
            @Json(name = "name")
            val name: String? = null,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String? = null,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String? = null,
            @Json(name = "sentry_data")
            val sentryData: String? = null
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String? = null,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String? = null,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long? = null,
                @Json(name = "miss_distance")
                val missDistance: MissDistance? = null,
                @Json(name = "orbiting_body")
                val orbitingBody: String? = null,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity? = null
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String? = null,
                    @Json(name = "kilometers")
                    val kilometers: String? = null,
                    @Json(name = "lunar")
                    val lunar: String? = null,
                    @Json(name = "miles")
                    val miles: String? = null
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String? = null,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String? = null,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String? = null
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet? = null,
                @Json(name = "kilometers")
                val kilometers: Kilometers? = null,
                @Json(name = "meters")
                val meters: Meters? = null,
                @Json(name = "miles")
                val miles: Miles? = null
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double? = null,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double? = null
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String? = null
            )
        }
    }
}