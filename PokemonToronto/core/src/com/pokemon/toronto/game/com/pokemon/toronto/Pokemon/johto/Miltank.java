package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.johto;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-01-22.
 */

public class Miltank extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 241;
    public static final String NAME = "Miltank";
    public static final String TYPE_OF_POKEMON = "Milk Cow";
    public static final String DESCRIPTION = "It is said that kids who drink Miltank's milk " +
            "grow up to become hearty, healthy adults.";
    public static final int BASE_EXP = 172;
    public static final int[] EV_YIELD = {0, 0, 2, 0, 0, 0};
    public static final int CAPTURE_RATE = 45;
    public static final double WEIGHT = 75.5;
    public static final double HEIGHT = 1.2;

    public static final Ability FIRST_ABILITY = new Ability.ThickFat();
    public static final Ability SECOND_ABILITY = new Ability.Scrappy();
    public static final Ability HIDDEN_ABILITY = new Ability.SapSipper();

    //Base Stats
    public static final int BASE_HEALTH = 95;
    public static final int BASE_ATTACK = 80;
    public static final int BASE_DEFENSE = 105;
    public static final int BASE_SPECIAL_ATTACK = 40;
    public static final int BASE_SPECIAL_DEFENSE = 70;
    public static final int BASE_SPEED = 100;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/johto/miltank.png";
    public static final String BACK_PATH = "battle/backs/johto/miltank.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/johto/miltank.png";
    public static final String CRY_PATH = "sounds/cry/241.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/johto/miltank.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.NORMAL;
    public static final Type TYPE_TWO = Type.NONE;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a miltank
     */
    public Miltank() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init miltank's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.TACKLE);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(3, new ArrayList<Integer>(Arrays.asList(SkillFactory.GROWL)));
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.DEFENSE_CURL)));
        levelUpSkills.put(8, new ArrayList<Integer>(Arrays.asList(SkillFactory.STOMP)));
        levelUpSkills.put(11, new ArrayList<Integer>(Arrays.asList(SkillFactory.MILK_DRINK)));
        //TODO BIDE 15
        levelUpSkills.put(19, new ArrayList<Integer>(Arrays.asList(SkillFactory.ROLLOUT)));
        levelUpSkills.put(24, new ArrayList<Integer>(Arrays.asList(SkillFactory.BODY_SLAM)));
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.ZEN_HEADBUTT)));
        levelUpSkills.put(35, new ArrayList<Integer>(Arrays.asList(SkillFactory.CAPTIVATE)));
        levelUpSkills.put(41, new ArrayList<Integer>(Arrays.asList(SkillFactory.GYRO_BALL)));
        levelUpSkills.put(48, new ArrayList<Integer>(Arrays.asList(SkillFactory.HEAL_BELL)));
        levelUpSkills.put(50, new ArrayList<Integer>(Arrays.asList(SkillFactory.WAKE_UP_SLAP)));
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.WORK_UP.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.ICE_BEAM.getValue());
        tmSkills.add(TmId.BLIZZARD.getValue());
        tmSkills.add(TmId.HYPER_BEAM.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.SOLAR_BEAM.getValue());
        tmSkills.add(TmId.THUNDERBOLT.getValue());
        tmSkills.add(TmId.THUNDER.getValue());
        tmSkills.add(TmId.EARTHQUAKE.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.SHADOW_BALL.getValue());
        tmSkills.add(TmId.BRICK_BREAK.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.SANDSTORM.getValue());
        tmSkills.add(TmId.ROCK_TOMB.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.ECHOED_VOICE.getValue());
        tmSkills.add(TmId.FOCUS_BLAST.getValue());
        tmSkills.add(TmId.FLING.getValue());
        tmSkills.add(TmId.GIGA_IMPACT.getValue());
        tmSkills.add(TmId.THUNDER_WAVE.getValue());
        tmSkills.add(TmId.GYRO_BALL.getValue());
        tmSkills.add(TmId.PSYCH_UP.getValue());
        tmSkills.add(TmId.BULLDOZE.getValue());
        tmSkills.add(TmId.ROCK_SLIDE.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.SURF.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    @Override
    protected void initGender() {
        gender = 'F';
    }
}
