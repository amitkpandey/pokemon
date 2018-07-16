package com.pokemon.toronto.game.com.pokemon.toronto.pokedex;

import java.util.ArrayList;
import java.util.List;

import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.hoenn.*;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.johto.*;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kalos.Meowstic;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Arbok;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Beedrill;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Blastoise;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Bulbasaur;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Butterfree;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Caterpie;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Charizard;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Charmander;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Charmeleon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Clefable;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Clefairy;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Diglett;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Ekans;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Fearow;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Gloom;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Golbat;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Ivysaur;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Jigglypuff;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Kakuna;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Metapod;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Nidoking;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Nidoqueen;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.NidoranF;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.NidoranM;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Nidorina;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Nidorino;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Ninetales;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Oddish;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Paras;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Parasect;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Pidgeot;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Pidgeotto;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Pidgey;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Pikachu;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Raichu;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Raticate;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Rattata;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Sandshrew;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Sandslash;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Spearow;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Squirtle;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Venomoth;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Venonat;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Venusaur;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Vileplume;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Vulpix;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Wartortle;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Weedle;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Wigglytuff;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.one_to_fifty.Zubat;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Abra;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Alakazam;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Arcanine;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Bellsprout;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Cloyster;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Dewgong;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Dodrio;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Doduo;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Drowzee;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Dugtrio;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Farfetchd;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Gastly;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Gengar;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Geodude;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Golduck;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Golem;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Graveler;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Grimer;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Growlithe;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Haunter;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Hypno;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Kadabra;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Kingler;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Krabby;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Machamp;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Machoke;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Machop;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Magnemite;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Magneton;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Mankey;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Meowth;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Muk;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Onix;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Persian;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Poliwag;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Poliwhirl;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Poliwrath;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Ponyta;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Primeape;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Psyduck;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Rapidash;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Seel;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Shellder;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Slowbro;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Slowpoke;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Tentacool;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Tentacruel;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Victreebel;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Voltorb;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_2.Weepinbell;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Aerodactyl;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Articuno;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Chansey;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Cubone;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Ditto;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Dragonair;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Dragonite;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Dratini;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Eevee;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Electabuzz;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Electrode;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Exeggcute;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Exeggutor;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Flareon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Goldeen;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Gyarados;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Hitmonchan;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Hitmonlee;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Horsea;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Jolteon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Jynx;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Kabuto;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Kabutops;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Kangaskhan;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Koffing;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Lapras;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Lickitung;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Magikarp;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Magmar;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Marowak;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Mew;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Mewtwo;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Moltres;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.MrMime;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Omanyte;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Omastar;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Pinsir;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Porygon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Rhydon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Rhyhorn;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Scyther;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Seadra;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Seaking;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Snorlax;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Starmie;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Staryu;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Tangela;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Tauros;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Vaporeon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Weezing;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.kanto.part_3.Zapdos;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.sinnoh.Gastrodon;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.sinnoh.Lickilicky;
import com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.sinnoh.Yanmega;
import com.pokemon.toronto.game.com.pokemon.toronto.pokedex.PokedexEntry.*;

import static com.pokemon.toronto.game.com.pokemon.toronto.Pokemon.attributes.PokemonId.MAGIKARP;

/**
 * Created by gregorykelsie on 2018-06-04.
 */

public class Pokedex {
    private List<PokedexEntry> currentDex;
    private List<PokedexEntry> kantoDex;
    public Pokedex() {
        initKantoDex();
        currentDex = kantoDex;
    }

