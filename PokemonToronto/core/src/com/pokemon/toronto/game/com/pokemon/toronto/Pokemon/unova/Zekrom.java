package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.unova;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-08-20.
 */

public class Zekrom extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 644;
    public static final String NAME = "Zekrom";
    public static final String TYPE_OF_POKEMON = "Deep Black";
    public static final String DESCRIPTION = "This Pokémon appears in legends. In its tail, it " +
            "has a giant generator that creates electricity.";
    public static final double HEIGHT = 2.9;
    public static final int BASE_EXP = 306;
    public static final int[] EV_YIELD = {0, 3, 0, 0, 0, 0};
    public static final int CAPTURE_RATE = 3;
    public static final double WEIGHT = 345;

    public static final Ability FIRST_ABILITY = new Ability.Teravolt();
    public static final Ability SECOND_ABILITY = null;
    public static final Ability HIDDEN_ABILITY = null;

    //Base Stats
    public static final int BASE_HEALTH = 100;
    public static final int BASE_ATTACK = 150;
    public static final int BASE_DEFENSE = 120;
    public static final int BASE_SPECIAL_ATTACK = 120;
    public static final int BASE_SPECIAL_DEFENSE = 100;
    public static final int BASE_SPEED = 90;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/unova/zekrom.png";
    public static final String BACK_PATH = "battle/backs/unova/zekrom.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/unova/zekrom.png";
    public static final String CRY_PATH = "sounds/cry/644.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/unova/zekrom.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.DRAGON;
    public static final Type TYPE_TWO = Type.ELECTRIC;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a zekrom
     */
    public Zekrom() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init zekrom's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.THUNDER_FANG);
        beginnerSkills.add(SkillFactory.DRAGON_RAGE);
        levelUpSkills.put(0, beginnerSkills);
        //8 IMPRISON
        levelUpSkills.put(15, new ArrayList<Integer>(Arrays.asList(SkillFactory.ANCIENT_POWER)));
        levelUpSkills.put(22, new ArrayList<Integer>(Arrays.asList(SkillFactory.THUNDERBOLT)));
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_BREATH)));
        levelUpSkills.put(36, new ArrayList<Integer>(Arrays.asList(SkillFactory.SLASH)));
        levelUpSkills.put(43, new ArrayList<Integer>(Arrays.asList(SkillFactory.ZEN_HEADBUTT)));
        //50 FUSION BOLT
        levelUpSkills.put(54, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_CLAW)));
        levelUpSkills.put(64, new ArrayList<Integer>(Arrays.asList(SkillFactory.NOBLE_ROAR)));
        levelUpSkills.put(71, new ArrayList<Integer>(Arrays.asList(SkillFactory.CRUNCH)));
        levelUpSkills.put(78, new ArrayList<Integer>(Arrays.asList(SkillFactory.THUNDER)));
        levelUpSkills.put(85, new ArrayList<Integer>(Arrays.asList(SkillFactory.OUTRAGE)));
        levelUpSkills.put(92, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYPER_VOICE)));
        //100 BOLT STRIKE
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.DRAGON_CLAW.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.HYPER_BEAM.getValue());
        tmSkills.add(TmId.LIGHT_SCREEN.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.ROOST.getValue());
        tmSkills.add(TmId.SAFEGUARD.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.THUNDERBOLT.getValue());
        tmSkills.add(TmId.THUNDER.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.PSYCHIC.getValue());
        tmSkills.add(TmId.SHADOW_BALL.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.REFLECT.getValue());
        tmSkills.add(TmId.ROCK_TOMB.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.ECHOED_VOICE.getValue());
        tmSkills.add(TmId.STEEL_WING.getValue());
        tmSkills.add(TmId.FOCUS_BLAST.getValue());
        tmSkills.add(TmId.FLING.getValue());
        tmSkills.add(TmId.CHARGE_BEAM.getValue());
        tmSkills.add(TmId.BRUTAL_SWING.getValue());
        tmSkills.add(TmId.SHADOW_CLAW.getValue());
        tmSkills.add(TmId.PAYBACK.getValue());
        tmSkills.add(TmId.GIGA_IMPACT.getValue());
        tmSkills.add(TmId.STONE_EDGE.getValue());
        tmSkills.add(TmId.VOLT_SWITCH.getValue());
        tmSkills.add(TmId.THUNDER_WAVE.getValue());
        tmSkills.add(TmId.FLY.getValue());
        tmSkills.add(TmId.ROCK_SLIDE.getValue());
        tmSkills.add(TmId.DRAGON_TAIL.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.FLASH_CANNON.getValue());
        tmSkills.add(TmId.WILD_CHARGE.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }
}