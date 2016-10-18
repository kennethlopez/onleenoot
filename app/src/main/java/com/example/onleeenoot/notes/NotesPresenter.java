package com.example.onleeenoot.notes;

public class NotesPresenter {

    private NotesService mService;
    private NotesContract.View mView;

    public NotesPresenter(NotesContract.View view, NotesService service) {
        mView = view;
        mService = service;
    }
}
