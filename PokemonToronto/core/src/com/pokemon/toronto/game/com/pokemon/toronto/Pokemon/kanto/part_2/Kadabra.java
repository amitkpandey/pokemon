package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Nature;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.Skill;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gregory on 9/16/2017.
 */

public class Kadabra extends Pokemon {
    /** Init Variables */
    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 64;
    private static final String NAME = "Kadabra";
    private static final int BASE_EXP = 140;
    private static final int[] EV_YIELD = {0, 0, 0, 2, 0, 0};
    private static final int CAPTURE_RATE = 100;
    private static final double WEIGHT = 56.5;

    private static final Ability FIRST_ABILITY = new Ability.Synchronize();
    private static final Ability SECOND_ABILITY = new Ability.InnerFocus();
    private static final Ability HIDDEN_ABILITY = new Ability.MagicGuard();


    //Base Stats
    private static final int BASE_HEALTH = 40;
    private static final int BASE_ATTACK = 35;
    private static final int BASE_DEFENSE = 30;
    private static final int BASE_SPECIAL_ATTACK = 120;
    private static final int BASE_SPECIAL_DEFENSE = 70;
    private static final int BASE_SPEED = 105;

    //Typing
    private static final Type TYPE_ONE = Type.PSYCHIC;
    private static final Type TYPE_TWO = Type.NONE;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_SLOW;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/kadabra.png";
    private static final String BACK_PATH = "battle/backs/kadabra.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/kadabra.png";
    private static final String CRY_PATH = "sounds/cry/064.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kanto/064.png";

    /**
     * Create a Kadabra.
     */
    public Kadabra() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .75) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }

    /**
     * Init Kadabra's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        //TODO: TELEPORT
        beginnerSkills.add(SkillFactory.CONFUSION);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(16, new ArrayList<Integer>(Arrays.asList(SkillFactory.CONFUSION)));
        //TODO: DISABLE 18
        levelUpSkills.put(21, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYBEAM)));
        //TODO: MIRACLE EYE 23
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.REFLECT)));
        levelUpSkills.put(28, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHO_CUT)));
        levelUpSkills.put(31, new ArrayList<Integer>(Arrays.asList(SkillFactory.RECOVER)));
        //TODO: TELEKINESIS 33
        levelUpSkills.put(38, new ArrayList<Integer>(Arrays.asList(SkillFactory.PSYCHIC)));
        levelUpSkills.put(41, new ArrayList<Integer>(Arrays.asList(SkillFactory.ROLE_PLAY)));
        levelUpSkills.put(43, new ArrayList<Integer>(Arrays.asList(SkillFactory.FUTURE_SIGHT)));
        //TODO: TRICK 46
        initEvolutionSkills();
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.KINESIS);
    }

    /**
     * Return Alakazam if Kadabra is 40
     * @return Alakazam if Kadabra is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 40) {
            return PokemonId.ALAKAZAM.getValue();
        }
        return -1;
    }
}
