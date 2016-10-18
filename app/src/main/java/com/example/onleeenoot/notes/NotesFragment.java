package com.example.onleeenoot.notes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onleeenoot.Cheese;
import com.example.onleeenoot.R;
import com.example.onleeenoot.util.ListUtil;

import java.util.List;

public class NotesFragment extends Fragment {

    private RecyclerView mRecycler;

    public NotesFragment() {
    }

    public static NotesFragment newInstance() {
        return new NotesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle icicle) {
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        NotesAdapter mAdapter = new NotesAdapter(ListUtil.toList(Cheese.LIST));

        mRecycler = (RecyclerView) view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        mRecycler.setLayoutManager(lm);

        mRecycler.setAdapter(mAdapter);
    }

    class NotesAdapter extends RecyclerView.Adapter<NotesViewHolder> {

        private List<Note> notes;

        NotesAdapter(List<Note> notes) {
            this.notes = notes;
        }

        @Override
        public NotesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View rootView = LayoutInflater.from(getContext()).inflate(
                    android.R.layout.simple_list_item_1, parent, false);
            return new NotesViewHolder(rootView);
        }

        @Override
        public void onBindViewHolder(NotesViewHolder holder, int position) {
            holder.setTitle(notes.get(position).getText());
        }

        @Override
        public int getItemCount() {
            return notes.size();
        }
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {

        private TextView mText;

        NotesViewHolder(View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(android.R.id.text1);
        }

        void setTitle(String text) {
            mText.setText(text);
        }
    }
}