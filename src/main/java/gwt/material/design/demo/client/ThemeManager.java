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
package gwt.material.design.demo.client;

import com.google.gwt.user.client.Cookies;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.themes.amber.ThemeAmber;
import gwt.material.design.themes.blue.ThemeBlue;
import gwt.material.design.themes.brown.ThemeBrown;
import gwt.material.design.themes.client.ThemeLoader;
import gwt.material.design.themes.green.ThemeGreen;
import gwt.material.design.themes.grey.ThemeGrey;
import gwt.material.design.themes.orange.ThemeOrange;
import gwt.material.design.themes.pink.ThemePink;
import gwt.material.design.themes.purple.ThemePurple;
import gwt.material.design.themes.red.ThemeRed;
import gwt.material.design.themes.yellow.ThemeYellow;

import java.util.Date;

public class ThemeManager {

    final static String COLOR = "color";

    static java.util.HashMap<MaterialWidget, Integer> map = new java.util.HashMap<>();

    public static final int REGULAR_SHADE = 0;
    public static final int DARKER_SHADE = 1;
    public static final int LIGHTER_SHADE = 2;

    public static void setColor(Color color, Color darkerColor, Color lighterColor) {
        final long DURATION = 1000 * 60 * 60 * 24 * 14; //duration remembering login - 2 weeks
        Date expires = new Date(System.currentTimeMillis() + DURATION);
        Cookies.setCookie(COLOR, color.getCssName(), expires, null, "/", false);

        for (MaterialWidget w : map.keySet()) {
            switch (map.get(w)) {
                case REGULAR_SHADE:
                    w.setBackgroundColor(color);
                    break;
                case DARKER_SHADE:
                    w.setBackgroundColor(darkerColor);
                    break;
                case LIGHTER_SHADE:
                    w.setBackgroundColor(lighterColor);
                    break;
                default:
                    break;
            }
        }
    }

    public static void loadTheme(ThemeLoader.ThemeBundle themeBundle) {
        ThemeLoader.loadAsync(themeBundle, new ThemeLoader.ThemeAsyncCallback() {
            @Override
            public void onSuccess(int resourceCount) {
                if (themeBundle == ThemeAmber.INSTANCE) {
                    setColor(Color.AMBER, Color.AMBER_DARKEN_3, Color.AMBER_LIGHTEN_2);
                } else if (themeBundle == ThemeBlue.INSTANCE) {
                    setColor(Color.BLUE, Color.BLUE_DARKEN_3, Color.BLUE_LIGHTEN_2);
                } else if (themeBundle == ThemeBrown.INSTANCE) {
                    setColor(Color.BROWN, Color.BROWN_DARKEN_3, Color.BROWN_LIGHTEN_2);
                } else if (themeBundle == ThemeGreen.INSTANCE) {
                    setColor(Color.GREEN, Color.GREEN_DARKEN_3, Color.GREEN_LIGHTEN_2);
                } else if (themeBundle == ThemeGrey.INSTANCE) {
                    setColor(Color.GREY, Color.GREY_DARKEN_3, Color.GREY_LIGHTEN_2);
                } else if (themeBundle == ThemeOrange.INSTANCE) {
                    setColor(Color.ORANGE, Color.ORANGE_DARKEN_3, Color.ORANGE_LIGHTEN_2);
                } else if (themeBundle == ThemePink.INSTANCE) {
                    setColor(Color.PINK, Color.PINK_DARKEN_3, Color.PINK_LIGHTEN_2);
                } else if (themeBundle == ThemePurple.INSTANCE) {
                    setColor(Color.PURPLE, Color.PURPLE_DARKEN_3, Color.PURPLE_LIGHTEN_2);
                } else if (themeBundle == ThemeRed.INSTANCE) {
                    setColor(Color.RED, Color.RED_DARKEN_3, Color.RED_LIGHTEN_2);
                } else if (themeBundle == ThemeYellow.INSTANCE) {
                    setColor(Color.YELLOW, Color.YELLOW_DARKEN_3, Color.YELLOW_LIGHTEN_2);
                }
            }

            @Override
            public void onFailure(Throwable reason) {
                MaterialToast.fireToast(reason.getMessage());
            }
        });
    }

    public static void initialize() {
        loadTheme(getBundle());
    }

    public static void register(MaterialWidget widget) {
        register(widget, REGULAR_SHADE);
    }

    public static void register(MaterialWidget widget, int shade) {
        if (!map.containsKey(widget)) {
            map.put(widget, shade);
        }
        initialize();
    }

    public static ThemeLoader.ThemeBundle getBundle() {
        if (getColor() == Color.AMBER) {
            return ThemeAmber.INSTANCE;
        } else if (getColor() == Color.BLUE) {
            return ThemeBlue.INSTANCE;
        } else if (getColor() == Color.BROWN) {
            return ThemeBrown.INSTANCE;
        } else if (getColor() == Color.GREEN) {
            return ThemeGreen.INSTANCE;
        } else if (getColor() == Color.GREY) {
            return ThemeGrey.INSTANCE;
        } else if (getColor() == Color.ORANGE) {
            return ThemeOrange.INSTANCE;
        } else if (getColor() == Color.PINK) {
            return ThemePink.INSTANCE;
        } else if (getColor() == Color.PURPLE) {
            return ThemePurple.INSTANCE;
        } else if (getColor() == Color.RED) {
            return ThemeRed.INSTANCE;
        } else if (getColor() == Color.YELLOW) {
            return ThemeYellow.INSTANCE;
        }
        return ThemeBlue.INSTANCE;
    }

    public static Color getColor() {
        if (Cookies.getCookie(COLOR) == null) {
            return Color.BLUE;
        }
        return Color.fromStyleName(Cookies.getCookie(COLOR));
    }
}
