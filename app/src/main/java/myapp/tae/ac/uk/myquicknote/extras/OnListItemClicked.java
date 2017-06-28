package myapp.tae.ac.uk.myquicknote.extras;

import android.view.View;


public interface OnListItemClicked {
    public void onListItemClicked(View view, int position);

    public boolean onLongItemClicked(View view, int position);
}
