package com.amaze.filemanager.utils.provider;

import com.amaze.filemanager.utils.color.ColorPreference;
import com.amaze.filemanager.utils.theme.AppTheme;
import com.amaze.filemanager.utils.theme.AppThemeManager;

/**
 * Created by Rémi Piotaix <remi.piotaix@gmail.com> on 2016-10-17.
 */
public interface UtilitiesProviderInterface {
    ColorPreference getColorPreference();

    AppTheme getAppTheme();

    AppThemeManager getThemeManager();
}
