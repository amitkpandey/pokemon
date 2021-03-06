package com.pokemon.toronto.game.com.pokemon.toronto.gamestate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Bulbasaur;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Charmander;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.Pokemon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Squirtle;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.Animation;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.AnimationFactory;
import com.pokemon.toronto.game.com.pokemon.toronto.animation.StraightLineAnimation;
import com.pokemon.toronto.game.com.pokemon.toronto.input.InputHandler;
import com.pokemon.toronto.game.com.pokemon.toronto.input.MyInput;
import com.pokemon.toronto.game.com.pokemon.toronto.net.JSONParser;
import com.pokemon.toronto.game.com.pokemon.toronto.textbox.TextBoxFactory;
import com.pokemon.toronto.game.com.pokemon.toronto.textbox.TextBoxText;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory on 6/5/2017.
 */
public class IntroductionState extends GameState {

    /** Instance Variables */

    //Textures
    private Texture background;
    private Texture genderImages;
    private Texture yesNoImages;
    private Texture textBox;
    private Texture textBoxHeader;
    private Texture starterPokeballsTexture;
    private Texture ivyWink;

    //Sounds
    private Sound clickSound;
    private Sound bulbasaurCry;
    private Sound charmanderCry;
    private Sound squirtleCry;
    private Sound throwPokeballSound;
    private Sound wooshSound;
    private Sound caughtPokemonSound;
    private Music ivyTheme;

    //Animations
    private Animation bulbasaurAnimation;
    private Animation charmanderAnimation;
    private Animation squirtleAnimation;
    private Animation ivyAnimation;
    private StraightLineAnimation droppingPokeballAnimation;


    //Text Boxes
    private List<TextBoxText> tbts;
    private TextBoxText genderText;
    private TextBoxText maleResponseText;
    private TextBoxText femaleResponseText;
    private TextBoxText genderResponseText;
    private TextBoxText pokeballSelectText;
    private TextBoxText congratsText;
    private List<TextBoxText> bulbasaurDexText;
    private List<TextBoxText> charmanderDexText;
    private List<TextBoxText> squirtleDexText;

    //Counters
    private double caughtSoundCounter;
    private float fadingCounter;
    private double fadingRate = (0.0033333f / 2.0f);
    private final double caughtSoundDuration = 3; //2.009 seconds of play time

    //FLAGS
    private boolean firstDialogue;
    private boolean genderDialogue;
    private boolean genderResponseDialogue;
    private boolean pokemonSelectDialogue;
    private boolean drawGenderOptions;
    private boolean drawYesNoOptions;
    private boolean choseMale;
    private boolean choseFemale;
    private boolean drawPokeballs;
    private boolean displayBulbasaurIntroduction;
    private boolean displayCharmanderIntroduction;
    private boolean displaySquirtleIntroduction;
    private boolean drawDroppingPokeballAnimation;
    private boolean justFinishedDroppingPokeball;
    private boolean startedFadingPokemon;
    private boolean finishedFadingPokemon;
    private boolean justFinishedFadingPokemon;
    private boolean startedCaughtSound;
    private boolean obtainedPokemon;
    private boolean startedFading;
    private boolean crySwitch;

    //Misc
    private ShapeRenderer shapeRenderer;
    private GameStateManager gsm;
    private char gender;
    private Pokemon starter;
    private int currentTextBox;

    /**
     * The Introduction State is the state that is open after a user logs
     * in for the first time. Professor Ivy teaches the player about the game
     * and the player selects their gender and starter Pokemon.
     * @param gsm A reference to the Game State Manager
     */
    public IntroductionState(GameStateManager gsm) {
        this.gsm = gsm;
        Gdx.input.setInputProcessor(new InputHandler());
        gsm.setNotificationSound();
        initTextBoxes();
        initAnimations();
        initTextures();
        initAudio();
        initFlags();
        initMisc();
        shapeRenderer = new ShapeRenderer();
    }

    /**
     * Initialize all of the text boxes for this state.
     * Retrive them from the TextBoxFactory.
     */
    private void initTextBoxes() {
        tbts = TextBoxFactory.getFirstBox();
        genderText = TextBoxFactory.getGenderText();
        maleResponseText = TextBoxFactory.getMaleResponseText();
        femaleResponseText = TextBoxFactory.getFemaleResponseText();
        genderResponseText = TextBoxFactory.getGenderResponseText();
        pokeballSelectText = TextBoxFactory.getPokeballSelectText();
        bulbasaurDexText = TextBoxFactory.getStarterBulbasaurText();
        charmanderDexText = TextBoxFactory.getStarterCharmanderText();
        squirtleDexText = TextBoxFactory.getStarterSquirtleText();
        congratsText = TextBoxFactory.getCongratsText();
    }

