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

public class Parasect extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 47;
    private static final String NAME = "Parasect";
    private static final int BASE_EXP = 128;
    private static final int[] EV_YIELD = {0, 2, 1, 0, 0, 0};
    private static final int CAPTURE_RATE = 75;

    //Base Stats
    private static final int BASE_HEALTH = 60;
    private static final int BASE_ATTACK = 95;
    private static final int BASE_DEFENSE = 80;
    private static final int BASE_SPECIAL_ATTACK = 60;
    private static final int BASE_SPECIAL_DEFENSE = 80;
    private static final int BASE_SPEED = 30;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/parasect.png";
    private static final String BACK_PATH = "battle/backs/parasect.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/parasect.png";
    private static final String CRY_PATH = "sounds/cry/047.wav";

    /**
     * Create a Parasect with the specified level.
     * @param level The level of the Parasect.
     */
    public Parasect(int level) {
        super(NUMBER, NAME, level, Type.BUG, Type.GRASS, Ability.EFFECT_SPORE, ExpType.MEDIUM_FAST,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE);
    }

    /**
     * Create an Parasect from the database.
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
    public Parasect(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                 Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                 Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, Type.BUG, Type.GRASS, ability, nature, ExpType.MEDIUM_FAST,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE, firstSkill, secondSkill,
                thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    /**
     * Init Parasect's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.CROSS_POISON);
        beginnerSkills.add(SkillFactory.SCRATCH);
        beginnerSkills.add(SkillFactory.STUN_SPORE);
        beginnerSkills.add(SkillFactory.POISON_POWDER);
        beginnerSkills.add(SkillFactory.ABSORB);
        levelUpSkills.put(0, beginnerSkills);
        ArrayList<Integer> six = new ArrayList<Integer>();
        six.add(SkillFactory.STUN_SPORE);
        six.add(SkillFactory.POISON_POWDER);
        levelUpSkills.put(6, six);
        levelUpSkills.put(11, new ArrayList<Integer>(Arrays.asList(SkillFactory.ABSORB)));
        levelUpSkills.put(17, new ArrayList<Integer>(Arrays.asList(SkillFactory.FURY_CUTTER)));
        levelUpSkills.put(22, new ArrayList<Integer>(Arrays.asList(SkillFactory.SPORE)));
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.SLASH)));
        levelUpSkills.put(37, new ArrayList<Integer>(Arrays.asList(SkillFactory.GROWTH)));
        levelUpSkills.put(44, new ArrayList<Integer>(Arrays.asList(SkillFactory.GIGA_DRAIN)));
        levelUpSkills.put(51, new ArrayList<Integer>(Arrays.asList(SkillFactory.AROMATHERAPY)));
        levelUpSkills.put(66, new ArrayList<Integer>(Arrays.asList(SkillFactory.X_SCISSOR)));
    }
}
