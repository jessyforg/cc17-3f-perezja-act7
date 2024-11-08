package com.example.cc17_perezja_act7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    fun loadPlaces(category: String) {
        _places.value = when (category) {
            "Coffee Shops" -> listOf(
                Place("Cafe by the Ruins", "Cafe by the Ruins was rebuilt into a romantic, modern cafe, reclaiming its title as one of the best spots in the city.  \n" +
                        "A visit to this iconic cafe is not complete without trying their signature Ruins Coffee infused with cinnamon and cardamom that’s sure to uplift your mood.  \n" +
                        "Plus, you can take home-baked pastries like Luisa's Ensaymada and Ernie’s Camote Bread that are sure to be a hit with the family!", R.drawable.cafebytheruins),
                Place("Hot Cat Specialty Coffee", "Hot Cat Specialty Coffee is a top pick for many coffee aficionados.  \n" +
                        "This quaint and quirky java shop is dedicated to highlighting specialty coffee and lets you in on the art and science behind pour-over coffee.  \n" +
                        "Before you get your hands on a cup of perfection, you’ll learn how it’s made to understand what good coffee should taste like.  \n" +
                        "Once you take your first sip of their specialty coffee like the Hot Cat’s Sweet Cinnamon Latte, Horchata, or the Spanish Latte, you’ll know what the perfect cup tastes like!  \n" +
                        "Have some sweet or savory delicacies on the side like their Lemon Fudge Bar or Grilled Four-Cheese Sandwich and enjoy your match made in coffee heaven under the swaying pine trees outside!", R.drawable.hotcatspecialtycoffee),
                Place("Arca's Yard", "Avoid the crowded cafes in the city and enjoy your coffee in peace at Arca’s Yard.  \n" +
                        "Hidden 10–15 minutes away from the city, Arca’s Yard is a café, museum, library, and bed-and-breakfast accommodation all rolled into one.  \n" +
                        "The first thing you will notice when you enter is the amount of natural light that illuminates the space and accentuates the rustic interiors and artworks, giving it a homey ambiance.  \n" +
                        "It’s the kind of place that makes you want to snuggle in a corner with a cup of strong Benguet Coffee in one hand, and a good book on the other while enjoying panoramic views of the lush Cordillera mountains.  \n" +
                        "What more can you ask for?", R.drawable.arca),
                Place("Cafe de Angelo", "Cafe de Angelo is a quaint coffee shop tucked in a dainty garden along the scenic outskirts of the city.  \n" +
                        "This garden cafe is a popular spot for locals and tourists to hang out and spend a chill afternoon.\n" +
                        "Take your pick from their house blends—De Angelo Blend, Barako, and Italian Roast—to go with your choice of comfort food like their Zoolander Burger and Chicharon Pasta for your midday fill.", R.drawable.angelo),
                Place("Hatch Coffee","One of the newer cafes in Baguio, Hatch Coffee is slowly becoming a staple in the city’s cafe scene.  \n" +
                        "This cafe, located 15 minutes away from the city center, is located along —hence the name.  \n" +
                        "This not-so-secret coffee shop has become a go-to spot for those who want to indulge in some comforting coffee and food.  \n" +
                        "If you’d like to spice up your coffee of the day, try their signature Hatchata, their play on the Horchata or their Dirty Hatchata made with almonds and cinnamon or their strawberry-flavored Hatchata.  \n" +
                        "Bring your tall glass of Hatchata with their Grilled Cheese with Habañero Honey out in their garden and enjoy it amidst the cool Baguio weather.", R.drawable.hatch)
            )
            "Restaurants" -> listOf(
                Place("Farmer\'s Daughter", "True to its mission of showcasing local flavors, the restaurant's design mirrors a traditional Ifugao hut, complete with a thatched roof.  \n" +
                        "Baguio City and its neighboring provinces are famous for their fresh vegetables, but the locals favor smoked meat, or \"kinuday,\" which is a standout dish here.", R.drawable.farmers),
                Place("Lemon and Olives", "Lemon and Olives, located along Outlook Drive, brings the vibrant flavors of Greek culture to hungry visitors in Baguio City.  \n" +
                        "Owned by Chef Takis, who hails from the historic city of Athens in Greece, the restaurant stays true to authentic Greek recipes.  \n" +
                        "The menu reflects Chef Takis' favorite dishes, many of which he has been preparing daily using ingredients sourced directly from Greece.", R.drawable.lemonandolives),
                Place("Hill Station", "Combining the signature flavors of Filipino cuisine with international influences is at the heart of Hill Station's cooking.  \n" +
                        "Their dishes have consistently gained recognition from guests and were even named one of the top restaurants in Asia by Miele Guide, a renowned regional guidebook on Asian cuisine.", R.drawable.hill_station),
                Place("Good Taste", "When you step into Amare La Cucina in the EGI Alberto Hotel in Baguio City, you'll immediately notice the distinct scent of a wood-fired brick oven.\n" +
                        "This traditional Italian cooking method gives the restaurant’s dishes an authentic flavor, especially its pizzas.\n" +
                        "Each pizza is carefully molded by hand, topped with fresh ingredients, and cooked at high temperatures in the oven, delivering a truly Italian dining experience.", R.drawable.goodtaste),
                Place("Amare La Cucina Pizza", "When you step into Amare La Cucina in the EGI Alberto Hotel in Baguio City, you'll immediately notice the distinct scent of a wood-fired brick oven.\n" +
                        "This traditional Italian cooking method gives the restaurant’s dishes an authentic flavor, especially its pizzas.\n" +
                        "Each pizza is carefully molded by hand, topped with fresh ingredients, and cooked at high temperatures in the oven, delivering a truly Italian dining experience.", R.drawable.amare)
            )
            //parks
            "Parks" -> listOf(
                Place("Burnham Park", "Burnham Park is a large city park located in front of The Melvin Jones Grandstand, in Baguio City, Philippines.\n" +
                        "There are many activities to be enjoyed by visitors, such as boating on the man-made lake, skateboarding and riding rides on the amusement park's kiddie rides, eating strawberry taho and other local delicacies at food stalls, or picnicking under the pine trees.", R.drawable.burnhamparkbaguio),
                Place("Botanical Garden", "The Baguio Botanical Garden is a beautiful spot in the city where visitors can explore a variety of plants and flowers.\n" +
                        "The park has a variety of different areas, including individual pavilions dedicated to the cities that Baguio shares relationships with.\n" +
                        "There are also plenty of benches to relax on and activities to do, like taking a lunch break or exploring the gardens.\n" +
                        "If you're interested in nature, then this is definitely a place you should visit.", R.drawable.botanical),
                Place("Mines View Park", "Mines View Park is a well-known destination that offers breathtaking views of mountain landscapes, making it an ideal spot to catch stunning sunsets.\n" +
                        "After enjoying the scenic beauty, visitors can explore the nearby Baguio Night Market for some bargain hunting or experience the lively nightlife along Session Road for a memorable evening in the area.", R.drawable.minesviewpark),
                Place("Camp John Hay", "Nestled among the pine trees of Baguio, Camp John Hay Park offers a picturesque setting for visitors to capture Instagram-worthy photos and enjoy the fresh ambiance.\n" +
                        "It provides a tranquil escape from the city, allowing you to immerse yourself in nature while still being close to urban amenities.", R.drawable.campjohnhay),
                Place("Wright Park", "Located in the heart of Baguio City, The Wright Park is a tranquil natural area that is perfect for nature lovers and those who want to get some exercise.\n" +
                        "There are several walking trails and horseback riding opportunities available, making it an ideal place to spend a day out.\n", R.drawable.wrightpark)
            )
            //malls
            "Malls" -> listOf(
                Place("SM City Baguio", "The shopping mall SM City Baguio has recently introduced a new dining experience called Dine Under the Sky.\n" +
                        "This offers guests a unique view of the surrounding greeneries and night sky through acrylic walls.\nThe mall is also home to nationally-known brands such as Nike, Uniqlo, Salvatore Ferragamo, Chanel, and many more.\n", R.drawable.sm),
                Place("Tiong San Mall", "Tiong San La Trinidad Mall is a spacious and modern shopping destination located in Baguio City and La Trinidad.\n" +
                        "With over seven decades of experience, it offers a wide range of products from groceries, clothes, accessories, school supplies to gadgets and house furniture.\n" +
                        "The mall's nice modern design and colorful chairs make for a pleasant shopping experience.\n" +
                        "Visitors also enjoy food trips here as it offers a variety of dining options.\n", R.drawable.tiongsan),
                Place("Abanao Square", "Small and unassuming, Abanao Square offers a variety of affordable goods and services.\n" +
                        "It has a wide assortment of apparel, personal care items, electronics, banks, pawnshops, remittance centers, and a fitness gym.\n" +
                        "The Japan home store is particularly well-made and helpful.\n", R.drawable.abanao),
                Place("Baguio Center Mall", "Baguio Center Mall is a large, modern shopping mall in the city of Baguio in the Philippines.\n" +
                        "Opened in 2003, it has more than 300 stores and restaurants, making it one of the largest malls on the island.\n" +
                        "The mall is popular for its wide range of retailers and its central location.\n", R.drawable.baguiocentermall),
                Place("Porta Vaga", "The Porta Vaga Mall is a large, well-designed shopping mall with a variety of stores, an eatery selection, and a supermarket.\n" +
                        "It’s the mall at the heart of the city, and it's elegant yet convenient for shoppers.\n", R.drawable.portavaga)
            )
            //Schools
            "Schools" -> listOf(
                Place("Saint Louis University", "#83 in the Philippines\n" +
                        "#3287 in Asia\n" +
                        "Founded: 1911", R.drawable.slu),
                Place("University of Baguio", "#106 in the Philippines\n" +
                        "#4020 in Asia\n" +
                        "Founded: 1948", R.drawable.ub),
                Place("University of the Cordilleras", "#109 in the Philippines\n" +
                        "#4059 in Asia\n" +
                        "Founded: 1946", R.drawable.uc),
                Place("University of the Philippines Baguio", "#28 in the Philippines\n" +
                        "#2460 in Asia\n" +
                        "Founded: 1961", R.drawable.upb)
            )
            else -> emptyList()
        }
    }
}