    /**
     * Initialize all of the textures for the state.
     */
    private void initTextures() {
        background = gsm.getLoader().get("nature_background.png");
        genderImages = gsm.getLoader().get("genderOptions.png");
        yesNoImages = gsm.getLoader().get("yesNoOptions.png");
        starterPokeballsTexture = gsm.getLoader().get("starterPokeballs.png");
        ivyWink = gsm.getLoader().get("professor_ivy3.png");
        textBox = gsm.getLoader().get("textbox.png");
        textBoxHeader = gsm.getLoader().get("textbox_header.png");
    }

    /**
     * Initialize the animations for this state.
     */
    private void initAnimations() {
        charmanderAnimation = AnimationFactory.getCharmanderAnimation(gsm.getLoader());
        bulbasaurAnimation = AnimationFactory.getBulbasaurAnimation(gsm.getLoader());
        squirtleAnimation = AnimationFactory.getSquirtleAnimation(gsm.getLoader());
        ivyAnimation = AnimationFactory.getIvyAnimation(gsm.getLoader());
        droppingPokeballAnimation = AnimationFactory.getDroppingPokeballAnimation(gsm.getLoader());
    }

    /**
     * Initialize any remainder variables to their initial state.
     */
    private void initMisc() {
        caughtSoundCounter = 0;
        currentTextBox = 0;
        fadingCounter = 0;
        crySwitch = false;
    }

    /**
     * Initialize the audio files for this state.
     * Play the Professor Ivy theme after all of the files are loaded.
     */
    private void initAudio() {
        clickSound = gsm.getLoader().get("sounds/click.wav");
        bulbasaurCry = gsm.getLoader().get("sounds/cry/001.wav");
        charmanderCry = gsm.getLoader().get("sounds/cry/004.wav");
        squirtleCry = gsm.getLoader().get("sounds/cry/007.wav");
        throwPokeballSound = gsm.getLoader().get("sounds/throwPokeball.wav");
        wooshSound = gsm.getLoader().get("sounds/woosh.wav");
        caughtPokemonSound = gsm.getLoader().get("sounds/caughtPokemon.wav");
        ivyTheme = gsm.getLoader().get("bgm/professorIvyTheme.mp3", Music.class);
        ivyTheme.setLooping(true);
        ivyTheme.play();
    }

    /**
     * Initialize the flags for this state.
     * Set the first flag for the first dialogue to play.
     * The flags are used to determine where in the conversation
     * the player is at.
     */
    private void initFlags() {
        firstDialogue = true;
        genderDialogue = false;
        genderResponseDialogue = false;
        pokemonSelectDialogue = false;
        drawGenderOptions = false;
        drawYesNoOptions = false;
        choseMale = false;
        choseFemale = false;
        drawPokeballs = false;
        displayBulbasaurIntroduction = false;
        displayCharmanderIntroduction = false;
        displaySquirtleIntroduction = false;
        drawDroppingPokeballAnimation = false;
        justFinishedDroppingPokeball = false;
        startedFadingPokemon = false;
        finishedFadingPokemon = false;
        justFinishedFadingPokemon = false;
        startedCaughtSound = false;
        obtainedPokemon = false;
        startedFading = false;
    }

    /**
     * Return whether or not the player selected a gender yet.
     * @return Whether or not the player selected a gender.
     */
    private boolean selectedGender() {
        return (choseMale || choseFemale);
    }

    /**
     * Finish updating the first dialogue text box if it hasn't finished yet.
     * Otherwise, go to the next text box.
     */
    private void firstDialogueClickedTextBox() {
        if (!tbts.get(currentTextBox).finishedUpdating()) {
            tbts.get(currentTextBox).quickUpdate();
        } else {
            //Get next textbox.
            if (currentTextBox == tbts.size() - 1) {
                firstDialogue = false;
                genderDialogue = true;
            } else {
                currentTextBox++;
            }
            clickSound.play();
        }
    }

