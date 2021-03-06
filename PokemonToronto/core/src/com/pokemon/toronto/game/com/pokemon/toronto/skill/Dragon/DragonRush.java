package com.pokemon.toronto.game.com.pokemon.toronto.skill.Dragon;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.SkillAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.skill.TackleAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffect;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffectSkill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillDescription;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects.FlinchEffect;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects.SpecialAttackEffect;

/**
 * Created by Gregory on 10/19/2017.
 */

public class DragonRush extends SecondaryEffectSkill {
    /**
     * - Name: Dragon Rush
     * - Type: Dragon
     * - Base Damage: 100
     * - PP: 10
     * - Cat: Physical
     * - Crit Stage: 1
     * - Accuracy: 75
     */
    public DragonRush() {
        super(SkillFactory.DRAGON_RUSH, "Dragon Rush", SkillDescription.DRAGON_RUSH, 10,
                Pokemon.Type.DRAGON, SkillCategory.PHYSICAL, 75, 100, 1, .2);
        secondaryEffects.add(new FlinchEffect(SecondaryEffect.Target.ENEMY));
        makesPhysicalContact = true;
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
