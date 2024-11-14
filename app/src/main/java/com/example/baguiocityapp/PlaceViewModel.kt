package com.example.baguiocityapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    fun loadPlaces(category: String) {
        _places.value = when (category) {
            "Coffee Shops" -> listOf(
                Place("Café by the Ruins", "Cafe by the Ruins was rebuilt into a romantic, modern cafe, reclaiming its title as one of the best coffee shops in Baguio.\n\n" +
                        "Address: Ruins, Upper Session Road, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisines: Filipino, Cafe, Asian, Fusion\n" +
                        "Meals: Breakfast, Lunch, Dinner, Brunch\n" +
                        "Desserts: Strawberry shortcake, Local pastries\n\n" +
                        "Price Range: ₱150 - ₱500\n\n" +
                        "Specials: Known for their locally sourced ingredients and unique blends of coffee. They often have seasonal specials featuring local delicacies.", R.drawable.cafebytheruins),
                Place("Arca's Yard", "Arca’s Yard is a café, museum, library, and bed-and-breakfast accommodation all rolled into one.\n\n" +
                        "Address:  777 Tiptop City Limit, Ambuklao Road, Baguio\n\n" +
                        "Details:\n" +
                        "Cuisines: Filipino, Cafe, Asian\n" +
                        "Meals: Breakfast, Lunch, Dinner, Brunch\n\n" +
                        "Price Range: ₱150 - ₱400\n\n" +
                        "Specials: Offers art exhibits featuring local artists and has a great view of the mountains.", R.drawable.arcasyard),
                Place("Café De Angelo", "Cafe de Angelo is a quaint coffee shop tucked in a dainty garden along Marcos Highway. This garden cafe is a popular spot for locals and tourists to hang out and spend a chill afternoon. \n\n" +
                        "Address: 54 Chapis Village, Marcos Highway, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisines: Cafe, International\n" +
                        "Meals: Breakfast, Lunch, Dinner, Brunch\n\n" +
                        "Price Range: ₱100 - ₱820\n\n" +
                        "Specials:  offers a tranquil and cozy ambiance away from the city's hustle and bustle.", R.drawable.cafedeangelo),
                Place("Vanilla Café", "Drink your coffee like an aristocrat at Vanilla Cafe - a French-inspired cafe of pastels, colorful prints, and both dainty and opulent vintage decor. \n\n" +
                        "Address: Kamiseta Hotel Baguio, 20 Villamor St., Brgy. Lualhati, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisines: American, Cafe\n" +
                        "Meals: Breakfast, Lunch, Dinner\n\n" +
                        "Price Range: ₱88 - ₱590\n\n" +
                        "Specials: They have an extensive menu of mouthwatering desserts from cupcakes to pancakes that you can wash down with a glass of coffee.", R.drawable.vanillacafe),
                Place("Café Yagam","A taste of Cordilleran culture, it has lovely wooden chairs and tables, as well as native delicacies like pinikpikan with etags — chicken with smoked and salted pork meat.\n\n" +
                        "Address: Address: Calle Uno Building, #3 Escoda (First Road) cor. Naguilian Road, Quezon Hill, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisines: Pinikpikan (traditional dish), Cordilleran specialties\n" +
                        "Price Range: ₱90 - ₱340\n\n" +
                        "Specials: Focuses on local Cordilleran cuisine and culture.", R.drawable.cafeyagam),
                Place("Hatch Coffee","The cafe Hatch Coffee is perfect for a relaxing afternoon, with its rustic interiors and dainty garden. It’s popular among students and young professionals.\n\n" +
                        "Address: 135 Easter Road cor 1 road, Manzanillo\n\n" +
                        "Details:\n" +
                        "Cuisine: Pastries, Light meals\n\n" +
                        "Price Range: ₱60 - ₱280\n\n" +
                        "Specials: Known for its minimalistic design and artisan coffee.",R.drawable.hatchcafe),

            )
            "Restaurants" -> listOf(
                Place("The Hill Station", "The Hill Station offers a cozy ambiance and a menu that highlights both local and international flavors, making it a popular choice for fine dining. The restaurant's vintage decor and warm atmosphere provide a perfect backdrop for a memorable dining experience.\n\n" +
                        "Address: 14 Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Cuisine: Filipino, International, Spanish\n" +
                        "Meal: Breakfast, Lunch, Dinner, Brunch, Late Night, Drinks\n" +
                        "Price Range: ₱300 - ₱1,200\n\n", R.drawable.hillstation),
                Place("Canto", "The Red Lion is a cozy pub that serves delicious comfort food and a wide range of drinks. Its warm, inviting atmosphere makes it a popular hangout for both locals and tourists looking to unwind.\n\n" +
                        "Address: # 32 Kisad Road, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisine: American, Barbeque\n" +
                        "Meal: Lunch, Dinner, Brunch\n" +
                        "Price Range: ₱200 - ₱600\n\n", R.drawable.canto),
                Place("Forest House", "Alfresco offers a relaxing outdoor dining experience surrounded by nature, making it a great spot for families and gatherings. The menu features a mix of local and international cuisine.\n\n" +
                        "Address: 16 Loakan Rd SW of Camp John Hay, Baguio, City\n\n" +
                        "Details:\n" +
                        "Cuisines: American, Filipino\n" +
                        "Meal: Lunch, Dinner, Brunch, Late Night\n" +
                        "Price Range: ₱200 - ₱500\n\n", R.drawable.foresrhouse),
                Place("Ganza Restaurant", "Ganza Restaurant combines a cozy ambiance with a menu featuring a mix of Filipino and Asian cuisine. The establishment is popular for its hearty dishes and family-friendly atmosphere.\n\n" +
                        "Address: Burnham Park, Lake Dr, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisine: Filipino\n" +
                        "Meal: Lunch, Dinner\n" +
                        "Price Range: ₱580 - ₱1400\n\n", R.drawable.ganza),
                Place("Sizzling Plate", "Sizzling Plate is known for its sizzling dishes served on hot plates, providing a unique dining experience. The restaurant offers a variety of options, from sizzling steaks to seafood, all prepared to perfection.\n\n" +
                        "Address: 23, Upper Session Road, Baguio City\n\n" +
                        "Details:\n" +
                        "Cuisine: Steakhouse\n" +
                        "Meal: Lunch, Dinner, Brunch\n" +
                        "Price Range: ₱200 - ₱500\n\n", R.drawable.sizzlingplate),
            )
            "Parks" -> listOf(
                Place("Wright Park", "Famous for its pool of pines and horseback riding activities, Wright Park also offers a lovely view of the Baguio Mansion. It’s perfect for family outings and taking scenic photos.\n\n" +
                        "Address: Gibraltar Road, Baguio, Benguet\n\n" +
                        "Features: Known for horseback riding and the picturesque “Pool of Pines,” with stalls nearby for souvenir shopping.", R.drawable.wright),
                Place("Mines View Park", "A viewing deck at this park provides stunning panoramas of the Cordillera mountains and the Itogon mines. It also features various souvenir shops and traditional costumes for photo opportunities.\n\n" +
                        "Address: Mines View Observation Deck, Baguio, Benguet\n\n" +
                        "Features: The viewing deck, traditional costume photo ops, and souvenir stalls make it a tourist hotspot.", R.drawable.mines_view_park),
                Place("Burnham Park", "This iconic park is known for its spacious lawns, picturesque lagoon with rowboats, and vibrant flower gardens. It’s ideal for leisure activities like cycling, boating, and picnicking.\n\n" +
                        "Address: Jose Abad Santos Drive, Baguio, Benguet\n\n" +
                        "Features: Offers boat rides on the lagoon, a rose garden, and a skating rink; it's a favorite for tourists and locals alike.", R.drawable.burnham),
                Place("Panagbenga Park", "Dedicated to the annual Panagbenga (Flower Festival), this park is adorned with vibrant blooms and hosts themed sculptures. It’s a colorful space for taking photos and enjoying nature.\n\n" +
                        "Address: Camp John Hay, Loakan Rd, Baguio, Benguet\n\n" +
                        "Features: Highlights include flower displays, festival-inspired sculptures, and benches for relaxation.", R.drawable.panagbenga),
                Place("Igorot Garden", "A small, peaceful park in the city center, featuring statues honoring the native Igorot people. It’s a cultural site for rest and relaxation amid the hustle and bustle of Baguio.\n\n" +
                        "Address: Shanum St, Baguio, Benguet\n\n" +
                        "Features: Highlights include cultural sculptures and benches, making it a great stop for photos and relaxation.", R.drawable.igorot),
                Place("Sunshine Park", "This small, beautifully landscaped park is located near Burnham Park and is ideal for a relaxing visit. It's known for its colorful flower beds and koi pond.\n\n" +
                        "Address: Harrison Road, Baguio, Benguet\n\n" +
                        "Features: Highlights include a tranquil koi pond, floral displays, and shaded areas perfect for picnicking.", R.drawable.sunshine),
            )
            "Shopping Centers" -> listOf(
                Place("SM City Baguio", "Located in the heart of Baguio, SM City is the largest mall in the city, offering a mix of local and international brands alongside stunning mountain views. The open-air mall also provides diverse dining options and a cinema.\n\n" +
                        "Address: Luneta Hill, Upper Session Road, Baguio City\n\n" +
                        "What to Buy: Clothing, accessories, electronics, groceries, souvenirs, and various Baguio-made crafts.", R.drawable.sm),
                Place("Baguio Public Market", "Baguio’s Public Market is a vibrant, sprawling area known for its variety of local goods, fresh produce, and traditional crafts. It’s a perfect place for a truly local shopping experience.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Vegetables, fruits, pasalubong items (souvenirs), woven products, silver jewelry, coffee beans, and Cordilleran crafts.", R.drawable.market),
                Place("Baguio Night Market", "The Baguio Night Market on Harrison Road is one of the most popular night shopping events in the city, offering great bargains on clothes, shoes, and souvenirs. Open from late evening until midnight, it’s perfect for night owls.\n\n" +
                        "Address: Harrison Road, Baguio City\n\n" +
                        "What to Buy: Thrifted clothes, jackets, bags, shoes, accessories, and street food.", R.drawable.nightmarket),
                Place("Baguio Center Mall", "A bustling local mall frequented by residents, Baguio Center Mall offers an affordable shopping experience with local retailers and eateries. It’s known for its variety of budget-friendly finds and central location.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Affordable clothing, footwear, accessories, household items, and Filipino street food.", R.drawable.cm),
                Place("Porta Vaga Mall", "Porta Vaga Mall is a smaller yet popular shopping center with a more relaxed vibe and offers a mix of retail, dining, and services. It’s a favorite for finding unique specialty stores and food options.\n\n" +
                        "Address: Session Road, Baguio City\n\n" +
                        "What to Buy: Artisanal crafts, local artwork, clothing, and specialty foods from Baguio.", R.drawable.porta),
                Place("Maharlika Livelihood Complex", "Known as a hub for local handicrafts, the Maharlika Complex offers a range of affordable items made by local artisans. It’s ideal for tourists seeking authentic Baguio products with a cultural touch.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Woven bags, traditional clothing, wood carvings, silver jewelry, and local produce like vegetables and fruits.", R.drawable.maharlika),
                Place("Sky World Commercial Center", "Sky World Commercial Center is a low-key shopping spot with affordable clothing and thrift shops, popular among budget-conscious shoppers. It has a vintage appeal, perfect for bargain hunters.\n\n" +
                        "Address: Session Road, Baguio City\n\n" +
                        "What to Buy: Pre-loved clothing, shoes, and budget-friendly accessories.", R.drawable.skyworld),
                Place("Hilltop Agora Market", "Hilltop Agora Market is a bustling open market known for its fresh produce and vibrant atmosphere. It’s a popular stop for both locals and tourists who enjoy discovering local flavors.\n\n" +
                        "Address: Hilltop St., Baguio City\n\n" +
                        "What to Buy: Fresh vegetables, strawberries, meat, and other locally grown produce, as well as handicrafts and Baguio souvenirs.", R.drawable.hilltop),
                Place("Abanao Square", "Abanao Square is a multi-level mall offering a mix of local and international retail brands, along with dining options and essential services. It’s a practical shopping destination located near the city center.\n\n" +
                        "Address: Abanao Street, Baguio City\n\n" +
                        "What to Buy: Fashion items, electronics, sporting goods, accessories, and basic household items.", R.drawable.abanao),
            )
            else -> emptyList()
        }
    }
}
