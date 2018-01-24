package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.johto;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-01-22.
 */

public class Togetic extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 176;
    private static final String NAME = "Togetic";
    private static final int BASE_EXP = 142;
    private static final int[] EV_YIELD = {0, 0, 0, 0, 2, 0};
    private static final int CAPTURE_RATE = 75;
    private static final double WEIGHT = 3.2;

    private static final Ability FIRST_ABILITY = new Ability.Hustle();
    private static final Ability SECOND_ABILITY = new Ability.SereneGrace();
    private static final Ability HIDDEN_ABILITY = new Ability.SuperLuck();

    //Base Stats
    private static final int BASE_HEALTH = 55;
    private static final int BASE_ATTACK = 40;
    private static final int BASE_DEFENSE = 85;
    private static final int BASE_SPECIAL_ATTACK = 80;
    private static final int BASE_SPECIAL_DEFENSE = 105;
    private static final int BASE_SPEED = 40;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/johto/togetic.png";
    private static final String BACK_PATH = "battle/backs/johto/togetic.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/johto/togetic.png";
    private static final String CRY_PATH = "sounds/cry/176.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/johto/togetic.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.FAIRY;
    private static final Type TYPE_TWO = Type.FLYING;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.FAST;

    /**
     * Create a togetic
     */
    public Togetic() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init togetic's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.MAGICAL_LEAF);
        beginnerSkills.add(SkillFactory.GROWL);
        beginnerSkills.add(SkillFactory.CHARM);
        //METRONOME
        beginnerSkills.add(SkillFactory.SWEET_KISS);
        levelUpSkills.put(0, beginnerSkills);
        //METRONOME 5
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.SWEET_KISS)));
        levelUpSkills.put(13, new ArrayList<Integer>(Arrays.asList(SkillFactory.YAWN)));
        levelUpSkills.put(14, new ArrayList<Integer>(Arrays.asList(SkillFactory.FAIRY_WIND)));
        //ENCORE 17
        //FOLLOW ME 21
        //BESTOW 25
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.WISH)));
        levelUpSkills.put(33, new ArrayList<Integer>(Arrays.asList(SkillFactory.ANCIENT_POWER)));
        levelUpSkills.put(37, new ArrayList<Integer>(Arrays.asList(SkillFactory.SAFEGUARD)));
        //BATON PASS 41
        levelUpSkills.put(45, new ArrayList<Integer>(Arrays.asList(SkillFactory.DOUBLE_EDGE)));
        //LAST RESORT 49
        //AFTER YOU 53

    }

    /**
     * Init togetic's gender.
     */
    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .881) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }

}
