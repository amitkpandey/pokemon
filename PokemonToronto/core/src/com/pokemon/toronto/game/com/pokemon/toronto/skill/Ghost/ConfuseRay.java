package com.pokemon.toronto.game.com.pokemon.toronto.skill.Ghost;

import com.pokemon.toronto.game.com.pokemon.toronto.Field.Field;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.SkillAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.skill.TackleAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory on 8/13/2017.
 */

public class ConfuseRay extends Skill {

    /**
     * - Name: Confuse Ray
     * - Type: Ghost
     * - PP: 10
     * - Cat: Misc
     * - Accuracy: 100
     */
    public ConfuseRay() {
        super("Confuse Ray", 10, Pokemon.Type.GHOST, SkillCategory.MISC, 100);
    }

    /**
     * Use Confuse Ray and return the move results.
     * The target is exposed to a sinister ray that triggers confusion.
     * @param skillUser The Pokemon using the skill
     * @param enemyPokemon The enemy receiving the skill
     * @param field The field the battle is on.
     * @return The move results.
     */
    public List<List<String>> use(Pokemon skillUser, Pokemon enemyPokemon, Field field, boolean isFirstAttack) {
        List<List<String>> fullList = new ArrayList<List<String>>();
        List<String> firstList = new ArrayList<String>();
        List<String> secondList = new ArrayList<String>();

        enemyPokemon.induceConfusion();
        secondList.add(enemyPokemon.getName() + " was confused!");

        fullList.add(firstList);
        fullList.add(secondList);
        return fullList;
    }

    /**
     * Return Confuse Ray's skill animation.
     * @param userAnimation Whether or not the skill's animation is from the user
     *                      using the skill or the enemy using the skill.
     * @return ConfuseRay's skill animation.
     */
    @Override
    public SkillAnimation getAnimation(boolean userAnimation) {
        return new TackleAnimation(userAnimation);
    }

    @Override
    public boolean willFail(Pokemon skillUser, Pokemon enemyPokemon,
                            Field field, boolean isFirstAttack) {
        if (enemyPokemon.isConfused() || enemyPokemon.getAbility() == Pokemon.Ability.OWN_TEMPO) {
            return true;
        }
        return false;
    }
}