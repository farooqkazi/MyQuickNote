package myapp.tae.ac.uk.myquicknote.presenter;

import android.os.Bundle;


public interface INoteView {

    public void showNoteDetail(Bundle bundle);

    public void notifyAdapterChange();

    public void startNoteDetailToCreate();

    void startNoteDetailToOpen(Bundle bundle);
}
