package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 8/16/2017.
 */

public class Pidgeot extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 18;
    private static final String NAME = "Pidgeot";
    private static final int BASE_EXP = 172;
    private static final int[] EV_YIELD = {0, 0, 0, 0, 0, 3};
    private static final int CAPTURE_RATE = 45;
    private static final double WEIGHT = 39.5;

    //Base Stats
    private static final int BASE_HEALTH = 83;
    private static final int BASE_ATTACK = 80;
    private static final int BASE_DEFENSE = 75;
    private static final int BASE_SPECIAL_ATTACK = 70;
    private static final int BASE_SPECIAL_DEFENSE = 70;
    private static final int BASE_SPEED = 101;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/pidgeot.png";
    private static final String BACK_PATH = "battle/backs/pidgeot.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/pidgeot.png";
    private static final String CRY_PATH = "sounds/cry/018.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/018.png";

    /**
     * Create a Pidgeot with the specified level.
     * @param level The level of the Pidgeot.
     */
    public Pidgeot(int level) {
        super(NUMBER, NAME, level, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, Pokemon.ExpType.MEDIUM_SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT);
    }

    /**
     * Create an Pidgeot from the database.
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
    public Pidgeot(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                     Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                     Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, Pokemon.Type.NORMAL, Pokemon.Type.FLYING, ability, nature, Pokemon.ExpType.MEDIUM_SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT,
                firstSkill, secondSkill, thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    //TODO: HIDDEN BIG PECKS
    @Override
    protected void initAbility() {
        if (Math.random() <= .5) {
            ability = Ability.KEEN_EYE;
        } else {
            ability = Ability.TANGLED_FEET;
        }
    }

    /**
     * Init Pidgeot's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.HURRICANE);
        beginnerSkills.add(SkillFactory.TACKLE);
        beginnerSkills.add(SkillFactory.SAND_ATTACK);
        beginnerSkills.add(SkillFactory.GUST);
        beginnerSkills.add(SkillFactory.QUICK_ATTACK);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.SAND_ATTACK)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.GUST)));
        levelUpSkills.put(13, new ArrayList<Integer>(Arrays.asList(SkillFactory.QUICK_ATTACK)));
        //TODO: WHIRLWIND 17
        levelUpSkills.put(22, new ArrayList<Integer>(Arrays.asList(SkillFactory.TWISTER)));
        levelUpSkills.put(27, new ArrayList<Integer>(Arrays.asList(SkillFactory.FEATHER_DANCE)));
        levelUpSkills.put(32, new ArrayList<Integer>(Arrays.asList(SkillFactory.AGILITY)));
        levelUpSkills.put(38, new ArrayList<Integer>(Arrays.asList(SkillFactory.WING_ATTACK)));
        levelUpSkills.put(44, new ArrayList<Integer>(Arrays.asList(SkillFactory.ROOST)));
        levelUpSkills.put(50, new ArrayList<Integer>(Arrays.asList(SkillFactory.TAILWIND)));
        //TODO: MIRROR MOVE 56
        levelUpSkills.put(62, new ArrayList<Integer>(Arrays.asList(SkillFactory.AIR_SLASH)));
        levelUpSkills.put(68, new ArrayList<Integer>(Arrays.asList(SkillFactory.HURRICANE)));
    }
}
