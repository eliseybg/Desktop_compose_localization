package localization.languages

import localization.Language

object LanguageEn : Language {
    override val currentLanguage: String
        get() = "En"
    override val title: String
        get() = "Compose desktop Localization"
    override val name: String
        get() = "Avocado"
    override val description: String
        get() = "The avocado (Persea americana) is a tree native to the Americas, probably native to mountainous regions from south-central Mexico to Guatemala. It is classified as a member of the flowering plant family Lauraceae."
}