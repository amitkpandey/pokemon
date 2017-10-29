package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 9/21/2017.
 */

public class Chansey extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 113;
    private static final String NAME = "Chansey";
    private static final int BASE_EXP = 255;
    private static final int[] EV_YIELD = {2, 0, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 30;
    private static final double WEIGHT = 34.6;

    //Base Stats
    private static final int BASE_HEALTH = 250;
    private static final int BASE_ATTACK = 5;
    private static final int BASE_DEFENSE = 5;
    private static final int BASE_SPECIAL_ATTACK = 35;
    private static final int BASE_SPECIAL_DEFENSE = 105;
    private static final int BASE_SPEED = 50;

    //Typing
    private static final Type TYPE_ONE = Type.NORMAL;
    private static final Type TYPE_TWO = Type.NONE;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.FAST;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/chansey.png";
    private static final String BACK_PATH = "battle/backs/chansey.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/chansey.png";
    private static final String CRY_PATH = "sounds/cry/113.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/113.png";

    /**
     * Create a Chansey with the specified level.
     * @param level The level of the Chansey.
     */
    public Chansey(int level) {
        super(NUMBER, NAME, level, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT);
    }

    /**
     * Create an Chansey from the database.
     * @param level The level of the Pokemon.
     * @param ivs  The array of set IVs
     * @param evs The array of set EVs
     * @param firstSkill The first move.
     * @param secondSkill The second move.
     * @param thirdSkill The third move.
     * @param fourthSkill The fourth move.
     * @param currentHealth The current health of the Pokemon.
     * @param currentExp The current exp of the Pokemon.
     * @param status The Pokemon's status.
     * @param nature The Pokemon's nature.
     * @param ability The Pokemon's ability.
     */
    public Chansey(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                   Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                   Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, TYPE_ONE, TYPE_TWO, ability, nature, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT,
                firstSkill, secondSkill, thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    //TODO: HIDDEN HEALER
    @Override
    protected void initAbility() {
        if (Math.random() <= .5) {
            //TODO: NATURAL CURE
            ability = Ability.INNER_FOCUS;
        } else {
            //TODO: SERENE GRACE
            ability = Ability.INNER_FOCUS;
        }
    }

    @Override
    protected void initGender() {
        gender = 'F';
    }

    /**
     * Init Chansey's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.DOUBLE_EDGE);
        beginnerSkills.add(SkillFactory.DEFENSE_CURL);
        beginnerSkills.add(SkillFactory.POUND);
        beginnerSkills.add(SkillFactory.GROWL);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.TAIL_WHIP)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.REFRESH)));
        levelUpSkills.put(12, new ArrayList<Integer>(Arrays.asList(SkillFactory.DOUBLE_SLAP)));
        levelUpSkills.put(16, new ArrayList<Integer>(Arrays.asList(SkillFactory.SOFT_BOILED)));
        //TODO: BESTOW 20
        levelUpSkills.put(23, new ArrayList<Integer>(Arrays.asList(SkillFactory.MINIMIZE)));
        levelUpSkills.put(27, new ArrayList<Integer>(Arrays.asList(SkillFactory.TAKE_DOWN)));
        levelUpSkills.put(31, new ArrayList<Integer>(Arrays.asList(SkillFactory.SING)));
        //TODO: FLING 34
        levelUpSkills.put(42, new ArrayList<Integer>(Arrays.asList(SkillFactory.EGG_BOMB)));
        levelUpSkills.put(46, new ArrayList<Integer>(Arrays.asList(SkillFactory.LIGHT_SCREEN)));
        //TODO: HEALING WISH 50
        levelUpSkills.put(54, new ArrayList<Integer>(Arrays.asList(SkillFactory.DOUBLE_EDGE)));
    }

}
