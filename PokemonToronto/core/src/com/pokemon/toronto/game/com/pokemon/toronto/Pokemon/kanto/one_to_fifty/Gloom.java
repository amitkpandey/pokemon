package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 8/16/2017.
 */

public class Gloom extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 44;
    private static final String NAME = "Gloom";
    private static final int BASE_EXP = 132;
    private static final int[] EV_YIELD = {0, 0, 0, 2, 0, 0};
    private static final int CAPTURE_RATE = 120;

    //Base Stats
    private static final int BASE_HEALTH = 60;
    private static final int BASE_ATTACK = 65;
    private static final int BASE_DEFENSE = 70;
    private static final int BASE_SPECIAL_ATTACK = 85;
    private static final int BASE_SPECIAL_DEFENSE = 75;
    private static final int BASE_SPEED = 40;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/gloom.png";
    private static final String BACK_PATH = "battle/backs/gloom.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/gloom.png";
    private static final String CRY_PATH = "sounds/cry/044.wav";

    /**
     * Create a Gloom with the specified level.
     * @param level The level of the Gloom.
     */
    public Gloom(int level) {
        super(NUMBER, NAME, level, Pokemon.Type.GRASS, Pokemon.Type.POISON, Ability.CHLOROPHYLL, ExpType.MEDIUM_SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE);
    }

    /**
     * Create an Gloom from the database.
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
    public Gloom(boolean fromDatabase, int level, char gender, int[] ivs, int [] evs, Skill firstSkill,
                  Skill secondSkill, Skill thirdSkill, Skill fourthSkill, int currentHealth, int currentExp,
                  Pokemon.Status status, Nature nature, Pokemon.Ability ability) {
        super(NUMBER, NAME, level, gender, status, ivs, evs, Pokemon.Type.GRASS, Type.POISON, ability, nature, ExpType.MEDIUM_SLOW,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, CAPTURE_RATE, firstSkill, secondSkill,
                thirdSkill, fourthSkill, currentHealth, currentExp);
    }

    /**
     * Init Oddish's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.ABSORB);
        beginnerSkills.add(SkillFactory.GROWTH);
        beginnerSkills.add(SkillFactory.SWEET_SCENT);
        beginnerSkills.add(SkillFactory.ACID);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(5, new ArrayList<Integer>(Arrays.asList(SkillFactory.SWEET_SCENT)));
        levelUpSkills.put(9, new ArrayList<Integer>(Arrays.asList(SkillFactory.ACID)));
        levelUpSkills.put(13, new ArrayList<Integer>(Arrays.asList(SkillFactory.POISON_POWDER)));
        levelUpSkills.put(14, new ArrayList<Integer>(Arrays.asList(SkillFactory.STUN_SPORE)));
        levelUpSkills.put(15, new ArrayList<Integer>(Arrays.asList(SkillFactory.SLEEP_POWDER)));
        levelUpSkills.put(19, new ArrayList<Integer>(Arrays.asList(SkillFactory.MEGA_DRAIN)));
        //TODO: LUCKY CHANT 24
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.MOONLIGHT)));
        levelUpSkills.put(34, new ArrayList<Integer>(Arrays.asList(SkillFactory.GIGA_DRAIN)));
        //TODO: TOXIC 39
        //TODO: NATURAL GIFT 44
        levelUpSkills.put(49, new ArrayList<Integer>(Arrays.asList(SkillFactory.PETAL_BLIZZARD)));
        //TODO: GRASSY TERRAIN 54
        levelUpSkills.put(59, new ArrayList<Integer>(Arrays.asList(SkillFactory.PETAL_DANCE)));
    }

    @Override
    public int getLeafStoneEvolutionId() {
        return PokemonId.VILEPLUME.getValue();
    }
}
