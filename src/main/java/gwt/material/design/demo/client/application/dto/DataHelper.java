package gwt.material.design.demo.client.application.dto;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.DatePickerLanguage;
import gwt.material.design.demo.client.application.addins.autocomplete.base.User;
import gwt.material.design.demo.client.resources.MaterialResources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Kevin on 1/29/2016.
 */
public class DataHelper {

    public static List<Hero> getAllHeroes(){
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/batman.png", "Batman", "Batman's secret identity is Bruce Wayne, an American billionaire, playboy, philanthropist, and owner of Wayne Enterprises. After witnessing the murder of his parents as a child, he swore revenge on criminals, an oath tempered by a sense of justice. Wayne trains himself both physically and intellectually and crafts a bat-inspired persona to fight crime.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/captain_america.png", "Captain America", "Captain America wears a costume that bears an American flag motif, and is armed with a nearly indestructible shield that he throws at foes. The character is usually depicted as the alter ego of Steve Rogers, a frail young man enhanced to the peak of human perfection by an experimental serum to aid the United States government's imminent efforts in World War II.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/cat_woman.png", "Cat Woman", "The original and most widely known Catwoman is Selina Kyle. The character was partially inspired by Kane's cousin, Ruth Steel,[3][4] as well as actress Jean Harlow. In her first appearance, she was a whip-carrying burglar with a taste for high-stake thefts.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/cyclops.png", "Cyclops", "Cyclops is a member of a subspecies of humans known as mutants, who are born with superhuman abilities. Cyclops can emit powerful beams of energy from his eyes. He cannot control the beams without the aid of special eyewear which he must wear at all times.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/flash.png", "Flash", "Barry Allen is The Flash, the fastest man alive. Using his super-speed powers, he taps into the Speed Force and becomes a costumed crime-fighter. His position is a legacy in the Flash Family, successor to the original Jay Garrick and predecessor to Wally West.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/green_lantern.png", "Green Lantern", "This Green Lantern's real name was Alan Scott, a railroad engineer who, after a railway crash, came into possession of a magic lantern which spoke to him and said it would bring power. From this, he crafted a magic ring which gave him a wide variety of powers. The limitations of the ring were that it had to be \"charged\" every 24 hours by touching it to the lantern for a time, and that it could not directly affect objects made of wood.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/robin.png", "Robin", "Robin is the name of several fictional superheroes appearing in American comic books published by DC Comics. The character was originally created by Bob Kane, Bill Finger, and Jerry Robinson, to serve as a junior counterpart to superhero Batman. ", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/spiderman.png", "Spiderman", " The Spider-Man series broke ground by featuring Peter Parker, the high school student behind Spider-Man's secret identity and with whose \"self-obsessions with rejection, inadequacy, and loneliness\" young readers could relate.[4] While Spider-Man had all the makings of a sidekick, unlike previous teen heroes such as Bucky and Robin, Spider-Man had no superhero mentor like Captain America and Batman; he thus had to learn for himself that \"with great power there must also come great responsibility\"", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/superman.png", "Superman", "Superman's appearance is distinctive and iconic; he usually wears a blue costume, red cape, and stylized red-and-yellow \"S\" shield on his chest.[3][4][5] This shield is used in a myriad of media to symbolize the character.[6] The origin story of Superman relates that he was born Kal-El on the planet Krypton, before being rocketed to Earth as an infant by his scientist father Jor-El, moments before Krypton's destruction. ", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/thor.png", "Thor", "Thor is trained in the arts of war, being a superbly skilled warrior, highly proficient in hand-to-hand combat, swordsmanship and hammer throwing.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/wolverine.png", "Wolverine", "Wolverine is typical of the many tough antiheroes that emerged in American popular culture after the Vietnam War;[2] his willingness to use deadly force and his brooding nature became standard characteristics for comic book antiheroes by the end of the 1980s.", 5));
        heroes.add(new Hero("https://gwtmaterialdesign.github.io/gwt-material-demo/images/wonder_woman.png", "Wonder Woman", "Wonder Woman is gifted with a wide range of superhuman powers and superior combat and battle skills. She possesses an arsenal of weapons, including the Lasso of Truth, a pair of indestructible bracelets, a tiara which serves as a projectile, and (in older stories) a range of devices based on Amazon technology.", 5));
        return heroes;
    }

