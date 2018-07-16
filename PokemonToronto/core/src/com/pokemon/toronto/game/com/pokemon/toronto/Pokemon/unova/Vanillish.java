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

public class Vanillish extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 583;
    private static final String NAME = "Vanillish";
    private static final int BASE_EXP = 138;
    private static final int[] EV_YIELD = {0, 0, 0, 2, 0, 0};
    private static final int CAPTURE_RATE = 120;
    private static final double WEIGHT = 41;

    private static final Ability FIRST_ABILITY = new Ability.IceBody();
    private static final Ability SECOND_ABILITY = new Ability.SnowCloak();
    private static final Ability HIDDEN_ABILITY = new Ability.WeakArmor();

    //Base Stats
    private static final int BASE_HEALTH = 51;
    private static final int BASE_ATTACK = 65;
    private static final int BASE_DEFENSE = 65;
    private static final int BASE_SPECIAL_ATTACK = 80;
    private static final int BASE_SPECIAL_DEFENSE = 75;
    private static final int BASE_SPEED = 59;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/unova/vanillish.png";
    private static final String BACK_PATH = "battle/backs/unova/vanillish.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/unova/vanillish.png";
    private static final String CRY_PATH = "sounds/cry/583.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/unova/vanillish.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.ICE;
    private static final Type TYPE_TWO = Type.NONE;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.SLOW;

    /**
     * Create a vanillish
     */
    public Vanillish() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init vanillish's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.ICICLE_SPEAR);
        beginnerSkills.add(SkillFactory.HARDEN);
        beginnerSkills.add(SkillFactory.ASTONISH);
        beginnerSkills.add(SkillFactory.UPROAR);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(4, new ArrayList<Integer>(Arrays.asList(SkillFactory.HARDEN)));
        levelUpSkills.put(7, new ArrayList<Integer>(Arrays.asList(SkillFactory.ASTONISH)));
        levelUpSkills.put(10, new ArrayList<Integer>(Arrays.asList(SkillFactory.UPROAR)));
        levelUpSkills.put(13, new ArrayList<Integer>(Arrays.asList(SkillFactory.ICY_WIND)));
        levelUpSkills.put(16, new ArrayList<Integer>(Arrays.asList(SkillFactory.MIST)));
        levelUpSkills.put(19, new ArrayList<Integer>(Arrays.asList(SkillFactory.AVALANCHE)));
        //22 TAUNT
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.MIRROR_SHOT)));
        levelUpSkills.put(31, new ArrayList<Integer>(Arrays.asList(SkillFactory.ACID_ARMOR)));
        levelUpSkills.put(36, new ArrayList<Integer>(Arrays.asList(SkillFactory.ICE_BEAM)));
        levelUpSkills.put(42, new ArrayList<Integer>(Arrays.asList(SkillFactory.HAIL)));
        //47 MIRROR COAT
        levelUpSkills.put(53, new ArrayList<Integer>(Arrays.asList(SkillFactory.BLIZZARD)));
        levelUpSkills.put(58, new ArrayList<Integer>(Arrays.asList(SkillFactory.SHEER_COLD)));
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HAIL.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.TAUNT.getValue());
        tmSkills.add(TmId.ICE_BEAM.getValue());
        tmSkills.add(TmId.BLIZZARD.getValue());
        tmSkills.add(TmId.LIGHT_SCREEN.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.RAIN_DANCE.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.EXPLOSION.getValue());
        tmSkills.add(TmId.FROST_BREATH.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.FLASH_CANNON.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    /**
     * Init vanillish's gender.
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
     * Return Vanilluxe if the vanillish is above level 47.
     * @return Vanilluxe if vanillish is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 47) {
            return PokemonId.VANILLUXE.getValue();
        }
        return -1;
    }
}