    /**
     * Execute clicking on the gender dialogue box.
     * This occurs on:
     * - Asking player for gender
     * - Asking again if the player is sure for their selection.
     */
    private void genderDialogueClickedTextBox() {
        //Update any text boxes if they haven't finished updating.
        if (!genderText.finishedUpdating()) {
            genderText.quickUpdate();
        }
        if (choseMale && !maleResponseText.finishedUpdating()) {
            maleResponseText.quickUpdate();
        }
        if (choseFemale && !femaleResponseText.finishedUpdating()) {
            femaleResponseText.quickUpdate();
        }

        //Clicked on the Male Button
        if (MyInput.getX() >= 75 && MyInput.getX() <= 333 &&
                MyInput.getY() >= 1579 && MyInput.getY() <= 1795) {
            //Check if the gender buttons are visible.
            if (drawGenderOptions) {
                choseMale = true;
                drawGenderOptions = false;
                clickSound.play();
            }
        }
        //Clicked on the Female Button
        if (MyInput.getX() >= 639 && MyInput.getX() <= 935 &&
                MyInput.getY() >= 1630 && MyInput.getY() <= 1804) {
            //Check if the gender buttons are visible.
            if (drawGenderOptions) {
                choseFemale = true;
                drawGenderOptions = false;
                clickSound.play();
            }
        }
        //Clicked on the Yes Button
        if (MyInput.getX() >= 69 && MyInput.getX() <= 414 &&
                MyInput.getY() >= 1582 && MyInput.getY() <= 1760) {
            //Check if the Yes and No option buttons are visible.
            if (drawYesNoOptions) {
                if (choseMale) {
                    gender = 'm';
                } else if (choseFemale) {
                    gender = 'f';
                }
                genderResponseDialogue = true;
                genderDialogue = false;
                drawYesNoOptions = false;
                clickSound.play();
            }

        }
        //Clicked on the No Button
        if (MyInput.getX() >= 658 && MyInput.getX() <= 996 &&
                MyInput.getY() >= 1626 && MyInput.getY() <= 1785) {
            //Check if the Yes and No option buttons are visible.
            if (drawYesNoOptions) {
                //Reset the lines because it cycles back to asking
                //for the player's gender.
                genderText.resetLines();
                maleResponseText.resetLines();
                femaleResponseText.resetLines();
                //Reset any choice the player made in regards to gender.
                choseMale = false;
                choseFemale = false;
                drawYesNoOptions = false;
                clickSound.play();
            }
        }
    }


    /**
     * Execute clicking on the gender response text box.
     * Update the text box if it is not finished updating.
     * Go towards the Pokemon select dialogue if it's done updating.
     */
    private void genderResponseDialogueClickedTextBox() {
        if (!genderResponseText.finishedUpdating()) {
            genderResponseText.quickUpdate();
        } else {
            genderResponseDialogue = false;
            pokemonSelectDialogue = true;
            clickSound.play();
        }
    }

    /**
     * Execute clicking on the pokemon select text box.
     * Update the text box if it hasn't finished updating.
     * Check to see if the player clicked on a Pokeball if it
     * has finished updating.
     */
    private void pokemonSelectDialogueClickedTextBox() {
        if (!pokeballSelectText.finishedUpdating()) {
            pokeballSelectText.quickUpdate();
        } else {
            //Check to see if clicked on a Pokeball
            if (MyInput.getX() >= 10 && MyInput.getX() <= 306 &&
                    MyInput.getY() >= 1646 && MyInput.getY() <= 1916) {
                //Left Pokeball
                displayBulbasaurIntroduction = true;
                pokemonSelectDialogue = false;
                drawPokeballs = false;
                crySwitch = true;
                currentTextBox = 0;
            } else if (MyInput.getX() >= 403 && MyInput.getX() <= 615 &&
                    MyInput.getY() >= 1646 && MyInput.getY() <= 1916) {
                //Middle Pokeball
                displayCharmanderIntroduction = true;
                pokemonSelectDialogue = false;
                drawPokeballs = false;
                crySwitch = true;
                currentTextBox = 0;
            } else if (MyInput.getX() >= 765 && MyInput.getX() <= 996 &&
                    MyInput.getY() >= 1646 && MyInput.getY() <= 1916) {
                //Right Pokeball
                displaySquirtleIntroduction = true;
                pokemonSelectDialogue = false;
                crySwitch = true;
                drawPokeballs = false;
                currentTextBox = 0;
            }
        }
    }

