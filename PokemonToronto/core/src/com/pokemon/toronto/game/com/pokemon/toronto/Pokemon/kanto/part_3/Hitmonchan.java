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

public class Hitmonchan extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 107;
    private static final String NAME = "Hitmonchan";
    private static final int BASE_EXP = 140;
    private static final int[] EV_YIELD = {0, 0, 0, 0, 2, 0};
    private static final int CAPTURE_RATE = 45;
    private static final double WEIGHT = 50.2;

    //Base Stats
    private static final int BASE_HEALTH = 50;
    private static final int BASE_ATTACK = 105;
    private static final int BASE_DEFENSE = 79;
    private static final int BASE_SPECIAL_ATTACK = 35;
    private static final int BASE_SPECIAL_DEFENSE = 110;
    private static final int BASE_SPEED = 76;

    //Typing
    private static final Type TYPE_ONE = Type.FIGHTING;
    private static final Type TYPE_TWO = Type.NONE;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_FAST;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/hitmonchan.png";
    private static final String BACK_PATH = "battle/backs/hitmonchan.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/hitmonchan.png";
    private static final String CRY_PATH = "sounds/cry/107.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/107.png";

    /**
     * Create a Hitmonchan with the specified level.
     * @param level The level of the Hitmonchan.
     */
    public Hitmonchan(int level) {
        super(NUMBER, NAME, level, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT);
    }

    /**
     * Create an Hitmonchan from the database.
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
    public Hitmonchan(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                     Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                     Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, TYPE_ONE, TYPE_TWO, ability, nature, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT,
                firstSkill, secondSkill, thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    //TODO: HIDDEN INNER FOCUS
    @Override
    protected void initAbility() {
        if (Math.random() <= .5) {
            ability = Ability.KEEN_EYE;
        } else {
            //TODO: IRON FIST
            ability = Ability.KEEN_EYE;
        }
    }

    @Override
    protected void initGender() {
        gender = 'M';
    }

    /**
     * Init Hitmonchan's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.CLOSE_COMBAT);
        //TODO: COUNTER
        //TODO: FOCUS PUNCH
        beginnerSkills.add(SkillFactory.REVENGE);
        beginnerSkills.add(SkillFactory.AGILITY);
        beginnerSkills.add(SkillFactory.PURSUIT);
        beginnerSkills.add(SkillFactory.MACH_PUNCH);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(6, new ArrayList<Integer>(Arrays.asList(SkillFactory.AGILITY)));
        levelUpSkills.put(11, new ArrayList<Integer>(Arrays.asList(SkillFactory.PURSUIT)));
        List<Integer> speedPunches = new ArrayList<Integer>();
        speedPunches.add(SkillFactory.MACH_PUNCH);
        speedPunches.add(SkillFactory.BULLET_PUNCH);
        levelUpSkills.put(16, speedPunches);
        levelUpSkills.put(21, new ArrayList<Integer>(Arrays.asList(SkillFactory.FEINT)));
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.VACUUM_WAVE)));
        //TODO: QUICK GUARD 31
        ArrayList<Integer> elementalPunches = new ArrayList<Integer>();
        elementalPunches.add(SkillFactory.THUNDER_PUNCH);
        elementalPunches.add(SkillFactory.ICE_PUNCH);
        elementalPunches.add(SkillFactory.FIRE_PUNCH);
        levelUpSkills.put(36, elementalPunches);
        levelUpSkills.put(41, new ArrayList<Integer>(Arrays.asList(SkillFactory.SKY_UPPERCUT)));
        levelUpSkills.put(46, new ArrayList<Integer>(Arrays.asList(SkillFactory.MEGA_PUNCH)));
        //TODO: DETECT 50
        //TODO: FOCUS PUNCH 56
        //TODO: COUNTER 61
        levelUpSkills.put(66, new ArrayList<Integer>(Arrays.asList(SkillFactory.CLOSE_COMBAT)));
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.COMET_PUNCH);
    }
}
