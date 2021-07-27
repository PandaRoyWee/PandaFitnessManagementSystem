package com.example.pandafitnessmanagementsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(RecipeActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Mexican Scrambled Eggs\n" + "15 Minutes","Ingredients Required:\n" +
                "3 eggs\n" + "pinch Himalayan Salt\n" +
                "pinch Black Pepper\n" + "30g canned black beans (drained)\n" + "45g red onion (diced)\n" +
                "80g tomato (diced)\n"+ "40g green capsicum (diced)\n" + "1tsp dried coriander\n" +
                "1tsp olive oil\n" + "40g avocado (chopped)\n\n" +
                "Cooking Instructions:\n" +
                "1. Crack the eggs in a bowl and whisk vigorously. Season with salt, pepper\n" +
                "and coriander. Set aside\n\n" +
                "2. Heat the olive oil in a non-stick fry pan over medium temperature and saute\n" +
                "the black beans, red onion, capsicum, and tomato for 3 minutes.\n\n" +
                "3. Pour the egg mixture into the pan \n" +
                "and cook stirring the ingredients together \n" +
                "for a few minutes or until the eggs\n" +
                "are cooked through.\n\n" +
                "4. Transfer to a plate. Add the avocado on\n" +
                "top and serve.","438 Calories",R.drawable.scrambledegg);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Beef Casserole\n" + "10 Minutes","Ingredients Required:\n" +
                "240g Beef stew (diced)\n" + "6ml olive oil\n" +
                "1 tbsp. dried thyme\n" + "1 tbsp. dried rosemary\n" +
                "pinch Himalayan salt\n" + "pinch black pepper\n" +
                "45g brown onion (diced)\n" + "60g carrot (diced)\n" +
                "60g celery (diced)\n" + "2 garlic cloves (crushed)\n" +
                "80ml liquid beef stock\n" + "80g canned crushed tomatoes\n" +
                "12ml olive oil\n" + "200g raw white potato (diced)\n" +
                "180g sweet potato (diced)\n\n" +
                "Cooking Instructions:\n" +
                "1. In a bowl combine the olive oil, rosemary, and thyme. Marinate the beef in the herbed oil for one\n" +
                "hour in the fridge. Season with salt\n\n" +
                "2. Heat olive oil in a non-stick pot over medium temperature and saute the onion and garlic for a few\n" +
                "minutes. Add the carrot, celery, and diced beef and cook for several minutes stirring well\n\n" +
                "3. Add the beef stock and crushed tomatoes and simmer on low heat for 30-45 minutes or until tender.\n" +
                "Season with salt and pepper\n\n" +
                "4. Meanwhile, cook the potato and sweet potato in a steaming basket over boiling water until softened.\n" +
                "Once ready, transfer to a bowl and mash using a fork or masher Season with olive oil and salt\n\n" +
                "5. Serve the beef casserole alongside the root vegetable mash\n", "430 Calories",R.drawable.beefcasserole);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Berry Brekkie Oat Smoothie\n" + "7 Minutes","Ingredients Required:\n" +
                "20g F45 Fuel vanilla protein powder\n" + "20g dry rolled oats\n" +
                "130g frozen raspberries\n" + "10g peanut butter\n" +
                "300ml unsweetened almond milk\n" + "0.5 cup ice\n\n" +
                "Cooking Instructions:\n" +
                "1. Add all the ingredients in a blender and blend until smooth consistency is formed\n\n" +
                "2. Pour the smoothie into a large glass\n\n" +
                "3. Serve","411 Calories",R.drawable.berrybrekkie);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Protein Berry Smoothie\n" + "5 Minutes","Ingredients Required:\n" +
                "30g frozen blackberries\n" + "35g frozen blueberries\n" +
                "60g banana, chopped\n" + "65g Lebanese cucumber, chopped\n" +
                "30g F45 Fuel Protein Powder, choice\n" + "25g fine desiccated coconut\n" +
                "1/4 tsp. vanilla essence\n" + "2 tsp. honey\n" +
                "180ml unsweetened almond milk\n" + "55ml water, filtered\n\n" +
                "Cooking Instructions:\n" +
                "1. Combine all ingredients in a blender until smooth.\n\n" +
                "2. Serve.","470 Calories",R.drawable.berryprotein);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Spiced Raisin Brown Rice and Salmon\n" + "35 Minutes","Ingredients Required:\n" +
                "70g brown rice (uncooked)\n" + "2 x 65g salmon fillets\n" +
                "30g dried raisins\n" + "50g brown onion (diced)\n" +
                "1 tsp. butter\n" + "150g frozen peas (thawed)\n" +
                "300g green beans (chopped)\n" + "0.5tsp cinnamon\n" +
                "1tsp nutmeg\n" + "1 garlic clove (crushed)\n" +
                "1 lemon wedge\n" + "pinch himalayan salt & pepper\n\n" +
                "Cooking Instructions:\n" +
                "1. Begin first by melting the butter in a saucepan over medium temperature and sauté the onion with\n" +
                "garlic for a few minutes. Add the brown rice to the onion and stir for 10 seconds\n\n" +
                "2. Add 500ml of the water to the saucepan and mix through the cinnamon and nutmeg. Cook the rice\n" +
                "for 25 minutes with a lid covering. Mix through the raisins, green beans, and peas when there are\n" +
                "10 minutes remaining. Add more water if required\n\n" +
                "3. Whilst the rice is cooking, heat a non-stick fry pan over medium temperature and cook the salmon\n" +
                "for a few minutes on each side or until cooked. Squeeze the lemon over the salmon and season\n" +
                "with Himalayan salt and pepper\n\n" +
                "4. Dish one serving of the salmon beside half of the spiced raisin brown rice","449 Calories",R.drawable.brownricesalmon);
        myFoodList.add(mFoodData);


        MyAdapter myAdapter = new MyAdapter(RecipeActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);

    }
}