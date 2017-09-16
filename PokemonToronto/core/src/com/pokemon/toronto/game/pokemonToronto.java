package com.pokemon.toronto.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pokemon.toronto.game.com.pokemon.toronto.factory.PokemonLookup;
import com.pokemon.toronto.game.com.pokemon.toronto.factory.WildPokemonCreator;
import com.pokemon.toronto.game.com.pokemon.toronto.gamestate.GameStateManager;
import com.pokemon.toronto.game.com.pokemon.toronto.input.InputHandler;
import com.pokemon.toronto.game.com.pokemon.toronto.input.MyInput;
import com.pokemon.toronto.game.com.pokemon.toronto.location.Place;
import com.pokemon.toronto.game.com.pokemon.toronto.trainer.Trainer;
import com.pokemon.toronto.game.com.pokemon.toronto.trainer.trivial.TrainerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pokemonToronto extends ApplicationAdapter {

	//Instance Variables
	private SpriteBatch batch;
	private Texture img;
	private GameStateManager gsm;
	private OrthographicCamera camera;
	private MyGameCallBack gameCallBack;

		/*stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		Skin skin = new Skin(Gdx.files.internal("uiskin.json"), new TextureAtlas(Gdx.files.internal("uiskin.atlas")));
		textField = new TextField(Integer.toString(Gdx.graphics.getWidth()), skin);
		textField.setPosition(200, 200);
		textField.setSize(300, 40);
		//stage.addActor(textField);
		*/

	/**
	 * A callback interface that links the pokemonToronto class to the AndroidLauncher
	 * activity. This interface is how the Android's GPS gives results to the game.
	 */
	public interface MyGameCallBack {
		public void startMapActivity(double[] pokemonLatitude, double[] pokemonLongitude, String[] pokemonIcon, double[] trainerLatitude,
									 double[] trainerLongitude, String[] trainerIcon);
		public void startPokemonMapActivity(double pokemonLatitude, double pokemonLongitude, String pokemonIcon, int distance);
		public void spawnNewGamePokemon();
	}

	/**
	 * Create the game. This is the beginning of the game when it gets
	 * started up.
	 */
	@Override
	public void create () {
		initEssentials();
		initGameStateManager();
	}

	/**
	 * Initialize the game's essential components:
	 * - Camera
	 * - SpriteBatch
	 * - Input
	 */
	private  void initEssentials() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1080, 1920);
		batch = new SpriteBatch();
		Gdx.input.setInputProcessor(new InputHandler());
	}

	/**
	 * Initialize the Game State Manager
	 * - Set the Initial State
	 * - Let the GSM have access to the callback so all states
	 *   have access
	 *  ### Spawning pokemon on boot as a test ###
	 */
	private void initGameStateManager() {
		gsm = new GameStateManager();
		//gsm.setNotificationSound();
		gsm.setInitialState();
		gsm.setGameCallBack(gameCallBack);
		//gsm.getGameCallBack().spawnNewGamePokemon();
	}

	/**
	 * Return the Game State Manager so the AndroidLauncher activity
	 * can have access.
	 * @return The Game State Manager
	 */
	public GameStateManager getGsm() {
		return gsm;
	}

	/**
	 * Set the Latitude coordinate of the player
	 * @param lat The latitude coordinate for the player
	 */
	public void setLatitude(double lat) {
		gsm.setLatitude(lat);
	}

	/**
	 * Set the Longitude coordinate of the player
	 * @param longitude The longitude coordinate for the player.
	 */
	public void setLongitude(double longitude) {
		gsm.setLongitude(longitude);
	}

	/**
	 * Add a wild pokemon to the player's list of wild pokemon.
	 * This method is relays the information from the WildPokemonReceiver
	 * @param latitude The latitude position of the player
	 * @param longitude The longitude position of the player
	 * @param country The country the player is in
	 * @param state The state or province the player is in
	 * @param city The city the player is in.
	 */
	public void wildPokemonNotification(double latitude, double longitude, String country, String state,
										String city) {
		gsm.addNewWildPokemon(longitude, latitude, country, state, city);
	}


	/**
	 *
	 * @param name
	 * @param latitude
	 * @param longitude
	 * @param types
	 */
	public void createPlace(String name, double latitude, double longitude, List<Integer> types) {
		Place p = new Place(name, latitude, longitude, types);
		if (p.hasPokemon()) {
			WildPokemonCreator wpc = new WildPokemonCreator();
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			Date date = new Date();
			String text = dateFormat.format(date);
			for (int i = 0; i < 3; i++) {
				int pokeID = p.getPokemon();
				Gdx.app.log("MyPlace", "Place: " + name + ", PokeID: " + pokeID);
				if (pokeID != -1) {
					double[] latlng = PokemonLookup.getRandomLocation(gsm.getLatitude(), gsm.getLongitude(), 200);
					gsm.getNearbyPokemon().add(wpc.createPokemon(pokeID, latlng[0],
							latlng[1], date, text));
				}
			}
		}
	}

	/**
	 * Return whether or not the player is logged in.
	 * @return Whether or not the Player is logged in.
	 */
	public boolean isLoggedIn() {
		if (gsm != null) {
			return gsm.isLoggedIn();
		} else {
			return false;
		}
	}

	public void spawnTrainer(List<Place> places) {
		TrainerFactory tf = new TrainerFactory();
		if (places.size() != 0) {
			Set<Integer> trainers = new HashSet<Integer>();
			//Fill the set of possible trainers that could be encountered
			//from the nearby places.
			for (Place place: places) {
				for (Integer i: place.getTrainers()) {
					trainers.add(i);
				}
			}
			List<Integer> setToList = new ArrayList<Integer>(trainers);
			if (setToList.size() != 0) {
				int rand = (int)Math.floor(Math.random() * setToList.size());
				Gdx.app.log("SpawnedTrainer", "" + setToList.get(rand));
				gsm.getNearbyTrainers().add(tf.getTrainer(setToList.get(rand), 0.5, gsm.getLatitude(), gsm.getLongitude()));
			} else {
				//Spawn default trainers
				gsm.getNearbyTrainers().add(tf.getTrainer(0.5, gsm.getLatitude(), gsm.getLongitude()));
			}
		} else {
			//Spawn default trainers
			gsm.getNearbyTrainers().add(tf.getTrainer(0.5, gsm.getLatitude(), gsm.getLongitude()));
		}
	}


	/**
	 * The method that allows this class to receive a reference
	 * to the AndroidLauncher activity. It sets itself as the
	 * callback.
	 * @param callBack The AndroidLauncher activity
	 */
	public void setGameCallBack(MyGameCallBack callBack) {
		this.gameCallBack = callBack;

	}

	/**
	 * Render the game!
	 */
	@Override
	public void render () {
		double dt = Gdx.graphics.getDeltaTime(); //Get the time passed
		gsm.update(dt); //Update the current game state.
		MyInput.update(); //Update the input.

		//Clear the screen.
		Gdx.gl.glClearColor(0, 0,0,1); // set color
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT ); //clear buffer
		batch.setProjectionMatrix(camera.combined); //Setup the camera

		//Render the game to the SpriteBatch
		batch.begin();
		gsm.render(batch);
		batch.end();
		gsm.drawStage();

		//End the rendering.
		Gdx.gl.glDisable(GL20.GL_BLEND);
	}

	/**
	 * Dispose the SpriteBatch.
	 */
	@Override
	public void dispose () {
		batch.dispose();
		gsm.dispose(); //fix
	}

}
