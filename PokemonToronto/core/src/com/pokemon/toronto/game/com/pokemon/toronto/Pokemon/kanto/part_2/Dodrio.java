package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 9/16/2017.
 */

public class Dodrio extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 85;
    private static final String NAME = "Dodrio";
    private static final int BASE_EXP = 158;
    private static final int[] EV_YIELD = {0, 2, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 45;
    private static final double WEIGHT = 85.2;

    //Base Stats
    private static final int BASE_HEALTH = 60;
    private static final int BASE_ATTACK = 110;
    private static final int BASE_DEFENSE = 70;
    private static final int BASE_SPECIAL_ATTACK = 60;
    private static final int BASE_SPECIAL_DEFENSE = 60;
    private static final int BASE_SPEED = 110;

    //Typing
    private static final Type TYPE_ONE = Type.NORMAL;
    private static final Type TYPE_TWO = Type.FLYING;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_FAST;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/dodrio.png";
    private static final String BACK_PATH = "battle/backs/dodrio.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/dodrio.png";
    private static final String CRY_PATH = "sounds/cry/085.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/085.png";

    /**
     * Create a Dodrio with the specified level.
     * @param level The level of the Dodrio.
     */
    public Dodrio(int level) {
        super(NUMBER, NAME, level, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT);
    }

    /**
     * Create an Dodrio from the database.
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
    public Dodrio(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                 Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                 Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, TYPE_ONE, TYPE_TWO, ability, nature, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT,
                firstSkill, secondSkill, thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    //TODO: HIDDEN TANGLED FEET
    @Override
    protected void initAbility() {
        if (Math.random() <= .5) {
            ability = Ability.RUN_AWAY;
        } else {
            //TODO: EARLY BIRD
            ability = Ability.RUN_AWAY;
        }
    }

    /**
     * Init Dodrio's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.PECK);
        beginnerSkills.add(SkillFactory.GROWL);
        beginnerSkills.add(SkillFactory.QUICK_ATTACK);
        beginnerSkills.add(SkillFactory.RAGE);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.QUICK_ATTACK)));
        levelUpSkills.put(8, new ArrayList<Integer>(Arrays.asList(SkillFactory.RAGE)));
        levelUpSkills.put(12, new ArrayList<Integer>(Arrays.asList(SkillFactory.FURY_ATTACK)));
        levelUpSkills.put(15, new ArrayList<Integer>(Arrays.asList(SkillFactory.PURSUIT)));
        levelUpSkills.put(19, new ArrayList<Integer>(Arrays.asList(SkillFactory.PLUCK)));
        levelUpSkills.put(22, new ArrayList<Integer>(Arrays.asList(SkillFactory.DOUBLE_HIT)));
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.AGILITY)));
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.UPROAR)));
        levelUpSkills.put(34, new ArrayList<Integer>(Arrays.asList(SkillFactory.ACUPRESSURE)));
        levelUpSkills.put(38, new ArrayList<Integer>(Arrays.asList(SkillFactory.SWORDS_DANCE)));
        levelUpSkills.put(43, new ArrayList<Integer>(Arrays.asList(SkillFactory.JUMP_KICK)));
        levelUpSkills.put(47, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRILL_PECK)));
        levelUpSkills.put(52, new ArrayList<Integer>(Arrays.asList(SkillFactory.ENDEAVOR)));
        levelUpSkills.put(56, new ArrayList<Integer>(Arrays.asList(SkillFactory.THRASH)));
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.TRI_ATTACK);
    }


}
