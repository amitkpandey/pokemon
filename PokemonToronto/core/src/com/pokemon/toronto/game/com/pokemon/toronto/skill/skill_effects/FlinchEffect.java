package com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffect;

import java.util.List;

/**
 * Created by Gregory on 8/31/2017.
 */

public class FlinchEffect extends SecondaryEffect {
    public FlinchEffect(double chance, SecondaryEffect.Target target) {
        super(chance, target);
    }

    /**
     * Use the flinch effect.
     * @param results The results String list after using the effect.
     * @param skillUser The Pokemon using the skill that causes this effect.
     * @param enemyPokemon The Pokemon not using the skill.
     * @param isFirstAttack Whether or not the effect is a result of the first attack.
     */
    @Override
    public void use(List<String> results, Pokemon skillUser, Pokemon enemyPokemon, boolean isFirstAttack) {
        if (isFirstAttack) {
            Pokemon effectReceiver;
            if (target == SecondaryEffect.Target.SELF) {
                effectReceiver = skillUser;
            } else {
                effectReceiver = enemyPokemon;
            }
            if (effectReceiver.getAbility() !=
                    Pokemon.Ability.INNER_FOCUS && effectReceiver.getAbility() !=
                    Pokemon.Ability.SHIELD_DUST) {
                double rand = Math.random();
                if (rand <= chance) {
                    effectReceiver.flinch();
                }
            }
        }
    }
}