    private void initKantoDex() {
        kantoDex = new ArrayList<PokedexEntry>();
        kantoDex.add(new PokedexEntry(new Bulbasaur()));
        kantoDex.add(new PokedexEntry(new Ivysaur()));
        kantoDex.add(new PokedexEntry(new Venusaur()));
        kantoDex.add(new PokedexEntry(new Charmander()));
        kantoDex.add(new PokedexEntry(new Charmeleon()));
        kantoDex.add(new PokedexEntry(new Charizard()));
        kantoDex.add(new PokedexEntry(new Squirtle()));
        kantoDex.add(new PokedexEntry(new Wartortle()));
        kantoDex.add(new PokedexEntry(new Blastoise()));
        kantoDex.add(new PokedexEntry(new Caterpie()));
        kantoDex.add(new PokedexEntry(new Metapod()));
        kantoDex.add(new PokedexEntry(new Butterfree()));
        kantoDex.add(new PokedexEntry(new Weedle()));
        kantoDex.add(new PokedexEntry(new Kakuna()));
        kantoDex.add(new PokedexEntry(new Beedrill()));
        kantoDex.add(new PokedexEntry(new Pidgey()));
        kantoDex.add(new PokedexEntry(new Pidgeotto()));
        kantoDex.add(new PokedexEntry(new Pidgeot()));
        kantoDex.add(new PokedexEntry(new Rattata()));
        kantoDex.add(new PokedexEntry(new Raticate()));
        kantoDex.add(new PokedexEntry(new Spearow()));
        kantoDex.add(new PokedexEntry(new Fearow()));
        kantoDex.add(new PokedexEntry(new Ekans()));
        kantoDex.add(new PokedexEntry(new Arbok()));
        kantoDex.add(new PokedexEntry(new Pikachu()));
        kantoDex.add(new PokedexEntry(new Raichu()));
        kantoDex.add(new PokedexEntry(new Sandshrew()));
        kantoDex.add(new PokedexEntry(new Sandslash()));
        kantoDex.add(new PokedexEntry(new NidoranF()));
        kantoDex.add(new PokedexEntry(new Nidorina()));
        kantoDex.add(new PokedexEntry(new Nidoqueen()));
        kantoDex.add(new PokedexEntry(new NidoranM()));
        kantoDex.add(new PokedexEntry(new Nidorino()));
        kantoDex.add(new PokedexEntry(new Nidoking()));
        kantoDex.add(new PokedexEntry(new Clefairy()));
        kantoDex.add(new PokedexEntry(new Clefable()));
        kantoDex.add(new PokedexEntry(new Vulpix()));
        kantoDex.add(new PokedexEntry(new Ninetales()));
        kantoDex.add(new PokedexEntry(new Jigglypuff()));
        kantoDex.add(new PokedexEntry(new Wigglytuff()));
        kantoDex.add(new PokedexEntry(new Zubat()));
        kantoDex.add(new PokedexEntry(new Golbat()));
        kantoDex.add(new PokedexEntry(new Oddish()));
        kantoDex.add(new PokedexEntry(new Gloom()));
        kantoDex.add(new PokedexEntry(new Vileplume()));
        kantoDex.add(new PokedexEntry(new Paras()));
        kantoDex.add(new PokedexEntry(new Parasect()));
        kantoDex.add(new PokedexEntry(new Venonat()));
        kantoDex.add(new PokedexEntry(new Venomoth()));
        kantoDex.add(new PokedexEntry(new Diglett()));
        kantoDex.add(new PokedexEntry(new Dugtrio()));
        kantoDex.add(new PokedexEntry(new Meowth()));
        kantoDex.add(new PokedexEntry(new Persian()));
        kantoDex.add(new PokedexEntry(new Psyduck()));
        kantoDex.add(new PokedexEntry(new Golduck()));
        kantoDex.add(new PokedexEntry(new Mankey()));
        kantoDex.add(new PokedexEntry(new Primeape()));
        kantoDex.add(new PokedexEntry(new Growlithe()));
        kantoDex.add(new PokedexEntry(new Arcanine()));
        kantoDex.add(new PokedexEntry(new Poliwag()));
        kantoDex.add(new PokedexEntry(new Poliwhirl()));
        kantoDex.add(new PokedexEntry(new Poliwrath()));
        kantoDex.add(new PokedexEntry(new Abra()));
        kantoDex.add(new PokedexEntry(new Kadabra()));
        kantoDex.add(new PokedexEntry(new Alakazam()));
        kantoDex.add(new PokedexEntry(new Machop()));
        kantoDex.add(new PokedexEntry(new Machoke()));
        kantoDex.add(new PokedexEntry(new Machamp()));
        kantoDex.add(new PokedexEntry(new Bellsprout()));
        kantoDex.add(new PokedexEntry(new Weepinbell()));
        kantoDex.add(new PokedexEntry(new Victreebel()));
        kantoDex.add(new PokedexEntry(new Tentacool()));
        kantoDex.add(new PokedexEntry(new Tentacruel()));
        kantoDex.add(new PokedexEntry(new Geodude()));
        kantoDex.add(new PokedexEntry(new Graveler()));
        kantoDex.add(new PokedexEntry(new Golem()));
        kantoDex.add(new PokedexEntry(new Ponyta()));
        kantoDex.add(new PokedexEntry(new Rapidash()));
        kantoDex.add(new PokedexEntry(new Slowpoke()));
        kantoDex.add(new PokedexEntry(new Slowbro()));
        kantoDex.add(new PokedexEntry(new Magnemite()));
        kantoDex.add(new PokedexEntry(new Magneton()));
        kantoDex.add(new PokedexEntry(new Farfetchd()));
        kantoDex.add(new PokedexEntry(new Doduo()));
        kantoDex.add(new PokedexEntry(new Dodrio()));
        kantoDex.add(new PokedexEntry(new Seel()));
        kantoDex.add(new PokedexEntry(new Dewgong()));
        kantoDex.add(new PokedexEntry(new Grimer()));
        kantoDex.add(new PokedexEntry(new Muk()));
        kantoDex.add(new PokedexEntry(new Shellder()));
        kantoDex.add(new PokedexEntry(new Cloyster()));
        kantoDex.add(new PokedexEntry(new Gastly()));
        kantoDex.add(new PokedexEntry(new Haunter()));
        kantoDex.add(new PokedexEntry(new Gengar()));
        kantoDex.add(new PokedexEntry(new Onix()));
        kantoDex.add(new PokedexEntry(new Drowzee()));
        kantoDex.add(new PokedexEntry(new Hypno()));
        kantoDex.add(new PokedexEntry(new Krabby()));
        kantoDex.add(new PokedexEntry(new Kingler()));
        kantoDex.add(new PokedexEntry(new Voltorb()));
        kantoDex.add(new PokedexEntry(new Electrode()));
        kantoDex.add(new PokedexEntry(new Exeggcute()));
        kantoDex.add(new PokedexEntry(new Exeggutor()));
        kantoDex.add(new PokedexEntry(new Cubone()));
        kantoDex.add(new PokedexEntry(new Marowak()));
        kantoDex.add(new PokedexEntry(new Hitmonlee()));
        kantoDex.add(new PokedexEntry(new Hitmonchan()));
        kantoDex.add(new PokedexEntry(new Lickitung()));
        kantoDex.add(new PokedexEntry(new Koffing()));
        kantoDex.add(new PokedexEntry(new Weezing()));
        kantoDex.add(new PokedexEntry(new Rhyhorn()));
        kantoDex.add(new PokedexEntry(new Rhydon()));
        kantoDex.add(new PokedexEntry(new Chansey()));
        kantoDex.add(new PokedexEntry(new Tangela()));
        kantoDex.add(new PokedexEntry(new Kangaskhan()));
        kantoDex.add(new PokedexEntry(new Horsea()));
        kantoDex.add(new PokedexEntry(new Seadra()));
        kantoDex.add(new PokedexEntry(new Goldeen()));
        kantoDex.add(new PokedexEntry(new Seaking()));
        kantoDex.add(new PokedexEntry(new Staryu()));
        kantoDex.add(new PokedexEntry(new Starmie()));
        kantoDex.add(new PokedexEntry(new MrMime()));
        kantoDex.add(new PokedexEntry(new Scyther()));
        kantoDex.add(new PokedexEntry(new Jynx()));
        kantoDex.add(new PokedexEntry(new Electabuzz()));
        kantoDex.add(new PokedexEntry(new Magmar()));
        kantoDex.add(new PokedexEntry(new Pinsir()));
        kantoDex.add(new PokedexEntry(new Tauros()));
        kantoDex.add(new PokedexEntry(new Magikarp()));
        kantoDex.add(new PokedexEntry(new Gyarados()));
        kantoDex.add(new PokedexEntry(new Lapras()));
        kantoDex.add(new PokedexEntry(new Ditto()));
        kantoDex.add(new PokedexEntry(new Eevee()));
        kantoDex.add(new PokedexEntry(new Vaporeon()));
        kantoDex.add(new PokedexEntry(new Jolteon()));
        kantoDex.add(new PokedexEntry(new Flareon()));
        kantoDex.add(new PokedexEntry(new Porygon()));
        kantoDex.add(new PokedexEntry(new Omanyte()));
        kantoDex.add(new PokedexEntry(new Omastar()));
        kantoDex.add(new PokedexEntry(new Kabuto()));
        kantoDex.add(new PokedexEntry(new Kabutops()));
        kantoDex.add(new PokedexEntry(new Aerodactyl()));
        kantoDex.add(new PokedexEntry(new Snorlax()));
        kantoDex.add(new PokedexEntry(new Articuno()));
        kantoDex.add(new PokedexEntry(new Zapdos()));
        kantoDex.add(new PokedexEntry(new Moltres()));
        kantoDex.add(new PokedexEntry(new Dratini()));
        kantoDex.add(new PokedexEntry(new Dragonair()));
        kantoDex.add(new PokedexEntry(new Dragonite()));
        kantoDex.add(new PokedexEntry(new Mewtwo()));
        kantoDex.add(new PokedexEntry(new Mew()));
        //JOHTO
        kantoDex.add(new PokedexEntry(new Chikorita()));
        kantoDex.add(new PokedexEntry(new Bayleef()));
        kantoDex.add(new PokedexEntry(new Meganium()));
        kantoDex.add(new PokedexEntry(new Cyndaquil()));
        kantoDex.add(new PokedexEntry(new Quilava()));
        kantoDex.add(new PokedexEntry(new Typhlosion()));
        kantoDex.add(new PokedexEntry(new Totodile()));
        kantoDex.add(new PokedexEntry(new Croconaw()));
        kantoDex.add(new PokedexEntry(new Feraligatr()));
        kantoDex.add(new PokedexEntry(new Sentret()));
        kantoDex.add(new PokedexEntry(new Furret()));
        kantoDex.add(new PokedexEntry(new Hoothoot()));
        kantoDex.add(new PokedexEntry(new Noctowl()));
        kantoDex.add(new PokedexEntry(new Ledyba()));
        kantoDex.add(new PokedexEntry(new Ledian()));
        kantoDex.add(new PokedexEntry(new Spinarak()));
        kantoDex.add(new PokedexEntry(new Ariados()));
        kantoDex.add(new PokedexEntry(new Crobat()));
        kantoDex.add(new PokedexEntry(new Chinchou()));
        kantoDex.add(new PokedexEntry(new Lanturn()));
        kantoDex.add(new PokedexEntry(new Pichu()));
        kantoDex.add(new PokedexEntry(new Cleffa()));
        kantoDex.add(new PokedexEntry(new Igglybuff()));
        kantoDex.add(new PokedexEntry(new Togepi()));
        kantoDex.add(new PokedexEntry(new Togetic()));
        kantoDex.add(new PokedexEntry(new Natu()));
        kantoDex.add(new PokedexEntry(new Xatu()));
        kantoDex.add(new PokedexEntry(new Mareep()));
        kantoDex.add(new PokedexEntry(new Flaffy()));
        kantoDex.add(new PokedexEntry(new Ampharos()));
        kantoDex.add(new PokedexEntry(new Bellossom()));
        kantoDex.add(new PokedexEntry(new Marill()));
        kantoDex.add(new PokedexEntry(new Azumarill()));
        kantoDex.add(new PokedexEntry(new Sudowoodo()));
        kantoDex.add(new PokedexEntry(new Politoed()));
        kantoDex.add(new PokedexEntry(new Hoppip()));
        kantoDex.add(new PokedexEntry(new Skiploom()));
        kantoDex.add(new PokedexEntry(new Jumpluff()));
        kantoDex.add(new PokedexEntry(new Aipom()));
        kantoDex.add(new PokedexEntry(new Sunkern()));
        kantoDex.add(new PokedexEntry(new Sunflora()));
        kantoDex.add(new PokedexEntry(new Yanma()));
        kantoDex.add(new PokedexEntry(new Wooper()));
        kantoDex.add(new PokedexEntry(new Quagsire()));
        kantoDex.add(new PokedexEntry(new Espeon()));
        kantoDex.add(new PokedexEntry(new Umbreon()));
        kantoDex.add(new PokedexEntry(new Murkrow()));
        kantoDex.add(new PokedexEntry(new Slowking()));
        kantoDex.add(new PokedexEntry(new Misdreavus()));
        kantoDex.add(new PokedexEntry(new Unown()));
        kantoDex.add(new PokedexEntry(new Wobbuffet()));
        kantoDex.add(new PokedexEntry(new Girafarig()));
        kantoDex.add(new PokedexEntry(new Pineco()));
        kantoDex.add(new PokedexEntry(new Forretress()));
        kantoDex.add(new PokedexEntry(new Dunsparce()));
        kantoDex.add(new PokedexEntry(new Gligar()));
        kantoDex.add(new PokedexEntry(new Steelix()));
        kantoDex.add(new PokedexEntry(new Snubbull()));
        kantoDex.add(new PokedexEntry(new Granbull()));
        kantoDex.add(new PokedexEntry(new Qwilfish()));
        kantoDex.add(new PokedexEntry(new Scizor()));
        kantoDex.add(new PokedexEntry(new Shuckle()));
        kantoDex.add(new PokedexEntry(new Heracross()));
        kantoDex.add(new PokedexEntry(new Sneasel()));
        kantoDex.add(new PokedexEntry(new Teddiursa()));
        kantoDex.add(new PokedexEntry(new Ursaring()));
        kantoDex.add(new PokedexEntry(new Slugma()));
        kantoDex.add(new PokedexEntry(new Magcargo()));
        kantoDex.add(new PokedexEntry(new Swinub()));
        kantoDex.add(new PokedexEntry(new Piloswine()));
        kantoDex.add(new PokedexEntry(new Corsola()));
        kantoDex.add(new PokedexEntry(new Remoraid()));
        kantoDex.add(new PokedexEntry(new Octillery()));
        kantoDex.add(new PokedexEntry(new Delibird()));
        kantoDex.add(new PokedexEntry(new Mantine()));
        kantoDex.add(new PokedexEntry(new Skarmory()));
        kantoDex.add(new PokedexEntry(new Houndour()));
        kantoDex.add(new PokedexEntry(new Houndoom()));
        kantoDex.add(new PokedexEntry(new Kingdra()));
        kantoDex.add(new PokedexEntry(new Phanpy()));
        kantoDex.add(new PokedexEntry(new Donphan()));
        kantoDex.add(new PokedexEntry(new Porygon2()));
        kantoDex.add(new PokedexEntry(new Stantler()));
        kantoDex.add(new PokedexEntry(new Smeargle()));
        kantoDex.add(new PokedexEntry(new Tyrogue()));
        kantoDex.add(new PokedexEntry(new Hitmontop()));
        kantoDex.add(new PokedexEntry(new Smoochum()));
        kantoDex.add(new PokedexEntry(new Elekid()));
        kantoDex.add(new PokedexEntry(new Magby()));
        kantoDex.add(new PokedexEntry(new Miltank()));
        kantoDex.add(new PokedexEntry(new Blissey()));
        kantoDex.add(new PokedexEntry(new Raikou()));
        kantoDex.add(new PokedexEntry(new Entei()));
        kantoDex.add(new PokedexEntry(new Suicune()));
        kantoDex.add(new PokedexEntry(new Larvitar()));
        kantoDex.add(new PokedexEntry(new Pupitar()));
        kantoDex.add(new PokedexEntry(new Tyranitar()));
        kantoDex.add(new PokedexEntry(new Lugia()));
        kantoDex.add(new PokedexEntry(new HoOh()));
        kantoDex.add(new PokedexEntry(new Celebi()));

        kantoDex.add(new PokedexEntry(new Treecko()));
        kantoDex.add(new PokedexEntry(new Grovyle()));
        kantoDex.add(new PokedexEntry(new Sceptile()));
        kantoDex.add(new PokedexEntry(new Torchic()));
        kantoDex.add(new PokedexEntry(new Combusken()));
        kantoDex.add(new PokedexEntry(new Blaziken()));
        kantoDex.add(new PokedexEntry(new Mudkip()));
        kantoDex.add(new PokedexEntry(new Marshtomp()));
        kantoDex.add(new PokedexEntry(new Swampert()));
        kantoDex.add(new PokedexEntry(new Poochyena()));
        kantoDex.add(new PokedexEntry(new Mightyena()));
        kantoDex.add(new PokedexEntry(new Zigzagoon()));
        kantoDex.add(new PokedexEntry(new Linoone()));
        kantoDex.add(new PokedexEntry(new Wurmple()));
        kantoDex.add(new PokedexEntry(new Silcoon()));
        kantoDex.add(new PokedexEntry(new Beautifly()));
        kantoDex.add(new PokedexEntry(new Cascoon()));
        kantoDex.add(new PokedexEntry(new Dustox()));
        kantoDex.add(new PokedexEntry(new Lotad()));
        kantoDex.add(new PokedexEntry(new Lombre()));
        kantoDex.add(new PokedexEntry(new Ludicolo()));
        kantoDex.add(new PokedexEntry(new Seedot()));
        kantoDex.add(new PokedexEntry(new Nuzleaf()));
        kantoDex.add(new PokedexEntry(new Shiftry()));
        kantoDex.add(new PokedexEntry(new Taillow()));
        kantoDex.add(new PokedexEntry(new Swellow()));
        kantoDex.add(new PokedexEntry(new Wingull()));
        kantoDex.add(new PokedexEntry(new Pelipper()));
        kantoDex.add(new PokedexEntry(new Ralts()));
        kantoDex.add(new PokedexEntry(new Kirlia()));
        kantoDex.add(new PokedexEntry(new Gardevoir()));
        kantoDex.add(new PokedexEntry(new Surskit()));
        kantoDex.add(new PokedexEntry(new Masquerain()));
        kantoDex.add(new PokedexEntry(new Shroomish()));
        kantoDex.add(new PokedexEntry(new Breloom()));
        kantoDex.add(new PokedexEntry(new Slakoth()));
        kantoDex.add(new PokedexEntry(new Vigoroth()));
        kantoDex.add(new PokedexEntry(new Slaking()));
        kantoDex.add(new PokedexEntry(new Nincada()));
        kantoDex.add(new PokedexEntry(new Ninjask()));
        kantoDex.add(new PokedexEntry(new Shedinja()));
        kantoDex.add(new PokedexEntry(new Whismur()));
        kantoDex.add(new PokedexEntry(new Loudred()));
        kantoDex.add(new PokedexEntry(new Exploud()));
        kantoDex.add(new PokedexEntry(new Makuhita()));
        kantoDex.add(new PokedexEntry(new Hariyama()));
        kantoDex.add(new PokedexEntry(new Azurill()));
        kantoDex.add(new PokedexEntry(new Nosepass()));
        kantoDex.add(new PokedexEntry(new Skitty()));
        kantoDex.add(new PokedexEntry(new Delcatty()));
        kantoDex.add(new PokedexEntry(new Sableye()));
        kantoDex.add(new PokedexEntry(new Mawile()));
        kantoDex.add(new PokedexEntry(new Aron()));
        kantoDex.add(new PokedexEntry(new Lairon()));
        kantoDex.add(new PokedexEntry(new Aggron()));
        kantoDex.add(new PokedexEntry(new Meditite()));
        kantoDex.add(new PokedexEntry(new Medicham()));
        kantoDex.add(new PokedexEntry(new Electrike()));
        kantoDex.add(new PokedexEntry(new Manectric()));
        kantoDex.add(new PokedexEntry(new Plusle()));
        kantoDex.add(new PokedexEntry(new Minun()));
        kantoDex.add(new PokedexEntry(new Volbeat()));
        kantoDex.add(new PokedexEntry(new Illumise()));
        kantoDex.add(new PokedexEntry(new Roselia()));
        kantoDex.add(new PokedexEntry(new Gulpin()));
        kantoDex.add(new PokedexEntry(new Swalot()));
        kantoDex.add(new PokedexEntry(new Carvanha()));
        kantoDex.add(new PokedexEntry(new Sharpedo()));
        kantoDex.add(new PokedexEntry(new Wailmer()));
        kantoDex.add(new PokedexEntry(new Wailord()));
        kantoDex.add(new PokedexEntry(new Numel()));
        kantoDex.add(new PokedexEntry(new Camerupt()));
        kantoDex.add(new PokedexEntry(new Torkoal()));
        kantoDex.add(new PokedexEntry(new Spoink()));
        kantoDex.add(new PokedexEntry(new Grumpig()));
        kantoDex.add(new PokedexEntry(new Spinda()));
        kantoDex.add(new PokedexEntry(new Trapinch()));
        kantoDex.add(new PokedexEntry(new Vibrava()));
        kantoDex.add(new PokedexEntry(new Flygon()));
        kantoDex.add(new PokedexEntry(new Cacnea()));
        kantoDex.add(new PokedexEntry(new Cacturne()));
        kantoDex.add(new PokedexEntry(new Swablu()));
        kantoDex.add(new PokedexEntry(new Altaria()));
        kantoDex.add(new PokedexEntry(new Zangoose()));
        kantoDex.add(new PokedexEntry(new Seviper()));
        kantoDex.add(new PokedexEntry(new Lunatone()));
        kantoDex.add(new PokedexEntry(new Solrock()));
        kantoDex.add(new PokedexEntry(new Barboach()));
        kantoDex.add(new PokedexEntry(new Whiscash()));
        kantoDex.add(new PokedexEntry(new Corphish()));
        kantoDex.add(new PokedexEntry(new Crawdaunt()));
        kantoDex.add(new PokedexEntry(new Baltoy()));
        kantoDex.add(new PokedexEntry(new Claydol()));
        kantoDex.add(new PokedexEntry(new Lileep()));
        kantoDex.add(new PokedexEntry(new Cradily()));
        kantoDex.add(new PokedexEntry(new Anorith()));
        kantoDex.add(new PokedexEntry(new Armaldo()));
        kantoDex.add(new PokedexEntry(new Feebas()));
        kantoDex.add(new PokedexEntry(new Milotic()));
        kantoDex.add(new PokedexEntry(new Castform()));
        kantoDex.add(new PokedexEntry(new Kecleon()));
        kantoDex.add(new PokedexEntry(new Shuppet()));
        kantoDex.add(new PokedexEntry(new Banette()));
        kantoDex.add(new PokedexEntry(new Duskull()));
        kantoDex.add(new PokedexEntry(new Dusclops()));
        kantoDex.add(new PokedexEntry(new Tropius()));
        kantoDex.add(new PokedexEntry(new Chimecho()));
        kantoDex.add(new PokedexEntry(new Absol()));
        kantoDex.add(new PokedexEntry(new Wynaut()));
        kantoDex.add(new PokedexEntry(new Snorunt()));
        kantoDex.add(new PokedexEntry(new Glalie()));
        kantoDex.add(new PokedexEntry(new Spheal()));
        kantoDex.add(new PokedexEntry(new Sealeo()));
        kantoDex.add(new PokedexEntry(new Walrein()));
        kantoDex.add(new PokedexEntry(new Clamperl()));
        kantoDex.add(new PokedexEntry(new Huntail()));
        kantoDex.add(new PokedexEntry(new Gorebyss()));
        kantoDex.add(new PokedexEntry(new Relicanth()));
        kantoDex.add(new PokedexEntry(new Luvdisc()));
        kantoDex.add(new PokedexEntry(new Bagon()));
        kantoDex.add(new PokedexEntry(new Shelgon()));
        kantoDex.add(new PokedexEntry(new Salamence()));
        kantoDex.add(new PokedexEntry(new Beldum()));
        kantoDex.add(new PokedexEntry(new Metang()));
        kantoDex.add(new PokedexEntry(new Metagross()));
        kantoDex.add(new PokedexEntry(new Regirock()));
        kantoDex.add(new PokedexEntry(new Regice()));
        kantoDex.add(new PokedexEntry(new Registeel()));
        kantoDex.add(new PokedexEntry(new Latias()));
        kantoDex.add(new PokedexEntry(new Latios()));
        kantoDex.add(new PokedexEntry(new Kyogre()));
        kantoDex.add(new PokedexEntry(new Groudon()));
        kantoDex.add(new PokedexEntry(new Rayquaza()));
        kantoDex.add(new PokedexEntry(new Jirachi()));
        kantoDex.add(new PokedexEntry(new Deoxys()));

    }

    public List<PokedexEntry> getKantoDex() {
        return kantoDex;
    }
}