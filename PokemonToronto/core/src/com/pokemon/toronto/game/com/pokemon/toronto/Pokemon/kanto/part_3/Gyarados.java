package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 9/21/2017.
 */

public class Gyarados extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 130;
    private static final String NAME = "Gyarados";
    private static final int BASE_EXP = 214;
    private static final int[] EV_YIELD = {0, 2, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 45;

    //Base Stats
    private static final int BASE_HEALTH = 95;
    private static final int BASE_ATTACK = 125;
    private static final int BASE_DEFENSE = 79;
    private static final int BASE_SPECIAL_ATTACK = 60;
    private static final int BASE_SPECIAL_DEFENSE = 100;
    private static final int BASE_SPEED = 81;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/gyarados.png";
    private static final String BACK_PATH = "battle/backs/gyarados.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/gyarados.png";
    private static final String CRY_PATH = "sounds/cry/130.wav";

    /**
     * Create a Gyarados with the specified level.
     * @param level The level of the Gyarados.
     */
    public Gyarados(int level) {
        super(NUMBER, NAME, level, Pokemon.Type.WATER, Type.FLYING, Ability.INTIMIDATE, ExpType.SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE);
    }

    /**
     * Create an Gyarados from the database.
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
    public Gyarados(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                    Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                    Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, Pokemon.Type.WATER, Type.FLYING, ability, nature, ExpType.SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE, firstSkill, secondSkill,
                thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    /**
     * Init Gyarados's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.THRASH);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(21, new ArrayList<Integer>(Arrays.asList(SkillFactory.LEER)));
        levelUpSkills.put(24, new ArrayList<Integer>(Arrays.asList(SkillFactory.TWISTER)));
        levelUpSkills.put(27, new ArrayList<Integer>(Arrays.asList(SkillFactory.ICE_FANG)));
        levelUpSkills.put(30, new ArrayList<Integer>(Arrays.asList(SkillFactory.AQUA_TAIL)));
        levelUpSkills.put(33, new ArrayList<Integer>(Arrays.asList(SkillFactory.SCARY_FACE)));
        levelUpSkills.put(36, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_RAGE)));
        levelUpSkills.put(39, new ArrayList<Integer>(Arrays.asList(SkillFactory.CRUNCH)));
        levelUpSkills.put(42, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYDRO_PUMP)));
        levelUpSkills.put(45, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_DANCE)));
        levelUpSkills.put(48, new ArrayList<Integer>(Arrays.asList(SkillFactory.HURRICANE)));
        levelUpSkills.put(51, new ArrayList<Integer>(Arrays.asList(SkillFactory.RAIN_DANCE)));
        levelUpSkills.put(54, new ArrayList<Integer>(Arrays.asList(SkillFactory.HYPER_BEAM)));
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.BITE);
    }

}
