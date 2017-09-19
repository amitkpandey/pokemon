package com.pokemon.toronto.game.com.pokemon.toronto.skill.Water;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.SkillAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.skill.TackleAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffect;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffectSkill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects.PoisonEffect;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects.SpeedEffect;

/**
 * Created by Gregory on 9/16/2017.
 */

public class Bubble extends SecondaryEffectSkill {
    /**
     * - Name: Bubble
     * - Type: Water
     * - Base Damage: 40
     * - PP: 30
     * - Cat: Special
     * - Crit Stage: 1
     * - Accuracy: 100
     */
    public Bubble() {
        super(SkillFactory.BUBBLE, "Bubble", 30, Pokemon.Type.WATER, SkillCategory.SPECIAL, 100, 40, 1, .1);
        secondaryEffects.add(new SpeedEffect(SecondaryEffect.Target.ENEMY, 1, SecondaryEffect.StatDirection.DECREASE));
    }

    /**
     * Return the skill's animation, player side or enemy side.
     * @param userAnimation Whether or not the skill's animation is from the user
     *                      using the skill or the enemy using the skill.
     * @return The skill's animation.
     */
    @Override
    public SkillAnimation getAnimation(boolean userAnimation) {
        return new TackleAnimation(userAnimation);
    }
}
