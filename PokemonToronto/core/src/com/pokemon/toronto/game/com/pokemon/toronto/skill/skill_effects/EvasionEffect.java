package com.pokemon.toronto.game.com.pokemon.toronto.skill.skill_effects;

import com.pokemon.toronto.game.com.pokemon.toronto.Field.Field;
import com.pokemon.toronto.game.com.pokemon.toronto.Field.SubField;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SecondaryEffect;

import java.util.List;

/**
 * Created by Gregory on 9/20/2017.
 */

public class EvasionEffect extends StatEffect {
    public EvasionEffect(SecondaryEffect.Target target, int amount,
                          StatDirection statDirection) {
        super(target, amount, statDirection);
    }

    /**
     * Use the accuracy effect.
     * @param results The results String list after using the effect.
     * @param skillUser The Pokemon using the skill that causes this effect.
     * @param enemyPokemon The Pokemon not using the skill.
     * @param field
     * @param userField
     * @param enemyField
     * @param isFirstAttack Whether or not the effect is a result of the first attack.
     */
    @Override
    public void use(List<String> results, Pokemon skillUser, Pokemon enemyPokemon, Field field, SubField userField, SubField enemyField, boolean isFirstAttack) {
        super.use(results, skillUser, enemyPokemon, field, userField, enemyField, isFirstAttack);
        if (statDirection == SecondaryEffect.StatDirection.DECREASE) {
            //Attempt to lower the accuracy stage.
            if (receiverField.hasMist()) {
                results.add("Mist prevents " + effectReceiver.getName() + "\nfrom losing evasion!");
            } else if (effectReceiver.getEvasionStage() == -6) {
                results.add(effectReceiver.getName() + "'s evasion can't be lowered.");
            } else {
                effectReceiver.decreaseEvasionStage(finalAmount);
                results.add(effectReceiver.getName() + "'s evasion" + getFallText());
            }
        } else {
            //Attempt to increase the accuracy stage.
            if (effectReceiver.getEvasionStage() == 6) {
                results.add(effectReceiver.getName() + "'s evasion can't get higher.");
            } else {
                effectReceiver.increaseEvasionStage(finalAmount);
                results.add(effectReceiver.getName() + "'s evasion" + getRoseText());
            }
        }
    }
}
