package com.pokemon.toronto.game.com.pokemon.toronto.skill.Bug;

import com.pokemon.toronto.game.com.pokemon.toronto.Field.Field;
import com.pokemon.toronto.game.com.pokemon.toronto.Field.SubField;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.SkillAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.skill.TackleAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.FailResult;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillDescription;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory on 10/14/2017.
 */

public class Powder extends Skill {
    /**
     * - Name: Powder
     * - Type: Bug
     * - PP: 20
     * - Cat: Misc
     * - Accuracy: 100
     */
    public Powder() {
        super(SkillFactory.POWDER, "Powder", SkillDescription.powder, 20, Pokemon.Type.BUG,
                Skill.SkillCategory.MISC, -1);
        setPriority(1);
    }

    /**
     * Use Powder and return the move results.
     * Sets the weather to Powder.
     * @param skillUser The Pokemon using the skill
     * @param enemyPokemon The enemy receiving the skill
     * @param skillUserPartyPosition
     * @param enemyPokemonPartyPosition
     * @param field The field for the battle.
     * @param userField The field for the battle.
     * @param enemyField The field for the battle.
     * @param targetSkill
     * @param skillUserParty
     * @param enemyPokemonParty      @return The move results.
     * */
    public List<String> use(Pokemon skillUser, Pokemon enemyPokemon, int skillUserPartyPosition, int enemyPokemonPartyPosition, Field field,
                            SubField userField, SubField enemyField, boolean isFirstAttack, Skill targetSkill, List<Pokemon> skillUserParty, List<Pokemon> enemyPokemonParty) {
        List<String> results = new ArrayList<String>();
        enemyPokemon.applyPowder();
        results.add(enemyPokemon.getName() + " is covered in Powder!");
        return results;
    }

    /**
     * Return Powder's skill animation.
     * @param userAnimation Whether or not the skill's animation is from the user
     *                      using the skill or the enemy using the skill.
     * @return Powder's skill animation.
     */
    @Override
    public SkillAnimation getAnimation(boolean userAnimation) {
        return new TackleAnimation(userAnimation);
    }

    @Override
    public FailResult willFail(Pokemon skillUser, Pokemon enemyPokemon, Field field,
                               SubField userField, SubField enemyField, boolean isFirstAttack, Skill targetsSkill) {
        if (enemyPokemon.isPowdered() || !isFirstAttack) {
            return new FailResult("It failed.");
        } else if (enemyPokemon.getTypeOne() == Pokemon.Type.GRASS ||
                enemyPokemon.getTypeTwo() == Pokemon.Type.GRASS ||
                enemyPokemon.getBattleAbility().getId() == Ability.AbilityId.OVERCOAT) {
            return new FailResult("It failed.");
        }
        return new FailResult(false);
    }
}
