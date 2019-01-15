package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.unova;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-05-07.
 */

public class Zweilous extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 634;
    public static final String NAME = "Zweilous";
    public static final String TYPE_OF_POKEMON = "Hostile";
    public static final String DESCRIPTION = "After it has eaten up all the food in its " +
            "territory, it moves to another area. Its two heads do not get along.";
    public static final double HEIGHT = 1.4;
    public static final int BASE_EXP = 147;
    public static final int[] EV_YIELD = {0, 2, 0, 0, 0, 0};
    public static final int CAPTURE_RATE = 45;
    public static final double WEIGHT = 50;

    public static final Ability FIRST_ABILITY = new Ability.Hustle();
    public static final Ability SECOND_ABILITY = null;
    public static final Ability HIDDEN_ABILITY = null;

    //Base Stats
    public static final int BASE_HEALTH = 72;
    public static final int BASE_ATTACK = 85;
    public static final int BASE_DEFENSE = 70;
    public static final int BASE_SPECIAL_ATTACK = 65;
    public static final int BASE_SPECIAL_DEFENSE = 70;
    public static final int BASE_SPEED = 58;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/unova/zweilous.png";
    public static final String BACK_PATH = "battle/backs/unova/zweilous.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/unova/zweilous.png";
    public static final String CRY_PATH = "sounds/cry/634.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/unova/zweilous.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.DARK;
    public static final Type TYPE_TWO = Type.DRAGON;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a zweilous
     */
    public Zweilous() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init zweilous's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.DOUBLE_HIT);
        beginnerSkills.add(SkillFactory.DRAGON_RAGE);
        beginnerSkills.add(SkillFactory.FOCUS_ENERGY);
        beginnerSkills.add(SkillFactory.BITE);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(4, new ArrayList<Integer>(Arrays.asList(SkillFactory.FOCUS_ENERGY)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.BITE)));
        levelUpSkills.put(12, new ArrayList<Integer>(Arrays.asList(SkillFactory.HEADBUTT)));
        levelUpSkills.put(17, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_BREATH)));
        //20 ROAR
        levelUpSkills.put(25, new ArrayList<Integer>(Arrays.asList(SkillFactory.CRUNCH)));
        levelUpSkills.put(28, new ArrayList<Integer>(Arrays.asList(SkillFactory.SLAM)));
        levelUpSkills.put(32, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_PULSE)));
        levelUpSkills.put(38, new ArrayList<Integer>(Arrays.asList(SkillFactory.WORK_UP)));
        levelUpSkills.put(42, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_RUSH)));
        levelUpSkills.put(48, new ArrayList<Integer>(Arrays.asList(SkillFactory.BODY_SLAM)));
        levelUpSkills.put(55, new ArrayList<Integer>(Arrays.asList(SkillFactory.SCARY_FACE)));
        levelUpSkills.put(64, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYPER_VOICE)));
        levelUpSkills.put(71, new ArrayList<Integer>(Arrays.asList(SkillFactory.OUTRAGE)));
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.WORK_UP.getValue());
        tmSkills.add(TmId.ROAR.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.TAUNT.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.TORMENT.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.THIEF.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.THUNDER_WAVE.getValue());
        tmSkills.add(TmId.PSYCH_UP.getValue());
        tmSkills.add(TmId.DRAGON_TAIL.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.DARK_PULSE.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    /**
     * Init zweilous's gender.
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

    /**
     * Return Hydreigon if the zweilous is above level 64.
     * @return Hydreigon if zweilous is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 64) {
            return PokemonId.HYDREIGON.getValue();
        }
        return -1;
    }
}
