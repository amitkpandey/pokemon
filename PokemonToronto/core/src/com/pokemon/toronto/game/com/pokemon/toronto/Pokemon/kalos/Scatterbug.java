package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kalos;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-02-02.
 */

public class Scatterbug extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    public static final int NUMBER = 664;
    public static final String NAME = "Scatterbug";
    public static final String TYPE_OF_POKEMON = "Scatterdust";
    public static final String DESCRIPTION = "When under attack from bird Pokémon, it spews a" +
            " poisonous black powder that causes paralysis on contact.";
    public static final double HEIGHT = 0.3;
    public static final int BASE_EXP = 40;
    public static final int[] EV_YIELD = {0, 0, 1, 0, 0, 0};
    public static final int CAPTURE_RATE = 255;
    public static final double WEIGHT = 2.5;

    public static final Ability FIRST_ABILITY = new Ability.ShieldDust();
    public static final Ability SECOND_ABILITY = new Ability.Compoundeyes();
    public static final Ability HIDDEN_ABILITY = new Ability.FriendGuard();

    //Base Stats
    public static final int BASE_HEALTH = 38;
    public static final int BASE_ATTACK = 35;
    public static final int BASE_DEFENSE = 40;
    public static final int BASE_SPECIAL_ATTACK = 27;
    public static final int BASE_SPECIAL_DEFENSE = 25;
    public static final int BASE_SPEED = 35;

    //Image Paths
    public static final String ICON_PATH = "pokemonSprites/kalos/scatterbug.png";
    public static final String BACK_PATH = "battle/backs/kalos/scatterbug.png";
    public static final String MINI_PATH = "pokemonMenu/sprites/kalos/scatterbug.png";
    public static final String CRY_PATH = "sounds/cry/664.wav";
    public static final String PROFILE_PATH = "trainercard/pokemon/kalos/scatterbug.png";

    //Typing
    public static final Pokemon.Type TYPE_ONE = Type.BUG;
    public static final Type TYPE_TWO = Type.NONE;

    //Exp
    public static final ExpType EXP_TYPE = ExpType.MEDIUM_FAST;

    /**
     * Create a scatterbug
     */
    public Scatterbug() {
        super(NUMBER, NAME, TYPE_OF_POKEMON, DESCRIPTION, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, HEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init scatterbug's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.TACKLE);
        beginnerSkills.add(SkillFactory.STRING_SHOT);
        levelUpSkills.put(0, beginnerSkills);
        levelUpSkills.put(6, new ArrayList<Integer>(Arrays.asList(SkillFactory.STUN_SPORE)));
        levelUpSkills.put(15, new ArrayList<Integer>(Arrays.asList(SkillFactory.BUG_BITE)));
    }

    /**
     * Init scatterbug's gender.
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

    /**
     * Return Spewpa if the scatterbug is above level 9.
     * @return Spewpa if scatterbug is the right level.
     */
    @Override
    public int getLevelUpEvolutionId() {
        if (level >= 9) {
            return PokemonId.SPEWPA.getValue();
        }
        return -1;
    }
}
