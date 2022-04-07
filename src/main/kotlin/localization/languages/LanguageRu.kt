package localization.languages

import localization.Language

object LanguageRu : Language {
    override val currentLanguage: String
        get() = "Ru"

    override val title: String
        get() = "Compose desktop локализация"
    override val name: String
        get() = "Авокадо"
    override val description: String
        get() = "Авокадо ( Persea americana ) - это дерево, происходящее из Америки, которое, вероятно, произрастает в горных районах от южно-центральной Мексики до Гватемалы. Он классифицируется как член семейства цветковых растений Lauraceae."
}