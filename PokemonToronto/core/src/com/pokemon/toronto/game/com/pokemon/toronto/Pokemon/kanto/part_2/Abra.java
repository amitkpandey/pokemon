package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory on 9/16/2017.
 */

public class Abra extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 63;
    private static final String NAME = "Abra";
    private static final int BASE_EXP = 62;
    private static final int[] EV_YIELD = {0, 0, 0, 1, 0, 0};
    private static final int CAPTURE_RATE = 200;
    private static final double WEIGHT = 19.5;

    private static final Ability FIRST_ABILITY = new Ability.Synchronize();
    private static final Ability SECOND_ABILITY = new Ability.InnerFocus();
    private static final Ability HIDDEN_ABILITY = new Ability.MagicGuard();

    //Base Stats
    private static final int BASE_HEALTH = 25;
    private static final int BASE_ATTACK = 20;
    private static final int BASE_DEFENSE = 15;
    private static final int BASE_SPECIAL_ATTACK = 105;
    private static final int BASE_SPECIAL_DEFENSE = 55;
    private static final int BASE_SPEED = 90;

    //Typing
    private static final Type TYPE_ONE = Type.PSYCHIC;
    private static final Type TYPE_TWO = Type.NONE;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_SLOW;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/abra.png";
    private static final String BACK_PATH = "battle/backs/abra.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/abra.png";
    private static final String CRY_PATH = "sounds/cry/063.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/063.png";

    /**
     * Create a Abra
     */
    public Abra() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .75) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }

    /**
     * Init Abra's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        //TODO: REMOVE TACKLE AND PUT TELEPORT
        beginnerSkills.add(SkillFactory.TACKLE);
        levelUpSkills.put(0, beginnerSkills);
    }

    /**
     * Return Kadabra if Abra is 16
     * @return Kadabra if Abra is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 16) {
            return PokemonId.KADABRA.getValue();
        }
        return -1;
    }
}
