package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.hoenn;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-03-31.
 */

public class Altaria extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 334;
    public static final String NAME = "Altaria";
    public static final String TYPE_OF_POKEMON = "Humming";
    public static final String DESCRIPTION = "On sunny days, it flies freely through the sky " +
            "and blends into the clouds. It sings in a beautiful soprano.";
    public static final int BASE_EXP = 172;
    public static final int[] EV_YIELD = {0, 0, 0, 0, 2, 0};
    public static final int CAPTURE_RATE = 45;
    public static final double WEIGHT = 20.6;
    public static final double HEIGHT = 1.1;

    public static final Ability FIRST_ABILITY = new Ability.NaturalCure();
    public static final Ability SECOND_ABILITY = null;
    public static final Ability HIDDEN_ABILITY = new Ability.CloudNine();

    //Base Stats
    public static final int BASE_HEALTH = 75;
    public static final int BASE_ATTACK = 70;
    public static final int BASE_DEFENSE = 90;
    public static final int BASE_SPECIAL_ATTACK = 70;
    public static final int BASE_SPECIAL_DEFENSE = 105;
    public static final int BASE_SPEED = 80;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/hoenn/altaria.png";
    public static final String BACK_PATH = "battle/backs/hoenn/altaria.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/hoenn/altaria.png";
    public static final String CRY_PATH = "sounds/cry/334.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/hoenn/altaria.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.DRAGON;
    public static final Type TYPE_TWO = Type.FLYING;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.ERRATIC;

    /**
     * Create a altaria
     */
    public Altaria() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init altaria's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.SKY_ATTACK);
        beginnerSkills.add(SkillFactory.PLUCK);
        beginnerSkills.add(SkillFactory.PECK);
        beginnerSkills.add(SkillFactory.GROWL);
        beginnerSkills.add(SkillFactory.ASTONISH);
        beginnerSkills.add(SkillFactory.SING);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(3, new ArrayList<Integer>(Arrays.asList(SkillFactory.ASTONISH)));
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.SING)));
        levelUpSkills.put(7, new ArrayList<Integer>(Arrays.asList(SkillFactory.FURY_ATTACK)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.SAFEGUARD)));
        levelUpSkills.put(11, new ArrayList<Integer>(Arrays.asList(SkillFactory.DISARMING_VOICE)));
        levelUpSkills.put(14, new ArrayList<Integer>(Arrays.asList(SkillFactory.MIST)));
        levelUpSkills.put(17, new ArrayList<Integer>(Arrays.asList(SkillFactory.ROUND)));
        //20 NATURAL GIFT
        levelUpSkills.put(23, new ArrayList<Integer>(Arrays.asList(SkillFactory.TAKE_DOWN)));
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.REFRESH)));
        levelUpSkills.put(30, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_DANCE)));
        levelUpSkills.put(34, new ArrayList<Integer>(Arrays.asList(SkillFactory.COTTON_GUARD)));
        levelUpSkills.put(40, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_PULSE)));
        //46 PERISH SONG
        levelUpSkills.put(52, new ArrayList<Integer>(Arrays.asList(SkillFactory.MOONBLAST)));
        levelUpSkills.put(59, new ArrayList<Integer>(Arrays.asList(SkillFactory.SKY_ATTACK)));
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.DRAGON_BREATH);
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.DRAGON_CLAW.getValue());
        tmSkills.add(TmId.ROAR.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.ICE_BEAM.getValue());
        tmSkills.add(TmId.HYPER_BEAM.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.ROOST.getValue());
        tmSkills.add(TmId.SAFEGUARD.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.SOLAR_BEAM.getValue());
        tmSkills.add(TmId.EARTHQUAKE.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.FLAMETHROWER.getValue());
        tmSkills.add(TmId.FIRE_BLAST.getValue());
        tmSkills.add(TmId.AERIAL_ACE.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.THIEF.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.ECHOED_VOICE.getValue());
        tmSkills.add(TmId.STEEL_WING.getValue());
        tmSkills.add(TmId.GIGA_IMPACT.getValue());
        tmSkills.add(TmId.FLY.getValue());
        tmSkills.add(TmId.PSYCH_UP.getValue());
        tmSkills.add(TmId.BULLDOZE.getValue());
        tmSkills.add(TmId.DREAM_EATER.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.DAZZLING_GLEAM.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    /**
     * Init altaria's gender.
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
