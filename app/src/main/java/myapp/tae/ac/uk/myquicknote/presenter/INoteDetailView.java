package myapp.tae.ac.uk.myquicknote.presenter;

import android.view.View;


public interface INoteDetailView {

    public void onItemClicked(View view);

    public String getNoteTitle();

    public String getNoteDetail();

    public String getLastModified();

    public void setNoteTitle(String title);

    public void setLastModified(String lastModifiedDate);

    public void setNoteDetail(String noteDetail);

    void setIsContentChanged(boolean isContentChanged);

    void setTitleEmptyError(int resId);

    void setDetailNoteEmptyError(int resId);

    void showSaveConfirmationDialog();

    void saveAndClose();

    void setNoteId(int id);
}
