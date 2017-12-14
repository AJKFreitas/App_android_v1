package com.github.welingtonveiga.mensageiro.util;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by fabia on 13/12/2017.
 */

public class PropertiesFiles {

    public static String getProperties(String key, Context context) throws IOException{
        Properties properties = new Properties();
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("config.properties");
        properties.load(inputStream);
        return properties.getProperty(key);
    }



}