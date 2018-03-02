package com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kalos;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.Ability;
import com.pokemon.toronto.game.com.pokemon.toronto.item.TmId;
import com.pokemon.toronto.game.com.pokemon.toronto.skill.SkillFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gregorykelsie on 2018-02-02.
 */

public class Tyrantrum extends Pokemon {
    /** Init Variables */

    //Basic (id, name, exp, ev yield, capture rate)
    private static final int NUMBER = 697;
    private static final String NAME = "Tyrantrum";
    private static final int BASE_EXP = 182;
    private static final int[] EV_YIELD = {0, 2, 0, 0, 0, 0};
    private static final int CAPTURE_RATE = 45;
    private static final double WEIGHT = 270;

    private static final Ability FIRST_ABILITY = new Ability.StrongJaw();
    private static final Ability SECOND_ABILITY = null;
    private static final Ability HIDDEN_ABILITY = new Ability.RockHead();

    //Base Stats
    private static final int BASE_HEALTH = 82;
    private static final int BASE_ATTACK = 121;
    private static final int BASE_DEFENSE = 119;
    private static final int BASE_SPECIAL_ATTACK = 69;
    private static final int BASE_SPECIAL_DEFENSE = 59;
    private static final int BASE_SPEED = 71;

    //Image Paths
    private static final String ICON_PATH = "pokemonSprites/kalos/tyrantrum.png";
    private static final String BACK_PATH = "battle/backs/kalos/tyrantrum.png";
    private static final String MINI_PATH = "pokemonMenu/sprites/kalos/tyrantrum.png";
    private static final String CRY_PATH = "sounds/cry/697.wav";
    private static final String PROFILE_PATH = "trainercard/pokemon/kalos/tyrantrum.png";

    //Typing
    private static final Pokemon.Type TYPE_ONE = Type.ROCK;
    private static final Type TYPE_TWO = Type.DRAGON;

    //Exp
    private static final ExpType EXP_TYPE = ExpType.MEDIUM_FAST;

    /**
     * Create a tyrantrum
     */
    public Tyrantrum() {
        super(NUMBER, NAME, TYPE_ONE, TYPE_TWO, EXP_TYPE,
                BASE_EXP, EV_YIELD, new int[]{BASE_HEALTH, BASE_ATTACK, BASE_DEFENSE,
                        BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED}, ICON_PATH,
                BACK_PATH, MINI_PATH, CRY_PATH, PROFILE_PATH, CAPTURE_RATE, WEIGHT, FIRST_ABILITY,
                SECOND_ABILITY, HIDDEN_ABILITY);
    }

    /**
     * Init tyrantrum's level up skills.
     */
    @Override
    protected void initLevelUpSkills() {
        List<Integer> beginnerSkills = new ArrayList<Integer>();
        beginnerSkills.add(SkillFactory.STOMP);
        beginnerSkills.add(SkillFactory.TACKLE);
        beginnerSkills.add(SkillFactory.TAIL_WHIP);
        //ROAR
        beginnerSkills.add(SkillFactory.HEAD_SMASH);
        levelUpSkills.put(0, beginnerSkills);
        //6 ROAR
        levelUpSkills.put(10, new ArrayList<Integer>(Arrays.asList(SkillFactory.STOMP)));
        //12 BIDE
        levelUpSkills.put(15, new ArrayList<Integer>(Arrays.asList(SkillFactory.STEALTH_ROCK)));
        levelUpSkills.put(17, new ArrayList<Integer>(Arrays.asList(SkillFactory.BITE)));
        levelUpSkills.put(20, new ArrayList<Integer>(Arrays.asList(SkillFactory.CHARM)));
        levelUpSkills.put(26, new ArrayList<Integer>(Arrays.asList(SkillFactory.ANCIENT_POWER)));
        //30 DRAGON TAIL
        levelUpSkills.put(34, new ArrayList<Integer>(Arrays.asList(SkillFactory.CRUNCH)));
        levelUpSkills.put(37, new ArrayList<Integer>(Arrays.asList(SkillFactory.DRAGON_CLAW)));
        levelUpSkills.put(42, new ArrayList<Integer>(Arrays.asList(SkillFactory.THRASH)));
        levelUpSkills.put(47, new ArrayList<Integer>(Arrays.asList(SkillFactory.EARTHQUAKE)));
        levelUpSkills.put(53, new ArrayList<Integer>(Arrays.asList(SkillFactory.HORN_DRILL)));
        levelUpSkills.put(58, new ArrayList<Integer>(Arrays.asList(SkillFactory.HEAD_SMASH)));
        levelUpSkills.put(68, new ArrayList<Integer>(Arrays.asList(SkillFactory.GIGA_IMPACT)));
        initEvolutionSkills();
    }

    @Override
    protected void initTMSkills() {
        tmSkills.add(TmId.DRAGON_CLAW.getValue());
        tmSkills.add(TmId.ROAR.getValue());
        tmSkills.add(TmId.TOXIC.getValue());
        tmSkills.add(TmId.HIDDEN_POWER.getValue());
        tmSkills.add(TmId.SUNNY_DAY.getValue());
        tmSkills.add(TmId.HYPER_BEAM.getValue());
        tmSkills.add(TmId.PROTECT.getValue());
        tmSkills.add(TmId.FRUSTRATION.getValue());
        tmSkills.add(TmId.EARTHQUAKE.getValue());
        tmSkills.add(TmId.RETURN.getValue());
        tmSkills.add(TmId.BRICK_BREAK.getValue());
        tmSkills.add(TmId.DOUBLE_TEAM.getValue());
        tmSkills.add(TmId.SANDSTORM.getValue());
        tmSkills.add(TmId.ROCK_TOMB.getValue());
        tmSkills.add(TmId.AERIAL_ACE.getValue());
        tmSkills.add(TmId.FACADE.getValue());
        tmSkills.add(TmId.REST.getValue());
        tmSkills.add(TmId.ATTRACT.getValue());
        tmSkills.add(TmId.ROUND.getValue());
        tmSkills.add(TmId.BRUTAL_SWING.getValue());
        tmSkills.add(TmId.GIGA_IMPACT.getValue());
        tmSkills.add(TmId.ROCK_POLISH.getValue());
        tmSkills.add(TmId.STONE_EDGE.getValue());
        tmSkills.add(TmId.BULLDOZE.getValue());
        tmSkills.add(TmId.ROCK_SLIDE.getValue());
        tmSkills.add(TmId.DRAGON_TAIL.getValue());
        tmSkills.add(TmId.SWAGGER.getValue());
        tmSkills.add(TmId.SLEEP_TALK.getValue());
        tmSkills.add(TmId.SUBSTITUTE.getValue());
        tmSkills.add(TmId.DARK_PULSE.getValue());
        tmSkills.add(TmId.CONFIDE.getValue());
    }

    @Override
    protected void initEvolutionSkills() {
        evolutionSkills.add(SkillFactory.ROCK_SLIDE);
    }

    /**
     * Init tyrantrum's gender.
     */
    @Override
    protected void initGender() {
        double genderProbability = Math.random();
        if (genderProbability <= .875) {
            gender = 'M';
        } else {
            gender = 'F';
        }
    }
}
