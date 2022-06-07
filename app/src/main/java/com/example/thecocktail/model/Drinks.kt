package com.example.thecocktail.model

import com.squareup.moshi.Json

data class Drinks(
    val idDrink: String, //"13024"
    val strDrink: String, //"Sweet Sangria"
    val strDrinkAlternate: String?, //null
    val strTags: String?, //null
    val strVideo: String?, //null
    val strCategory: String, //"Punch \/ Party Drink"
    val strIBA: String?, //null
    val strAlcoholic: String, //"Alcoholic"
    val strGlass: String, //"Pitcher"
    val strInstructions: String, //"Dissolve the sugar in hot water and cool.
    // Peel the citrus fruits and break into wedges.
    // Mix the wine, sugar syrup, fruit, and Fresca in a pitcher and put in the fridge for a few hours.
    // Serve in tall glasses with a straw."
    val strInstructionsES: String?, //null
    val strInstructionsDE: String, //"Den Zucker in hei
    // \u00dfem Wasser aufl
    // \u00f6sen und abk
    // \u00fchlen lassen. Die Zitrusfr
    // \u00fcchte sch
    // \u00e4len und st
    // \u00fcckeln. Wein, Zuckersirup, Obst und Fresca in einem Krug mischen und f
    // \u00fcr einige Stunden in den K
    // \u00fchlschrank stellen. In hohen Gl
    // \u00e4sern mit einem Strohhalm servieren."
    val strInstructionsFR: String?, //null
    val strInstructionsIT: String, //"Sciogliere lo zucchero in acqua calda e raffreddare.
    // \r\nPelare gli agrumi e spezzarli a spicchi.
    // \r\nMescolare il vino, lo sciroppo di zucchero, la frutta e la Fresca in una caraffa e mettere in frigo per qualche ora.
    // \r\nServire in bicchieri alti con una cannuccia."
    @Json(name = "strInstructionsZH-HANS")
    val strInstructionsZHHANS: String?, //null
    @Json(name = "strInstructionsZH-HANT")
    val strInstructionsZHHANT: String?, //null
    val strDrinkThumb: String, //"https:\/\/www.thecocktaildb.com\/images\/media\/drink\/uqqvsp1468924228.jpg"
    val strIngredient1: String?, //"Red wine"
    val strIngredient2: String?, //"Sugar"
    val strIngredient3: String?, //"Water"
    val strIngredient4: String?, //"Apple"
    val strIngredient5: String?, //"Orange"
    val strIngredient6: String?, //"Lime"
    val strIngredient7: String?, //"Lemon"
    val strIngredient8: String?, //"Fresca"
    val strIngredient9: String?, //null
    val strIngredient10: String?, //null
    val strIngredient11: String?, //null
    val strIngredient12: String?, //null
    val strIngredient13: String?, //null
    val strIngredient14: String?, //null
    val strIngredient15: String?, //null
    val strMeasure1: String, //"2 bottles "
    val strMeasure2: String, //"1 cup "
    val strMeasure3: String, //"2 cups hot "
    val strMeasure4: String, //"1 cup"
    val strMeasure5: String, //" wedges\n"
    val strMeasure6: String, //" wedges\n"
    val strMeasure7: String?, //null
    val strMeasure8: String?, //null
    val strMeasure9: String?, //null
    val strMeasure10: String?, //null
    val strMeasure11: String?, //null
    val strMeasure12: String?, //null
    val strMeasure13: String?, //null
    val strMeasure14: String?, //null
    val strMeasure15: String?, //null
    val strImageSource: String?, //null
    val strImageAttribution: String?, //null
    val strCreativeCommonsConfirmed: String, //"No"
    val dateModified: String, //"2016-07-19 11:30:28"
) {
    fun Drinks.convertByCocktail(): Cocktail {
        val ingredients = mutableListOf<String>()
        val allIngredients = listOf<String?>(
            strIngredient1,
            strIngredient2,
            strIngredient3,
            strIngredient4,
            strIngredient5,
            strIngredient6,
            strIngredient7,
            strIngredient8,
            strIngredient9,
            strIngredient10,
            strIngredient11,
            strIngredient12,
            strIngredient13,
            strIngredient14,
            strIngredient15
        )

        for (i in 0..14) {
            allIngredients[i]?.let {
                ingredients.add(it)
            }
        }

        return Cocktail(
            id = idDrink,
            name = strDrink,
            image = strDrinkThumb,
            category = strCategory,
            favorite = false,
            ingredients = ingredients
        )
    }
}