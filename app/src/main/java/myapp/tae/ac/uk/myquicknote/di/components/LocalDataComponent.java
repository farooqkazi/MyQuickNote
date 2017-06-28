package myapp.tae.ac.uk.myquicknote.di.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;
import myapp.tae.ac.uk.myquicknote.di.modules.AppModule;
import myapp.tae.ac.uk.myquicknote.di.modules.LocalDataModule;
import myapp.tae.ac.uk.myquicknote.services.DataService;

@Singleton
@Component(modules = {LocalDataModule.class, AppModule.class})
public interface LocalDataComponent {

    Realm realm();

    SharedPreferences preferences();

    void inject(DataService dataService);

}
