package com.udemy.motivation.data

import com.udemy.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase (val description: String, val categoryId: Int)

class Mock {

    private val sunny = MotivationConstants.FILTER.SUNNY
    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY


    private val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Não existe um caminho para a felicidade. A felicidade é o caminho.", happy),
        Phrase("Saber encontrar a alegria na alegria dos outros é o segredo da felicidade.", happy),
        Phrase("Feliz aquele que transfere o que sabe e aprende o que ensina.", happy),
        Phrase("A alegria evita mil males e prolonga a vida.", happy),
        Phrase("Só existe uma lei no amor; tornar feliz a quem se ama.", happy),
        Phrase("A persistência é o caminho do êxito.", sunny),
        Phrase("Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.", sunny),
        Phrase("A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.", sunny),
        Phrase("É parte da cura o desejo de ser curado.", sunny),
        Phrase("O que me preocupa não é o grito dos maus. É o silêncio dos bons.", sunny),
        Phrase("O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.", sunny),

        )
    
    fun getPhrase(value: Int) : String {
        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description

    }

}