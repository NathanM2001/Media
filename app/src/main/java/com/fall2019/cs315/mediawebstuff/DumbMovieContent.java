package com.fall2019.cs315.mediawebstuff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumbMovieContent {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MovieModel> ITEM_MAP = new HashMap<
            String, MovieModel>();

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title ="DeepWater Horizon";
    private static final String movie1Description = "On April 20, 2010, the Deepwater Horizon drilling rig explodes in the Gulf of Mexico, igniting a massive fireball that kills several crew members. Chief electronics technician Mike Williams (Mark Wahlberg) and his colleagues find themselves fighting for survival";
    private static final String movie1Year ="2016";
    private static final String movie1Image = "water";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt1860357/";

    private static final String movie2Title ="Martian";
    private static final String movie2Description = "When astronauts blast off from the planet Mars, they leave behind Mark Watney (Matt Damon), presumed dead after a fierce storm. With only a meager amount of supplies, the stranded visitor must utilize his wits and spirit to find a way to survive on the hostile planet.";
    private static final String movie2Year ="2015";
    private static final String movie2Image = "martian";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt3659388/";

    private static final String tv1Title = "Chicago Fire";
    private static final String tv1Description = "As the firefighters, rescue squad and paramedics of Chicago Firehouse 51 forge headfirst into danger, the choices they make can mean the difference between life and death. But from the relentless pressure of saving lives, an extended family is forged.";
    private static final String tv1Year = "2012";
    private static final String tv1Image = "fire";
    private static final String tv1Url = "https://www.imdb.com/title/tt2261391/";

    private static final String tv2Title = "Chicago PD";
    private static final String tv2Description = "District 21 of the Chicago Police Department is composed of the uniformed cops, who deal with street crimes, and the Intelligence Unit, which deals with major crimes like drug trafficking and high-profile murders. Sgt Hank Voight - a tough boss who doesn't mind bending the rules a little";
    private static final String tv2Year = "2014";
    private static final String tv2Image = "pd";
    private static final String tv2Url = "https://www.imdb.com/title/tt2805096/";

    private static final String tv3Title = "NCIS";
    private static final String tv3Description = "Naval Criminal Investigative Service Special Agent Leroy Jethro Gibbs leads a group of colorful personalities in investigating crimes -- ranging from murder and espionage to terrorism -- that have evidence connected to Navy and Marine Corps personnel.";
    private static final String tv3Year = "2003";
    private static final String tv3Image = "ncis";
    private static final String tv3Url = "https://www.imdb.com/title/tt0364845/";




    /**
     * Create and return an array of Movie items.  Duh!
     */
    boolean ball = false;
    public List<MovieModel> createMovieMagic () {
    if(!ball) {
        // make those movie objects
        MovieModel movie2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MovieModel movie1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel tv1 = new MovieModel(tv1Title, tv1Description, tv1Year, tv1Image, tv1Url);
        MovieModel tv2 = new MovieModel(tv2Title, tv2Description, tv2Year, tv2Image, tv2Url);
        MovieModel tv3 = new MovieModel(tv3Title, tv3Description, tv3Year, tv3Image, tv3Url);


        // add EACH movie object to our lists and maps
        addMovieToList(movie2);
        addMovieToList(movie1);
        addMovieToList(tv1);
        addMovieToList(tv2);
        addMovieToList(tv3);
    }
    ball = true;
        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
