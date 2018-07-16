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
 * Created by gregorykelsie on 2018-05-05.
 */

public class Swadloon extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 541;
    private static final String NAME = "Swadloon";
    private static final int BASE_EXP = 133;
    private static final int[] EV_YIELD = {0, 0, 2, 0, 0, 0};
    private static final int CAPTURE_RATE = 120;
    private static final double WEIGHT = 7.3;

    private static final Ability FIRST_ABILITY = new Ability.LeafGuard();
    private static final Ability SECOND_ABILITY = new Ability.Chlorophyll();
    private static final Ability HIDDEN_ABILITY = new Ability.Overcoat();

    //Base Stats
    private static final int BASE_HEALTH = 55;
    private static final int BASE_ATTACK = 63;
    private static final int BASE_DEFENSE = 90;
    private static final int BASE_SPECIAL_ATTACK = 50;
    private static final int BASE_SPECIAL_DEFENSE = 80;
    private static final int BASE_SPEED = 42;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/unova/swadloon.png";
    private static final String BACK_PATH = "battle/backs/unova/swadloon.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/unova/swadloon.png";
    private static final String CRY_PATH = "sounds/cry/541.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/unova/swadloon.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.BUG;
    private static final Type TYPE_TWO = Type.GRASS;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_SLOW;

    /**
     * Create a swadloon
     */
    public Swadloon() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init swadloon's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.GRASS_WHISTLE);
        beginnerSkills.add(SkillFactory.TACKLE);
        beginnerSkills.add(SkillFactory.STRING_SHOT);
        beginnerSkills.add(SkillFactory.BUG_BITE);
        beginnerSkills.add(SkillFactory.RAZOR_LEAF);
        levelUpSkills.put(0, beginnerSkills);
        //TODO: init evolution skill protect
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.CALM_MIND.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.LIGHT_SCREEN.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.SAFEGUARD.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.SOLAR_BEAM.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.ENERGY_BALL.getValue());
        tmSkills.add(TmId.PAYBACK.getValue());
        tmSkills.add(TmId.DREAM_EATER.getValue());
        tmSkills.add(TmId.GRASS_KNOT.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.NATURE_POWER.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    /**
     * Init swadloon's gender.
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

    @Override
    public int getLeafStoneEvolutionId() {
        return PokemonId.LEAVANNY.getValue();
    }
}
