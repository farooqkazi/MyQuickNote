package myapp.tae.ac.uk.myquicknote.di.modules;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import myapp.tae.ac.uk.myquicknote.R;


@Module
public class LocalDataModule {

    @Singleton
    @Provides
    Realm provideRealmInstance(Application context) {
        return Realm.getInstance(context);
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(Application context) {
        return context.getSharedPreferences(context.getString(R.string.preference_name),
                context.MODE_PRIVATE);
    }
}
