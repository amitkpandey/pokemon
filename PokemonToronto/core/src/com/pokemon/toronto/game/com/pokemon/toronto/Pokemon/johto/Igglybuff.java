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

public class Igglybuff extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 174;
    private static final String NAME = "Igglybuff";
    private static final int BASE_EXP = 42;
    private static final int[] EV_YIELD = {1, 0, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 170;
    private static final double WEIGHT = 1;

    private static final Ability FIRST_ABILITY = new Ability.CuteCharm();
    private static final Ability SECOND_ABILITY = new Ability.Competitive();
    private static final Ability HIDDEN_ABILITY = new Ability.FriendGuard();

    //Base Stats
    private static final int BASE_HEALTH = 90;
    private static final int BASE_ATTACK = 30;
    private static final int BASE_DEFENSE = 15;
    private static final int BASE_SPECIAL_ATTACK = 40;
    private static final int BASE_SPECIAL_DEFENSE = 20;
    private static final int BASE_SPEED = 15;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/johto/igglybuff.png";
    private static final String BACK_PATH = "battle/backs/johto/igglybuff.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/johto/igglybuff.png";
    private static final String CRY_PATH = "sounds/cry/174.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/johto/igglybuff.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.NORMAL;
    private static final Type TYPE_TWO = Type.FAIRY;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.FAST;

    /**
     * Create a igglybuff
     */
    public Igglybuff() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init igglybuff's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.SING);
        beginnerSkills.add(SkillFactory.CHARM);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(3, new ArrayList<Integer>(Arrays.asList(SkillFactory.DEFENSE_CURL)));
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.POUND)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.SWEET_KISS)));
        //COPYCAT 11

    }

    /**
     * Init igglybuff's gender.
     */
    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .246) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }

    /**
     * Return Jigglypuff if the igglybuff is above level 14.
     * @return Jigglypuff if igglybuff is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 14) {
            return PokemonId.JIGGLYPUFF.getValue();
        }
        return -1;
    }
}
