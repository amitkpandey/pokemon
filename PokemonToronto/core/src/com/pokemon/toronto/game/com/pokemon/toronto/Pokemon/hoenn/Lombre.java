package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.hoenn;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-03-02.
 */

public class Lombre extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 271;
    public static final String NAME = "Lombre";
    public static final String TYPE_OF_POKEMON = "Jolly";
    public static final String DESCRIPTION = "It has a mischievous spirit. If it spots an" +
            " angler, it will tug on the fishing line to interfere.";
    public static final int BASE_EXP = 119;
    public static final int[] EV_YIELD = {0, 0, 0, 0, 2, 0};
    public static final int CAPTURE_RATE = 120;
    public static final double WEIGHT = 32.5;
    public static final double HEIGHT = 1.2;

    public static final Ability FIRST_ABILITY = new Ability.SwiftSwim();
    public static final Ability SECOND_ABILITY = new Ability.RainDish();
    public static final Ability HIDDEN_ABILITY = new Ability.OwnTempo();

    //Base Stats
    public static final int BASE_HEALTH = 60;
    public static final int BASE_ATTACK = 50;
    public static final int BASE_DEFENSE = 50;
    public static final int BASE_SPECIAL_ATTACK = 60;
    public static final int BASE_SPECIAL_DEFENSE = 70;
    public static final int BASE_SPEED = 50;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/hoenn/lombre.png";
    public static final String BACK_PATH = "battle/backs/hoenn/lombre.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/hoenn/lombre.png";
    public static final String CRY_PATH = "sounds/cry/271.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/hoenn/lombre.png";

    //Typing
    public static final Type TYPE_ONE = Type.WATER;
    public static final Type TYPE_TWO = Type.GRASS;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.MEDIUM_SLOW;

    /**
     * Create a lombre
     */
    public Lombre() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init lombre's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.ASTONISH);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(3, new ArrayList<Integer>(Arrays.asList(SkillFactory.GROWL)));
        levelUpSkills.put(6, new ArrayList<Integer>(Arrays.asList(SkillFactory.ABSORB)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.BUBBLE)));
        levelUpSkills.put(12, new ArrayList<Integer>(Arrays.asList(SkillFactory.FURY_SWIPES)));
        levelUpSkills.put(16, new ArrayList<Integer>(Arrays.asList(SkillFactory.FAKE_OUT)));
        levelUpSkills.put(20, new ArrayList<Integer>(Arrays.asList(SkillFactory.WATER_SPORT)));
        levelUpSkills.put(24, new ArrayList<Integer>(Arrays.asList(SkillFactory.BUBBLEBEAM)));
        //28 NATURE POWER
        levelUpSkills.put(32, new ArrayList<Integer>(Arrays.asList(SkillFactory.UPROAR)));
        levelUpSkills.put(36, new ArrayList<Integer>(Arrays.asList(SkillFactory.KNOCK_OFF)));
        levelUpSkills.put(40, new ArrayList<Integer>(Arrays.asList(SkillFactory.ZEN_HEADBUTT)));
        levelUpSkills.put(44, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYDRO_PUMP)));
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HAIL.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.ICE_BEAM.getValue());
        tmSkills.add(TmId.BLIZZARD.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.SOLAR_BEAM.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.BRICK_BREAK.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.THIEF.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.ECHOED_VOICE.getValue());
        tmSkills.add(TmId.ENERGY_BALL.getValue());
        tmSkills.add(TmId.SCALD.getValue());
        tmSkills.add(TmId.FLING.getValue());
        tmSkills.add(TmId.SWORDS_DANCE.getValue());
        tmSkills.add(TmId.GRASS_KNOT.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.SURF.getValue());
        tmSkills.add(TmId.NATURE_POWER.getValue());
        tmSkills.add(TmId.WATERFALL.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    /**
     * Init lombre's gender.
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
     * Return Ludicolo if a water stone is used on Lombre.
     * @return Ludicolo.
     */
    @Override
    public int getWaterStoneEvolutionId() {
        return PokemonId.LUDICOLO.getValue();
    }



}