package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.hoenn;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-07-16.
 */

public class Latias extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 380;
    public static final String NAME = "Latias";
    public static final String TYPE_OF_POKEMON = "Eon";
    public static final String DESCRIPTION = "Its body is covered with a down that can refract" +
            " light in such a way that it becomes invisible.";
    public static final int BASE_EXP = 270;
    public static final int[] EV_YIELD = {0, 0, 0, 0, 3, 0};
    public static final int CAPTURE_RATE = 3;
    public static final double WEIGHT = 40;
    public static final double HEIGHT = 1.4;

    public static final Ability FIRST_ABILITY = new Ability.Levitate();
    public static final Ability SECOND_ABILITY = null;
    public static final Ability HIDDEN_ABILITY = null;

    //Base Stats
    public static final int BASE_HEALTH = 80;
    public static final int BASE_ATTACK = 80;
    public static final int BASE_DEFENSE = 90;
    public static final int BASE_SPECIAL_ATTACK = 110;
    public static final int BASE_SPECIAL_DEFENSE = 130;
    public static final int BASE_SPEED = 110;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/hoenn/latias.png";
    public static final String BACK_PATH = "battle/backs/hoenn/latias.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/hoenn/latias.png";
    public static final String CRY_PATH = "sounds/cry/380.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/hoenn/latias.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.DRAGON;
    public static final Type TYPE_TWO = Type.PSYCHIC;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a latias
     */
    public Latias() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init Latias's gender.
     */
    @Override
    protected void initGender() {
        gender = 'F';
    }


    /**
     * Init latias's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        //HEALING WISH
        //HELPING HAND
        beginnerSkills.add(SkillFactory.WISH);
        beginnerSkills.add(SkillFactory.PSYWAVE);
        beginnerSkills.add(SkillFactory.SAFEGUARD);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(4, new ArrayList<Integer>(Arrays.asList(SkillFactory.WATER_SPORT)));
        levelUpSkills.put(7, new ArrayList<Integer>(Arrays.asList(SkillFactory.CHARM)));
        levelUpSkills.put(10, new ArrayList<Integer>(Arrays.asList(SkillFactory.STORED_POWER)));
        levelUpSkills.put(13, new ArrayList<Integer>(Arrays.asList(SkillFactory.REFRESH)));
        //16 HEAL PULSE
        levelUpSkills.put(20, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_BREATH)));
        levelUpSkills.put(24, new ArrayList<Integer>(Arrays.asList(SkillFactory.MIST_BALL)));
        levelUpSkills.put(28, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHO_SHIFT)));
        levelUpSkills.put(32, new ArrayList<Integer>(Arrays.asList(SkillFactory.RECOVER)));
        levelUpSkills.put(36, new ArrayList<Integer>(Arrays.asList(SkillFactory.REFLECT_TYPE)));
        levelUpSkills.put(41, new ArrayList<Integer>(Arrays.asList(SkillFactory.ZEN_HEADBUTT)));
        //46 GUARD SPLIT
        levelUpSkills.put(51, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHIC)));
        levelUpSkills.put(56, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_PULSE)));
        //61 HEALING WISH
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.DRAGON_CLAW.getValue());
        tmSkills.add(TmId.PSYSHOCK.getValue());
        tmSkills.add(TmId.CALM_MIND.getValue());
        tmSkills.add(TmId.ROAR.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.ICE_BEAM.getValue());
        tmSkills.add(TmId.HYPER_BEAM.getValue());
        tmSkills.add(TmId.LIGHT_SCREEN.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.ROOST.getValue());
        tmSkills.add(TmId.SAFEGUARD.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.SOLAR_BEAM.getValue());
        tmSkills.add(TmId.THUNDERBOLT.getValue());
        tmSkills.add(TmId.THUNDER.getValue());
        tmSkills.add(TmId.EARTHQUAKE.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.PSYCHIC.getValue());
        tmSkills.add(TmId.SHADOW_BALL.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.REFLECT.getValue());
        tmSkills.add(TmId.SANDSTORM.getValue());
        tmSkills.add(TmId.AERIAL_ACE.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.STEEL_WING.getValue());
        tmSkills.add(TmId.ENERGY_BALL.getValue());
        tmSkills.add(TmId.CHARGE_BEAM.getValue());
        tmSkills.add(TmId.SHADOW_CLAW.getValue());
        tmSkills.add(TmId.GIGA_IMPACT.getValue());
        tmSkills.add(TmId.THUNDER_WAVE.getValue());
        tmSkills.add(TmId.FLY.getValue());
        tmSkills.add(TmId.PSYCH_UP.getValue());
        tmSkills.add(TmId.BULLDOZE.getValue());
        tmSkills.add(TmId.DREAM_EATER.getValue());
        tmSkills.add(TmId.GRASS_KNOT.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.SURF.getValue());
        tmSkills.add(TmId.WATERFALL.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }
}