    public static List<Version> getAllVersions() {
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("2.1.1", "August 2018", Version.VersionLink.CORE_2_1_1.getName(), Version.VersionLink.ADDINS_2_1_1.getName(), Version.VersionLink.THEME_2_1_1.getName(), Version.VersionLink.JQUERY_2_1_1.getName(), Version.VersionLink.TABLE_2_1_1.getName(), Color.INDIGO));
        versions.add(new Version("2.1", "July 2018", Version.VersionLink.CORE_2_1.getName(), Version.VersionLink.ADDINS_2_1.getName(), Version.VersionLink.THEME_2_1.getName(), Version.VersionLink.JQUERY_2_1.getName(), Version.VersionLink.TABLE_2_1.getName(), Color.INDIGO));
        versions.add(new Version("2.0.1", "February 2018", Version.VersionLink.CORE_2_0_1.getName(), Version.VersionLink.ADDINS_2_0_1.getName(), Version.VersionLink.THEME_2_0_1.getName(), Version.VersionLink.JQUERY_2_0_1.getName(), Version.VersionLink.TABLE_2_0_1.getName(), Color.GREEN));
        versions.add(new Version("2.0", "November 2017", Version.VersionLink.CORE_2_0.getName(), Version.VersionLink.ADDINS_2_0.getName(), Version.VersionLink.THEME_2_0.getName(), Version.VersionLink.JQUERY_2_0.getName(), Version.VersionLink.TABLE_2_0.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc7", "October 2017", Version.VersionLink.CORE_2_0_RC7.getName(), Version.VersionLink.ADDINS_2_0_RC7.getName(), Version.VersionLink.THEME_2_0_RC7.getName(), Version.VersionLink.JQUERY_2_0_RC7.getName(), Version.VersionLink.TABLE_2_0_RC7.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc6", "July 2017", Version.VersionLink.CORE_2_0_RC6.getName(), Version.VersionLink.ADDINS_2_0_RC6.getName(), Version.VersionLink.THEME_2_0_RC6.getName(), Version.VersionLink.JQUERY_2_0_RC6.getName(), Version.VersionLink.TABLE_2_0_RC6.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc5", "May 2017", Version.VersionLink.CORE_2_0_RC5.getName(), Version.VersionLink.ADDINS_2_0_RC5.getName(), Version.VersionLink.THEME_2_0_RC5.getName(), Version.VersionLink.JQUERY_2_0_RC5.getName(), Version.VersionLink.TABLE_2_0_RC5.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc4", "March 2017", Version.VersionLink.CORE_2_0_RC4.getName(), Version.VersionLink.ADDINS_2_0_RC4.getName(), Version.VersionLink.THEME_2_0_RC4.getName(), Version.VersionLink.JQUERY_1_0_RC4.getName(), Version.VersionLink.TABLE_1_0_RC4.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc3", "November 2016", Version.VersionLink.CORE_2_0_RC3.getName(), Version.VersionLink.ADDINS_2_0_RC3.getName(), Version.VersionLink.THEME_2_0_RC3.getName(), Version.VersionLink.JQUERY_1_0_RC3.getName(), Version.VersionLink.TABLE_1_0_RC3.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc3", "November 2016", Version.VersionLink.CORE_2_0_RC3.getName(), Version.VersionLink.ADDINS_2_0_RC3.getName(), Version.VersionLink.THEME_2_0_RC3.getName(), Version.VersionLink.JQUERY_1_0_RC3.getName(), Version.VersionLink.TABLE_1_0_RC3.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc2", "November 2016", Version.VersionLink.CORE_2_0_RC2.getName(), Version.VersionLink.ADDINS_2_0_RC2.getName(), Version.VersionLink.THEME_2_0_RC2.getName(), Version.VersionLink.JQUERY_1_0_RC2.getName(), Version.VersionLink.TABLE_1_0_RC2.getName(), Color.GREEN));
        versions.add(new Version("2.0-rc1", "October 2016", Version.VersionLink.CORE_2_0_RC1.getName(), Version.VersionLink.ADDINS_2_0_RC1.getName(), Version.VersionLink.THEME_2_0_RC1.getName(), Version.VersionLink.JQUERY_1_0_RC1.getName(), Version.VersionLink.TABLE_1_0_RC1.getName(), Color.GREEN));
        versions.add(new Version("1.6.2", "September 2016", Version.VersionLink.CORE_1_6_2.getName(), Version.VersionLink.ADDINS_1_6_2.getName(), null, null, null, Color.AMBER_DARKEN_2));
        versions.add(new Version("1.6.1", "August 2016", Version.VersionLink.CORE_1_6_1.getName(), null, null, null, null, Color.DEEP_ORANGE_ACCENT_2));
        versions.add(new Version("1.6.0", "August 2016", Version.VersionLink.CORE_1_6_0.getName(), Version.VersionLink.ADDINS_1_6_0.getName(), Version.VersionLink.THEME_1_6_0.getName(), null, null, Color.BROWN_DARKEN_1));
        versions.add(new Version("1.5.3", "July 2016", Version.VersionLink.CORE_1_5_3.getName(), null, null, null, null, Color.TEAL));
        versions.add(new Version("1.5.2", "June 2016", Version.VersionLink.CORE_1_5_2.getName(), Version.VersionLink.ADDINS_1_5_2.getName(), Version.VersionLink.THEME_1_5_2.getName(), null, null, Color.PINK_ACCENT_1));
        versions.add(new Version("1.5.1", "June 2016", Version.VersionLink.CORE_1_5_1.getName(), Version.VersionLink.ADDINS_1_5_1.getName(), Version.VersionLink.THEME_1_5_1.getName(), null, null, Color.TEAL));
        versions.add(new Version("1.5.0", "April 2016", Version.VersionLink.CORE_1_5_0.getName(), Version.VersionLink.ADDINS_1_5_0.getName(), Version.VersionLink.THEME_1_5_0.getName(), null, null, Color.DEEP_ORANGE));
        versions.add(new Version("1.4.1", "January 2016", Version.VersionLink.CORE_1_4_1.getName(), null, Version.VersionLink.THEME_1_4.getName(), null, null, Color.RED));
        versions.add(new Version("1.4", "November 2015", Version.VersionLink.CORE_1_4.getName(), null, Version.VersionLink.THEME_1_4.getName(), null, null, Color.PURPLE));
        versions.add(new Version("1.3.3", "July 2015", Version.VersionLink.CORE_1_3_3.getName(), null, null, null, null, Color.PINK));
        versions.add(new Version("1.3.2", "June 2015", Version.VersionLink.CORE_1_3_2.getName(), null, null, null, null, Color.BROWN));
        versions.add(new Version("1.3.1", "April 2015", Version.VersionLink.CORE_1_3_1.getName(), null, null, null, null, Color.RED));
        versions.add(new Version("1.3", "April 2015", Version.VersionLink.CORE_1_3.getName(), null, null, null, null, Color.BLUE));
        versions.add(new Version("1.2", "April 2015", Version.VersionLink.CORE_1_2.getName(), null, null, null, null, Color.GREEN));
        versions.add(new Version("1.0", "April 2015", Version.VersionLink.CORE_1.getName(), null, null, null, null, Color.AMBER));
        return versions;
    }

    public static List<Apps> getAllApps() {
        List<Apps> apps = new ArrayList<>();
        apps.add(new Apps("Take It", "Andrey Kurbanov", "https://lh4.googleusercontent.com/-U1vyJFhSQ1c/AAAAAAAAAAI/AAAAAAAABxk/DfJoe_JD2Fo/w80-h80/photo.jpg", "https://derzhika.ru/", "http://i.imgur.com/n1dSMgL.jpg", Color.DEEP_ORANGE));
        apps.add(new Apps("gwt-material-channel", "kevzlou7979", "https://avatars1.githubusercontent.com/u/3138071?v=3&s=30", "http://gwt-material-channel.appspot.com/", "http://i.imgur.com/3ROA1Bz.png", Color.RED));
        apps.add(new Apps("Feel Vision", "gilberto", "https://avatars1.githubusercontent.com/gilberto-torrezan?v=3&s=30", "https://feel-vision.appspot.com", "http://i.imgur.com/G37VTJj.png", Color.GREEN));
        apps.add(new Apps("My Money", "Werner Kok", "https://avatars1.githubusercontent.com/wkok?v=3&s=30", "https://appadvice.com/app/my-money-expense-tracker/1073455420", "http://i.imgur.com/w9UVW2H.png", Color.BLUE));
        apps.add(new Apps("TripWeGo", "Julien Guibert", "https://avatars2.githubusercontent.com/guibertjulien?v=3&s=128", "http://www.tripwego.com/", "http://i.imgur.com/BkWWPFr.png", Color.BLACK));
        apps.add(new Apps("Follow Chess", "Asim Pereira", "https://lh3.googleusercontent.com/-nLDflwTMqQY/AAAAAAAAAAI/AAAAAAAAG7U/7CowZmu0Tbg/s60-p-rw-no/photo.jpg", "https://live.followchess.com/", "http://i.imgur.com/50i7vZq.png", Color.ORANGE));
        return apps;
    }

    public static String getRichEditorHTML() {
        String html = "<h2 style=\"text-align: center; \"> <span style=\"color: rgb(101, 31, 255);\"> I Love Material Design </span> </h2> <p style=\"text-align: center;\"> <span style=\"font-size: 17px;\"> Using </span> <span style=\"font-weight: bold; font-size: 17px; text-decoration: underline;\"> Airmode </span> <span style=\"font-size: 17px;\"> you can directly modify this html. </span> </p> <p style=\"text-align: center;\"> <br> </p> <table class=\"hoverable bordered striped responsive-table\"> <thead> <tr> <th> State </th> <th> Capital </th> <th> Currency </th> </tr> </thead> <tbody> <tr> <td> Philippines </td> <td> Manila </td> <td> Peso </td> </tr> <tr> <td> Japan </td> <td> Tokyo </td> <td> Yen </td> </tr> </tbody> </table> <p> </p>";
        return html;
    }

    public static List<DatePickerLanguage> getAllDateLanguage() {
        List<DatePickerLanguage> dpLanguages = new ArrayList<>();
        dpLanguages.add(DatePickerLanguage.EN);
        dpLanguages.add(DatePickerLanguage.AR);
        dpLanguages.add(DatePickerLanguage.BG);
        dpLanguages.add(DatePickerLanguage.BS);
        dpLanguages.add(DatePickerLanguage.CA);
        dpLanguages.add(DatePickerLanguage.CS);
        dpLanguages.add(DatePickerLanguage.DA);
        dpLanguages.add(DatePickerLanguage.DE);
        dpLanguages.add(DatePickerLanguage.EL);
        dpLanguages.add(DatePickerLanguage.ES);
        dpLanguages.add(DatePickerLanguage.ET);
        dpLanguages.add(DatePickerLanguage.EU);
        dpLanguages.add(DatePickerLanguage.FA);
        dpLanguages.add(DatePickerLanguage.FI);
        dpLanguages.add(DatePickerLanguage.FR);
        dpLanguages.add(DatePickerLanguage.GL);
        dpLanguages.add(DatePickerLanguage.HE);
        dpLanguages.add(DatePickerLanguage.HI);
        dpLanguages.add(DatePickerLanguage.HR);
        dpLanguages.add(DatePickerLanguage.HU);
        dpLanguages.add(DatePickerLanguage.ID);
        dpLanguages.add(DatePickerLanguage.IS);
        dpLanguages.add(DatePickerLanguage.IT);
        dpLanguages.add(DatePickerLanguage.JA);
        dpLanguages.add(DatePickerLanguage.KO);
        return dpLanguages;
    }

    public static List<Repository> getAllRepositories() {
        List<Repository> repositories = new ArrayList<>();
        repositories.add(new Repository("gwt-material", 200, 64));
        repositories.add(new Repository("gwt-material-addins", 14, 17));
        repositories.add(new Repository("gwt-material-themes", 5, 5));
        repositories.add(new Repository("gwt-material-demo", 16, 27));
        repositories.add(new Repository("gwt-material-patterns", 7, 3));
        repositories.add(new Repository("gwt-material-starter", 4, 7));
        repositories.add(new Repository("gwt-material-basic", 3, 0));
        repositories.add(new Repository("gwt-material-archetype", 3, 0));
        repositories.add(new Repository("gwt-material-errai", 5, 2));
        repositories.add(new Repository("gwt-material-phonegap", 7, 4));
        return repositories;
    }

    public static List<TimeZone> getTimeZones() {
        List<TimeZone> timeZones = new ArrayList<>();
        timeZones.add(new TimeZone("Alaskan/Hawaiian Time Zone", getHawaiianTimeZone()));
        timeZones.add(new TimeZone("Pacific Time Zone", getPacificTimeZone()));
        return timeZones;
    }

    protected static List<State> getHawaiianTimeZone() {
        List<State> states = new ArrayList<>();
        states.add(new State("Alaska", "AK"));
        states.add(new State("Hawaii", "HI"));
        return states;
    }

    protected static List<State> getPacificTimeZone() {
        List<State> states = new ArrayList<>();
        states.add(new State("California", "CA"));
        states.add(new State("Nevada", "NV"));
        states.add(new State("Oregon", "OR"));
        states.add(new State("Washington", "WA"));
        return states;
    }

    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg", "Luis Hoppe", "luis@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/yassiryahya/128.jpg", "Irwin Mueller", "irwin@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/lebinoclard/128.jpg", "Levin Card", "levin@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/lmjabreu/128.jpg",  "Dr. Cassie Keeling", "cassie@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/ariil/128.jpg",  "Dr. Madelynn Schamberger", "madelyn@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/devankoshal/128.jpg", "Dominique Schmidt", "dom@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/karthipanraj/128.jpg", "Rowland Heller", "rowland@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/GavicoInd/128.jpg", "Quincy Schimmel", "quincy@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/roybarberuk/128.jpg", "Tierra VonRueden", "tierra@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/kimcool/128.jpg", "Travis Larson", "travis@mail.com"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/tonymillion/128.jpg", "Clint Heller", "clint@mail.com"));
        return list;
    }
}
