package gwt.material.design.demo.client.application.dto;

import gwt.material.design.demo.client.resources.MaterialResources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Kevin on 1/29/2016.
 */
public class DataHelper {

    public static List<Hero> getAllHeroes(){
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero(MaterialResources.INSTANCE.batman(), "Batman", "Batman's secret identity is Bruce Wayne, an American billionaire, playboy, philanthropist, and owner of Wayne Enterprises. After witnessing the murder of his parents as a child, he swore revenge on criminals, an oath tempered by a sense of justice. Wayne trains himself both physically and intellectually and crafts a bat-inspired persona to fight crime.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.captain_america(), "Captain America", "Captain America wears a costume that bears an American flag motif, and is armed with a nearly indestructible shield that he throws at foes. The character is usually depicted as the alter ego of Steve Rogers, a frail young man enhanced to the peak of human perfection by an experimental serum to aid the United States government's imminent efforts in World War II.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.cat_woman(), "Cat Woman", "The original and most widely known Catwoman is Selina Kyle. The character was partially inspired by Kane's cousin, Ruth Steel,[3][4] as well as actress Jean Harlow. In her first appearance, she was a whip-carrying burglar with a taste for high-stake thefts.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.cyclops(), "Cyclops", "Cyclops is a member of a subspecies of humans known as mutants, who are born with superhuman abilities. Cyclops can emit powerful beams of energy from his eyes. He cannot control the beams without the aid of special eyewear which he must wear at all times.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.flash(), "Flash", "Barry Allen is The Flash, the fastest man alive. Using his super-speed powers, he taps into the Speed Force and becomes a costumed crime-fighter. His position is a legacy in the Flash Family, successor to the original Jay Garrick and predecessor to Wally West.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.green_lantern(), "Green Lantern", "This Green Lantern's real name was Alan Scott, a railroad engineer who, after a railway crash, came into possession of a magic lantern which spoke to him and said it would bring power. From this, he crafted a magic ring which gave him a wide variety of powers. The limitations of the ring were that it had to be \"charged\" every 24 hours by touching it to the lantern for a time, and that it could not directly affect objects made of wood.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.robin(), "Robin", "Robin is the name of several fictional superheroes appearing in American comic books published by DC Comics. The character was originally created by Bob Kane, Bill Finger, and Jerry Robinson, to serve as a junior counterpart to superhero Batman. ", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.spiderman(), "Spiderman", " The Spider-Man series broke ground by featuring Peter Parker, the high school student behind Spider-Man's secret identity and with whose \"self-obsessions with rejection, inadequacy, and loneliness\" young readers could relate.[4] While Spider-Man had all the makings of a sidekick, unlike previous teen heroes such as Bucky and Robin, Spider-Man had no superhero mentor like Captain America and Batman; he thus had to learn for himself that \"with great power there must also come great responsibility\"", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.superman(), "Superman", "Superman's appearance is distinctive and iconic; he usually wears a blue costume, red cape, and stylized red-and-yellow \"S\" shield on his chest.[3][4][5] This shield is used in a myriad of media to symbolize the character.[6] The origin story of Superman relates that he was born Kal-El on the planet Krypton, before being rocketed to Earth as an infant by his scientist father Jor-El, moments before Krypton's destruction. ", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.thor(), "Thor", "Thor is trained in the arts of war, being a superbly skilled warrior, highly proficient in hand-to-hand combat, swordsmanship and hammer throwing.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.wolverine(), "Wolverine", "Wolverine is typical of the many tough antiheroes that emerged in American popular culture after the Vietnam War;[2] his willingness to use deadly force and his brooding nature became standard characteristics for comic book antiheroes by the end of the 1980s.", 5));
        heroes.add(new Hero(MaterialResources.INSTANCE.wonder_woman(), "Wonder Woman", "Wonder Woman is gifted with a wide range of superhuman powers and superior combat and battle skills. She possesses an arsenal of weapons, including the Lasso of Truth, a pair of indestructible bracelets, a tiara which serves as a projectile, and (in older stories) a range of devices based on Amazon technology.", 5));
        return heroes;
    }

    public static List<Version> getAllVersions() {
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("1.5.0-SNAPSHOT", "Ongoing", Version.VersionLink.CORE_1_5_SNAPSHOT.getName(), Version.VersionLink.ADDINS_1_5_SNAPSHOT.getName(), Version.VersionLink.THEME_1_5.getName(), "deep-orange"));
        versions.add(new Version("1.4.1", "January 2016", Version.VersionLink.CORE_1_4_1.getName(), null, Version.VersionLink.THEME_1_4.getName(), "red"));
        versions.add(new Version("1.4", "November 2015", Version.VersionLink.CORE_1_4.getName(), null, Version.VersionLink.THEME_1_4.getName(), "purple"));
        versions.add(new Version("1.3.3", "July 2015", Version.VersionLink.CORE_1_3_3.getName(), null, null, "pink"));
        versions.add(new Version("1.3.2", "June 2015", Version.VersionLink.CORE_1_3_2.getName(), null, null, "brown"));
        versions.add(new Version("1.3.1", "April 2015", Version.VersionLink.CORE_1_3_1.getName(), null, null, "red"));
        versions.add(new Version("1.3", "April 2015", Version.VersionLink.CORE_1_3.getName(), null, null, "blue"));
        versions.add(new Version("1.2", "April 2015", Version.VersionLink.CORE_1_2.getName(), null, null, "green"));
        versions.add(new Version("1.0", "April 2015", Version.VersionLink.CORE_1.getName(), null, null, "amber"));
        return versions;
    }

    public static List<Apps> getAllApps() {
        List<Apps> apps = new ArrayList<>();
        apps.add(new Apps("gwt-material-channel", "kevzlou7979", "https://avatars1.githubusercontent.com/u/3138071?v=3&s=30", "http://gwt-material-channel.appspot.com/", "http://i.imgur.com/3ROA1Bz.png", "red"));
        apps.add(new Apps("Feel Vision", "gilberto", "https://avatars1.githubusercontent.com/gilberto-torrezan?v=3&s=30", "https://feel-vision.appspot.com", "http://i.imgur.com/G37VTJj.png", "green"));
        apps.add(new Apps("My Money", "Werner Kok", "https://avatars1.githubusercontent.com/wkok?v=3&s=30", "https://managemy.net/money/login.html", "http://i.imgur.com/w9UVW2H.png", "blue"));
        apps.add(new Apps("TripWeGo", "Julien Guibert", "https://avatars2.githubusercontent.com/guibertjulien?v=3&s=128", "http://tripwego-gwt-material.appspot.com/", "http://i.imgur.com/BkWWPFr.png", "black"));
        return apps;
    }

}
