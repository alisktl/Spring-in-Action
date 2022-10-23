package tacos.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tacos.Ingredient;
import tacos.data.IngredientRepository;

import java.util.Optional;

@RestController
@RequestMapping(path="/api/ingredients", produces = "application/json")
@CrossOrigin(origins="http://localhost:8080")
public class IngredientController {

    private IngredientRepository repo;

    @Autowired
    public IngredientController(IngredientRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Iterable<Ingredient> allIngredients() {
        return repo.findAll();
    }

    @GetMapping(path="/{ingredientId}")
    public Optional<Ingredient> ingredientById(
        @PathVariable("ingredientId") String ingredientId) {

        return repo.findById(ingredientId);
    }

}