    /**
     * Execute clicking on the Charmander information text box.
     * Update the text box if it hasn't finished updating.
     * Check if clicked on the yes no options while it is displayed.
     */
    private void charmanderClicked() {
        if (!charmanderDexText.get(currentTextBox).finishedUpdating()) {
            charmanderDexText.get(currentTextBox).quickUpdate();
        } else {
            boolean exited = false;
            if (currentTextBox != charmanderDexText.size() - 1) {
                currentTextBox++;
                clickSound.play();
            }

            if (MyInput.getX() >= 69 && MyInput.getX() <= 414 &&
                    MyInput.getY() >= 1582 && MyInput.getY() <= 1760) {
                //Clicked yes
                if (drawYesNoOptions) {
                    starter = new Charmander();
                    starter.insertWildData(5, 0);
                    drawDroppingPokeballAnimation = true;
                    drawYesNoOptions = false;
                    throwPokeballSound.play();
                }
            } else if (MyInput.getX() >= 658 && MyInput.getX() <= 996 &&
                    MyInput.getY() >= 1626 && MyInput.getY() <= 1785) {
                //Chose No
                if (drawYesNoOptions) {
                    exited = true;
                    pokemonSelectDialogue = true;
                    pokeballSelectText.resetLines();
                    for (int i = 0; i < charmanderDexText.size(); i++) {
                        charmanderDexText.get(i).resetLines();
                    }
                    drawYesNoOptions = false;
                    displayCharmanderIntroduction = false;
                    clickSound.play();
                }
            }

            if (exited) {
                //Set the current text box for the next list of text
                //boxes to come in.
                currentTextBox = 0;
            }
        }
    }


    /**
     * Execute clicking on the Bulbasaur information text box.
     * Update the text box if it hasn't finished updating.
     * Check if clicked on the yes no options while it is displayed.
     */
    private void bulbasaurClicked() {
        if (!bulbasaurDexText.get(currentTextBox).finishedUpdating()) {
            bulbasaurDexText.get(currentTextBox).quickUpdate();
        } else {
            boolean exited = false;
            if (currentTextBox != bulbasaurDexText.size() - 1) {
                currentTextBox++;
                clickSound.play();
            }

            if (MyInput.getX() >= 69 && MyInput.getX() <= 414 &&
                    MyInput.getY() >= 1582 && MyInput.getY() <= 1760) {
                //Clicked yes
                if (drawYesNoOptions) {
                    starter = new Bulbasaur();
                    starter.insertWildData(5, 0);
                    drawDroppingPokeballAnimation = true;
                    drawYesNoOptions = false;
                    throwPokeballSound.play();
                }
            } else if (MyInput.getX() >= 658 && MyInput.getX() <= 996 &&
                    MyInput.getY() >= 1626 && MyInput.getY() <= 1785) {
                //Chose No
                if (drawYesNoOptions) {
                    exited = true;
                    pokemonSelectDialogue = true;
                    pokeballSelectText.resetLines();
                    for (int i = 0; i < bulbasaurDexText.size(); i++) {
                        bulbasaurDexText.get(i).resetLines();
                    }
                    drawYesNoOptions = false;
                    displayBulbasaurIntroduction = false;
                    clickSound.play();
                }
            }

            if (exited) {
                currentTextBox = 0;
            }
        }
    }

    /**
     * Execute clicking on the Squirtle information text box.
     * Update the text box if it hasn't finished updating.
     * Check if clicked on the yes no options while it is displayed.
     */
    private void squirtleClicked() {
        if (!squirtleDexText.get(currentTextBox).finishedUpdating()) {
            squirtleDexText.get(currentTextBox).quickUpdate();
        } else {
            boolean exited = false;
            if (currentTextBox != squirtleDexText.size() - 1) {
                currentTextBox++;
                clickSound.play();
            }

            if (MyInput.getX() >= 69 && MyInput.getX() <= 414 &&
                    MyInput.getY() >= 1582 && MyInput.getY() <= 1760) {
                //Clicked yes
                if (drawYesNoOptions) {
                    starter = new Squirtle();
                    starter.insertWildData(5, 0);
                    drawYesNoOptions = false;
                    drawDroppingPokeballAnimation = true;
                    throwPokeballSound.play();
                }
            } else if (MyInput.getX() >= 658 && MyInput.getX() <= 996 &&
                    MyInput.getY() >= 1626 && MyInput.getY() <= 1785) {
                //Chose No
                if (drawYesNoOptions) {
                    exited = true;
                    pokemonSelectDialogue = true;
                    pokeballSelectText.resetLines();
                    for (int i = 0; i < squirtleDexText.size(); i++) {
                        squirtleDexText.get(i).resetLines();
                    }
                    drawYesNoOptions = false;
                    displaySquirtleIntroduction = false;
                    clickSound.play();
                }
            }

            if (exited) {
                currentTextBox = 0;
            }
        }
    }


