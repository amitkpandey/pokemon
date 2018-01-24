package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.johto;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-01-22.
 */

public class Xatu extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 178;
    private static final String NAME = "Xatu";
    private static final int BASE_EXP = 165;
    private static final int[] EV_YIELD = {0, 0, 0, 1, 0, 1};
    private static final int CAPTURE_RATE = 75;
    private static final double WEIGHT = 15;

    private static final Ability FIRST_ABILITY = new Ability.Synchronize();
    private static final Ability SECOND_ABILITY = new Ability.EarlyBird();
    private static final Ability HIDDEN_ABILITY = new Ability.MagicBounce();

    //Base Stats
    private static final int BASE_HEALTH = 65;
    private static final int BASE_ATTACK = 75;
    private static final int BASE_DEFENSE = 70;
    private static final int BASE_SPECIAL_ATTACK = 95;
    private static final int BASE_SPECIAL_DEFENSE = 70;
    private static final int BASE_SPEED = 95;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/johto/xatu.png";
    private static final String BACK_PATH = "battle/backs/johto/xatu.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/johto/xatu.png";
    private static final String CRY_PATH = "sounds/cry/178.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/johto/xatu.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.PSYCHIC;
    private static final Type TYPE_TWO = Type.FLYING;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_FAST;

    /**
     * Create a xatu
     */
    public Xatu() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init xatu's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.TAILWIND);
        beginnerSkills.add(SkillFactory.PECK);
        beginnerSkills.add(SkillFactory.LEER);
        beginnerSkills.add(SkillFactory.NIGHT_SHADE);
        //teleport
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(6, new ArrayList<Integer>(Arrays.asList(SkillFactory.NIGHT_SHADE)));
        //TELEPORT 9
        //LUCKY CHANT 12
        levelUpSkills.put(17, new ArrayList<Integer>(Arrays.asList(SkillFactory.STORED_POWER)));
        levelUpSkills.put(20, new ArrayList<Integer>(Arrays.asList(SkillFactory.OMINOUS_WIND)));
        levelUpSkills.put(23, new ArrayList<Integer>(Arrays.asList(SkillFactory.CONFUSE_RAY)));
        levelUpSkills.put(29, new ArrayList<Integer>(Arrays.asList(SkillFactory.WISH)));
        levelUpSkills.put(35, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHIC)));
        //MIRACLE EYE 39
        levelUpSkills.put(43, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHO_SHIFT)));
        levelUpSkills.put(49, new ArrayList<Integer>(Arrays.asList(SkillFactory.FUTURE_SIGHT)));
        //POWER SWAP AND GUARD SWAP 53
        //ME FIRST 57
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.AIR_SLASH);
    }

    /**
     * Init xatu's gender.
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

}
