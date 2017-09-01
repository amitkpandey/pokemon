package com.pokemon.toronto.game.com.pokemon.toronto.item.stone;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.factory.PokemonFactory;
import com.pokemon.toronto.game.com.pokemon.toronto.item.Item;

/**
 * Created by Gregory on 8/19/2017.
 */

public class DuskStone extends Item {
    public DuskStone() {
        super(25, "Dusk Stone", "A peculiar stone that can make certain species of Pokemon evolve. It holds shadows as dark as can be.",
                "bag/icons/duskStone.png");
    }

    public void use(Pokemon p) {
        if (p.getFireStoneEvolutionId() != -1) {
            PokemonFactory pf = new PokemonFactory();
            p = pf.createPokemon(p.getDuskStoneEvolutionId(), p);
        }
    }

    @Override
    public boolean ableToUse(Pokemon p) {
        if (p.getDuskStoneEvolutionId() != -1) {
            return true;
        }
        return false;
    }

    public int getEvolutionId(Pokemon p) {
        return p.getDuskStoneEvolutionId();
    }
}