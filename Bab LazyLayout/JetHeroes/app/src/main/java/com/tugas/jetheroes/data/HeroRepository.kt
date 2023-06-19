package com.tugas.jetheroes.data

import com.tugas.jetheroes.models.Hero
import com.tugas.jetheroes.models.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}