    /**
     * Execute clicking on the congrats text box when Professor Ivy
     * congratulates the user on choosing their starter.
     * Updates the text box if it hasn't finished updating.
     * Start the fade out phase if the box finished updating.
     */
    private void obtainedPokemonClicked() {
        if (!congratsText.finishedUpdating()) {
            congratsText.quickUpdate();
        } else {
            //Open new gamestate
            startedFading = true;
            obtainedPokemon = false;
            clickSound.play();
        }
    }

    /**
     * Return whether or not a starter is being displayed.
     * This is the only case when Professor Ivy is not shown
     * on the screen.
     * @return Whether or not a starter is being displayed as the
     * main render.
     */
    private boolean isDisplayingStarter() {
        if (displaySquirtleIntroduction || displayCharmanderIntroduction ||
                displayBulbasaurIntroduction) {
            return true;
        }
        return false;
    }

    /**
     * Render the Introduction State.
     * @param batch The SpriteBatch the Introduction State is being
     *              rendered to.
     */
    @Override
    public void render(SpriteBatch batch) {
        batch.draw(background, 0, 0); //Draw the background.

        //Determine whether or not to draw Professor Ivys
        //regular animation (blinking), wink or neither.
        if (genderResponseDialogue) {
            batch.draw(ivyWink, 0, 0);
        } else if (!isDisplayingStarter()){
            ivyAnimation.render(batch);
        }

        ///Render the text box and header
        if (!drawDroppingPokeballAnimation && !startedFading) {
            batch.draw(textBox, 0, 0);
            batch.draw(textBoxHeader, 0, 0);
        }

        //Render the right text box based on the true flag.
        if (firstDialogue) {
            tbts.get(currentTextBox).render(batch);
        } else if (genderDialogue) {
            if (!selectedGender()) {
                genderText.render(batch);
            } else if (choseMale) {
                maleResponseText.render(batch);
            } else if (choseFemale) {
                femaleResponseText.render(batch);
            }
        } else if (genderResponseDialogue) {
            genderResponseText.render(batch);
        } else if (pokemonSelectDialogue) {
            pokeballSelectText.render(batch);
        } else if (obtainedPokemon) {
            congratsText.render(batch);
        }

        //Fade the screen to black
        else if (startedFading) {
            batch.end();
            Gdx.gl.glEnable(GL20.GL_BLEND);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(0,0,0, this.fadingCounter);
            shapeRenderer.rect(0,0,1080, 1920);
            shapeRenderer.end();
            Gdx.gl.glDisable(GL20.GL_BLEND);
            batch.begin();
        }

        //Draw the icons based on the true flag.
        if (drawGenderOptions) {
            batch.draw(genderImages, 0, 0);
        }

        if (drawYesNoOptions) {
            batch.draw(yesNoImages, 0, 0);
        }

        if (drawPokeballs) {
            batch.draw(starterPokeballsTexture, 0, 0);
        }

        //Draw the Starter Renders
        if (displayBulbasaurIntroduction) {
            if (!finishedFadingPokemon) {
                bulbasaurAnimation.render(batch);
            }
            if (!drawDroppingPokeballAnimation) {
                bulbasaurDexText.get(currentTextBox).render(batch);
            }
            if (crySwitch) {
                crySwitch = false;
                bulbasaurCry.play();
            }
        }
        if (displayCharmanderIntroduction) {
            if (!finishedFadingPokemon) {
                charmanderAnimation.render(batch);
            }
            if (!drawDroppingPokeballAnimation) {
                charmanderDexText.get(currentTextBox).render(batch);
            }
            if (crySwitch) {
                crySwitch = false;
                charmanderCry.play();
            }
        }
        if (displaySquirtleIntroduction) {
            if (!finishedFadingPokemon) {
                squirtleAnimation.render(batch);
            }
            if (!drawDroppingPokeballAnimation) {
                squirtleDexText.get(currentTextBox).render(batch);
            }
            if (crySwitch) {
                crySwitch = false;
                squirtleCry.play();
            }
        }

        //Render the Pokeball that drops down onto the starters.
        if (drawDroppingPokeballAnimation) {
            droppingPokeballAnimation.render(batch);
        }

    }

