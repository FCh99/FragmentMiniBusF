package com.example.faustocheca.myfragmentminif;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by faustocheca on 13/8/16.
 */
public class FragmentOne extends Fragment {



    EditText editText;
    Button button;
    TextView textView;
    Context context;
    private EventBus bus = EventBus.getDefault();  // Publisher
    CommunicateEvent communicateEvent;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);

        editText = (EditText)view. findViewById(R.id.edit_text);
        button = (Button)view. findViewById(R.id.button_go);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableHideKeyboard();
                communicateEvent = new CommunicateEvent(editText
                        .getText().toString());
                bus.post(communicateEvent);



            }
        });


        return view;

    }



    private void enableHideKeyboard() {
        InputMethodManager mgr = (InputMethodManager) getActivity()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(editText.getWindowToken(), 0);


    }



}
