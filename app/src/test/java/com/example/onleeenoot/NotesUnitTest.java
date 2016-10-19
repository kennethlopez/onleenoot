package com.example.onleeenoot;

import com.example.onleeenoot.notes.NotesContract;
import com.example.onleeenoot.notes.NotesPresenter;
import com.example.onleeenoot.notes.NotesService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class NotesUnitTest {

    private NotesPresenter mPresenter;
    private NotesContract.View mView;
    private NotesService mService;

    @Before
    public void setUp() throws Exception {
        mPresenter = new NotesPresenter(mView, mService);
    }

    @Test
    public void shouldShowTextIfNotesAreEmpty() throws Exception {
//        List mockedList = mock(List.class);
//        when()
//        mPresenter
//        verify()
    }
}