    /**
     * Update the Introduction State.
     * @param dt The time elapsed.
     */
    @Override
    public void update(double dt) {

        //Check to see if the caught Pokemon sound is playing.
        if (startedCaughtSound) {
            caughtSoundCounter += dt;
            //Wait for the caught sound to finish playing before
            //Going to the next phase and starting the Ivy theme
            //again.
            if (caughtSoundCounter >= caughtSoundDuration) {
                ivyTheme.play();
                obtainedPokemon = true;
                drawDroppingPokeballAnimation = false;
                startedCaughtSound = false;
                displayCharmanderIntroduction = false;
                displayBulbasaurIntroduction = false;
                displaySquirtleIntroduction = false;
            }
        }

        //Update the ivy animation only when the gender response text
        //is not up. (Due to Ivy being on a wink frame at that time)
        if (!genderResponseDialogue) {
            ivyAnimation.update(dt);
        }

        //Update the text boxes based on the dialogue that is open.
        if (this.firstDialogue) {
            tbts.get(currentTextBox).update(dt);
        } else if (genderDialogue) {
            genderText.update(dt);
            if (genderText.finishedUpdating()) {
                //Draw the gender select images when the gender
                //hasn't been selected.
                if (!selectedGender()) {
                    drawGenderOptions = true;
                } else {
                    //Draw the response text for the chosen gender.
                    if (choseMale) {
                        maleResponseText.update(dt);
                        if (maleResponseText.finishedUpdating()) {
                            drawYesNoOptions = true;
                        }
                    } else if (choseFemale) {
                        femaleResponseText.update(dt);
                        if (femaleResponseText.finishedUpdating()) {
                            drawYesNoOptions = true;
                        }
                    }
                }
            }
        } else if (genderResponseDialogue) {
            genderResponseText.update(dt);
        } else if (pokemonSelectDialogue) {
            pokeballSelectText.update(dt);
            if (pokeballSelectText.finishedUpdating()) {
                drawPokeballs = true;
            }
        } else if (displayCharmanderIntroduction) {
            if (startedFadingPokemon) {
                charmanderAnimation.update(dt);
            }
            if (charmanderAnimation.finishedAnimation() && !justFinishedFadingPokemon) {
                finishedFadingPokemon = true;
                justFinishedFadingPokemon = true;
                droppingPokeballAnimation.setInitialFrame();
                caughtPokemonSound.play();
                startedCaughtSound = true;
                caughtPokemonSound.play();
                charmanderAnimation.reset();
                ivyTheme.pause();
            }
            charmanderDexText.get(currentTextBox).update(dt);
            if (currentTextBox == charmanderDexText.size() - 1 &&
                    charmanderDexText.get(currentTextBox).finishedUpdating()) {
                if (!drawDroppingPokeballAnimation) {
                    drawYesNoOptions = true;
                }
            }

        } else if (displayBulbasaurIntroduction) {
            if (startedFadingPokemon) {
                bulbasaurAnimation.update(dt);
            }
            if (bulbasaurAnimation.finishedAnimation() && !justFinishedFadingPokemon) {
                finishedFadingPokemon = true;
                justFinishedFadingPokemon = true;
                droppingPokeballAnimation.setInitialFrame();
                startedCaughtSound = true;
                caughtPokemonSound.play();
                bulbasaurAnimation.reset();
                ivyTheme.pause();
            }
            bulbasaurDexText.get(currentTextBox).update(dt);
            if (currentTextBox == bulbasaurDexText.size() - 1 &&
                    bulbasaurDexText.get(currentTextBox).finishedUpdating()) {
                if (!drawDroppingPokeballAnimation) {
                    drawYesNoOptions = true;
                }
            }
        } else if (displaySquirtleIntroduction) {
            if (startedFadingPokemon) {
                squirtleAnimation.update(dt);
            }
            if (squirtleAnimation.finishedAnimation() && !justFinishedFadingPokemon) {
                finishedFadingPokemon = true;
                justFinishedFadingPokemon = true;
                droppingPokeballAnimation.setInitialFrame();
                startedCaughtSound = true;
                caughtPokemonSound.play();
                squirtleAnimation.reset();
                ivyTheme.pause();
            }
            squirtleDexText.get(currentTextBox).update(dt);
            if (currentTextBox == squirtleDexText.size() - 1 &&
                    squirtleDexText.get(currentTextBox).finishedUpdating()) {
                if (!drawDroppingPokeballAnimation) {
                    drawYesNoOptions = true;
                }
            }
        } else if (obtainedPokemon) {
            congratsText.update(dt);
        }
        //Update the fade out into the new state.
        else if (startedFading) {
            //Fade the volume and the screen into darkness.
            fadingCounter += fadingRate;
            ivyTheme.setVolume(Math.max(0,1 - fadingCounter));
            if (fadingCounter >= 1) {
                //Switch states
                saveToDatabase();
                gsm.addToParty(starter);
                gsm.getGameCallBack().spawnNewGamePokemon();
                gsm.setState(new LoadingState(gsm, LoadingState.POKENAV_MENU));
                gsm.playBgm();
                dispose();
            }
        }

        //Update the dropping ball animation if it is playing.
        if (drawDroppingPokeballAnimation) {
            droppingPokeballAnimation.update(dt);
            if (droppingPokeballAnimation.ended()) {
                if (!justFinishedDroppingPokeball) {
                    justFinishedDroppingPokeball = true;
                    startedFadingPokemon = true;
                    wooshSound.play();
                }

            }
        }

        //Check to see if there was a click.
        if (MyInput.clicked()) {
            //Check clicking on the text box area.
            if (MyInput.getX() >= 0 && MyInput.getX() <= 1080 &&
                    MyInput.getY() >= 1324 && MyInput.getY() <= 1920) {
                //Execute what happens to the text box depending on which
                //one was clicked.
                if (this.firstDialogue) {
                    firstDialogueClickedTextBox();
                } else if (genderDialogue) {
                    genderDialogueClickedTextBox();
                } else if (genderResponseDialogue) {
                    genderResponseDialogueClickedTextBox();
                } else if (pokemonSelectDialogue) {
                    pokemonSelectDialogueClickedTextBox();
                } else if (displayCharmanderIntroduction) {
                    charmanderClicked();
                } else if (displayBulbasaurIntroduction) {
                    bulbasaurClicked();
                } else if (displaySquirtleIntroduction) {
                    squirtleClicked();
                } else if (obtainedPokemon) {
                    obtainedPokemonClicked();
                }
            }
        }
    }

