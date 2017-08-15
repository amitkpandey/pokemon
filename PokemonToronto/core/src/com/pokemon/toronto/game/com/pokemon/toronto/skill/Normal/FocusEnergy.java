package com.pokemon.toronto.game.com.pokemon.toronto.skill.Normal;

import com.pokemon.toronto.game.com.pokemon.toronto.Field.Field;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.SkillAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.skill.TackleAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory on 8/14/2017.
 */

public class FocusEnergy extends Skill {
    /**
     * - Name: Focus Energy
     * - Type: Normal
     * - PP: 30
     * - Cat: Misc
     * - Accuracy: 100
     */
    public FocusEnergy() {
        super("Focus Energy", 30, Pokemon.Type.NORMAL, Skill.SkillCategory.MISC, 100);
    }

    /**
     * Use Focus Energy and return the move results
     * Raise the Crit Stage 2 levels.
     * @param skillUser The Pokemon using the skill
     * @param enemyPokemon The enemy receiving the skill
     * @param field The field the battle is on.
     * @return The move results.
     */
    public List<List<String>> use(Pokemon skillUser, Pokemon enemyPokemon, Field field, boolean isFirstAttack) {
        List<List<String>> fullList = new ArrayList<List<String>>();
        List<String> firstList = new ArrayList<String>();
        List<String> secondList = new ArrayList<String>();
        skillUser.focus();
        secondList.add(skillUser.getName() + " is getting pumped up!!");
        fullList.add(firstList);
        fullList.add(secondList);
        return fullList;
    }

    /**
     * Return Focus Energy's skill animation.
     * @param userAnimation Whether or not the skill's animation is from the user
     *                      using the skill or the enemy using the skill.
     * @return Focus Energy's skill animation.
     */
    @Override
    public SkillAnimation getAnimation(boolean userAnimation) {
        return new TackleAnimation(userAnimation);
    }

    @Override
    public boolean willFail(Pokemon skillUser, Pokemon enemyPokemon,
                            Field field, boolean isFirstAttack) {
        if (skillUser.isFocused()) {
            return true;
        }
        return false;
    }
}