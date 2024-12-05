package org.bangalore.api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    // GET: Best restaurants for friends and family
    @GetMapping("/friends-family")
    public List<Map<String, String>> getBestForFriendsAndFamily() {
        return List.of(
                Map.of("name", "Corner House", "location", "Indiranagar", "famousDishes", "Ice Creams"),
                Map.of("name", "Black Pearl", "location", "Koramangala", "famousDishes", "Buffet")
        );
    }

    // GET: Budget-friendly restaurants
    @GetMapping("/budget-friendly")
    public List<Map<String, String>> getBudgetFriendly() {
        return List.of(
                Map.of("name", "CTR", "location", "Malleshwaram", "famousDishes", "Dosa"),
                Map.of("name", "Savoury", "location", "Frazer Town", "famousDishes", "Biryani")
        );
    }

    // GET: Street shopping areas
    @GetMapping("/street-shopping")
    public List<Map<String, String>> getStreetShopping() {
        return List.of(
                Map.of("area", "Commercial Street", "famousFor", "Clothes"),
                Map.of("area", "Chickpet", "famousFor", "Sarees")
        );
    }

    // PUT: Add restaurant for friends
    @PutMapping("/add-for-friends")
    public String addForFriends(@RequestBody Map<String, String> restaurant) {
        return "Added restaurant for friends: " + restaurant.get("name");
    }

    // PUT: Add restaurant for family
    @PutMapping("/add-for-family")
    public String addForFamily(@RequestBody Map<String, String> restaurant) {
        return "Added restaurant for family: " + restaurant.get("name");
    }
}