    private void saveToDatabase() {
        JSONParser jp = new JSONParser();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("uid", Integer.toString(gsm.getPlayer().getId())));
        params.add(new BasicNameValuePair("gender", "" + gender));

        params.add(new BasicNameValuePair("pid", Integer.toString(starter.getId())));
        params.add(new BasicNameValuePair("level", Integer.toString(starter.getLevel())));
        params.add(new BasicNameValuePair("health", Integer.toString(starter.getCurrentHealth())));
        params.add(new BasicNameValuePair("currentExp", Integer.toString((int)starter.getDisplayedExp())));
        params.add(new BasicNameValuePair("nature", Integer.toString(starter.getNature().getValue())));
        params.add(new BasicNameValuePair("ability", Integer.toString(starter.getAbilityPosition())));
        params.add(new BasicNameValuePair("partyPosition", "0")); //first slot in party
        params.add(new BasicNameValuePair("pokemonGender", "" + starter.getGender()));
        params.add(new BasicNameValuePair("status", "0")); //0 is status free
        params.add(new BasicNameValuePair("iv_hp", Integer.toString(starter.getHealthIV())));
        params.add(new BasicNameValuePair("iv_atk", Integer.toString(starter.getAttackIV())));
        params.add(new BasicNameValuePair("iv_def", Integer.toString(starter.getDefenseIV())));
        params.add(new BasicNameValuePair("iv_spatk", Integer.toString(starter.getSpAttackIV())));
        params.add(new BasicNameValuePair("iv_spdef", Integer.toString(starter.getSpDefenseIV())));
        params.add(new BasicNameValuePair("iv_spd", Integer.toString(starter.getSpeedIV())));
        params.add(new BasicNameValuePair("ev_hp", "0"));
        params.add(new BasicNameValuePair("ev_atk", "0"));
        params.add(new BasicNameValuePair("ev_def", "0"));
        params.add(new BasicNameValuePair("ev_spatk", "0"));
        params.add(new BasicNameValuePair("ev_spdef", "0"));
        params.add(new BasicNameValuePair("ev_spd", "0"));
        params.add(new BasicNameValuePair("skill1_id", Integer.toString(starter.getSkills().get(0).getId())));
        params.add(new BasicNameValuePair("skill1_pp", Integer.toString(starter.getSkills().get(0).getCurrentPP())));
        if (starter.getSkills().size() > 1) {
            params.add(new BasicNameValuePair("skill2_id", Integer.toString(starter.getSkills().get(1).getId())));
            params.add(new BasicNameValuePair("skill2_pp", Integer.toString(starter.getSkills().get(1).getCurrentPP())));
            if (starter.getSkills().size() > 2) {
                params.add(new BasicNameValuePair("skill3_id", Integer.toString(starter.getSkills().get(2).getId())));
                params.add(new BasicNameValuePair("skill3_pp", Integer.toString(starter.getSkills().get(2).getCurrentPP())));
                if (starter.getSkills().size() > 3) {
                    params.add(new BasicNameValuePair("skill4_id", Integer.toString(starter.getSkills().get(3).getId())));
                    params.add(new BasicNameValuePair("skill4_pp", Integer.toString(starter.getSkills().get(3).getCurrentPP())));
                }
            }
        }
        JSONObject obj = jp.makeHttpRequest("http://kelsiegr.com/pokemononline/finishTutorial.php", "POST", params);
    }

    /**
     * Dispose all of the textures and sounds that were used
     * for the Introduction State.
     */
    @Override
    public void dispose() {
        textBox.dispose();
        textBoxHeader.dispose();
        ivyTheme.stop();

        shapeRenderer.dispose();
        for (int i = 0; i < tbts.size(); i++) {
            tbts.get(i).dispose();
        }
        gsm.getLoader().unload("nature_background.png");
        gsm.getLoader().unload("genderOptions.png");
        gsm.getLoader().unload("yesNoOptions.png");
        gsm.getLoader().unload("starterPokeballs.png");
        gsm.getLoader().unload("professor_ivy3.png");
        gsm.getLoader().unload("textbox.png");
        gsm.getLoader().unload("textbox_header.png");
        gsm.getLoader().unload("professor_ivy.png");
        gsm.getLoader().unload("professor_ivy2.png");
        gsm.getLoader().unload("starterImages/charmander.png");
        gsm.getLoader().unload("starterImages/charmander02.png");
        gsm.getLoader().unload("starterImages/charmander03.png");
        gsm.getLoader().unload("starterImages/charmander04.png");
        gsm.getLoader().unload("starterImages/charmander05.png");
        gsm.getLoader().unload("starterImages/bulbasaur.png");
        gsm.getLoader().unload("starterImages/bulbasaur02.png");
        gsm.getLoader().unload("starterImages/bulbasaur03.png");
        gsm.getLoader().unload("starterImages/bulbasaur04.png");
        gsm.getLoader().unload("starterImages/bulbasaur05.png");
        gsm.getLoader().unload("starterImages/squirtle.png");
        gsm.getLoader().unload("starterImages/squirtle02.png");
        gsm.getLoader().unload("starterImages/squirtle03.png");
        gsm.getLoader().unload("starterImages/squirtle04.png");
        gsm.getLoader().unload("starterImages/squirtle05.png");
        gsm.getLoader().unload("closedPokeball.png");
        gsm.getLoader().unload("openPokeball.png");

        gsm.getLoader().unload("sounds/cry/001.wav");
        gsm.getLoader().unload("sounds/cry/004.wav");
        gsm.getLoader().unload("sounds/cry/007.wav");
        gsm.getLoader().unload("sounds/throwPokeball.wav");
        gsm.getLoader().unload("sounds/woosh.wav");
        gsm.getLoader().unload("sounds/caughtPokemon.wav");

        gsm.getLoader().unload("bgm/professorIvyTheme.mp3");
    }
}
