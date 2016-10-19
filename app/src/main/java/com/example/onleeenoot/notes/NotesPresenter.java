package com.example.onleeenoot.notes;

import com.example.onleeenoot.Cheese;
import com.example.onleeenoot.util.ListUtil;

public class NotesPresenter implements NotesContract.Presenter {

    private NotesContract.View mView;
    private NotesService mService;

    public NotesPresenter(NotesContract.View view, NotesService service) {
        mView = view;
        mService = service;
        mView.setPresenter(this);
    }

    @Override
    public void loadNotes() {
        mView.showLoadingIndicator(true);

        // replace code block with network/database/disk activity
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    mView.showNotes(ListUtil.toList(Cheese.LIST));
                    mView.showLoadingIndicator(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
