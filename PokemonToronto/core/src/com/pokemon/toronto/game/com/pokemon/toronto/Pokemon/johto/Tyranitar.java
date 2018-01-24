package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.johto;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-01-22.
 */

public class Tyranitar extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 248;
    private static final String NAME = "Tyranitar";
    private static final int BASE_EXP = 270;
    private static final int[] EV_YIELD = {0, 3, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 45;
    private static final double WEIGHT = 202;

    private static final Ability FIRST_ABILITY = new Ability.SandStream();
    private static final Ability SECOND_ABILITY = null;
    private static final Ability HIDDEN_ABILITY = new Ability.Unnerve();

    //Base Stats
    private static final int BASE_HEALTH = 100;
    private static final int BASE_ATTACK = 134;
    private static final int BASE_DEFENSE = 110;
    private static final int BASE_SPECIAL_ATTACK = 95;
    private static final int BASE_SPECIAL_DEFENSE = 100;
    private static final int BASE_SPEED = 61;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/johto/tyranitar.png";
    private static final String BACK_PATH = "battle/backs/johto/tyranitar.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/johto/tyranitar.png";
    private static final String CRY_PATH = "sounds/cry/248.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/johto/tyranitar.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.ROCK;
    private static final Type TYPE_TWO = Type.GROUND;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a tyranitar
     */
    public Tyranitar() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init tyranitar's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.THUNDER_FANG);
        beginnerSkills.add(SkillFactory.ICE_FANG);
        beginnerSkills.add(SkillFactory.FIRE_FANG);
        beginnerSkills.add(SkillFactory.LEER);
        beginnerSkills.add(SkillFactory.BITE);
        beginnerSkills.add(SkillFactory.SCREECH);
        beginnerSkills.add(SkillFactory.SANDSTORM);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.SANDSTORM)));
        levelUpSkills.put(10, new ArrayList<Integer>(Arrays.asList(SkillFactory.SCREECH)));
        levelUpSkills.put(14, new ArrayList<Integer>(Arrays.asList(SkillFactory.CHIP_AWAY)));
        levelUpSkills.put(19, new ArrayList<Integer>(Arrays.asList(SkillFactory.ROCK_SLIDE)));
        levelUpSkills.put(23, new ArrayList<Integer>(Arrays.asList(SkillFactory.SCARY_FACE)));
        levelUpSkills.put(28, new ArrayList<Integer>(Arrays.asList(SkillFactory.THRASH)));
        levelUpSkills.put(34, new ArrayList<Integer>(Arrays.asList(SkillFactory.DARK_PULSE)));
        levelUpSkills.put(41, new ArrayList<Integer>(Arrays.asList(SkillFactory.PAYBACK)));
        levelUpSkills.put(47, new ArrayList<Integer>(Arrays.asList(SkillFactory.CRUNCH)));
        levelUpSkills.put(54, new ArrayList<Integer>(Arrays.asList(SkillFactory.EARTHQUAKE)));
        levelUpSkills.put(63, new ArrayList<Integer>(Arrays.asList(SkillFactory.STONE_EDGE)));
        levelUpSkills.put(73, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYPER_BEAM)));
        levelUpSkills.put(82, new ArrayList<Integer>(Arrays.asList(SkillFactory.GIGA_IMPACT)));
    }

    /**
     * Init tyranitar's gender.
     */
    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .5) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }
}
