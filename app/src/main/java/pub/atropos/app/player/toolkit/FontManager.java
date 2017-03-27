package pub.atropos.app.player.toolkit;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by 980558 on 2017/3/27.
 */
public class FontManager {
    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
